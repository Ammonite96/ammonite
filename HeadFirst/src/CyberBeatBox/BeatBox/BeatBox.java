package CyberBeatBox.BeatBox;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class BeatBox {

    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxList; // флажки
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;
    boolean[] checkboxState; // массив для хранения состояния каждого флажка. Используется для сохранения и открытия шаблона

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare",
            "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell",
            "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};

    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63}; // Аля клавиши инструментов.

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }

    public void buildGUI(){
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout borderLayout = new BorderLayout();
        JPanel background = new JPanel(borderLayout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); // пустая граница позволяет создать поля между краями панели и местом размещения компонентов

        checkBoxList = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new MySendListener());
        buttonBox.add(saveButton);

        JButton openButton = new JButton("Open Pattern");
        openButton.addActionListener(new MyReadInListener());
        buttonBox.add(openButton);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++){
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16,16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++){      // Создаем флажки и устанавливаем им значение false (чтобы они не были установленны)
            JCheckBox c = new JCheckBox();  // а затем добавляем их в массив ArrayList и на панель.
            c.setSelected(false);
            checkBoxList.add(c);
            mainPanel.add(c);
        } // конец цикла

        setUpMidi();

        theFrame.setBounds(50,50,300,300);
        theFrame.pack();
        theFrame.setVisible(true);
        theFrame.setLocationRelativeTo(null);
    } // закрываем метод

    public void setUpMidi() { // Обычный Миди-код для получения синтезатора, сиквенсера и дорожки.
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex){
            ex.getMessage();
        }
    } // закрывем метод

    public void buildTrackAndStart() { // Метод который преобразует состояния флажков в Миди-события и добовляет их на дорожку.
        int[] trackList = null; // Массив из 16 элементов, чтобы хранить значения для каждого инструмента, на все 16 тактов.

        sequence.deleteTrack(track);
        track = sequence.createTrack(); // избавляемся от старой дорожки и добавляем новую.

        for (int i = 0; i < 16; i++){ // делаем это для каждого из 16 рядов (инструментов)
            trackList = new int[16];
            int key = instruments[i]; // Задаем клавишу которая предстваляет инструмент. Массив содержит Миди-числа для каждого инструмента.
            for (int j = 0; j < 16; j++){ // Делаем это для каждого такта текукщего ряда
                JCheckBox jc = (JCheckBox) checkBoxList.get(j + (16*i));
                if (jc.isSelected())    // Установлен ли флажок на этом такте? Если да, то помещаем значение клавиши в текущуюю ячейку массива
                    trackList[j] = key; // (ячейку которая предоставляет такт). Если нет то инструмент не должен играть в этом такте
                else                    // по этому присвоем ему 0
                    trackList[j] = 0;
            } // закрываем внутренний цикл

            makeTracks (trackList);  // Для этого инструемнта и для всех 16 тактов создаем события и добавляем их на дорожку
            track.add(makeEvent(176,1,127,0,16));
        } // закрываем внешний цикл

        track.add(makeEvent(192,9,1,0,15)); // Мы всегда должны быть уверенны что событие на такте 16 существует (они идут от 0 до 15)
        try{                                // Иначе программа может не пройти все 16 тактов, перед тем как заново начнет последавательность
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY); // Позволяет задать кол.во повторений цикла или как в этом случае, непрерывный цикл
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex){     // теперь мы проигрываем мелодию
            ex.getMessage();
        }
    } // Закрываем метод buildTrackAndStart

    public class MyStartListener implements ActionListener{
// Первый из внутренних классов - слушателей для кнопок.
        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    } // Закрываем внутренний класс

    public class MyStopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
        }
    } // закрываем класс

    public class MyUpTempoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {  // коэффициент темпа определяет темп синтезатора.
            float tempoFactor = sequencer.getTempoFactor();     // по умолчанию он равен 1.0. по этому щелчком мыши
            sequencer.setTempoFactor((float)(tempoFactor * 1.03));  // можно изменить его на +-3%
        }
    } // закрываем класс

    public class MyDownTempoListener implements ActionListener{ // +-3%

        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * .97));
        }
    }   // close class

    public void makeTracks(int[] list) { // Метод создает события для одного инструмента за каждый проход цикла для всех 16 тактов.
        for (int i = 0; i < 16; i++){ // Можно получить int[] для Bass Drum, и каждый элемент массива будет содержать либо клавишу либо ноль
            int key = list[i]; // Если это ноль то инструмент не должен играть на текущем такте. Иначе нужно создать событие и добавить его в дорожку
            if (key != 0){
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(128,9,key,100,i+1));
            }
        }
    } // закрываем метод

    public MidiEvent makeEvent(int comb, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comb,chan,one,two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return event;
    } // close method

    public class MySendListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            checkboxState = new boolean[256];

            for (int i = 0; i < 256; i++){
                JCheckBox check = (JCheckBox) checkBoxList.get(i);
                if (check.isSelected())
                    checkboxState[i] = true;
            }
            JFileChooser fileSave = new JFileChooser();
            fileSave.showOpenDialog(theFrame);
            saveFile (fileSave.getSelectedFile());
        }
    }

    private void saveFile(File file){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
            os.writeObject(checkboxState);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public class MyReadInListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(theFrame);
            loadFile (fileOpen.getSelectedFile());
            sequencer.stop();
            buildTrackAndStart();
        }
    }

    private void loadFile(File file){
        checkboxState = null;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
            checkboxState = (boolean[]) is.readObject();
        } catch (Exception ex){ex.printStackTrace();}

        for (int i = 0; i < 256; i++){
            JCheckBox check = (JCheckBox) checkBoxList.get(i);
            if (checkboxState[i])
                check.setSelected(true);
            else
                check.setSelected(false);
        }
    }
} // Close BeatBox Class
