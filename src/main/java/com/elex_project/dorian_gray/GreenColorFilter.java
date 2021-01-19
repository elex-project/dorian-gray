/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

public final class GreenColorFilter extends AbsImageFilter {

	@Override
	protected int doSomethingWithPixel(final int color) {
		int a = Colors.getAlpha(color);
		//int r = ColorUtils.getRed(color);
		int g = Colors.getGreen(color);
		//int b = ColorUtils.getBlue(color);

		return Colors.pack(a, 0, g, 0);
	}
}
