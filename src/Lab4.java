

public class Lab4 {
    public static void main(String[] args)
    {
        Car car = new Car("M5 F90","BMW",2015,3,200000F,"Red");
        System.out.printf("Car:[%s]\n",car.toString());
        car.sell();

        System.out.println("=========Car info===========");
        System.out.printf("model:[%s]\nbrand:[%s]\nyear:[%d]\ncolor:[%s]\nquantity:[%d]\nprice:[%.1f]",
                car.getModel(),car.getBrand(),car.getYear(),car.getColor(),car.getQuantity(),car.getPrice());

        car.setBrand("Skoda");
        car.setModel("Fabia");
        car.setPrice(6000);
        car.setQuantity(100);
        car.delivery();
        System.out.println("====================");
        System.out.printf("\nCar:[%s]\n",car.toString());

    }
}
