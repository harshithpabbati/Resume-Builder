import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EducationUI extends JFrame implements ActionListener{
	public JLabel l,l1,l2,l3,l4;
	public JTextField t1,t2,t3;
	public JComboBox j1,j2,j3,j4,j5,j6;
	public JButton b1;
	public Font f;
	
	public EducationUI() {
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Education");
		l.setFont(f);
		l1 = new JLabel("School");
		l2 = new JLabel("College");
		l3 = new JLabel("University");
		l4 = new JLabel("Time Period");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		j1 = new JComboBox();
		j2 = new JComboBox();
		j3 = new JComboBox();
		j4 = new JComboBox();
		j5 = new JComboBox();
		j6 = new JComboBox();
		b1 = new JButton("Experience -->");
		for(int i=1950;i<=2050;i++){
	        j1.addItem(i);
		}
		for(int i=1950;i<=2050;i++){
	        j2.addItem(i);
		}
		for(int i=1950;i<=2050;i++){
	        j3.addItem(i);
		}
		for(int i=1950;i<=2050;i++){
	        j4.addItem(i);
		}
		for(int i=1950;i<=2050;i++){
	        j5.addItem(i);
		}
		for(int i=1950;i<=2050;i++){
	        j6.addItem(i);
		}
		l.setBounds(150, 10, 250,50);
		l1.setBounds(50, 90, 250,40);
		l2.setBounds(50, 130, 250,40);
		l3.setBounds(50, 170, 250,40);
		l4.setBounds(450,50,250,10);
		t1.setBounds(150, 90, 200,40);
		t2.setBounds(150, 130, 200,40);
		t3.setBounds(150, 170, 200,40);
		j1.setBounds(400, 90, 100,40);
		j2.setBounds(400, 130, 100,40);
		j3.setBounds(400, 170, 100,40);
		j4.setBounds(520, 90, 100,40);
		j5.setBounds(520, 130, 100,40);
		j6.setBounds(520, 170, 100,40);
		b1.setBounds(300,300, 150,50);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		add(j6);
		add(b1);
		b1.addActionListener(this);
		setLayout(null);
		setSize(640,400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ExperienceUI();
	}

}
