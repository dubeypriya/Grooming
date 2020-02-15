package com.db.operations;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import com.db.persist.ImageEntity;

import javax.imageio.ImageIO;

public class ImageReadOperation {

	void saveImage(ImageEntity ie) throws IOException {
		String encodedImage=ie.getEncoded_string();
		String fileName=String.valueOf(ie.getID());
		byte[] decodedImage = Base64.getDecoder().decode(encodedImage);  ;
		ByteArrayInputStream bis = new ByteArrayInputStream(decodedImage);
	      BufferedImage bImage = ImageIO.read(bis);
	      ImageIO.write(bImage, "jpg", new File(fileName+".jpg") );

	}

}
