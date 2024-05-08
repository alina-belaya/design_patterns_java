import java.util.*;

class CompositeIterator implements Iterator<Component> {
    private Stack<Iterator<Component>> stack = new Stack<>();

    public CompositeIterator(Iterator<Component> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator<Component> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Component next() {
        if (hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();
            if (component instanceof Box) {
                stack.push(component.iterator());
            }
            return component;
        }
        throw new NoSuchElementException();
    }
}