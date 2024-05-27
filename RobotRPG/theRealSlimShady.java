import java.awt.event.*;
import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.ArrayList;

public class theRealSlimShady {
    public JTextArea ta = new JTextArea();
    public static void main(String[] args)
    {
        //creating array

        String[] journal = new String[4];
        
        // create frame
        JFrame f = new JFrame("Robot RPG");
        f.setSize(1200,600);

        //create panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,10));

        //creating a text area
        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        ta.setBackground(f.getBackground());
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        Font font= new Font("DialogInput", Font.PLAIN, 21);
        ta.setFont(font);

        

        // creating the journal text box
        JTextArea ta2 = new JTextArea();
        ta2.setEditable(true);
        ta2.setBackground(f.getBackground());
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
        Font font2 = new Font("DialogInput", Font.PLAIN, 21);
        ta2.setFont(font2);
        ta2.setText("Please put your journal entry here: ");
        int tally = 0;
        //creating a button
        JButton save = new JButton("save");
        save.addActionListener(new ActionListener(){  
            int tally = 0;
        public void actionPerformed(ActionEvent e){  
            String journalEntry = ta2.getText();
            System.out.println(journalEntry);
            journal[tally] = journalEntry;
            System.out.println(journal[tally] + "slkdjfalsjdflkjads");
            tally++;
            System.out.print(tally);
        } 
         });

        //setting opening text and putting it in text area
        ta.setText("You are a sentient Robot...\n" + 
            "keeping track of your immortal life in this Solo Journalism RPG of Life and Decay.\n" + 
            "Starting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life. Hopefully, at the end, you can look back and be happy.\n" +
            "Act 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.\n" +
            "You create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?"
            );

            

        //adding things to f and p
        f.add(ta);
        f.add(p);
        p.add(ta);
        p.add(save);
        p.add(ta2);

        //setting 44

        f.setVisible(true);
        p.setVisible(true);


    }
    public static void eatMyAss(JTextArea ta){
        ta.setText("eat my ass");
    }
}
