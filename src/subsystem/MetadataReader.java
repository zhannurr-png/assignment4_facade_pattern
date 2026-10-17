package subsystem;

public class MetadataReader {
    public String readFormat(String fileName){
        int dotInd = fileName.lastIndexOf('.');
        if (dotInd <= 0 || dotInd == fileName.length() -1){
            throw new IllegalArgumentException("File must have a valid extension: " + fileName);
        }
        return fileName.substring(dotInd + 1).toLowerCase();
    }

    public String readMetadata(String fileName){
        String format = readFormat(fileName);
        return "Metadata: file=" + fileName + ", format=" + format;
    }
}