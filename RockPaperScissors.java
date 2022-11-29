import java.util.*;
import javax.swing.*;
public class RockPaperScissors
//Set up a GUI for Rock, Paper, Scissors Program
{
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args)
   {
      int score, computer, points;
      String computerInput, user, results, repeat;   
      
      //Initialize Starting Point Count
      points = 0;
      
      //starting loop
      
      repeat = "0"; 
      
      while(repeat.equals("0"))
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
      
         user = JOptionPane.showInputDialog("Rock, Paper or Scissors?");

         /*
         System.out.print("Rock, Paper, or Scissors? " + 
            "(Must be capitalized) ");
         user = input.next();
         */
         
         
         results = "Rock, Paper, Scissors...\n                        \nYou: " + user + "         " + "COM: " + computerInput;
         
         /*
         System.out.println("Rock, Paper, Scissors...");
         System.out.println("                        ");
         System.out.println("You: " + user +"         " + "COM: " + computerInput);
         */
         
         JOptionPane.showMessageDialog(null, results,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
                  
         if(user.equals(computerInput)) 
         JOptionPane.showMessageDialog(null, "It's a tie!\nNo points given!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
                  
            
            
         else if(user.equals("Rock"))
            if(computerInput.equals("Scissors"))
            {
               points = points + 1;
               JOptionPane.showMessageDialog(null, "You win!\n1 point given!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
                                
              
            }
            else
            {
      
               points = points - 1;
               JOptionPane.showMessageDialog(null, "Sorry, you lose.\n1 point lost!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
              
            }    
            
         else if(user.equals("Paper"))
            if(computerInput.equals("Rock"))
            {
              
               points = points + 1;
               JOptionPane.showMessageDialog(null, "You win!\n1 point given!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
               
            }
            else
            {
               
               points = points - 1;
               JOptionPane.showMessageDialog(null, "Sorry, you lose.\n1 point lost!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
               
            }
          
         else if(user.equals("Scissors"))
            if(computerInput.equals("Paper"))
            {
              
               points = points + 1;
               JOptionPane.showMessageDialog(null, "You win!\n1 point given!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
               
            }
            else
            {
               
               points = points - 1;
               JOptionPane.showMessageDialog(null, "Sorry, you lose.\n1 point lost!\n" + "Current Points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
              
            }
           
         repeat = JOptionPane.showInputDialog("\nWould you like to play again?\n" + 
               "(0 for yes or 1 for no.) ");
       
         
        
      }
    
     JOptionPane.showMessageDialog(null, "Thanks for playing!\nYour points: " + points,
                                   "Rock, Paper, Scissors",
                                JOptionPane.INFORMATION_MESSAGE);
   }
}
