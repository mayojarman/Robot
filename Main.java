package lifecyclerpg;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String answer;
        Scanner scnr = new Scanner(System.in);
        System.out.printf("You are a sentient Robot...\nkeeping track of your immortal life in this Solo Journaling RPG of Life and Decay.\n");
        System.out.print("Are you ready? yes/no : ");
        answer = scnr.next();
        answer.toLowerCase();

        if(answer.equals("yes")){
            System.out.println("Get ready for your Adventure!");
            System.out.println("Your story comes in 4 parts. We'll roll a couple d6s for you...");
            Act1 act1 = new Act1(scnr);
            act1.printMyInnerThoughts();

        }
        else if (answer.equals("no")){
            System.out.println("Why not?");
            //String why = "";
           // while(scnr.hasNextLine()){
            String why = scnr.nextLine();
           // }
            System.out.println("Oh, " + why + " is a very valid reason. Have a nice day!");
        }
    }
}
