public class Main {
    public static void main(String[] args) {
        Beverage espressoWithSugar = new Sugar(new Espresso(), 2);
        System.out.println(espressoWithSugar);

        Beverage darkRoastWithWhippedCreamAndSugar = new Sugar(new WhippedCream(new DarkRoast()), 2);
        System.out.println(darkRoastWithWhippedCreamAndSugar);

        Beverage darkRoastWithCreamAndOneSugar = new Sugar(new Cream(new DarkRoast()), 1);
        System.out.println(darkRoastWithCreamAndOneSugar);

        Beverage decafWithMilkAndSugar = new Sugar(new Milk(new Decaf()), 2);
        System.out.println(decafWithMilkAndSugar);
    }
}