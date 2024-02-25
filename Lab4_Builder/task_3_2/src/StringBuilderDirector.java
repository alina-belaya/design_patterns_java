class StringBuilderDirector {
    private StringBuilderInterface stringBuilderBuilder;

    public StringBuilderDirector(StringBuilderInterface stringBuilderBuilder) {
        this.stringBuilderBuilder = stringBuilderBuilder;
    }

    public void construct() {
        stringBuilderBuilder.append("Original string ");
        stringBuilderBuilder.insert(16, "[Inserted string]");
    }
}