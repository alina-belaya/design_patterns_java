class PostEndlDecorator extends StringDecorator {
    public PostEndlDecorator(PrintableString inner) {
        super(inner);
    }

    public void print() {
        inner.print();
        System.out.println();
    }
}