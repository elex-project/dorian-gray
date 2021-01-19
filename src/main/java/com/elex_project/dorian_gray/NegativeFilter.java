/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

public final class NegativeFilter extends AbsImageFilter {

	@Override
	protected int doSomethingWithPixel(final int color) {
		int a = Colors.getAlpha(color);
		int r = Colors.getRed(color);
		int g = Colors.getGreen(color);
		int b = Colors.getBlue(color);

		return Colors.pack(a, 255-r, 255-g, 255-b);
	}
}
