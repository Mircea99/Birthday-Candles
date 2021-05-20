import java.util.Scanner;

public class Candles {

    public static void main(String[] args) {

        //get the number o candles
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age input : ");
        int numberOfCandles = scanner.nextInt();

        //get the candles heigths
        System.out.println("Candles heigth input : ");
        String heigths = "";
        heigths += scanner.nextLine();
        scanner.close();

        int[] candlesHeigth = new int[numberOfCandles];

        //get rid of whitespaces
        heigths = heigths.replaceAll("\\s+", "");
        char[] asChars = heigths.toCharArray();

        //convert char array to int array to be able to compare
        for (int i = 0; i <= candlesHeigth.length+1; i++) {
            candlesHeigth[i] = asChars[i];
        }

        birthdayCakeCandles(candlesHeigth);

    }

    public static int birthdayCakeCandles(int[] candlesHeigth) {

        //variables to determine the max candle heigth and count how many they are
        //get the max heigth
        int maxHeigth = 0;
        for (int i = 0; i < candlesHeigth.length; i++) {
            if (candlesHeigth[i] > maxHeigth) {
                maxHeigth = candlesHeigth[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < candlesHeigth.length; i++) {
            if (candlesHeigth[i] == maxHeigth) {
                counter++;
            }
        }
        return counter;
    }
}
