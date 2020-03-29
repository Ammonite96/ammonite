package CyberBeatBox.SmallTasks;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();   // Получаем синтезатор и открываем его, чтобы начать использовать (по дефолту закрыт)
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();    // Запрашиваем трек у последовательности. Помним, что трек содержится внутри последовательности, а Midi-данные - в треке

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 65, 100);  // Помещаем в трек Миди-события
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);    //  Передаем последовательность синтезатору
            player.start();     // Запускаем синтезатор

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
