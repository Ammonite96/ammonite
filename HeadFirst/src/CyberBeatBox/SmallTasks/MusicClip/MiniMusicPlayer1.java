package CyberBeatBox.SmallTasks.MusicClip;

import javax.sound.midi.*;

public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        try{
            Sequencer sequencer = MidiSystem.getSequencer();    // Создаём и открываем синтезатор
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);   // Создаем последовательность и дорожку
            Track track = seq.createTrack();

            for (int i = 20; i < 90; i+=4){      // Создаем группу событий, чтобы ноты поднимались с 5 по 61
                track.add(makeEvent(144,1,i,100,i));
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
