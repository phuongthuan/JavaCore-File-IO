package JavaCore.file.io.handle.npt.Bai2;

import java.io.*;

public class FileSplit {
    public static void splitFile(File f) throws IOException {

        int partFiles = 1;
        int sizeOfSubfiles = 1024 * 1024;
        byte[] buffer = new byte[sizeOfSubfiles];

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        String name = f.getName();
        int tmp = 0;
        while ((tmp = bis.read(buffer)) > 0) {
            File newFile = new File(f.getParent(), name + "."
                    + String.format("%03d", partFiles++));
            FileOutputStream out = new FileOutputStream(newFile);
            out.write(buffer, 0, tmp);
        }
    }

    public static void main(String[] args) throws IOException {
        splitFile(new File("C:\\Users\\PhuongThuan\\Desktop\\Tha Vao Mua - Trung Quan Idol_2.mp3"));
    }
}
