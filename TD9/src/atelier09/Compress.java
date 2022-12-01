package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compress {
	File targetFile;
	
	public Compress() {}
	
	public Compress(File target) {
		targetFile = target;
		if (targetFile.exists())
			targetFile.delete();
	}


	public static void main(String[] args) {
		File f = new File("E:/Study/Java");
		new Compress(new File( "D:/test",f.getName()+".zip"));
	}
 
	public void zipFile(File srcfile, ZipOutputStream out, String basedir) {
		if (!srcfile.exists())
			return;
 
		byte[] buf = new byte[1024];
		FileInputStream in = null;
 
		try {
			int len;
			in = new FileInputStream(srcfile);
			out.putNextEntry(new ZipEntry(basedir + srcfile.getName()));
 
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.closeEntry();
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
