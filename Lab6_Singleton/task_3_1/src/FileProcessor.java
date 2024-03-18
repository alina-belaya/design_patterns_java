import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessor {

    private static FileProcessor instance;

    private FileProcessor() {
    }

    public static FileProcessor getInstance() {
        if (instance == null) {
            instance = new FileProcessor();
        }
        return instance;
    }

    public String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public int countWordOccurrences(String filePath, String word) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += line.split("\\b" + word + "\\b").length - 1;
            }
        }
        return count;
    }
}
