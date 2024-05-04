class SaveDocumentCommand implements Command {
    private Document document;

    SaveDocumentCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}