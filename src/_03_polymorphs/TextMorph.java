package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JOptionPane;

public class TextMorph extends Polymorph {
Random rand = new Random();
public static boolean bool = false;
	TextMorph(int x, int y) {
		super(x, y, 50, 50);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
		g.setColor(color);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}
