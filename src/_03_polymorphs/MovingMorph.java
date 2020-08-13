package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
int move = 0;
Random rand = new Random();
	MovingMorph(int x, int y, int width, int height) {
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
	public void update() {
		
		setY(rand.nextInt(PolymorphWindow.HEIGHT));
		setX(rand.nextInt(PolymorphWindow.WIDTH));
	}

}