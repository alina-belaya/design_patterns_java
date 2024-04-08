class PostComaDecorator extends StringDecorator {
    public PostComaDecorator(PrintableString inner) {
        super(inner);
    }

    public void print() {
        inner.print();
        System.out.print(",");
    }
}