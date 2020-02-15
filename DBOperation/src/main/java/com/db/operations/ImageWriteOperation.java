package com.db.operations;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import org.springframework.util.Base64Utils;
import javax.imageio.ImageIO;

public class ImageWriteOperation {

	String readImage(String filepath) throws IOException {
		byte[] image;
		BufferedImage bImage = ImageIO.read(new File(filepath));
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ImageIO.write(bImage, "jpg", bos);
		image = bos.toByteArray();
		String encodedImage = Base64Utils.encodeToString(image);
		return encodedImage;

	}

}
