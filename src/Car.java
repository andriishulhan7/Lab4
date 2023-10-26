import java.util.Random;

public class Car {
    private String model, brand, color;
    private int year, quantity;
    private float price;

    public Car(String model,String brand,int year,int quantity,float price,String color)
    {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
    }
    public String getModel(){return model;}
    public String getBrand(){return brand;}
    public String getColor(){return color;}
    public int getYear(){return year;}
    public int getQuantity(){return quantity;}
    public float getPrice(){return price;}
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
    public String toString()
    {
        return String.format("model:%s brand:%s year:%d quantity:%d",model,brand,year,quantity);
    }
    public void sell()
    {
        quantity--;
    }
    public void delivery()
    {
        quantity++;
    }
}
