/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;

/**
 *
 * @author Niraj
 */
public class User1 {
    private int teacherId;
    private String teacherName;
    private String faculty;
    private int count;


    public User1(int teacherId, String teacherName, String faculty, int count) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.faculty = faculty;
        this.count = count;
    }

    public int getTeacherId() {
        return teacherId;
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}