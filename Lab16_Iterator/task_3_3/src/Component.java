import java.util.Iterator;

interface Component {
    void execute();
    Iterator<Component> iterator();
}