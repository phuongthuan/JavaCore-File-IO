package JavaCore.file.io.handle.Bai3;

import java.io.*;

/**
 * Created by PhuongThuan on 8/25/2016.
 */
public class MergerFiles {

    public static void main(String[] args) {
        String tes1 = "C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3.002";
        String tes2 = "C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3.003";
        String tes3 = "C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3.004";
        String tes4 = "C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3.005";
        String tes5 = "C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3.006";
        String tes6 = "C:\\Users\\PhuongThuan\\Desktop\\Cây đàn bỏ quên.mp3.007";

        String test = "C:\\Users\\PhuongThuan\\Desktop\\File mp3 Cây đàn bỏ quên .mp3";

        File[] file = new File[6];
        file[0] = new File(tes1);
        file[1] = new File(tes2);
        file[2] = new File(tes3);
        file[3] = new File(tes4);
        file[4] = new File(tes5);
        file[5] = new File(tes6);

        File fjoiner = new File(test);

        fileJoiner(file, fjoiner);
    }


    public static void fileJoiner(File[] files, File fjoiner) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fjoiner, true));
            for (File f : files) {
                System.out.println("Đang joiner file: " + f.getName());
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
                br.close();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Thành Công !!");
    }
}
