import java.util.*;

class Box implements Component {
    private final List<Component> children = new ArrayList<>();
    private final int id;

    public Box(int id) {
        this.id = id;
    }

    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void execute() {
        for (Component component : children) {
            component.execute();
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new CompositeIterator(children.iterator());
    }
}