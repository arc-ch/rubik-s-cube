import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
public class window extends JPanel{
	private Color []y;
	private Color []b;
	private Color []r;
	private Color []g;
	private Color []o;
	private Color []w;
	private int k=0;
	public JFrame frame;
	public window(int width,int height,String title) {
		frame = new JFrame(title);
		frame.add(this);
		frame.setBounds(125,200,width,height);
		frame.setTitle(title);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void update(Color []y,Color []b,Color []r,Color []g,Color []o,Color []w){
		this.y=y;
		this.b=b;
		this.r=r;
		this.g=g;
		this.o=o;
		this.w=w;
	}
	public void paint(Graphics gr) {
		if(k==9)
			k=0;
		//System.out.println("g");
		super.paint(gr);
		Graphics2D gr2 = (Graphics2D) gr;
		gr2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		setBackground(Color.white);
		//setForeground(Color.orange);
		gr2.setFont(new Font("arial",Font.BOLD,28));
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				gr2.setColor(y[k]);
				gr2.fillRect(i*50+25,j*50+50,50,50);
				gr2.setColor(Color.BLACK);
				gr2.drawString("YELLOW",35,250);
				
				gr2.setColor(b[k]);
				gr2.fillRect(i*50+200+25,j*50+50,50,50);
				gr2.setColor(Color.BLACK);
				gr2.drawString("BLUE",260,250);
				
				gr2.setColor(r[k]);
				gr2.fillRect(i*50+400+25,j*50+50,50,50);
				gr2.setColor(Color.BLACK);
				gr2.drawString("RED",470,250);
				
				gr2.setColor(g[k]);
				gr2.fillRect(i*50+600+25,j*50+50,50,50);
				gr2.setColor(Color.BLACK);
				gr2.drawString("GREEN",650,250);
				
				gr2.setColor(o[k]);
				gr2.fillRect(i*50+800+25,j*50+50,50,50);
				gr2.setColor(Color.BLACK);
				gr2.drawString("ORANGE",835,250);
				
				gr2.setColor(w[k]);
				gr2.fillRect(i*50+1000+25,j*50+50,50,50);
				gr2.setColor(Color.BLACK);
				gr2.drawString("WHITE",1050,250);
				
				k++;
			}
		}
		gr2.dispose();
		repaint();
	}
}
