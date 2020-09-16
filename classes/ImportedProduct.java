package classes;
import java.lang.*;


public class ImportedProduct extends Product
{
    private String countryName;

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void showInfo()
    {
        System.out.println();
        System.out.println("Product name               : " + name);
        System.out.println("Product ID                 : " + pid);
        System.out.println("Product available quantity : " + availableQuantity);
        System.out.println("Product Price              : " + price);
        System.out.println("Product Country Name       : " + countryName);
        System.out.println();


    }
}
