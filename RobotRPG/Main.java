


import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int lifeCyclePoint = 1;
        int time = 4;

        //System.out.printf("You are a sentient Robot...\nkeeping track of your immortal life in this Solo Journaling RPG of Life and Decay.\n");
        //System.out.printf("Starting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life. Hopefully, at the end, you can look back and be happy.\nAct 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.\nYou create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?\n");
        //System.out.printf("Clocks: As you progress, time is running out. Everytime the Time Passes 1 will be taken away from your time. After 4 Time Passes, you progress to the next Cycle of your Life. \nFor every Event that is not the Time Passes you get 1XP in this Lifecycle. If you get 5XP you get a +1 to your first Dice roll in the next Lifecycle. \nIf you roll the same Event more than three times it becomes a Time Passes Event. Mark your rolls in the checkboxes. \nFor the Conclusion, you sum up the overall XP and with every 5XP you unlock a new final Question, answer them one after another. \nCan you get all 4 Conclusion Questions unlocked? \nWhat may your story be?\n");
        
        
        //System.out.print("...lets begin with Act1: your birth.");
        //System.out.println("Your virtual DM will be rolling some d6s to determine what you'll be writing about!");
        //theWholeShebang(time, lifeCyclePoint,scnr);

        //System.out.println("You have reached the end of your Robot Life!");


    }
    public static void act(int lifeCyclePoint){
        Scene scene = new Scene();
        int temp = scene.randInt();
        System.out.println("You rolled a " + temp + " on the die. That means you'll write for this prompt: ");
        scene.setScene(lifeCyclePoint);
        scene.printSelection();
    }
    public static void theWholeShebang(int time, int lifeCyclePoint,Scanner scnr){
        while(time != 0){
            Scene scene = new Scene();
            scene.time(time);
            act(lifeCyclePoint);
            lifeCyclePoint++;
            Journal journal = new Journal();
            journal.addToJournal(scnr);
        }
    }
    
}
