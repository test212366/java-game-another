import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



	class MyFrame extends JFrame{
		public MyFrame() {
			MyPanel pan= new MyPanel(); 
			Container cont=getContentPane();
			cont.add(pan);
            setBounds(100, 100, 1200, 900);			
			setVisible(true);
		
		}
	}
	class MyPanel extends JPanel{
		Image img;
		int x=0, y=0;
		int napr= 1;
		class myKey implements KeyListener{

			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				int key_=arg0.getKeyCode();
				if (key_==100){
					napr=0;
				}
				if (key_==98) {
					napr=1;
				}
				if (key_==102) {
					napr=2;
				}
				if (key_==104) {
					napr=3;
				}
				if (key_==103) {
					napr=4;
				}
				if (key_==99) {
					napr=5;
				}
				if (key_==105) {
					napr=6;
				}
				if (key_==97) {
					napr=7;
				}
				if (key_==96) {
					napr=8;
				}
				if (key_==101) {
					napr=9;
				}
			}

			@Override
			public void keyReleased (KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		}public MyPanel() {
		 addKeyListener(new myKey());
		 setFocusable(true);
		 Timer nt=new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (napr==3) {
					y--;
				}
				if (napr==0) {
					x--;
				}
				if (napr==2) {
					x++;
				}
				if (napr==1) {
					y++;
				}
				if (napr==4) {
					y--;
					x--;
				}
				if (napr==5) {
					y++;
					x++;
				}
				if (napr==6) {
					y--;
					x++;
				}
				if (napr==7) {
					y++;
					x--;
				}
				if (napr==8) {
					y=0;
					x=0;
				}
				if (napr==9) {
					y=y++;
					x=x++;
				}
				repaint();
				
			}
		
		}); 
		 nt.start();
		 
		 try {
			img=ImageIO.read(new File("F:\\worcks\\Hometab\\1365482777172.jpg"));
		} catch (IOException e) {
			System.out.println(404);
		}
	}
        public void paintComponent(Graphics g) {
        	g.clearRect(x-1, y-1, img.getWidth(null),img.getHeight(null)+1);
        	g.drawImage(img,x,y,null);
        	
        }
        
	}
	public class pr1 {
		
	public static void main(String[] args) {
		MyFrame okno=new MyFrame();

	}

}
