package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCount = 0;
        System.out.print("Enter first word: ");
        wordCount++;
        String previousWord = scan.nextLine();
        while (score < 50) {
            System.out.print("Enter next word: ");
            String word = scan.nextLine();
            wordCount++;
            
            if (word.equals(previousWord)){
                score -= 10;
                System.out.println("-10 points: current word is the same as previous word; SCORE: " + score);
            } else if (word.compareTo(previousWord) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } else {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }
            if (!word.equals(previousWord) && word.contains(previousWord.substring(0,1))) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            
            if (!word.equals(previousWord) && previousWord.substring(previousWord.length()-2).equals(word.substring(0, 2))){
                score += 5;
                System.out.println("+5 points: last 2 letters of previous word match first 2 letters of current; SCORE: " + score);
            }

            if (!word.equals(previousWord) && word.length() == previousWord.length()){
                score += 5;
                System.out.println("+5 points: word length matches previous word length; SCORE: " + score);
            }
            previousWord = word;
        }
        System.out.println("You WIN! It took you " + wordCount + " words! Try again for a lower word count :)");
        scan.close();
    }
}