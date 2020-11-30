import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class productDatabase {
    static Integer howMuch(String name, HashMap<String, Integer> dataBase) {
        return dataBase.get(name);
    }

    static String productExpensive(HashMap<String, Integer> dataBase) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : dataBase.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    static double productsAverage(HashMap<String, Integer> dataBase) {
        double sumValue = 0;
        if (dataBase == null || dataBase.isEmpty()) {
            throw new UnsupportedOperationException("Null, or empty database are unsopported ");
        }
        for (Map.Entry<String, Integer> entry : dataBase.entrySet()) {
            sumValue += entry.getValue();
        }
        return sumValue / dataBase.size();
    }

    static int howMuchAbove(int num, HashMap<String, Integer> dataBase) {
        int picies = 0;
        for (Map.Entry<String, Integer> entry : dataBase.entrySet()) {
            if (entry.getValue() > num) {
                picies++;
            }
        }
        return picies;
    }

    static boolean isThereFor(int priceOfProduct, HashMap<String, Integer> dataBase) {
        boolean thereIs = false;
        for (Map.Entry<String, Integer> entry : dataBase.entrySet()) {
            if (entry.getValue().equals(priceOfProduct)) {
                thereIs = true;
            }
        }
        return thereIs;
    }

    static String productCheapest(HashMap<String, Integer> dataBase) {
        String minKey = null;
        int minValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : dataBase.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
        }
        return minKey;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> productsDatabase = new HashMap<String, Integer>();
        productsDatabase.put("Eggs", 200);
        productsDatabase.put("Milk", 200);
        productsDatabase.put("Fish", 400);
        productsDatabase.put("Apples", 150);
        productsDatabase.put("Bread", 50);
        productsDatabase.put("Chicken", 550);
        Integer fishCost = howMuch("Fish", productsDatabase);
        System.out.println(productsDatabase);
        System.out.println(fishCost);
        System.out.println("The most expensive product: " + productExpensive(productsDatabase));
        int priceOfProduct = 125;
        System.out.println(isThereFor(priceOfProduct, productsDatabase));
        int num = 300;
        System.out.println(howMuchAbove(num, productsDatabase) + " darab termék van " + num + " fölött");
        System.out.println("The chepest product is " + productCheapest(productsDatabase));
        System.out.println("The average price is " + productsAverage(productsDatabase));
        try {
            HashMap<String, Integer> emptyDb = new HashMap<String, Integer>();
            System.out.println("The average price is" + productsAverage(emptyDb));
            System.out.println("The average price is " + productsAverage(null));
        } catch (UnsupportedOperationException e) {
            System.out.println("Please use a valid database");
        }

    }
}