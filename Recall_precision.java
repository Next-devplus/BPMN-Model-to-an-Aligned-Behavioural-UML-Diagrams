package com.IG;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Recall_precision  extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	double Precision;
         final JFrame f=new JFrame();
       f.setSize(800, 400);
       f.setTitle("Recall -Precision measurement.");
       f.getContentPane().setLayout(null);
       JPanel p=new JPanel();
         
       
       JLabel l=new JLabel("Design Sequence diagrams:");
       l.setBounds(30, 100, 333, 30);
          f.getContentPane().add(l);
          
          
    final JTextField t=new JTextField(60);
       t.setBounds(250, 100, 175, 30);
          f.getContentPane().add(t);
          
          
          JButton b=new JButton("Import");
       b.setBounds(450, 100, 115, 30);
          f.getContentPane().add(b);
          
       JLabel l1=new JLabel("Expert Sequence diagrams:");
         l1.setBounds(30, 140, 333, 30);
          f.getContentPane().add(l1);
          
          
          final JTextField t2=new JTextField(60);
       t2.setBounds(250, 140, 175, 30);
          f.getContentPane().add(t2);
          
           JButton b1=new JButton("Import");
       b1.setBounds(450, 140, 115, 30);
          f.getContentPane().add(b1);
          
          
          
         
