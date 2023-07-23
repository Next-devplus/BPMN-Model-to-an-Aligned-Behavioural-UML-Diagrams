package com.IG;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.text.Document;

public class Fragment2
{
	public   void affiche( final String file)
    { 
    	
    	
    	JFrame frame = new JFrame();
	      frame.setSize(699, 455);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	     
	 		frame.setTitle("Design Diagram Generator");
		frame.getContentPane().setLayout(null);
	 
	 
		JLabel lab = new JLabel("Select Fragment");
		lab.setBounds(75,50,100,30);
		frame.getContentPane().add(lab);
		 String s1[] = { "F1", "F2", "F3-F4", "F5" };
		
		
	 
	      
	  
	        // create checkbox
	        final JComboBox   c1 = new JComboBox(s1);
	        c1.setBounds(80,90,200,30);
			frame.getContentPane().add(c1);
		
		// Button Choose
		JButton btnChoose = new JButton("Transform");
		btnChoose.setFont(new Font("Calibri", Font.PLAIN, 14));
		//btnChoose.setBackground(new Color(0x2dce98));
		//btnChoose.setForeground(Color.white);
		btnChoose.setBounds(333, 150, 111, 55);
		frame.getContentPane().add(btnChoose);
	
		
		// Button Save
		JButton btnSave = new JButton("Diagramme Sequence");
		btnSave.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSave.setBackground(new Color(0x3dba94));
		btnSave.setForeground(Color.white);	
		btnSave.setBounds(153, 311, 111, 55);
		//frame.getContentPane().add(btnSave);
		
		// Windows Loaded
	 
		   frame.setVisible(true);
    	
    	

	    	
	    	
		   btnChoose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = null;
					String strresultat = null;
/////////////////////////////Initilisation////////////////////////////////////////////////////////////
//////////////////////////////Conversion File (Model XPDL)//////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
										
				///	String filess ="D:/samar/Diagramme.xpdl";
					
					try
		    	     {	InputStream is = new FileInputStream(file);
				     
		    	    InputStreamReader isr = new InputStreamReader(is);
		    	    BufferedReader buffer = new BufferedReader(isr);
		    	        
		    	    String line = buffer.readLine();
		    	    StringBuilder builder = new StringBuilder();
		    	        
		    	    while(line != null){
		    	       builder.append(line).append("\n");
		    	       line = buffer.readLine();
		    	    }
		    	        
		    	      str = builder.toString();
		    	     }
						
					 catch(IOException ioe)
		    	     {
		    	      
		    	     }
					
/////////////////////////////Finnnnnn Initilisation//////////////////////////////////////////////////////////
//////////////////////////////Conversion File (Model XPDL)//////////////////////////////////////////////////
 

/////////////////////////////FFFFFFFFFF1///////////////////////////////////////////////////////////////////////
 												
							 
					 if((c1.getSelectedItem().toString())=="F1")
						{
							 
								
					    	     System.out.println("ddd");
					    	     
					 int index1 = str.indexOf("create purchase order");
					 int index3 = str.indexOf("approve purchase order");
					 int index4 = str.indexOf("receive purchase request");
					 int index5 = str.indexOf("Request quotations");
					 int index6 = str.indexOf("Selected supplier");
					 int index7 = str.indexOf("Receive quotations");
				    if((index1 == - 1)&&(index3 == - 1)&&(index4 == - 1)&&(index5 == - 1)&&(index6 == - 1)&&(index7 == - 1)) {
				      System.out.println("Le mot  n'existe pas.");
				    } else { 
				        try
			   	     {
				        	InputStream is1 = new FileInputStream("input/F1.txt");
						     
				    	    InputStreamReader isr1 = new InputStreamReader(is1);
				    	    BufferedReader buffer1 = new BufferedReader(isr1);
				    	        
				    	    String line1 = buffer1.readLine();
				    	    StringBuilder builder1 = new StringBuilder();
				    	        
				    	    while(line1 != null){
				    	       builder1.append(line1).append("\n");
				    	       line1 = buffer1.readLine();
				    	    }
				    	        
				    	    strresultat = builder1.toString();
			   	      FileWriter fw = new FileWriter("D:/output/F1.mdj",true);
			   	      fw.write(strresultat);
			   	      fw.close();
			   	     }
			   	     catch(IOException ioe)
			   	     {
			   	      }} 			 
						}
/////////////////////////////fin   F1111////////////////////////////////////////////////////////////
 
		 
/////////////////////////////Debut FFFFFF2////////////////////////////////////////////////////////////	
 
					 if((c1.getSelectedItem().toString())=="F2")
						{
							 
						 int index6 = str.indexOf("send purchase order");

						 if(index6 == - 1) {
						 System.out.println("Le mot n'existe pas.");
						 } else { 
						 try
						 {
						 InputStream is1 = new FileInputStream("input/F2.txt");

						 InputStreamReader isr1 = new InputStreamReader(is1);
						 BufferedReader buffer1 = new BufferedReader(isr1);

						 String line1 = buffer1.readLine();
						 StringBuilder builder1 = new StringBuilder();

						 while(line1 != null){
						 builder1.append(line1).append("\n");
						 line1 = buffer1.readLine();
						 }

						 strresultat = builder1.toString();
						 FileWriter fw = new FileWriter("D:/output/F2.mdj",true);
						 fw.write(strresultat);
						 fw.close();
						 }
						 catch(IOException ioe)
						 {
						 }}
				        
						
						}
						 
/////////////////////////////Fin  FFFFFF2////////////////////////////////////////////////////////////
/////////////////////////////Fin  FFFFFF2////////////////////////////////////////////////////////////
					 
/////////////////////////////FFFFFFF3////////////////////////////////////////////////////////////				 
/////////////////////////////FFFFFFF3////////////////////////////////////////////////////////////


if((c1.getSelectedItem().toString())=="F3-F4")
{
  
     
 int index3 = str.indexOf("receive invoice");

if(index3 == - 1) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/F3.txt");
 
InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);
    
String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();
    
while(line1 != null){
   builder1.append(line1).append("\n");
   line1 = buffer1.readLine();
}
    
strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/F34.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}
}} 			 

 		 

/////////////////////////////finnn FFFFFFF3////////////////////////////////////////////////////////////
/////////////////////////////finnn FFFFFFF3////////////////////////////////////////////////////////////




/////////////////////////////FFFFFF4////////////////////////////////////////////////////////////				 
/////////////////////////////FFFFFF4////////////////////////////////////////////////////////////


/*if((c1.getSelectedItem().toString())=="F4")
{


int index3 = str.indexOf("receive item");

if(index3 == - 1) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/F4.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/F4.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}
}} 			 
*/


/////////////////////////////finnn FFFFFF4////////////////////////////////////////////////////////////
/////////////////////////////finnn FFFFFF4////////////////////////////////////////////////////////////

/////////////////////////////FFFFFF5////////////////////////////////////////////////////////////				 
/////////////////////////////FFFFFFF5////////////////////////////////////////////////////////////


if((c1.getSelectedItem().toString())=="F5")
{


int index3 = str.indexOf("process payment");
int index33 = str.indexOf("notify payment");
if((index3 == - 1)&&(index33 == - 1)) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/F5.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/F5.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}
}} 			 



/////////////////////////////finnn FFFFFFF5////////////////////////////////////////////////////////////
/////////////////////////////finnn FFFFFFF5////////////////////////////////////////////////////////////







}});
    	
    	
		   
    	
    	
    	
    	
    	
       
      ////////////////////////////////////////////////////////////////////  
        
                 }
        
}
 

