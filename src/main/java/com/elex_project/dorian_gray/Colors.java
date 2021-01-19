/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

public final class Colors {
	private Colors(){}

	public static int getAlpha(final int color){
		return color>>24 & 0xff;
	}
	public static int getRed(final int color){
		return color>>16 & 0xff;
	}
	public static int getGreen(final int color){
		return color>>8 & 0xff;
	}
	public static int getBlue(final int color){
		return color & 0xff;
	}

	public static int pack(final int a, final int r, final int g, final int b){
		return a<<24 | r<<16 | g<<8 | b;
	}
}
