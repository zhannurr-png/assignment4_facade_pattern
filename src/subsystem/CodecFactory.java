package subsystem;

public class CodecFactory {
    public String getCodec(String format){
        switch (format.toLowerCase()){
            case "avi":
                return "AVI Codec";
            case "mp4":
                return "MP4 Codec";
            case "mp3":
                return "MP3 Codec";
            default:
                throw new IllegalArgumentException("Unsupported format: " + format);
        }
    }
}