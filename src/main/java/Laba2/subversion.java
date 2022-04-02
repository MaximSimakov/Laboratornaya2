package Laba2; //пакет Java классов

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.io.IOException;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion extends JFrame {
	
	FileRead reader = new FileRead("src/messag.txt");
	
	public JFrame main_GUI = new JFrame("subversion");
	JPanel main_panel = new JPanel();
	String[] items;
	private JComboBox comboBox;
	private JPanel panel1=new JPanel();//Панель - используется для организации компонентов в окне
	private JLabel imgLabel = new JLabel();//Создание лейбла с картинкой
	private JPanel panel2=new JPanel();
	private JPanel panel3=new JPanel();
	private JPanel panel4=new JPanel();
	public subversion() throws IOException  {
	
		
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,300);
	main_GUI.setResizable(false); // фиксированный размер окна
	main_panel.setLayout(new BoxLayout (main_panel , BoxLayout.PAGE_AXIS));
	main_GUI.add(main_panel);
	
	String[] items = {"Переместить логотип УГАТУ в верхний правый угол","Переместить логотип УГАТУ в середину","Переместить логотип УГАТУ в левый верхний угол","Отсортировать "
			+ "данные в проекте12"};
	//JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	//laba_info.setBounds(120,0,150,30);
	//main_panel.add(laba_info);
	imgLabel=new JLabel(new ImageIcon("src/USATU.jpg"));//Добавление в лейбл картинки
    JButton button_exit = new JButton("Информация"); // добавляем кнопку
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(reader); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	
	JButton button_exit2 = new JButton("Выход"); // добавляем кнопку
	button_exit2.setBounds(270,200,100,40);
	ActionListener actionListener2 = new ListenerButtonBack(main_GUI); //создаем слушатель
	button_exit2.addActionListener(actionListener2);
	
	BarMenu gui=new BarMenu(main_GUI, panel1, imgLabel, "Действия","Загрузить файлы в проект","Отобразить логотип Угату","Выход", reader);
	JComboBox comboBox=new JComboBox(items);
	
	main_panel.add(panel1);//добавление панели 1 на основную
	main_panel.add(panel2);//добавление панели 2 на основную
	main_panel.add(panel3);
	main_panel.add(panel4);

	panel3.add(button_exit);//добавление кнопку на панель 2
	panel3.add(button_exit2);
	
	Square rectangle=new Square(panel4,"Введите длину","Введите ширину","Расчитать");
	ComboBox cmbBox=new ComboBox(items, main_panel, comboBox, panel1, panel2, panel3, imgLabel);
	
	
   
    


	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	
	public static void main(String[] args) throws IOException { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}
	


}
