package lifecyclerpg;
import java.util.Scanner;
import java.util.Random;
public class Act1 {
    private String journal;
    public Act1(Scanner scnr){
        //Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
            
        int randInt1 = rand.nextInt(6);
        int randInt2 = rand.nextInt(6);
        int randInt3 = rand.nextInt(6);
        int randInt4 = rand.nextInt(6);
        int randInt5 = rand.nextInt(6);
        int randInt6 = rand.nextInt(6);

        //Act1

        System.out.println("You enter the first act of your life... your birth.");
        if(randInt1 == 1){
            System.out.println("Time Passes: The time counter ticks up by 1. Record this event in your journal to signify the passage of time and the Robot's early development.");
            System.out.print("what do you have to say? ");
            while(scnr.hasNextLine()){
                journal += scnr.nextLine();
            }
            System.out.println(journal);
        }
        if(randInt2 == 2){
            System.out.printf("\"What is the Robot's Purpose?\":\nAnswer the question and write it in your journal. This defines the primary objective of the Robot's existence.\n");
            System.out.print("what do you have to say? ");
            while(!(scnr.nextLine().equals(" "))){
                journal += scnr.nextLine();
            }
            System.out.println(journal);
        }
        if(randInt3 == 3){
            System.out.printf("\"Who is the Creator of the Robot?\" Answer the question and write it in your journal. This introduces the Robot's creator and their role in its creation.");
            System.out.print("what do you have to say? ");
            while(!(scnr.nextLine().equals(" "))){
                journal += scnr.nextLine();
            }
            System.out.println(journal);
        }
        if(randInt4 == 4){
            System.out.println("eatmybutt");
            System.out.print("what do you have to say? ");
            while(!(scnr.nextLine().equals(" "))){
                journal += scnr.nextLine();
            }
            System.out.println(journal);
        }
        if(randInt5 == 5){
            System.out.println("eatmybutt");
            System.out.print("what do you have to say? ");
            while(!(scnr.nextLine().equals(" "))){
                journal += scnr.nextLine();
            }
            System.out.println(journal);
        }
        if(randInt6 == 6){
            System.out.println("eatmybutt");
            System.out.print("what do you have to say? ");
            while(!(scnr.nextLine().equals(" "))){
                journal += scnr.nextLine();
            }
            System.out.println(journal);
        }

        }
        public void printMyInnerThoughts(){
            System.out.println("eat my butt");
        }
    }
