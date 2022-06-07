package pavel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Gui extends JFrame {
	public Gui()
	{
		  JButton a[][] = new JButton[3][3];
		  JLabel j=new JLabel("DESTEEE BRACO");
		  JButton jj=new JButton("NEW GAME");
		  jj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0;i<3;i++)
				  {
					  for(int ii = 0;ii<3;ii++)
					  {
						  a[i][ii].setText("-");
					  }
				  }
			}
		});
		  setBounds(0,0,500,500);
		  JPanel panel=new JPanel(new GridLayout(3,3,1,1));
		
		  int i,ii;
		  Logic l = new Logic(); 
		  for(i=0;i<3;i++)
		  {
			  for(ii=0;ii<3;ii++)
			  {
				  JButton d=new BetterButton(i,ii);
				  a[i][ii]=d;   
				  a[i][ii].setText("-");
				  a[i][ii].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						BetterButton bb=((BetterButton)e.getSource());
						if(bb.getText()=="-")
						if(l.odigraj()%2==0)
						{
							bb.setText("O");
						}
						else
						{
							bb.setText("X");
						}
						
						
		
					}
				});
				a[i][ii].setPreferredSize(new Dimension(70,70));
				  panel.add(a[i][ii]);
			  }
		  }
		  getContentPane().add(j,BorderLayout.NORTH);
		  
		  getContentPane().add(panel,BorderLayout.CENTER);
		  getContentPane().add(jj,BorderLayout.SOUTH);

	
		  //pack();
		 
	      
		  setVisible(true);
		  
	}
}
