package JavaCore.file.io.handle.Bai1;


import java.io.*;
import java.util.List;

/**
 * Created by PhuongThuan on 8/23/2016.
 */
public class StudentDataAcess {
    public static void writeToBinaryFile(List<Student> listStudent) {
        File file = new File("Student.dat");
        if (file.exists()) {
            System.out.println("File đã tồn tại LMAO :))");
            System.exit(0);
        } else {
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(listStudent);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Student> readFromBinaryFile(String path) throws IOException {
        File file = new File("Student.dat");
        if (file.exists()) {
            System.out.println("File đã tồn tại LMAO :))");
            System.exit(0);
        } else {
            FileInputStream inputStream = new FileInputStream(path);
            StringBuilder sb = new StringBuilder();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
            System.out.println("Data from file:\n" + sb);
        }
        return null;
    }

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

    public static List<Student> readFromTextFile(String path) {
        return null;
    }
}
