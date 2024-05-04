class ShowInfoDocumentCommand implements Command {
    private Document document;

    ShowInfoDocumentCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.showInfo();
    }
}