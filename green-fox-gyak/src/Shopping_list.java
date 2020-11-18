import java.util.LinkedHashMap;
import java.util.Map;


public class Shopping_list {
    public static double summerize(LinkedHashMap<String, Double> itemPriceList, LinkedHashMap<String, Integer> shoppingList) {
        int sum = 0;
        for (Map.Entry<String, Integer> listElement : shoppingList.entrySet()) {
            String key = listElement.getKey();
            Integer value = listElement.getValue();
            sum += (value * itemPriceList.get(key));

        }
        return sum;

    }

    public static void show(double bob, double alice) {
        if (alice > bob) {
            System.out.println("Alice többet vásárolt, mint Bob");
            System.out.println("Alice " + alice + " költött");
        } else {
            System.out.println("Bob többet vásárolt, mint Alice");
            System.out.println("Bob " + bob + " költött");
        }

    }

    public static void main(String[] args) {
        LinkedHashMap<String, Double> itemList = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> bobList = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> aliceList = new LinkedHashMap<>();
        itemList.put("Milk", 1.07);
        itemList.put("Rice", 1.59);
        itemList.put("Eggs", 3.14);
        itemList.put("Cheese", 12.60);
        itemList.put("Chicken Breasts", 9.40);
        itemList.put("Apples", 2.31);
        itemList.put("Tomato", 2.58);
        itemList.put("Potato", 1.75);
        itemList.put("Onion", 1.10);
        bobList.put("Milk", 3);
        bobList.put("Rice", 2);
        bobList.put("Eggs", 2);
        bobList.put("Cheese", 1);
        bobList.put("Chicken Breasts", 4);
        bobList.put("Apples", 1);
        bobList.put("Tomato", 2);
        bobList.put("Potato", 1);
        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);
        double bobExpenses = summerize(itemList, bobList);
        double aliceExpenses = summerize(itemList, aliceList);
        System.out.println("Bob "+bobExpenses+" Ft-ot fizet");
        System.out.println("Alice "+aliceExpenses+" Ft-ot fizet");

        show(bobExpenses, aliceExpenses);
        int bobRice=bobList.get("Rice");
        System.out.println("Bob rizse: "+bobRice);
        int aliceRice=aliceList.get("Rice");
        System.out.println("Alice rizse: "+aliceRice);
        System.out.println("");
        if(bobRice>aliceRice) {
            System.out.println("Bob vásárolt több rizset");
        }else{
            System.out.println("Alice vásárolt több rizset" );
        }
        int bobPotatoes=bobList.get("Potato");
        System.out.println("Bob krumplija: "+bobPotatoes);
        int alicePotatoes=aliceList.get("Rice");
        System.out.println("Alice krumplija: "+alicePotatoes);
        System.out.println("");
        if(bobPotatoes>alicePotatoes) {
            System.out.println("Bob vásárolt több krumplit");
        }
        if(bobPotatoes<alicePotatoes){
            System.out.println("Alice vásárolt több krumplit" );
        }
        if(alicePotatoes==bobPotatoes){
            System.out.println("Egyforma mennyiségű krumplit vásároltak.");
        }
    }
}
