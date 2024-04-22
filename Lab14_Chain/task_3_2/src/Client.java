public class Client {
    public static void main(String[] args) {
        String[] files = {
                "image.jpg", "image.png", "document.docx", "document.doc",
                "table.xls", "table.xlsx", "presentation.pptx", "document.pdf"
        };

        FileHandler jpgHandler = new JPGHandler();
        FileHandler pngHandler = new PNGHandler();
        FileHandler docxHandler = new DOCXHandler();
        FileHandler pdfHandler = new PDFHandler();
        FileHandler pptxHandler = new PPTXHandler();

        jpgHandler.setNextHandler(pngHandler);
        pngHandler.setNextHandler(docxHandler);
        docxHandler.setNextHandler(pdfHandler);
        pdfHandler.setNextHandler(pptxHandler);

        for (String file : files) {
            jpgHandler.openFile(file);
        }


    }
}
