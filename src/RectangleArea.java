import java.util.Scanner;
public class RectangleArea {
    private float a = 0, b = 0, area;
    public RectangleArea()
    {
        getData();
        computeField();
        fieldDisplay();
    }
    public void fieldDisplay()
    {
        System.out.printf("area = %.1f\n",area);
    }
    public void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        if(scanner.hasNextFloat())
            a = scanner.nextFloat();
        System.out.println("Enter width:");
        if(scanner.hasNextFloat())
            b = scanner.nextFloat();
    }
    public void computeField()
    {
        area = a * b;
    }
}
