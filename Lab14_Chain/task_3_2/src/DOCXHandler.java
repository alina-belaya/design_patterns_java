class DOCXHandler implements FileHandler {
    private FileHandler nextHandler;

    @Override
    public void setNextHandler(FileHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".docx")) {
            System.out.println("Opening DOCX file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}