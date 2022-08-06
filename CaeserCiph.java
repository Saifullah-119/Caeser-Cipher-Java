import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CaeserCiph implements ActionListener
{
	//Begin variables
	int len;
	String a,tab="";
	JFrame frm;
	Container con;
	FlowLayout fly;
	JButton fbtn;
	BorderLayout bly;
	Panel pnl,pnl2;
	JTextField txt1;
	JTextField txt2;
	JButton btn;
	JLabel lbl;
	//End variables 
	
	//Begin constructor
	void enCode()
	{
		frm=new JFrame();
		con=frm.getContentPane();
		lbl=new JLabel("Test",JLabel.CENTER);
		lbl.setBackground(Color.decode("#b7b8cf"));
		lbl.setOpaque(true);
		lbl.setFont(new Font("Serif", Font.PLAIN, 60));
		lbl.setPreferredSize(new Dimension(300, 300));

		
		fly = new FlowLayout();
		con.setLayout(fly);
		
		bly = new BorderLayout();
		con.setLayout(bly);
		
		pnl=new Panel();
		pnl.setLayout(new FlowLayout());
		
		txt1= new JTextField();
		txt1.setToolTipText("Enter text!");
		txt1.setSize(200,30);
		pnl.add(txt1);
		txt2= new JTextField("0");
		txt2.setSize(100,30);
		txt2.setToolTipText("Enter key!");
		pnl.add(txt2);
		pnl2=new Panel();
		pnl2.setLayout(new FlowLayout());
		btn=new JButton("GENERATE");
		pnl2.add(btn);
		btn.setPreferredSize(new Dimension(200, 50));
		btn.addActionListener(this);
		con.add(pnl,BorderLayout.NORTH);
		con.add(pnl2,BorderLayout.CENTER);
		con.add(lbl,BorderLayout.SOUTH);
		
		frm.setSize(1000,800);
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//End constructor
	public static void main(String args[])
	{
		CaeserCiph c=new CaeserCiph();
		c.enCode();
	}
	
	//Other Methods
	public void actionPerformed(ActionEvent e)
	{
		a=txt1.getText();
		int b=Integer.parseInt(txt2.getText());
		for(int i=0;i<a.length();i++)
		{
				tab+=(char)(a.charAt(i)+b);
		}
		lbl.setText(tab);
		tab="";
	}
}