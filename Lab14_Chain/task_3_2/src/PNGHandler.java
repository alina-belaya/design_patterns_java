class PNGHandler implements FileHandler {
    private FileHandler nextHandler;

    @Override
    public void setNextHandler(FileHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".png")) {
            System.out.println("Opening PNG file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}