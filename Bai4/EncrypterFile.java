package JavaCore.file.io.handle.Bai4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PhuongThuan on 8/26/2016.
 */
public class EncrypterFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PhuongThuan\\Desktop\\thuan.txt");
        FileEncrypter(file);
        System.out.println("done");
    }

    public static void FileEncrypter(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            List<Byte> bytes = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                for (byte b : line.getBytes()) {
                    bytes.add((byte) (b + 5));
                    System.out.println((byte) (b + 5));
                }
            }
            br.close();
            File filenew = new File(file.getParent(), file.getName() + "_encrypter.txt");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filenew));
            for (byte b : bytes) {
                bos.write(b);
            }
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
