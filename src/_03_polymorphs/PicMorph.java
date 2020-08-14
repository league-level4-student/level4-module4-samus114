package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PicMorph extends Polymorph {
BufferedImage image;
	PicMorph(int x, int y) {
		super(x, y, 50, 50);
		try { 
			image = ImageIO.read(this.getClass().getResourceAsStream("wolf.jpeg")); 
			} catch (Exception e) {
				
			}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, this.getX(), this.getY(), 50, 50, null);
	}

}
