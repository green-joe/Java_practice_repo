public class Josephus {
    public static int josephus(int numberOfPlayers, int killRange) {
        int counter = 0;
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println(counter = (counter + killRange) % i);

        }
        return counter++;
    }
    public static void main(String[] args) {
        System.out.println("Winner " + josephus(7,2));
    }
}


