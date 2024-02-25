public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructHatchback(builder);
        Car hatchbackCar = builder.getResult();
        System.out.println(hatchbackCar);

        director = new Director();
        builder = new CarBuilder();
        director.constructSedan(builder);
        Car sedanCar = builder.getResult();
        System.out.println(sedanCar);
    }
}