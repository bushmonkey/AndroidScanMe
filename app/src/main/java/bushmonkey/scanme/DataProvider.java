package bushmonkey.scanme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by will on 8/19/2015.
 */
public class DataProvider
{
    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> ShoppingDetails = new HashMap<String, List<String>>();
        List<String> Vegetables = new ArrayList<String>();
        Vegetables.add("Cucumber");
        ShoppingDetails.put("Vegetables",Vegetables);

        return ShoppingDetails;
    }
}
