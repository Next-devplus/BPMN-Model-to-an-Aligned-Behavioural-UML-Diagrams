package com.IG;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
public class Quality_Metrics  extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame f=new JFrame();
       f.setSize(700, 366);
       f.setTitle("Quality Metrics Measurement");
       f.getContentPane().setLayout(null);
       JPanel p=new JPanel();
         
      

      
       
       JLabel l=new JLabel("Sequence diagram:");
       l.setBounds(60, 100, 115, 30);
          f.getContentPane().add(l);
          
          
    final JTextField t=new JTextField(60);
       t.setBounds(250, 100, 175, 30);
          f.getContentPane().add(t);
          
          
          JButton b=new JButton("Import");
       b.setBounds(450, 100, 115, 30);
          f.getContentPane().add(b);
          
       JLabel l1=new JLabel("Quality Metrics Measurement");
         l1.setBounds(250, 140, 199, 30);
          f.getContentPane().add(l1);
          
          
          
          
          
          
          
          String data[][]={ {"Quality metrics","Metrics values","Thresholds","Quality attributes"},
        		  {"RFC",	"[0,5]",	"0-35",	"M- R- CP- T"},
        		  {"CBO",	"[0,3]",	"0-8",	"R- CP- T"},
        		  {"CA",	"[0,4]",	"7-39",	"M- R"},
        		  {"CE",	"[0,4]",	"6-16",	"M- R"}
          };    
String column[]={"Quality metrics","Metrics values","Thresholds","Quality attributes"};         
JTable jt=new JTable(data,column);    
jt.setBounds(10, 200, 700,77);  
 JScrollPane sp=new JScrollPane(jt);
f.getContentPane().add(jt);
          
          
          
           
      //f.add(p);
       f.setVisible(true);
    
       b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();
               int ret = fileopen.showDialog(null, "Choose file");

               if (ret == JFileChooser.APPROVE_OPTION) {
               	t.setText(fileopen.getSelectedFile().toString());
               }
			}
		});
       
       
       
       
    }
    
}
