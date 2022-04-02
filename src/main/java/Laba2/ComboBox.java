package Laba2;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


public class ComboBox{


	public ComboBox(String[] items, JPanel main_panel, JComboBox comboBox, JPanel panel1, JPanel panel2,JPanel panel3,JLabel imgLabel) {
    	  
    	  panel3.add(comboBox);
    	  comboBox.addActionListener(new ActionListener() {
    	  @Override
          public void actionPerformed(ActionEvent e) {
        
        	  if(comboBox.getSelectedItem()=="Переместить логотип УГАТУ в верхний правый угол") {
    	    	  panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
    					panel1.add(imgLabel);
    					main_panel.revalidate();
    				}
    				
    				if(comboBox.getSelectedItem()=="Переместить логотип УГАТУ в середину") {
    					panel2.add(imgLabel);
    	    	  main_panel.revalidate();
    				}
    				
    				if (comboBox.getSelectedItem()=="Переместить логотип УГАТУ в левый верхний угол") {
    			panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
    	    	  panel1.add(imgLabel);
    	    	  main_panel.revalidate();
    	  }
        	  
          }
    	  });
      } 
          }