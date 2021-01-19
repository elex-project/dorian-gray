package com.elex_project.dorian_gray;


import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class FilterTest {

	@Test
	void doFilter1() throws IOException {
		BufferedImage image = Imagez.readFrom(new File("sample/sample.jpg"));
		ImageFilter filter = new GreyScaleFilter();
		filter.doFilter(image, 100,100,300,300);
		Imagez.writeTo(image, Imagez.WRITER_FORMAT_PNG, new File("sample/sample_greyscale.png"));
	}
	@Test
	void doFilter2() throws IOException {
		BufferedImage image = Imagez.readFrom(new File("sample/sample.jpg"));
		ImageFilter filter = new NegativeFilter();
		filter.doFilter(image, 50,50,400,250);
		Imagez.writeTo(image, Imagez.WRITER_FORMAT_PNG, new File("sample/sample_negative.png"));
	}
	@Test
	void doFilter3() throws IOException {
		BufferedImage image = Imagez.readFrom(new File("sample/sample.jpg"));
		ImageFilter filter = new SephiaColorFilter();
		filter.doFilter(image, 50,50,400,250);
		Imagez.writeTo(image, Imagez.WRITER_FORMAT_PNG, new File("sample/sample_sephia.png"));
	}
}
