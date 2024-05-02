//package lifecyclerpg;
import java.util.ArrayList;
import java.util.Random;
public class Scene {
    private String[] numList = new String[6];
    private ArrayList<Scene> sceneList;
    private Scene scene1;
    private int time = 4;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private String option6;
    
    public Scene(){

    }
    public void setScene(int lifeCyclePoint){
        if(lifeCyclePoint == 1){
            option1 =  "Time Passes: The time counter ticks up by 1. Record this event in your journal to signify the passage of time and the Robot's early development.";
            numList[0] = option1;
            option2 =  "'What is the Robot's Purpose?'': Answer the question and write it in your journal. This defines the primary objective of the Robot's existence";
            numList[1] = option2;
            option3 = "'Who is the Creator of the Robot?' Answer the question and write it in your journal. This introduces the Robot's creator and their role in its creation.";
            numList[2] = option3;
            option4 = "'What makes the Robot Special?' Answer the question and write it in your journal. This highlights the unique attributes or capabilities of the Robot.";
            numList[3] = option4;
            option5 = "'Is this Robot one of a kind?' Answer the question and write it in your journal. This determines whether there are other robots like it in the world.";
            numList[4] = option5;
            option6 = "'What did the Robot enjoy?' Answer the question and write it in your journal. This explores the Robot's early experiences and pleasures. ";
            numList[5] = option6;
        }
        if(lifeCyclePoint == 2){
            option1 =  "Time Passes: The time counter ticks up by 1. Record this event in your journal to signify the passage of time and the Robot's early development.";
            numList[0] = option1;
            option2 =  "'What is the Robot's Purpose?'': Answer the question and write it in your journal. This defines the primary objective of the Robot's existence";
            numList[1] = option2;
            option3 = "'Who is the Creator of the Robot?' Answer the question and write it in your journal. This introduces the Robot's creator and their role in its creation.";
            numList[2] = option3;
            option4 = "'What makes the Robot Special?' Answer the question and write it in your journal. This highlights the unique attributes or capabilities of the Robot.";
            numList[3] = option4;
            option5 = "'Is this Robot one of a kind?' Answer the question and write it in your journal. This determines whether there are other robots like it in the world.";
            numList[4] = option5;
            option6 = "'What did the Robot enjoy?' Answer the question and write it in your journal. This explores the Robot's early experiences and pleasures. ";
            numList[5] = option6;
        }
        if(lifeCyclePoint == 3){
            option1 =  "Time Passes: The time counter ticks up by 1. Record this event in your journal to signify the passage of time and the Robot's early development.";
            numList[0] = option1;
            option2 =  "'What is the Robot's Purpose?'': Answer the question and write it in your journal. This defines the primary objective of the Robot's existence";
            numList[1] = option2;
            option3 = "'Who is the Creator of the Robot?' Answer the question and write it in your journal. This introduces the Robot's creator and their role in its creation.";
            numList[2] = option3;
            option4 = "'What makes the Robot Special?' Answer the question and write it in your journal. This highlights the unique attributes or capabilities of the Robot.";
            numList[3] = option4;
            option5 = "'Is this Robot one of a kind?' Answer the question and write it in your journal. This determines whether there are other robots like it in the world.";
            numList[4] = option5;
            option6 = "'What did the Robot enjoy?' Answer the question and write it in your journal. This explores the Robot's early experiences and pleasures. ";
            numList[5] = option6;
        }
        if(lifeCyclePoint == 4){
            option1 =  "Time Passes: The time counter ticks up by 1. Record this event in your journal to signify the passage of time and the Robot's early development.";
            numList[0] = option1;
            option2 =  "'What is the Robot's Purpose?'': Answer the question and write it in your journal. This defines the primary objective of the Robot's existence";
            numList[1] = option2;
            option3 = "'Who is the Creator of the Robot?' Answer the question and write it in your journal. This introduces the Robot's creator and their role in its creation.";
            numList[2] = option3;
            option4 = "'What makes the Robot Special?' Answer the question and write it in your journal. This highlights the unique attributes or capabilities of the Robot.";
            numList[3] = option4;
            option5 = "'Is this Robot one of a kind?' Answer the question and write it in your journal. This determines whether there are other robots like it in the world.";
            numList[4] = option5;
            option6 = "'What did the Robot enjoy?' Answer the question and write it in your journal. This explores the Robot's early experiences and pleasures. ";
            numList[5] = option6;
        }
        sceneList = new ArrayList<Scene>();
        sceneList.add(scene1);  
    }
    public int randInt(){
        Random rand = new Random();
        int randInt = rand.nextInt(6);
        System.out.println(numList[randInt]);
        if(randInt == 1 || randInt ==2){
            time -=1;
            System.out.println(time);
        }
        return randInt;
    }
    
}
