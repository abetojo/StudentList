package studentlist;
/**
 * SYST17796 Fundamentals of Software Design and Development
 * @author Joshua Abeto
 */
import java.util.Scanner;
public class ArrayReversing {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = input.nextLine();
        char[] myLetters = new char[6];
        myLetters[0] = 'J';
        myLetters[1] = 'O';
        myLetters[2] = 'S';
        myLetters[3] = 'H';
        myLetters[4] = 'U';
        myLetters[5] = 'A';
        
        for(int i=0; i<myLetters.length;i++){
            System.out.println(myLetters[i]);
        }
        for(int i = myLetters.length - 1; i >= 0; i--){
            System.out.println(myLetters[i]);
        }

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
