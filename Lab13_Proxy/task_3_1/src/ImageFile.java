import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Зображення
 */
class ImageFile implements DisplayObject {
    final private String path;
    private BufferedImage image;

    public ImageFile(String path) {
        this.path = path;
    }

    public void display() {
        if (image == null) {
            image = load();
        }
        System.out.println("Displaying image.");
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }

    private BufferedImage load() {
        System.out.println("Loading image " + path + "...");
        BufferedImage img = null;
        File file = new File(path);
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}