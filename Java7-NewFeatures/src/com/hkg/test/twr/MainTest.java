package com.hkg.test.twr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void TWROld() {
		URL url = null;
		File file = null;
		InputStream is = null;
		try {
			is = url.openStream();
			OutputStream out = new FileOutputStream(file);
			try {
				byte[] buf = new byte[4096];
				int len;
				while ((len = is.read(buf)) >= 0)
					out.write(buf, 0, len);
			} catch (IOException iox) {
			} finally {
				try {
					out.close();
				} catch (IOException closeOutx) {
				}
			}
		} catch (FileNotFoundException fnfx) {
		} catch (IOException openx) {
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException closeInx) {
			}
		}
	}

	public static void TWRNew() {
		URL url = null;
		File file = null;
		try (OutputStream out = new FileOutputStream(file);
				InputStream is = url.openStream()) {
			byte[] buf = new byte[4096];
			int len;
			while ((len = is.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
