class PostExclaimDecorator extends StringDecorator {
    public PostExclaimDecorator(PrintableString inner) {
        super(inner);
    }

    public void print() {
        inner.print();
        System.out.print("!");
    }
}