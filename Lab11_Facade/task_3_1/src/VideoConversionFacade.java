public class VideoConversionFacade {

    public VideoFile convertVideo(VideoFile file, String format) {
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equalsIgnoreCase("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile convertedFile = BitrateReader.convert(buffer, file.getName(), destinationCodec);

        if (file.getAudioBuffer() != null) {
            new AudioMixer().fix(convertedFile, file.getAudioBuffer());
        }

        return convertedFile;
    }
}