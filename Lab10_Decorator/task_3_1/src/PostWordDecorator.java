class PostWordDecorator extends StringDecorator {
    private String word;

    public PostWordDecorator(PrintableString inner, String word) {
        super(inner);
        this.word = word;
    }

    public void print() {
        inner.print();
        System.out.print(word);
    }
}