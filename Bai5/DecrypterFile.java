package JavaCore.file.io.handle.Bai5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PhuongThuan on 8/26/2016.
 */
public class DecrypterFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PhuongThuan\\Desktop\\thuan.txt_encrypter.txt");
        FileDecrypter(file);
    }


    public static void FileDecrypter(File file){
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            List<Byte> list = new ArrayList<Byte>();
            byte[] bytes = new byte[1024];

            while (bis.read(bytes) > 0){
                for (byte b :bytes) {
                    if(b != 0){
                        System.out.print((char)(byte)(b-5));
                        list.add((byte)(b-5));
                    }
                }
            }
            bis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
