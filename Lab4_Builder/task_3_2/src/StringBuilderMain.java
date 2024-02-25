public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilderInterface stringBuilderBuilder = new ConcreteStringBuilder();
        StringBuilderDirector director = new StringBuilderDirector(stringBuilderBuilder);
        director.construct();
        String result = stringBuilderBuilder.getResult();

        System.out.println("Result: " + result);
    }
}
