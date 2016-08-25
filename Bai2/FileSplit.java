package JavaCore.file.io.handle.Bai2;

import java.io.*;

public class FileSplit {
    public static void splitFile(File f) throws IOException {
        int partCounter = 1;
        int sizeOfFiles = 1024 * 1024;
        byte[] buffer = new byte[sizeOfFiles];

        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(f))) {
            String name = f.getName();

            int tmp = 0;
            while ((tmp = bis.read(buffer)) > 0) {
                File newFile = new File(f.getParent(), name + "."
                        + String.format("%03d", partCounter++));
                try (FileOutputStream out = new FileOutputStream(newFile)) {
                    out.write(buffer, 0, tmp);//tmp is chunk size
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        splitFile(new File("C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3"));
    }
}