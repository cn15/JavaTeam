package GiaoDien;
import java.awt.event.*;  
import javax.swing.*;  
  
public class Abc{  
Abc(){  
JFrame f=new JFrame();  
                  
          
JButton b=new JButton(new ImageIcon("b.jpg"));  
b.setBounds(0, 0, 1000, 780);  
      
f.add(b);  
          
f.setSize(1200, 800);  
f.setLayout(null);  
f.setVisible(true);  
          
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
    }  
      
public static void main(String[] args) {  
    new Abc();  
}  
}  