

//import java.sql.Time;
import java.util.Scanner;

//import org.w3c.dom.events.Event;

public class Main{
    public static void main(String[] args){
        String answer;
        Scanner scnr = new Scanner(System.in);
        //Scene act1;
        //int currTime;
       // Scenes act1;
        System.out.printf("You are a sentient Robot...\nkeeping track of your immortal life in this Solo Journaling RPG of Life and Decay.\n");
        System.out.printf("Starting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life. Hopefully, at the end, you can look back and be happy.\nAct 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.\nYou create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?\n");
        System.out.printf("Clocks: As you progress, time is running out. Everytime the Time Passes 1 will be taken away from your time. After 4 Time Passes, you progress to the next Cycle of your Life. \nFor every Event that is not the Time Passes you get 1XP in this Lifecycle. If you get 5XP you get a +1 to your first Dice roll in the next Lifecycle. \nIf you roll the same Event more than three times it becomes a Time Passes Event. Mark your rolls in the checkboxes. \nFor the Conclusion, you sum up the overall XP and with every 5XP you unlock a new final Question, answer them one after another. \nCan you get all 4 Conclusion Questions unlocked? \nWhat may your story be?\n");
        System.out.print("Are you ready? yes/no : ");
        answer = scnr.next();
        answer = answer.toLowerCase();

        if(answer.equals("yes")){
            System.out.println("Get ready for your Adventure!");
            System.out.println("Your story comes in 4 parts. We'll roll a couple d6s for you...");
            Scene act1 = new Scene("happy","Stroll","capulets","montigues","hair","dolls");
            act1.input(scnr);
        }
        else if (answer.equals("no")){
            System.out.printf("Why not?\nPlease type enter and then \"end\" when you are done with your reason.");
            String why = "";
            while(!(scnr.next().equals("end"))){
            why = scnr.nextLine();
              }
            System.out.println("Oh, " + why + " is a very valid reason. Have a nice day!");
        }
        scnr.close();
    }

    
}
