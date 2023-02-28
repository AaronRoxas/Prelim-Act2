
import java.util.Scanner;


public class Activity2 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = "yes";
        String again = "no";
        int choice;
        String word = "";

        do
        {
            System.out.print("\nThis is a String Function Demo in JAVA "
            +"\n[1] Concatenation"
            +"\n[2] Replace first letter with 'A'. "
            +"\n[3] Replace the letter 'a' with 'the'. "
            +"\n[4] Get the length of a word"
            +"\n[5] Ends with (Checks if the word is ending with the letter a)"
            +"\n[6] EXIT"
            +"\nSelect Number: ");
            choice = s.nextInt();


        switch(choice)
        {
            case 1:
                while(a.equalsIgnoreCase("yes"))
                {
                    System.out.print("Enter first word: ");
                    word = s.next();
                    System.out.print("Enter second word: ");
                    String secondWord = s.next();

                    System.out.println("\nFirst word: " + word
                            + "\nSecond Word: " + secondWord
                            +"\nConcatenated Word: "+ word.concat(secondWord));
                    System.out.print("\nTry Again? [yes]/[no]: ");
                    a = s.next();

                    if (a.equalsIgnoreCase("no"))
                    {
                        System.out.print("Do you want to go back to the Main Menu? [yes][no]: ");
                        a = s.next();

                            if(a.equalsIgnoreCase("yes"))
                            {
                                again = "yes";
                                break;
                            }
                    }
                }
                break;

            case 2:
                while(a.equalsIgnoreCase("yes"))
                {
                    System.out.print("Enter a word: ");
                    word = s.next();
                    
                    char first = word.charAt(0);
                    
                    System.out.println("\nEntered word: " + word 
                            +"\nUpdated Word: " + word.replace(first, 'A'));   
                    System.out.print("\nTry Again? [yes]/[no]: ");
                    a = s.next();

                    if (a.equalsIgnoreCase("no"))
                    {
                        System.out.print("Do you want to go back to the Main Menu? [yes][no]: ");
                        a = s.next();

                        if(a.equalsIgnoreCase("yes"))
                        {
                            again = "yes";
                            break;
                        }
                    }
                }
                break;

            case 3:
             while(a.equalsIgnoreCase("yes"))
             {
                    System.out.print("Enter a word: ");
                    word = s.next();

                    System.out.println("\nEntered word: " + word 
                            +"\nUpdated Word: " + word.replace("a", "the"));   

                    System.out.print("\nTry Again? [yes]/[no]: ");
                    a = s.next();

                    if (a.equalsIgnoreCase("no"))
                        {
                            System.out.print("Do you want to go back to the Main Menu? [yes][no]: ");
                            a = s.next();

                            if(a.equalsIgnoreCase("yes"))
                            {
                                again = "yes";
                                break;
                            }
                        }  
             }
             break;

            case 4:
             while(a.equalsIgnoreCase("yes"))
             {
                    System.out.print("Enter a word: ");
                    word = s.next();
                    
                    System.out.println("\nEntered word: " + word + "\nLength of the Word: " + word.length());

                    System.out.print("\nTry Again? [yes]/[no]: ");
                    a = s.next();

                
                
                    if (a.equalsIgnoreCase("no"))
                    {   
                        System.out.print("Do you want to go back to the Main Menu? [yes][no]: ");
                        a = s.next();

                        if(a.equalsIgnoreCase("yes"))
                        {
                            again = "yes";
                            break;
                        }
                    }
             }
             break;

            case 5:
             while(a.equalsIgnoreCase("yes"))
             {
                    System.out.print("Enter a word: ");
                    word = s.next();
                    
                    System.out.println("\nEntered word: " + word
                            +"\nDoes it end with letter 'a': " + word.endsWith("a"));

                    System.out.print("\nTry Again? [yes]/[no]: ");
                    a = s.next();

                    if (a.equalsIgnoreCase("no"))
                    {
                        System.out.print("Do you want to go back to the Main Menu? [yes][no]: ");
                        a = s.next();

                        if(a.equalsIgnoreCase("yes"))
                        {
                            again = "yes";
                            break;
                        }
                    }     
             }
             break;

             case 6:
                System.out.println("Program Closed");
                System.exit(0);
                break;
        }
        }while(again.equalsIgnoreCase("yes"));
 }
}
