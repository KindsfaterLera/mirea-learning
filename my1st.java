import javax.swing.*;
public class my1st extends JFrame
{
	public static void main(String[] args)
{
	new my1st();
}
	public my1st()
{
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("Всем привет. Это моя первая Java-программа на Linux");
	panel1.add(label1);
	this.add(panel1);
	this.setTitle("Моя первая программа на Java");
	this.setSize(500,500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
}
