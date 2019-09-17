import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ExperienceUI extends JFrame implements ActionListener{
	public JLabel l,l1,l2,l3,l4;
	public JTextField t1,t2,t3;
	public JButton b1;
	public JComboBox j1;
	public Font f;
	
	public ExperienceUI() {
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Experience");
		l.setFont(f);
		l1 = new JLabel("Company");
		l2 = new JLabel("Designation");
		l3 = new JLabel("Salary");
		l4 = new JLabel("Years");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		j1 = new JComboBox();
		b1 = new JButton("Save");
		for(int i=1;i<=30;i++){
	        j1.addItem(i);
		}
		l.setBounds(150, 10, 250,50);
		l1.setBounds(50, 90, 250,40);
		l2.setBounds(50, 130, 250,40);
		l3.setBounds(50, 170, 250,40);
		l4.setBounds(50,210,250,40);
		t1.setBounds(150, 90, 200,40);
		t2.setBounds(150, 130, 200,40);
		t3.setBounds(150, 170, 200,40);
		j1.setBounds(150,210,100,40);
		b1.setBounds(300,300, 100,50);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(j1);
		setLayout(null);
		setSize(640,400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Saved your details");
	}

}
