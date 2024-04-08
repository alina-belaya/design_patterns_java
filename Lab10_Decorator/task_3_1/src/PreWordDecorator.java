class PreWordDecorator extends StringDecorator {
    private String word;

    public PreWordDecorator(PrintableString inner, String word) {
        super(inner);
        this.word = word;
    }

    public void print() {
        System.out.print(word);
        inner.print();
    }
}