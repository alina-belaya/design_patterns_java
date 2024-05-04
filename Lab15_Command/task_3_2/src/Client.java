public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.saveButton.click();
        editor.printButton.click();
        editor.saveMenuItem.select();
        editor.printMenuItem.select();
        editor.showInfoMenuItem.select();
        editor.saveShortcut.press();
        editor.printShortcut.press();
    }
}
