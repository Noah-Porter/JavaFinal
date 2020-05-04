package controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
  public static Texture wood = new Texture("https://img.rawpixel.com/s3fs-private/rawpixel_images/website_content/pf-chim-036.jpg?w=800&dpr=1&fit=default&crop=default&auto=format&fm=pjpg&q=75&vib=3&con=3&usm=15&bg=F4F4F3&ixlib=js-2.2.1&s=d6568c05cc9cea4ae46605f588832e35", 64);
	public static Texture brick = new Texture("https://i.pinimg.com/originals/2c/c1/3e/2cc13e6422218aa521474b36346b85f9.jpg", 64);
	public static Texture bluestone = new Texture("https://i.pinimg.com/originals/2c/c1/3e/2cc13e6422218aa521474b36346b85f9.jpg", 64);
	public static Texture stone = new Texture("https://i.pinimg.com/originals/2c/c1/3e/2cc13e6422218aa521474b36346b85f9.jpg", 64);

	public int[] pixels;
	private String loc;
	public final int SIZE;
	
	public Texture(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}