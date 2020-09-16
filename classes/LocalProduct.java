package classes;
import java.lang.*;

public class LocalProduct extends Product
{

    private double discountRate;

    public void setDiscountRate(Double discountRate)
    {
        this.discountRate = discountRate;
    }

    public double getDiscountRate()
    {
        return discountRate;
    }

    public void showInfo()
    {
        System.out.println();
        System.out.println("Product name               : " + name);
        System.out.println("Product ID                 : " + pid);
        System.out.println("Product available quantity : " + availableQuantity);
        System.out.println("Product Price              : " + price);
        System.out.println("Product Discount Rate      : " + getDiscountRate());
        System.out.println();


    }
}
