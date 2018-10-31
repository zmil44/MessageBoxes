/*
 * Zach Miller
 * assignment 8.1
 * bellevue university
 * the point of this program was to add action listeners
 * 8/1/18
 * 
 * note:This is not my best code i did this all in a rush so it probably looks really bad but it works for now
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




	public class MessageBoxes{
	
	  private JButton[] b = {
	                         new JButton("Alert"),
	                     new JButton("Yes/No"),
	                     new JButton("Color"),
	                     new JButton("Input"),
	                     new JButton("3 Vals"),
	                         };
	
	  private JTextField txt = new JTextField(15);
	
	  private JFrame frame;{
	  
	  b[0].addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
		  JOptionPane.showMessageDialog(null,"There's a bug on you!", "Hey!",JOptionPane.ERROR_MESSAGE);
	  
	  	}
	  });
	  b[1].addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  int val = JOptionPane.showConfirmDialog(null,"or no", "Chose yes",JOptionPane.YES_NO_OPTION);
			  if(val == 0){
				  txt.setText("Yes");
			  }
			  else{
				  txt.setText("No");
			  }
		  }
	  });
	  
	  b[2].addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  Object[] options = {"Red", "Green", "Blue"};
	
			  int sel = JOptionPane.showOptionDialog(null,"Choose a Color!", "Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE, null,options, options[0]);
	
			  if(sel != JOptionPane.CLOSED_OPTION){
				  txt.setText("Color Selected: " + options[sel]);
			  }
		  }
	  });
	  
	  b[3].addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  String val = JOptionPane.showInputDialog("How many fingers do you see?");
			  txt.setText(val);
		  }
	  });
	  
	  b[4].addActionListener(new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  Object[] selections = {"First", "Second", "Third", "Fourth"};
	
			  Object val = JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE,null, selections, selections[0]);
	
			  if(val != null){
				  txt.setText(val.toString());
			  }
		  }
	  });
	  }
	 
	
	
	 
	  
	  public MessageBoxes(){
	
		    frame = new JFrame("Title");
	
	    frame.setSize(250, 250);
	
	    frame.getContentPane().setLayout(new FlowLayout());
	
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    for(int i = 0; i < b.length; i++){
	
	      frame.getContentPane().add(b[i]);
	    }
	
	    frame.getContentPane().add(txt);
	
	    frame.setVisible(true);
	
	  }
	
	  public void launchJFrame(){

	  }
	
	  public static void main(String [] args){
	
	    MessageBoxes messageBoxes = new MessageBoxes();
	    messageBoxes.launchJFrame();
	  }
	}
	
	
		