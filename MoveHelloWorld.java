package github;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MoveHelloWorld extends JFrame implements MouseMotionListener{
	//窗口的宽度和高度
	final int WINDOW_WIDTH = 500;
	final int WINDOW_HEIGHT = 500;
	MyJPanel myPanel;
	//鼠标任意时刻的坐标值，默认值为屏幕中心
	int nowX=WINDOW_WIDTH/2,nowY=WINDOW_WIDTH/2;
	
	//初始化窗口中的组件
	public MoveHelloWorld() {
		myPanel = new MyJPanel();
		this.add(myPanel);
		
		this.addMouseMotionListener(this);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		nowX = arg0.getX();
		nowY = arg0.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	class MyJPanel extends JPanel{
		@Override
		public void paint(Graphics arg0) {
			arg0.setColor(Color.WHITE);
			arg0.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
			arg0.setColor(Color.BLACK);
			arg0.drawString("Hello World", nowX, nowY);
		}
	}
	
	public static void main(String[] args) {
		MoveHelloWorld moveString = new MoveHelloWorld();
	}
}
