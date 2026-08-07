import java.io.File;
import javax.sound.sampled.*;

class One {

    public static void main(String[] args) {
        try {
            File file = new File("sample.wav");
            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(file);

            AudioFormat format = audioStream.getFormat();

            byte[] buffer = new byte[4096];
            int bytesRead = audioStream.read(buffer);

            double avgFrequency = calculateFrequency(buffer, format);

            String instrument = detectInstrument(avgFrequency);

            System.out.println("Detected Frequency: " + avgFrequency + " Hz");
            System.out.println("Possible Instrument: " + instrument);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Very basic frequency estimation
    static double calculateFrequency(byte[] audioData, AudioFormat format) {
        int zeroCrossings = 0;

        for (int i = 1; i < audioData.length; i++) {
            if ((audioData[i - 1] > 0 && audioData[i] <= 0)
                    || (audioData[i - 1] < 0 && audioData[i] >= 0)) {
                zeroCrossings++;
            }
        }

        return (zeroCrossings * format.getSampleRate()) / (2.0 * audioData.length);
    }

    static String detectInstrument(double frequency) {

        if (frequency >= 80 && frequency <= 350)
            return "Guitar";

        if (frequency >= 250 && frequency <= 1000)
            return "Piano";

        if (frequency >= 260 && frequency <= 1200)
            return "Violin";

        if (frequency >= 500 && frequency <= 3000)
            return "Flute";

        return "Unknown Instrument";
    }
}