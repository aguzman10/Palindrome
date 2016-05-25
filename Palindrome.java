package palindrome;

import java.util.*;
/**
 *
 * @author Alejandro Guzman
 * Software Engineering major - UTD
 */
public class Palindrome 
{
    public static void main(String[] args) 
    {
        String word;
        Scanner scan = new Scanner(System.in);
        Stack wordCheck = new Stack();
        int index = 0;
        boolean sameWord = true;
        
        System.out.print("Please enter the word you wish to check: ");
        word = scan.next();
        
        for(int i = 0; i < word.length(); i++)
        {
            wordCheck.push(new Character(word.charAt(index)));
            index++;
        }
        
        index = 0;
        
        while(sameWord&&(index < wordCheck.size()))
        {
            if(word.charAt(index) == ((Character)wordCheck.pop()).charValue())
            {
               index++;
               continue;
            }
            else
            {
                sameWord = false;
                break;
            }
        }
        if(sameWord == true)
        {
            System.out.print("This word is a palindrome");
        }
        else
        {
            System.out.print("This word is not a palindrome");
        }
    }
}
