/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ontapjava;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ndt05
 */
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException  {
    	Student student = new Student(1, "Nguyen Van A", 8, "BT", "BT");
        Student student2 = new Student(2, "Nguyen Van B", 9, "BT", "BT");
        Student student3 = new Student(3, "Nguyen Van c", 7, "BT", "BT");

        StudentManage students = new StudentManage();
        students.addStudent(student2);
        students.addStudent(student3);
        students.addStudent(student);

        System.out.println("sắp xếp theo id giảm dần");
        students.showListStudentById(-1);

        System.out.println("sắp xếp theo điểm tăng dần");
        students.showListStudentByscore(1);
    	File file = new File("Object.dat");
        ObjectOutputStream oos = null;
    	try {
            if (!file.exists()) {
            	if (file.createNewFile()) {
                	FileOutputStream fos = new FileOutputStream(file);
                        oos = new ObjectOutputStream(fos);
                	oos.writeObject(student);
                        oos.flush();
            	}
            }
  	} catch (IOException e) {
        	e.printStackTrace();
        }
//        finally {
//            oos.close();
//        }
        
//        ObjectInputStream ois = null;
//        try {
//            ois = new ObjectInputStream(new FileInputStream("Object.dat"));
//            Student student1 = (Student) ois.readObject();
//            System.out.println(student1);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            ois.close();
//        }
    }
}
