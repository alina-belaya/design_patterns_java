class PDFHandler implements FileHandler {
    private FileHandler nextHandler;

    @Override
    public void setNextHandler(FileHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void openFile(String fileName) {
        if (fileName.endsWith(".pdf")) {
            System.out.println("Opening PDF file: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        }
    }
}