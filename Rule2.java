package com.IG;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.text.Document;

import de.regnis.q.sequence.QSequenceCommonBlockFactory;

public class Rule2
{
    /*public static void main(String [] args)
    {*/
    	
    	
    	public void afficher( final String file)
    	{
    	
    	   JFrame frame = new JFrame();
	      frame.setSize(699, 455);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	     
	 		frame.setTitle("Transform");
		frame.getContentPane().setLayout(null);
	 
	 
		JLabel lab = new JLabel("Transform To");
		lab.setBounds(75,50,100,30);
		frame.getContentPane().add(lab);
		
		
		JRadioButton r1=new JRadioButton("A-  Design Sequence Diagram");    
		JRadioButton r2=new JRadioButton("B-  State Diagram");    
		r1.setBounds(75,90,200,30);    
		r2.setBounds(75,140,200,30);    
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);
		bg.add(r2);    
		 frame.getContentPane().add(r1);
		 frame.getContentPane().add(r2);   
		 JLabel lab1 = new JLabel("Rule");
			lab1.setBounds(333,50,100,30);
			frame.getContentPane().add(lab1);
		 String s1[] = { "Rule2","Rule3","Rule 4","Rule 6", "Rule7.1", "Rule7.2", "Rule8.1&Rule8.2", "Rule8.3", "Rule8.4",  "Rule9.1", "Rule9.2", "Rule13.1", "Rule13.2"};
	      
	  
	        // create checkbox
	        final JComboBox   c1 = new JComboBox(s1);
	        c1.setBounds(333,90,200,30);
			frame.getContentPane().add(c1);
		
		// Button Choose
		JButton btnChoose = new JButton("Transform");
		btnChoose.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnChoose.setBackground(new Color(0x2dce98));
		btnChoose.setForeground(Color.white);
		btnChoose.setBounds(33, 311, 111, 55);
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
					String a = "person";
					String b = "agent";
					String c = "system";
					String str = null;
					String strresultat = null;
/////////////////////////////Initilisation////////////////////////////////////////////////////////////
//////////////////////////////Conversion File (Model XPDL)//////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
							int n = 0;			
				///	String filess ="D:/samar/Diagramme.xpdl";
					for(int i=0;i<n;i++)
					{
						
						create(a,b,c);
					}
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////
				 
/////////////////////////////Debutttttttttttttttt Rule////////////////////////////////////////////////////////////////////////
					 if((c1.getSelectedItem().toString())=="Rule2")
						{
							 
								
					    	     System.out.println("ddd");
					    	     
					 int index1 = str.indexOf("purchase order");
				    
				    if(index1 == - 1) {
				      System.out.println("Le mot  n'existe pas.");
				    } else { 
				        try
			   	     {
				        	for(int i=0;i<n;i++)
							{
								
								String a1= "UCD";
					        	if(a=="UCD")
								{
								 
					        		rule2(c);
								}
					        	
					        	 
					        	
					        	
					        	else if(a=="SD")
					        	{
					        		rule2(c);
					        	}
							}
							
				        	InputStream is1 = new FileInputStream("input/R2.txt");
						     
				    	    InputStreamReader isr1 = new InputStreamReader(is1);
				    	    BufferedReader buffer1 = new BufferedReader(isr1);
				    	        
				    	    String line1 = buffer1.readLine();
				    	    StringBuilder builder1 = new StringBuilder();
				    	        
				    	    while(line1 != null){
				    	       builder1.append(line1).append("\n");
				    	       line1 = buffer1.readLine();
				    	    }
				    	        
				    	    strresultat = builder1.toString();
			   	      FileWriter fw = new FileWriter("D:/output/R2.mdj",true);
			   	      fw.write(strresultat);
			   	      fw.close();
			   	     }
			   	     catch(IOException ioe)
			   	     {
			   	      }} 			 
						}
/////////////////////////////R2&R3///////////////////////////////////////////////////////////////////////
/////////////////////////////R2&R3//////////////////////////////////////////////////////////////////////
														
							 
					 if((c1.getSelectedItem().toString())=="Rule3")
						{
							for(int i=0;i<n;i++)
							{
								
								String a1= "UCD";
					        	if(a=="UCD")
								{
								 
								 
									rule3(c);
								}
					        	
					        	 
					        	
					        	
					        	else if(a=="SD")
					        	{
					        		rule3(c);
					        	}
							}
							
							
							
							
							
								
					    	     System.out.println("ddd");
					    	     
					 int index1 = str.indexOf("purchase order");
				    
				    if(index1 == - 1) {
				      System.out.println("Le mot  n'existe pas.");
				    } else { 
				        try
			   	     {
				        	
				        	
				        	for(int i=0;i<n;i++)
							{
								
								String a1= "UCD";
					        	if(a=="UCD")
								{
								 
								 
									rule3(c);
								}
					        	
					        	 
					        	
					        	
					        	else if(a=="SD")
					        	{
					        		rule3(c);
					        	}
							}
				        	InputStream is1 = new FileInputStream("input/R3.txt");
						     
				    	    InputStreamReader isr1 = new InputStreamReader(is1);
				    	    BufferedReader buffer1 = new BufferedReader(isr1);
				    	        
				    	    String line1 = buffer1.readLine();
				    	    StringBuilder builder1 = new StringBuilder();
				    	        
				    	    while(line1 != null){
				    	       builder1.append(line1).append("\n");
				    	       line1 = buffer1.readLine();
				    	    }
				    	        
				    	    strresultat = builder1.toString();
			   	      FileWriter fw = new FileWriter("D:/output/R3.mdj",true);
			   	      fw.write(strresultat);
			   	      fw.close();
			   	     }
			   	     catch(IOException ioe)
			   	     {
			   	      }} 			 
						}
/////////////////////////////fin   R2&R3////////////////////////////////////////////////////////////
/////////////////////////////fin   R2&R3////////////////////////////////////////////////////////////
		 
/////////////////////////////Debut R4////////////////////////////////////////////////////////////	
/////////////////////////////Debut R4////////////////////////////////////////////////////////////
					 if((c1.getSelectedItem().toString())=="Rule 4")
						{
							 
								
					    	     System.out.println("ddd");
					    	     
					 int index2 = str.indexOf("Order");
					  	extendedAttributeLabel N=new extendedAttributeLabel();
				    /*if(index2 == - 1) {
				      System.out.println("Le mot  n'existe pas.");
				    } else { */
				        try
			   	     {
				        	InputStream is1 = new FileInputStream("input/R4.txt");
						     
				    	    InputStreamReader isr1 = new InputStreamReader(is1);
				    	    BufferedReader buffer1 = new BufferedReader(isr1);
				    	        
				    	    String line1 = buffer1.readLine();
				    	    StringBuilder builder1 = new StringBuilder();
				    	        
				    	    while(line1 != null){
				    	       builder1.append(line1).append("\n");
				    	       line1 = buffer1.readLine();
				    	    }
				    	        
				    	    strresultat = builder1.toString();
			   	      FileWriter fw = new FileWriter("D:/output/R4.mdj",true);
			   	      fw.write(strresultat);
			   	      fw.close();
			   	     }
			   	     catch(IOException ioe)
			   	     {
			   	      }}
						 
/////////////////////////////Fin  R4////////////////////////////////////////////////////////////
/////////////////////////////Fin  R4////////////////////////////////////////////////////////////
					 
/////////////////////////////R6////////////////////////////////////////////////////////////				 
/////////////////////////////R6////////////////////////////////////////////////////////////


if((c1.getSelectedItem().toString())=="Rule 6")
{
  
  	extendedAttributeLabel N=new extendedAttributeLabel();
  N.ActionVerb("Purchase order");
 int index3 = str.indexOf("Purchase order");

if(index3 == - 1) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R6.txt");
 
InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);
    
String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();
    
while(line1 != null){
   builder1.append(line1).append("\n");
   line1 = buffer1.readLine();
}
    
strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R6.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}
}} 			 

