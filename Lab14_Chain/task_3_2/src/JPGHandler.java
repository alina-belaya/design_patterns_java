class JPGHandler implements FileHandler {
    private FileHandler nextHandler;

    @Override
    public void setNextHandler(FileHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".jpg")) {
            System.out.println("Opening JPG file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}