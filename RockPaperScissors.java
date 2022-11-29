import java.util.*;
public class RockPaperScissors
//Set up a GUI for Rock, Paper, Scissors Program
{
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args)
   {
      int score, computer, points, repeat;
      String computerInput, user;   
      
      //Initialize Starting Point Count
      points = 0;
      
      //starting loop
      repeat = 0;
      while(repeat == 0)
      {
         //Variable Set-Up Section
         computer = (int)(Math.random()*3+1); //randomizes Computer Input between 1 and 3
         if(computer == 1)
            computerInput = "Rock";
         else if(computer == 2)
            computerInput = "Paper";
         else 
            computerInput = "Scissors";
      
         //User Interface Section
         System.out.print("Rock, Paper, or Scissors? " + 
            "(Must be capitalized) ");
         user = input.next();
         System.out.println("Rock, Paper, Scissors...");
         System.out.println("                        ");
         System.out.println("You: " + user +"         " + "COM: " + computerInput);
         
                  
         if(user.equals(computerInput)) 
            System.out.print("It's a tie!\nNo points given!\n");
            
         else if(user.equals("Rock"))
            if(computerInput.equals("Scissors"))
            {
               System.out.print("You win!\n1 point given!\n");
               points = points + 1;
               System.out.print("Current Points: " + points);
            }
            else
            {
               System.out.print("Sorry, you lose.\n1 point lost!\n");
               points = points - 1;
               System.out.print("Current Points: " + points);
            }    
            
         else if(user.equals("Paper"))
            if(computerInput.equals("Rock"))
            {
               System.out.print("You win!\n1 point given!\n");
               points = points + 1;
               System.out.print("Current Points: " + points);
            }
            else
            {
               System.out.print("Sorry, you lose.\n1 point lost!\n");
               points = points - 1;
               System.out.print("Current Points: " + points);
            }
          
         else if(user.equals("Scissors"))
            if(computerInput.equals("Paper"))
            {
               System.out.print("You win!\n1 point given!\n");
               points = points + 1;
               System.out.print("Current Points: " + points);
            }
            else
            {
               System.out.print("Sorry, you lose.\n1 point lost!\n");
               points = points - 1;
               System.out.println("Current Points: " + points);
            }
           
         System.out.print("\nWould you like to play again?\n" + 
               "(0 for yes or 1 for no.) ");
         repeat = input.nextInt();
      }
     System.out.print("Thanks for playing!\nYour points: " + points); 
   }
}