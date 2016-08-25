package JavaCore.file.io.handle.Bai1;

import java.io.*;
import java.util.List;

/**
 * Created by PhuongThuan on 8/23/2016.
 */
public class Test {
//    public static void main(String[] args) {
//
////        try {
////            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("student.dat")));
////
////            List<Student> list = (List<Student>) ois.readObject();
////            for (Student st1 : list
////                    ) {
////                System.out.println(st1.infoStudent());
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        } catch (ClassNotFoundException e) {
////            e.printStackTrace();
////        }
//
//
//
//    }

    public static void writeToTextFile(List<Student> listStudent) throws IOException {
        File file = new File("Student.txt");
        if (file.exists()) {
            System.out.println("File đã tồn tại LMAO :))");
            System.exit(0);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Student student : listStudent) {
            bufferedWriter.write(student.toString());
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }
}
