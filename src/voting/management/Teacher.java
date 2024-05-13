/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;


class Teacher {
    
    
     private String teacher_id,teacher_name,faculty, course, password;
    
    
    public Teacher (String teacher_id,String teacher_name,String faculty,String course, String password)
            {
            this.teacher_id= teacher_id;
            this.teacher_name=teacher_name;
            this.faculty=faculty;
            this.course=course;
            this.password=password;
           
            
    }

    public String getPassword() {
        return password;
    }

    public String getTeacherid() {
        return teacher_id;
    }

   
    public String getTeacher_name() {
        return teacher_name;
    }

    public String getFaculty() {
        return faculty;
    }


    public String getCourse() {
        return course;
    }
 

    
}
