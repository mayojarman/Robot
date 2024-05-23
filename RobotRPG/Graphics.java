// Java Program to create a 
// blank label and add text to it.
import java.awt.event.*;
import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.ArrayList;
class Graphics extends JFrame {
 
    // frame
    static JFrame f;
    static JTextField t;
 
    // default constructor
    Graphics()
    {
    }
 
    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("Life Cycle Journaling RPG");
    
        JTextArea openingText = new JTextArea();
        openingText.setEditable(false);
        openingText.setBackground(f.getBackground());
        openingText.setLineWrap(true);
        openingText.setWrapStyleWord(true);
        Font font= new Font("DialogInput", Font.PLAIN, 21);
        openingText.setFont(font);

        openingText.setText("You are a sentient Robot...\n" + 
            "keeping track of your immortal life in this Solo Journaling RPG of Life and Decay.\n" + 
            "Starting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life. Hopefully, at the end, you can look back and be happy.\n" +
            "Act 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.\n" +
            "You create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?"
            );

        // create a panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 1));
        // add label to panel
        p.add(openingText);

        t = new JTextField("Please write your Journal entry here : " , 100);

        String text = t.getText();
        String [] journal = new String[]();
        journal.add(test);
        t.setHorizontalAlignment(JTextField.CENTER);
        f.add(p);
        p.add(t);
 
        // set the size of frame
        //f.setSize(500, 500);
        f.setBounds(0,0,1300,500);

        JButton b = new JButton("End");
        b.setBounds(20,20,10,10);  
        b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            t.setText("Hello and welcome to the first act of your life");  
        } 
         }); 

        p.add(b);

 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}