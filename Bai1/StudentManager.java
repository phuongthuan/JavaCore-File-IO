package JavaCore.file.io.handle.Bai1;

import javax.management.Query;
import java.util.ArrayList;

/**
 * Created by PhuongThuan on 8/23/2016.
 */
public class StudentManager {

    private ArrayList<Student> listStudents = new ArrayList<Student>();

    public StudentManager(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public StudentManager(){

    }

    //======Add student=============

    public boolean addStudent(Student st) {
        if (!existsID(st.getId()) && !existsName(st.getName())) {
            listStudents.add(st);
            return true;
        }
        return false;
    }

    //======Edit student=============
    public boolean editStudent(String oldid, String newid, String newname, String newage, String newaddress) {
        if (existsID(oldid)) {
            for (int i = 0; i < listStudents.size(); i++) {
                if (listStudents.get(i).getId().equals(oldid)) {
                    listStudents.get(i).setId(newid);
                    listStudents.get(i).setName(newname);
                    listStudents.get(i).setAge(newage);
                    listStudents.get(i).setAddress(newaddress);
                    return true;
                }
            }
        }
        return false;
    }

    //=========Delete student=========
    public boolean deleteStudent(String id) {
        if (existsID(id)) {
            for (int i = 0; i < listStudents.size(); i++) {
                if (listStudents.get(i).getId().equals(id)) {
                    listStudents.remove(i);
                    return true;
                }
            }
        }
        return false;
    }


    //=========Display Student ============
    public String displayStudent(){
        String st = " ";
        for (int i = 0; i < listStudents.size(); i++) {
            listStudents.get(i).getId();
            listStudents.get(i).getName();
            listStudents.get(i).getAge();
            listStudents.get(i).getAddress();
            st += "Info[id,name,age,address]:\n " + "- " + listStudents.get(i).getId() + "\n" +
                    " - " + listStudents.get(i).getName() + "\n" +
                    " - " + listStudents.get(i).getAge() + "\n" +
                    " - " + listStudents.get(i).getAddress() + "\n" +
                    "--------------------------" + "\n";
        }
        return st;
    }

    //=========CheckStudent==========
    public boolean existsID(String inputID) {
        if (listStudents.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < listStudents.size(); i++) {
                listStudents.get(i).getId().equals(inputID);
                return true;
            }
        }
        return false;
    }

    public boolean existsName(String inputName) {
        if (listStudents.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < listStudents.size(); i++) {
                listStudents.get(i).getName().equals(inputName);
                return true;
            }
        }
        return false;
    }
}