JButton b4 = new JButton("Calculer");
b4.setBounds(533, 255, 100, 30);
//f.getContentPane().add(b4);
          
          
            final JLabel l2=new JLabel("Interpret : the Generated Design Sequence diagrams covers the whole domain precisely in accordanse with the experts perspective");
       l2.setBounds(15, 300, 800, 30);
     
          
            
           
       	final JTextField l3=new JTextField(60);   
         l3.setBounds(10, 250, 199, 30);
        //  f.getContentPane().add(l3);
          
         	final JTextField l4=new JTextField(60); 
       l4.setBounds(10, 300, 199, 30);
          //f.getContentPane().add(l4);
          
          
          final JTextArea textArea= new JTextArea(5, 20);
          JScrollPane scrollPane = new JScrollPane(textArea); 
          textArea.setEditable(false);
          textArea.setBounds(250, 250,333 , 111);
         // f.getContentPane().add(textArea);
          
          
          
          final JLabel  lab=new JLabel(""); 
          lab.setBounds(250, 350, 199, 30);
          f.getContentPane().add(lab);
          
        /*  final JTextField l5=new JTextField(60); 
          l5.setBounds(10, 350, 199, 30);
             f.getContentPane().add(l5);
              */
      //f.add(p);
    
       b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();
               int ret = fileopen.showDialog(null, "Choose file");

               if (ret == JFileChooser.APPROVE_OPTION) {
               	t.setText(fileopen.getSelectedFile().toString());
               }
			}
		});
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////

       /////////////////////////////////////////////////////////////////////
       ////////////////////////////////////////////////////////////////////
       b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();
              int ret = fileopen.showDialog(null, "Choose file");

              if (ret == JFileChooser.APPROVE_OPTION) {
            	  
            	  
            	  
            	  t2.setText(fileopen.getSelectedFile().toString());
            	  
            	  
            	  
            	  
            	  
            	  
            	  int FP = 0;
     			 int TP = 0;
     			int FN = 0;
     			 int FPtot= 0;
     			String file =t2.getText();
     			String file1 =t.getText();
     			try{
     			BufferedReader reader = new BufferedReader(new FileReader(file));
     			StringBuilder builder = new StringBuilder();
     			String str = null;
     			while((str = reader.readLine()) != null){
     			builder.append(str);
     			}

     			String fileString = builder.toString();
     			String match = "UMLMessage";
     			String[] split = fileString.split(match);
     			//System.out.println(split.length - 1);
     			//System.out.println("11111111111111111");
     			String match1 = "UMLLifeline";
     			String[] split1 = fileString.split(match1);
     			//System.out.println(split1.length - 1);
     			///  TP=(split.length - 1)+(split1.length - 1);
     			TP=((split.length - 1)+(split1.length - 1))-2;
     			//System.out.println("TP est------- "+TP);
     			
     			
     			
     			
     			
     			}
     			 catch(IOException ioe)
         	     {
         	      
         	     }
     			
     			try{
     				BufferedReader reader = new BufferedReader(new FileReader(file1));
     				StringBuilder builder = new StringBuilder();
     				String str = null;
     				while((str = reader.readLine()) != null){
     				builder.append(str);
     				}

     				String fileString = builder.toString();
     				String match = "UMLMessage";
     				String[] split = fileString.split(match);
     				//System.out.println(split.length - 1);
     				//System.out.println("11111111111111111");
     				String match1 = "UMLLifeline";
     				String[] split1 = fileString.split(match1);
     				//System.out.println(split1.length - 1);
     				//FN=(split.length - 1)+(split1.length - 1);
     				FN=((split.length - 1)+(split1.length - 1))-4;
     			//	System.out.println("FP est  "+FN);
     				
     				
     				
     				
     				
     				}
     				 catch(IOException ioe)
     	    	     {
     	    	      
     	    	     }
     			
     			
     	      
     			
     			
     			
     			//System.out.println("FN est  "+FN);
     			  FP=TP-FN;	
     			int tot=TP+FN;
     			int tot1=TP+FP;
     			double Precision =(double)TP/(double)tot1;
     			if(Precision>1) {
     				Precision=Precision-2;
   	    	     }
     			double Recall =(double)TP/(double)tot;
     			System.out.println("Precision est  "+Precision);
     			System.out.println("Recall est  "+Recall);
     		         DecimalFormat df=new DecimalFormat();
     		         df.setMaximumFractionDigits(2);
     		         df.setDecimalSeparatorAlwaysShown(true);
     		       // textArea.setText("Recall:        TP/(TP+FN)="+FP+"/"+tot+"="+df.format(Recall) );
     		       //textArea.setText("Precision:     TP/(TP+FP)="+TP+"/"+tot1+"="+df.format(Precision));
     		         String aa="\n";
     		     // textArea.setText("Recall                              |||||        Precision "+aa+"TP/(TP+FN)="+FP+"/"+tot+"="+df.format(Recall)+"||||| TP/(TP+FP)="+TP+"/"+tot1+"="+df.format(Precision) );
     		     // textArea.setText("Recall                              |||||        Precision "+aa+"TP/(TP+FN)="+df.format(Recall)+"||||| TP/(TP+FP)="+df.format(Precision) );

     		      //textArea.setText(    );
            	  
     		     String[] columns = new String[] {
     		            "Recall",
     		            "Precision"
     		             
     		        };
     		        //données pour JTable dans un tableau 2D
     		        Object[][] data = new Object[][] {
     		            {"AVGSSDs(Recall)", "AVGSSDs(Precision)"},
     		           {"TP/(TP+FN)="+df.format(Recall)+"", "TP/(TP+FP)="+df.format(Precision)+""},
     		             
     		        };
     		        
     		        
     		       final TableModel model = new DefaultTableModel(data, columns) ;
     		        //crée un JTable avec des données
     		        final JTable table = new JTable(model);
     		        //crée un JTable avec des données
     		       //JTable table = new JTable(data, columns);
     		         
     		      table.setBounds(250, 250,333 , 31);
 				                                                                                                                                                                                                                                    
     		
     		       f.getContentPane().add(table);
     		      f.getContentPane().add(l2); 
     		     // ((DefaultTableModel) model).setRowCount(0);    
     		   
              }
              
              
              
              
              ////////////////////////////////////////////////////////////////////////////
              /////////////////////////////////////////////////////////////////////////////
              File repertoire=new File("D:/input/");
			    final String liste[] = repertoire.list(); 
			    int count = 0;  	
					 int nb=0;
			                 String ch="";
			                 //float score=0;
						 
								  if (liste != null) { 
									 for (int i = 0; i < liste.length; i++) {
			                                                try {
			                                                   File file = new File("D:/input/"+liste[i]);
			                                                  
			       String[] words = null;  
			    // Créer l'objet File Reader
			     double nbmot=0;
			    FileReader fr = new FileReader(file);
			    // Créer l'objet BufferedReader  
			    BufferedReader reader = new BufferedReader(fr);  
			   // BufferedReader reader = new BufferedReader(new FileReader(file1));
			    // Mot à rechercher
			       //String search= "UMLLifeline";
			    // Initialise le compteur de mots à zéro
			    
			   	try{
   				
   				StringBuilder builder = new StringBuilder();
   				String str = null;
   				while((str = reader.readLine()) != null){
   				builder.append(str);
   				}

   				String fileString = builder.toString();
   				String match = "UMLMessage";
   				String[] split = fileString.split(match);
   				//System.out.println(split.length - 1);
   				//System.out.println("11111111111111111");
   				//String match1 = "UMLLifeline";
   				//String[] split1 = fileString.split(match1);
   				//System.out.println(split1.length - 1);
   				count=count+(split.length - 1);
   			//	System.out.println("FP est  "+count);
   				
   				
   				
   				
   				
   				}
			                                                    
			                                                    catch(IOException ioe)
			                                    	    	     {
			                                    	    	      
			                                    	    	     }
			                                                    //affichr resultat
			  
			    fr.close();
			   }                                             catch(IOException ioe)
	    	     {
	    	      
	    	     }
			                         
									 
									 
			                                                 
									 
									 
									 
									 }  
									 
}
								  double avg=count/4;
								   //lab.setText("AVG(Precision):     ="+avg);
								   lab.setText("  ");

								  //System.out.println(count);
			}
		});
       
       ////////////////////////////////////////////////////////////////////////////////////////////////
       //////////////////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////
		  //////////////////////////////////////////////////////////////////////////////////////

       
       
       
       
       
			 
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////
								  //////////////////////////////////////////////////////////////////////////////////////


   /*	b4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			           
	                
	         	
								  }
	});
	 */
   	
     
      
   	
    f.setVisible(true);

    }
    
}
