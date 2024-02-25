class ConcreteStringBuilder implements StringBuilderInterface {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void append(String str) {
        stringBuilder.append(str);
    }

    @Override
    public void insert(int index, String str) {
        stringBuilder.insert(index, str);
    }

    @Override
    public String getResult() {
        return stringBuilder.toString();
    }
}