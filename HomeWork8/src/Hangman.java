
import java.util.*;

/*
@author: Kishan

Project: Hangman.java
Description: A hangman game that randomly generates a word and prompts the user
to guess one letter at a time, as shown in the sample run. Each letter in the
word is displayed as an asterisk. When the user makes a correct guess, the actual
letter is then displayed. When the user finishes a word, display the number of
misses and ask the user whether to continue to play with another word.

 */
public class Hangman {

    public static void main(String[] args) {

        System.out.println("HANGMAN GAME\n");

        Random rand = new Random();
        String[] words = {"daffy", "thick", "shock", "unsightly", "house", "bawdy",
            "stone", "advice", "outrageous", "punishment", "literate", "zebra",
            "picture", "racial", "chilly", "colorful", "beef", "form", "school",
            "attend", "book", "crash", "shy", "innocent", "friction"}; //Array of various words.
        String choice;
        do { //do-while for running the program until user says 'no' to a new word.
            StringBuilder word = new StringBuilder(words[rand.nextInt(25)]); //Selecting a random word from the array.
            StringBuilder newword = new StringBuilder(word); //Copy word into a new object for future reference.
            char[] letters = word.toString().toCharArray(); //Get letters in the word in an array.
            for (int i = 0; i < word.length(); i++) { //Setting all characters in the word to *.

                word.deleteCharAt(i);
                word.insert(i, '*');
            }
            System.out.println("\nA new word has been selected!\nIt has " + word.length() + " letters!!");

            int n = 0;
            boolean guess = true;
            Scanner input = new Scanner(System.in);
            do { //do-while for guessing the word. Goes on until correct word is guessed OR until 7 incorrect tries.
                
                int has=0;
                System.out.printf("\nYou have (%d) correct guess(es) remaining!!\n", (7 - n));
                System.out.printf("Correct Guess #%d : Enter a letter in |%s| - ", n + 1, word);
                char c = input.next().charAt(0); //Input a guess character.

                for (int i = 0; i < letters.length; i++) {

                    if (c == letters[i] && c != word.charAt(i)) { //Check if character is in the letters array and not already guessed.

                        word.setCharAt(i, c);
                        has=1;
                    } else if (c == word.charAt(i)) { //Character is already guessed and is in the word.

                        System.out.printf("\n'%c' is already in the word!", c);
                        has=1;
                    }
                }

                if (has==0) { //Incorrect guess.

                    System.out.printf("\n'%c' is not a letter in the word!\n", c);
                    n++;
                } else {
                
                    System.out.println("\nCORRECT!");
                }
                
                if (word.toString().equals(newword.toString())) { //If entire word is guessed, exit the do-while loop.
                
                    guess = false;
                }
            } while (n < 7 && guess);

            if (!guess) { //Word is guessed correctly. Stats are displayed.

                System.out.println("\nCONGRATULATIONS! You guessed the word correctly!!");
                System.out.printf("The word was %s. You had %d wrong guess(es).", newword, n);
            } else if (n == 7) { //User could not guess the word even after 7 incorrect attempts.

                System.out.println("\nUH OH!! You couldn't guess the word. The correct word was " + newword);
            }

            System.out.print("\nDo you want to guess another word? (y/n): ");
            choice = input.next();
        } while ("y".equals(choice.toLowerCase()));
    }//end of main.
}//end of Hangman
