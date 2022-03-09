/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ontapjava;

/**
 *
 * @author ndt05
 */
import java.io.Serializable;
public class Student implements Serializable {
    
        private static final long serialVersionUID = -266706354210367639L;
    private int id;
    private String name;
    private int score;
    private String image;
    private String note;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", image='" + image + '\'' +
                ", note='" + note + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public Student(int id,String name, int score,String image, String address) {
        super();
        this.name = name;
        this.score = score;
        this.image = image;
        this.address = address;
        this.id = id;
    }

    public int compareTo(Student compareStudent) {

        int compareId = ((Student) compareStudent).getId();

        //ascending order
        return this.id - compareId;


    }

    public int compareToDESC(Student compareStudent) {

        int compareId = ((Student) compareStudent).getId();



        //descending order
        return compareId - this.id;

    }

    public int compareToByScore (Student compareStudent) {

        int compareScore = ((Student) compareStudent).getScore();

        //ascending order
        return this.score - compareScore;


    }

    public int compareToByScoreDESC(Student compareStudent) {

        int compareScore = ((Student) compareStudent).getScore();



        //descending order
        return compareScore - this.score;

    }

}
