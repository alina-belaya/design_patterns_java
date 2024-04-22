interface FileHandler {
    void setNextHandler(FileHandler handler);
    void openFile(String fileName);
}