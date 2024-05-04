public class TextEditor {
    private Document document;
    Button saveButton;
    Button printButton;
    MenuItem saveMenuItem;
    MenuItem printMenuItem;
    MenuItem showInfoMenuItem;
    Shortcut saveShortcut;
    Shortcut printShortcut;

    public TextEditor() {
        document = new Document("blank.txt");

        saveButton = new Button();
        printButton = new Button();

        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();

        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();

        SaveDocumentCommand saveCommand = new SaveDocumentCommand(document);
        PrintDocumentCommand printCommand = new PrintDocumentCommand(document);
        ShowInfoDocumentCommand showInfoCommand = new ShowInfoDocumentCommand(document);

        saveButton.setCommand(saveCommand);
        printButton.setCommand(printCommand);

        saveMenuItem.setCommand(saveCommand);
        printMenuItem.setCommand(printCommand);
        showInfoMenuItem.setCommand(showInfoCommand);

        saveShortcut.setCommand(saveCommand);
        printShortcut.setCommand(printCommand);
    }
}