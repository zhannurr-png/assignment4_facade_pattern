package facade;
import subsystem.*;

public class MediaConversionFacade {
    private final MetadataReader metadataReader = new MetadataReader();
    private final CodecFactory codecFactory = new CodecFactory();
    private final MediaConverter mediaConverter = new MediaConverter();
    private final AudioMixer audioMixer = new AudioMixer();

    public String convert(String fileName, String targetFormat, int volume, String action){
        String sourceFormat = metadataReader.readFormat(fileName);

        String sourceCodec = codecFactory.getCodec(sourceFormat);
        String targetCodec = codecFactory.getCodec(targetFormat);

        String convertedData = mediaConverter.convert(fileName, sourceCodec, targetCodec);
        return audioMixer.processAudio(convertedData, volume, action);
    }
}
