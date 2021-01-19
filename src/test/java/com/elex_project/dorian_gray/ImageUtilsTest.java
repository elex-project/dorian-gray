package com.elex_project.dorian_gray;


import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtilsTest {
	/**
	 * JPG
	 * jpg
	 * tiff
	 * bmp
	 * BMP
	 * gif
	 * GIF
	 * WBMP
	 * png
	 * PNG
	 * JPEG
	 * tif
	 * TIF
	 * TIFF
	 * jpeg
	 * wbmp
	 * @throws IOException
	 */
	@Test
	public void writerFormatNames() throws IOException {
		String[] s = ImageIO.getWriterFormatNames();
		for (String item : s){
			System.out.println(item);
		}

		//BufferedImage image = ImageUtils.readFrom(new File(""));
		//image.getRGB(0,0);
	}
}
