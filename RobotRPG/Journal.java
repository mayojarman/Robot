
//package lifecyclerpg;
import java.util.Scanner;
import java.util.ArrayList;

public class Journal {
    private ArrayList<String> journal;
    public Journal(){

    }
    public void addToJournal(Scanner scnr){
        journal = new ArrayList<String>();
        String temp = "";
        String temp2="";
        System.out.print("Type enter and then 'end' when you are done with your journal entry. ");
        while(!(temp2.equals("end"))){
            temp2 = scnr.nextLine();
            temp += temp2;
        }
        journal.add(temp);
    }
    public void printJournal(){
        for (String i: journal){
            System.out.println("NEXT CHAPTER : " + i);
        }
    }
}
