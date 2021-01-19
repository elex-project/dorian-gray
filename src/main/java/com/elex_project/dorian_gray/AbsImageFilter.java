/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

import java.awt.image.BufferedImage;

abstract class AbsImageFilter implements ImageFilter {
	@Override
	public void doFilter(BufferedImage image) {
		doFilter(image, 0,0,image.getWidth()-1, image.getHeight()-1);
	}

	@Override
	public void doFilter(BufferedImage image, int x0, int y0, int x1, int y1) {
		for (int y=y0; y<=y1; y++) {
			for (int x=x0; x<=x1; x++) {
				image.setRGB(x, y, doSomethingWithPixel(image.getRGB(x,y)));
			}
		}
	}

	protected abstract int doSomethingWithPixel(int color);
}
