package interfaces;
import java.lang.*;

public interface ShopOperations
{
    boolean insertShop(Shop s);
    boolean removeShop(Shop s);
    Shop searchShop(String sid);
    void showAllShops();
}