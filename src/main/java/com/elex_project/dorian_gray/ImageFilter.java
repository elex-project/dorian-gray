/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

import java.awt.image.BufferedImage;

public interface ImageFilter {

	public void doFilter(final BufferedImage image);

	/**
	 *
	 * @param image Image
	 * @param x0 inclusive
	 * @param y0 inclusive
	 * @param x1 inclusive
	 * @param y1 inclusive
	 */
	public void doFilter(final BufferedImage image, final int x0, final int y0, final int x1, final int y1);
}
