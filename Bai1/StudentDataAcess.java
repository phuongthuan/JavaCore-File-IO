package JavaCore.file.io.handle.npt.Bai1;


import java.io.*;
import java.util.List;

/**
 * Created by PhuongThuan on 8/23/2016.
 */
public class StudentDataAcess {
    public static void writeToBinaryFile(List<Student> listStudent) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat", false));
        oos.writeObject(listStudent);
        oos.close();
    }

    public static List<Student> readFromBinaryFile(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
        List<Student> list = (List<Student>) ois.readObject();
        for (Student st1 : list) {
            System.out.println(st1.infoStudent());
        }
        ois.close();
        return null;
    }

    public static void writeToTextFile(List<Student> listStudent) throws IOException {
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("studenttext.txt", false));
        oos2.writeObject(listStudent);
        oos2.close();
    }

    public static List<Student> readFromTextFile(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("studenttext.txt")));
        List<Student> list1 = (List<Student>) ois1.readObject();
        for (Student st2 : list1) {
            System.out.println(st2.infoStudent());
        }
        ois1.close();
        return null;
    }
}
