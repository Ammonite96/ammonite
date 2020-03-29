package CyberBeatBox.SmallTasks.MusicClip;

import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {  // Нам нужно отслеживать события ControllerEvent поэтому мы реализуем интерфейс слушателя
    @Override
    public void controlChange(ShortMessage event) {
        System.out.println("Ля");
    }

    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public  void go(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();    // Создаём и открываем синтезатор
            sequencer.open();

            int[] eventsIWant = {127};  // Регистрируем событие синтезатором. Метод, отвечающий за регистрацию, принимает обьект слушателя и массив. Массив-список событий ControllerEvent
            sequencer.addControllerEventListener(this, eventsIWant); // которые нам нужны. Нас интересует только одно событие №127;

            Sequence seq = new Sequence(Sequence.PPQ, 4);   // Создаем последовательность и дорожку
            Track track = seq.createTrack();

            for (int i = 20; i < 90; i+=4){      // Создаем группу событий, чтобы ноты поднимались с 5 по 61
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,i,100,i+2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static MidiEvent makeEvent (int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex){ex.printStackTrace();}
        return event;
    }
}
