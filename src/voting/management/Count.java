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
class Count {
    
    int count, teacher_id;
    String teacherName, faculty;
    
    public Count(int teacher_id, String teacherName,String faculty, int count)
    {
        this.teacher_id=teacher_id;
        this.teacherName=teacherName;
        this.faculty=faculty;
        this.count=count;
    
    }
    
    public int getteacherid()
    {
        return teacher_id;
    }
    public int getcount()
    {
    return count;}
    
    public String getTeacherName()
    {
    return teacherName;
    }
    
    public String getfaculty()
    {
        return faculty;
    }
}