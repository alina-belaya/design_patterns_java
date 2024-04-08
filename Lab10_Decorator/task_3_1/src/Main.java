public class Main {
    public static void main(String[] args) {
        PrintableString base = new PrintableString("");
        PrintableString decorated = new PostExclaimDecorator(
                new PostWordDecorator(
                        new PostSpaceDecorator(
                                new PostComaDecorator(
                                        new PreWordDecorator(base, "Hello")
                                )
                        ),
                        "World"
                )
        );
        decorated.print();
    }
}