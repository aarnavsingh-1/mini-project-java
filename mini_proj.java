import java.awt.event.*;  
import javax.swing.*;
import java.util.*;

public class mini_proj extends JFrame implements ActionListener
{
    JTextArea text;
    JButton b1,b2;
    JLabel lab;

    mini_proj()
    {
        super("Word & Character Counter");
        text=new JTextArea();
        text.setBounds(50,50,250,200);
        b1=new JButton("Word");  
        b1.setBounds(50,300,100,30);  
        b2=new JButton("Character");  
        b2.setBounds(180,300,100,30);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        lab=new JLabel("Enter text here:");
        lab.setBounds(50,-60,250,200);
        add(lab);
        add(b1);
        add(b2);
        add(text);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String str=text.getText();
        int n=str.length();
        char ch;
        str=str.trim();
        int word=0;
        int characters=0;
        if(e.getSource()==b1)
        {
            for(int i=0;i<n-1;i++)
            {
                ch=str.charAt(i);
                if(Character.isWhitespace(ch)||!(Character.isLetterOrDigit(ch)))
                {
                    char ch1=str.charAt(i+1);
                    if(Character.isLetter(ch1))
                    word++;
                }
            }
            JOptionPane.showMessageDialog(this,"Total number of words entered: "+(word+1));
        }
        if(e.getSource()==b2)
        {
            for(int i=0;i<n;i++)
            {
                ch=str.charAt(i);
                if(!(Character.isWhitespace(ch)))
                characters++;
            }
            JOptionPane.showMessageDialog(this,"Total number of characters entered: "+characters);
        }
    }

    public static void main(String Args[])
    {
        mini_proj obj=new mini_proj();
    }
}