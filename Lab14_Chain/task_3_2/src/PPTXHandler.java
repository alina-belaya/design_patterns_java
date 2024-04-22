class PPTXHandler implements FileHandler {
    private FileHandler nextHandler;

    @Override
    public void setNextHandler(FileHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".pptx")) {
            System.out.println("Opening PPTX file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}