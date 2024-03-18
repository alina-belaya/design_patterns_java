public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        CarBuilder builder = new CarBuilder();

        director.constructHatchback(builder);
        Car hatchbackCar = builder.getResult();
        System.out.println(hatchbackCar);

        builder = new CarBuilder();
        director.constructSedan(builder);
        Car sedanCar = builder.getResult();
        System.out.println(sedanCar);

    }
}
