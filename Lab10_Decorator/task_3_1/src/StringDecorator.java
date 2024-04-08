abstract class StringDecorator extends PrintableString {
    protected PrintableString inner;

    public StringDecorator(PrintableString inner) {
        super("");
        this.inner = inner;
    }
}