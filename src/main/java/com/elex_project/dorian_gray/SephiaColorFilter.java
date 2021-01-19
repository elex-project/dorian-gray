/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;


import com.elex_project.abraxas.Mathz;

public final class SephiaColorFilter extends AbsImageFilter {

	@Override
	protected int doSomethingWithPixel(final int color) {
		int a = Colors.getAlpha(color);
		int r = Colors.getRed(color);
		int g = Colors.getGreen(color);
		int b = Colors.getBlue(color);

		int _r = Mathz.constrain((int)(0.393*r + 0.769*g + 0.189*b), 0, 255);
		int _g = Mathz.constrain((int)(0.349*r + 0.686*g + 0.168*b), 0, 255);
		int _b = Mathz.constrain((int)(0.272*r + 0.534*g + 0.131*b), 0, 255);
		return Colors.pack(a, _r,_g,_b);
	}
}
