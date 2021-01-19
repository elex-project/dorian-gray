/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

public final class RedColorFilter extends AbsImageFilter {

	@Override
	protected int doSomethingWithPixel(final int color) {
		int a = Colors.getAlpha(color);
		int r = Colors.getRed(color);
		//int g = ColorUtils.getGreen(color);
		//int b = ColorUtils.getBlue(color);

		return Colors.pack(a, r, 0, 0);
	}
}
