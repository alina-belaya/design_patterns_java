class PrintDocumentCommand implements Command {
    private Document document;

    PrintDocumentCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}