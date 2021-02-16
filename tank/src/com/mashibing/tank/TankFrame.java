package com.mashibing.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TankFrame extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x =200, y=200;

	public TankFrame() throws HeadlessException {
		setSize(800,600);
		setResizable(false);
		setTitle("坦克-tank war-大战");
		
		setVisible(true);
		this.addKeyListener(new MyKeyLister());
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		g.fillRect(x, y, 50, 50);
		x += 10;
	//	y += 10;
		//super.paint(g);
	}
	class MyKeyLister extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			//x+= 200;
			//repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		
	}
	
	
}
