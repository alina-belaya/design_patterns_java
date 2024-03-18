public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "text.txt";

            FileProcessor fileProcessor = FileProcessor.getInstance();

            String fileContent = fileProcessor.readFile(filePath);
            System.out.println("File Content:\n" + fileContent);

            String wordToCount = "singleton";
            int count = fileProcessor.countWordOccurrences(filePath, wordToCount);
            System.out.println("Occurrences of '" + wordToCount + "': " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
