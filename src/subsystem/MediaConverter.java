package subsystem;

public class MediaConverter {
    public String convert(String fileName, String sourceCodec, String targetCodec){
        if (fileName.isEmpty()){
            throw new IllegalArgumentException("File name cannot be empty");
        }
        if (sourceCodec.isEmpty() || targetCodec.isEmpty()){
            throw new IllegalArgumentException("Codecs cannot be empty");
        }
        int dotInd = fileName.lastIndexOf('.');

        String convertedFile = fileName.substring(0, dotInd + 1) + getFormat(targetCodec);
        return "Converted file: " + convertedFile + " | Source codec: " + sourceCodec + " | Target Codec: " + targetCodec;
    }

    private String getFormat(String codec) {
        return codec.toLowerCase().replace(" codec", "");
    }
}