public class Main {

    public static void main(String[] args) {
        String fileName = "youtubevideo.ogg";
        String format = "mp4";

        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        System.out.println("\n======= VideoConversionFacade: conversion started. =======");
        VideoFile videoFileConverted = conversionFacade.convertVideo(videoFile, format);
        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}