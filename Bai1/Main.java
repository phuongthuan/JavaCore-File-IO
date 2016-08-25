package JavaCore.file.io.handle.Bai1;

import javax.management.Query;
import java.io.*;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PhuongThuan on 8/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        boolean set = true;
        Scanner input = new Scanner(System.in);
        StudentManager stmn = new StudentManager();
        StudentDataAcess stda = new StudentDataAcess();
        while (set) {
            System.out.println("**********************");
            System.out.println("* STUDENT MANAGER    *");
            System.out.println("* 1.ADD STUDENT      *");
            System.out.println("* 2.EDIT STUDENT     *");
            System.out.println("* 3.DELETE STUDENT   *");
            System.out.println("* 4.DISPLAY STUDENT  *");
            System.out.println("* 5.WRITE ST TO FILE *");
            System.out.println("* 6.READ ST FROMFILE *");
            System.out.println("* 0.QUIT             *");
            System.out.println("**********************");
            System.out.println("ENTER YOUR CHOICE: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    input.nextLine();
                    System.out.println("ADD STUDENT");
                    System.out.println("ENTER ID - NAME - AGE - ADDRESS: ");
                    Student entry = new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
                    if (stmn.addStudent(entry)) {
                        System.out.println("Add success !!");
                    } else {
                        System.out.println("Add failed !!");
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Edit Student");
                    System.out.println("EnterID: ");
                    String oldid = input.nextLine();
                    System.out.println("Enter newID: ");
                    String newid = input.nextLine();
                    System.out.println("Enter newName: ");
                    String newname = input.nextLine();
                    System.out.println("Enter newAge: ");
                    String newage = input.nextLine();
                    System.out.println("Enter newAddress: ");
                    String newaddress = input.nextLine();
                    if (stmn.editStudent(oldid, newid, newname, newage, newaddress)) {
                        System.out.println("Edit success!!");
                    } else {
                        System.out.println("Edit failed !!)");
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("DELETE STUDENT");
                    System.out.println("EnterID yourID: ");
                    String yourID = input.nextLine();
                    if (stmn.deleteStudent(yourID)) {
                        System.out.println("Delete success!!");
                    } else {
                        System.out.println("Delete Failed !!)");
                    }
                    break;
                case 4:
                    System.out.println("NumberOfStudent: " + stmn.getListStudents().size() + " Student");
                    System.out.println(stmn.displayStudent());
                    break;
                case 5:
                    input.nextLine();
                    List<Student> st = stmn.getListStudents();
                    stda.writeToBinaryFile(st);
                    System.out.println("Written done !!");
                    break;
                case 6:
                    input.nextLine();
                    break;
                case 0:
                    set = false;
                    break;
                default:
                    break;
            }
        }
    }
}