/////////////////////////////finnnR6////////////////////////////////////////////////////////////
/////////////////////////////finnnR6////////////////////////////////////////////////////////////

					 
/////////////////////////////Debut R7.1////////////////////////////////////////////////////////////					
/////////////////////////////Debut R7.1////////////////////////////////////////////////////////////
	if((c1.getSelectedItem().toString())=="Rule7.1")
			{
				 
		extendedAttributeLabel N=new extendedAttributeLabel();
		  N.sendreceive();
		    	    // System.out.println(strresultat);
		    	     
		int index4 = str.indexOf("create purchase order");
	    
	    if(index4 == - 1) {
	      System.out.println("Le mot  n'existe pas.");
	    } else {
	        try
   	     {
	        	InputStream is1 = new FileInputStream("input/R71.txt");

	        	InputStreamReader isr1 = new InputStreamReader(is1);
	        	BufferedReader buffer1 = new BufferedReader(isr1);

	        	String line1 = buffer1.readLine();
	        	StringBuilder builder1 = new StringBuilder();

	        	while(line1 != null){
	        	builder1.append(line1).append("\n");
	        	line1 = buffer1.readLine();
	        	}
	        	strresultat = builder1.toString();
	        	FileWriter fw = new FileWriter("D:/output/R71.mdj",true);
	        	fw.write(strresultat);
	        	fw.close();
   	     }
   	     catch(IOException ioe)
   	     {
   	      }}}
/////////////////////////////Fin  R7.1////////////////////////////////////////////////////////////
/////////////////////////////Fin  R7.1////////////////////////////////////////////////////////////
	     
/////////////////////////////R7.2////////////////////////////////////////////////////////////
/////////////////////////////R7.2////////////////////////////////////////////////////////////


