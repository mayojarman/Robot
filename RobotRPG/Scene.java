//package lifecyclerpg;
import java.util.Scanner;
import java.util.Random;
public class Scene {
    private String journal;
    private int currTime = 0;
    private String[] optionList;
    public Scene(){
    }
    public Scene(String option1, String option2, String option3, String option4, String option5, String option6){
        System.out.printf("\n\t" + option1 + "\n\t"+ option2 +"\n\t" + option3+"\n\t" + option4+"\n\t" + option5+"\n\t" + option6+ "\n");
        int hello = this.randInt(6);
        optionList = new String[6];
        optionList[0] = option1;
        optionList[1] = option2;
        optionList[2] = option3;
        optionList[3] = option4;
        optionList[4] = option5;
        optionList[5] = option6;

        for(int i = 0; i < 6; i++){
            if(hello == i){
                System.out.println(optionList[i]);
            }
        }

    }
    public void chooseStory(String selectedStory){
        System.out.println(selectedStory);

    }
    public void input(Scanner scnr){
        System.out.print("Type enter and then 'end' when you are done with your journal entry. ");
        while(!(scnr.next().equals("end"))){
            journal += scnr.nextLine();
        }
        System.out.println(journal);
    }
    public int randInt(int currTime1){
        Random rand = new Random();
        currTime = currTime1;
        int randInt = rand.nextInt(6);
        if(randInt == 1 || randInt == 2){
           currTime = changeTime(currTime);
        }
        return randInt;
    }
    public int changeTime(int currTime1){
        currTime = currTime1 - 1;
        return currTime;
    }
    
}
