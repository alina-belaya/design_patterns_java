class PostSpaceDecorator extends StringDecorator {
    public PostSpaceDecorator(PrintableString inner) {
        super(inner);
    }

    public void print() {
        inner.print();
        System.out.print(" ");
    }
}