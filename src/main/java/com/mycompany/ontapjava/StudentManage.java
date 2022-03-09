package com.mycompany.ontapjava;

import java.util.ArrayList;
import java.util.List;

public class StudentManage {
    private List<Student> listStudent = new ArrayList<>();

    public StudentManage(List<Student> listStudent) {
        super();
        this.listStudent = listStudent;
    }
    public StudentManage() {
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void addStudent(Student student) {
        this.listStudent.add(student);
    }

    public void showListStudentById(int re){
    /**
     * re >0, ascending
     * else, descending
     */
        if (re > 0)
            this.listStudent.sort((Student::compareTo));
        else
            this.listStudent.sort((Student::compareToDESC));

        this.listStudent.forEach((n) -> System.out.println(n));
    }
    public void showListStudentByscore(int re){
        /**
         * re >0, ascending
         * else, descending
         */
        if (re > 0)
            this.listStudent.sort((Student::compareToByScore));
        else
            this.listStudent.sort((Student::compareToByScoreDESC));

        this.listStudent.forEach((n) -> System.out.println(n));
    }
}
