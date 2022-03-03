package Laba2;
import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square extends JFrame  {
	private Integer a;
	private Integer b;
	private Integer S;
	private Integer g=0;
	protected Square(JPanel panel4,String str1,String str2,String str3) throws IOException{
	    JButton button_raschet = new JButton(str3); // добавляем кнопку
		button_raschet.setBounds(10,10,10,40);
		JTextField text1=new JTextField(str1);
		JTextField text2=new JTextField(str2);
		panel4.add(text1);
		panel4.add(text2);
		panel4.add(button_raschet);
        text1.addFocusListener(new FocusListener(){
        	 
            @Override
            public void focusGained(FocusEvent e) {
 
                text1.setText(null);
                
            }

			@Override
			public void focusLost(FocusEvent e) {
			}
	});
        text2.addFocusListener(new FocusListener(){
       	 
            @Override
            public void focusGained(FocusEvent e) {
 
                text2.setText(null);
                
            }

			@Override
			public void focusLost(FocusEvent e) {
			}
	});

	button_raschet.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
        try {
       if(Integer.parseInt(text1.getText())>0 && Integer.parseInt(text2.getText())>0) {
    	   a=Integer.parseInt(text1.getText());
           b=Integer.parseInt(text2.getText());
           S=a*b;
           JOptionPane.showMessageDialog(null, "Площадь прямоугольника ="+S);
       }
       else {
    	   JOptionPane.showMessageDialog(null, "Значения в полях должны быть положительными", "Error", JOptionPane.ERROR_MESSAGE);
       }
        } catch(Exception l) {
        	JOptionPane.showMessageDialog(null, "Ошибка выполнения", "Error", JOptionPane.ERROR_MESSAGE);
        }
		
       
	} 
});
	}
}
