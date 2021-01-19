/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;


import com.elex_project.abraxas.Mathz;

public final class GreyScaleFilter extends AbsImageFilter {

	@Override
	protected int doSomethingWithPixel(final int color) {
		int a = Colors.getAlpha(color);
		int r = Colors.getRed(color);
		int g = Colors.getGreen(color);
		int b = Colors.getBlue(color);

		int avg = Mathz.avg(r, g, b);

		return Colors.pack(a, avg, avg, avg);
	}
}
