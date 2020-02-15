package com.db.operations;

import java.io.IOException;

import com.db.persist.PersistImage;
import com.db.persist.ReadImagePersist;

public class Operations {
	public static void insertExecute(String filepath) throws IOException {
		ImageWriteOperation io = new ImageWriteOperation();
		PersistImage pi = new PersistImage();
		String encoded_image = io.readImage(filepath);
		pi.insertImage(encoded_image);
	}
	public static void readExecute(int id) throws IOException {
		ReadImagePersist ri = new ReadImagePersist();
		ImageReadOperation ir = new ImageReadOperation();
		ir.saveImage(ri.readImage(id));
	}
}
