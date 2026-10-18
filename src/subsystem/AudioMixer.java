package subsystem;

public class AudioMixer {
    public String processAudio(String convertedData, int volume, String action){
        if (convertedData.isEmpty()){
            throw new IllegalArgumentException("Converted data cannot be empty");
        }

        if (volume < 0 || volume > 100){
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }

        if (action.isEmpty()) {
            throw new IllegalArgumentException("Action cannot be empty");
        }

        int adjustedVolume;

        if(action.equalsIgnoreCase("increase")) {
            adjustedVolume = Math.min(volume + 10, 100);
        } else if (action.equalsIgnoreCase("decrease")) {
            adjustedVolume = Math.max(volume - 10, 0);
        } else {throw new IllegalArgumentException("Action must be increase or decrease");}
        return convertedData + " | Adjusted volume: " + adjustedVolume + "%";
    }
}