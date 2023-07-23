package com.IG;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class Fragment1 {
	public static void main(String[] args) {

		final JFrame frame = new JFrame();
		frame.setSize(699, 455);  
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setTitle("Transform BPMN model");
		frame.getContentPane().setLayout(null);

		JRadioButton r1 = new JRadioButton("Use an existing BPMN model");
		r1.setBounds(75, 66, 200, 30);

		JLabel l = new JLabel("Select BPM Model");
		l.setBounds(99, 111, 115, 30);
		frame.getContentPane().add(l);

		final JTextField input = new JTextField(60);
		input.setBounds(250, 111, 175, 30);
		frame.getContentPane().add(input);

		JButton b = new JButton("Browser");
		b.setBounds(450, 111, 115, 30);
		frame.getContentPane().add(b);

		JRadioButton r2 = new JRadioButton("Select a Modeling Tool for Business Process Model");

		r2.setBounds(75, 166, 400, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		frame.getContentPane().add(r1);
		frame.getContentPane().add(r2);
		JLabel lab1 = new JLabel("Tool");
		lab1.setBounds(99, 199, 400, 30);
		frame.getContentPane().add(lab1);
		String s1[] = { "Bizagi", "Bizagi" };

		// create checkbox
		JComboBox c1 = new JComboBox(s1);
		c1.setBounds(255, 199, 100, 30);
		frame.getContentPane().add(c1);

		JButton b1 = new JButton("Construct");
		b1.setBounds(411, 199, 100, 30);
		frame.getContentPane().add(b1);

		JButton b3 = new JButton("Cancel");
		b3.setBounds(411, 255, 100, 30);
		frame.getContentPane().add(b3);

		JButton b4 = new JButton("Next");
		b4.setBounds(533, 255, 100, 30);
		frame.getContentPane().add(b4);

		frame.setVisible(true);
/////////////////////////////Button  JFileChooser  ////////////////////////////////////////////////////////////
/////////////////////////////Button  JFileChooser////////////////////////////////////////////////////////////

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();
				int ret = fileopen.showDialog(null, "Choose file");

				if (ret == JFileChooser.APPROVE_OPTION) {
					input.setText(fileopen.getSelectedFile().toString());
				}
			}
		});

/////////////////////////////Button  Next  ////////////////////////////////////////////////////////////
/////////////////////////////Button  Next////////////////////////////////////////////////////////////

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String file =input.getText();
				 
					 if((file.equals("")))
					 {
							JOptionPane.showMessageDialog(null, "Select you BPM Model","", JOptionPane.ERROR_MESSAGE);
   
					 }
					 else
					 {
						 Fragment2 frame2 = new Fragment2();
						 frame2.affiche(file);
						 frame.setVisible(false);
					 }
				 
			}
		});
		
		
		
		
		
		////////////////////////////////////////////////////////////////////

	}

}