if((c1.getSelectedItem().toString())=="Rule7.2")
{
	QSequenceCommonBlockFactory.class.getAnnotatedInterfaces();

System.out.println("ddd");

 int index5 = str.indexOf("Purchase department");

if(index5 == - 1) {
System.out.println("Le mot n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R72.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R72.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}} 			 
}
/////////////////////////////finnn R7.2////////////////////////////////////////////////////////////
/////////////////////////////finnn R7.2////////////////////////////////////////////////////////////
		
 
/////////////////////////////R812////////////////////////////////////////////////////////////
/////////////////////////////R812////////////////////////////////////////////////////////////


if((c1.getSelectedItem().toString())=="Rule8.1&Rule8.2")
{

	QSequenceCommonBlockFactory.class.getAnnotationsByType(null);
System.out.println("ddd");

 int index6 = str.indexOf("send purchase order");

if(index6 == - 1) {
System.out.println("Le mot n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R812.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R812.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}}
} 			 
 
/////////////////////////////finnn R812////////////////////////////////////////////////////////////
/////////////////////////////finnn R812////////////////////////////////////////////////////////////
	




/////////////////////////////debut R83////////////////////////////////////////////////////////////
/////////////////////////////debut R83////////////////////////////////////////////////////////////

if((c1.getSelectedItem().toString())=="Rule8.3")
{
	QSequenceCommonBlockFactory.class.getAnnotatedSuperclass();

System.out.println("ddd");

 int index7 = str.indexOf("Request quotations");

if(index7 == - 1) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R83.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R83.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}} 			 
}
/////////////////////////////finnn R83////////////////////////////////////////////////////////////
/////////////////////////////finnn R83////////////////////////////////////////////////////////////

/////////////////////////////debut R84////////////////////////////////////////////////////////////
/////////////////////////////debut R84////////////////////////////////////////////////////////////



if((c1.getSelectedItem().toString())=="Rule8.4")
{
 

System.out.println("ddd");

 int index4 = str.indexOf("Receive quotations");

if(index4 == - 1) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R84.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R84.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}
} } 			 

/////////////////////////////finnn R84////////////////////////////////////////////////////////////
/////////////////////////////finnn R84////////////////////////////////////////////////////////////

/////////////////////////////debut R91////////////////////////////////////////////////////////////
/////////////////////////////debut R91////////////////////////////////////////////////////////////



if((c1.getSelectedItem().toString())=="Rule9.1")
{
 

System.out.println("ddd");

 int index5 = str.indexOf("process payment"); 
 int index55 = str.indexOf("notify payment");
if((index5 == - 1)&&(index55 == - 1)) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R91.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R91.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}}} 			 

/////////////////////////////finnn R91////////////////////////////////////////////////////////////
/////////////////////////////finnn R91////////////////////////////////////////////////////////////


/////////////////////////////debut R92////////////////////////////////////////////////////////////
/////////////////////////////debut R92////////////////////////////////////////////////////////////



if((c1.getSelectedItem().toString())=="Rule9.2")
{
 

System.out.println("ddd");

 int index6 = str.indexOf("Receive quotations");
 int index66 = str.indexOf("Request quotations");
if((index6 == - 1)&&(index66 == - 1)) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R92.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R92.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}}} 			 

/////////////////////////////finnn R92////////////////////////////////////////////////////////////
/////////////////////////////finnn R92////////////////////////////////////////////////////////////



/////////////////////////////debut R131////////////////////////////////////////////////////////////
/////////////////////////////debut R131////////////////////////////////////////////////////////////
if((c1.getSelectedItem().toString())=="Rule13.1")
{
	QSequenceCommonBlockFactory.class.getAnnotatedInterfaces();
System.out.println("ddd");

 int index7 = str.indexOf("approve purchase order");
 
if(index7 == - 1) {
System.out.println("Le mot  n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R131.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R131.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}} 
} 			 

/////////////////////////////finnn R131////////////////////////////////////////////////////////////
/////////////////////////////finnn R131////////////////////////////////////////////////////////////


/////////////////////////////debut R132////////////////////////////////////////////////////////////
/////////////////////////////debut R132////////////////////////////////////////////////////////////



if((c1.getSelectedItem().toString())=="Rule13.2")
{
	QSequenceCommonBlockFactory.class.getAnnotatedInterfaces();

System.out.println("ddd");

int index8 = str.indexOf("approve purchase order");

if(index8 == - 1) {
System.out.println("Le mot n'existe pas.");
} else { 
try
{
InputStream is1 = new FileInputStream("input/R132.txt");

InputStreamReader isr1 = new InputStreamReader(is1);
BufferedReader buffer1 = new BufferedReader(isr1);

String line1 = buffer1.readLine();
StringBuilder builder1 = new StringBuilder();

while(line1 != null){
builder1.append(line1).append("\n");
line1 = buffer1.readLine();
}

strresultat = builder1.toString();
FileWriter fw = new FileWriter("D:/output/R132.mdj",true);
fw.write(strresultat);
fw.close();
}
catch(IOException ioe)
{
}} 
} 			 

/////////////////////////////finnn R132////////////////////////////////////////////////////////////
/////////////////////////////finnn R132////////////////////////////////////////////////////////////












}});
    	
    	
    	
    	
    	
    	
       
       
        
                 
    
    	}
    	public void create(String a,String b,String c)
    	{
    		
    	}
    	public void rule2(String c)
    	{
    		
    	}
    	public void rule3(String c)
    	{
    		
    	}
}
 

