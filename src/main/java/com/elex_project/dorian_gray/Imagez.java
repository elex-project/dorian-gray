/******************************************************************************
 * Project Dorian Gray                                                        *
 *                                                                            *
 * Copyright (c) 2019. Elex. All Rights Reserved.                             *
 * https://www.elex-project.com/                                              *
 ******************************************************************************/

package com.elex_project.dorian_gray;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 *
 * @see "https://www.geeksforgeeks.org/image-processing-java-set-1-read-write/"
 */
public final class Imagez {
	public static final String WRITER_FORMAT_JPG = "JPEG";
	public static final String WRITER_FORMAT_BMP = "BMP";
	public static final String WRITER_FORMAT_GIF = "GIF";
	public static final String WRITER_FORMAT_WBMP = "WBMP";
	public static final String WRITER_FORMAT_PNG = "PNG";
	public static final String WRITER_FORMAT_TIFF = "TIFF";

	private Imagez(){}

	public static BufferedImage readFrom(final File file) throws IOException {
		return ImageIO.read(file);
	}
	public static BufferedImage readFrom(final URL url) throws IOException {
		return ImageIO.read(url);
	}
	public static BufferedImage readFrom(final InputStream stream) throws IOException {
		return ImageIO.read(stream);
	}

	public static boolean writeTo(final BufferedImage image, final String format, final File file) throws IOException {
		return ImageIO.write(image, format, file);
	}
	public static boolean writeTo(final BufferedImage image, final String format, final OutputStream stream) throws IOException {
		return ImageIO.write(image, format, stream);
	}
}
