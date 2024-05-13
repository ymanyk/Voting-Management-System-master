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
class User3 {
    
    int count, teacher_id;
    String teacher_name, faculty;
    
    public User3(int teacher_id,String teacher_name, String faculty, int count)
    {
        this.teacher_id=teacher_id;
        this.teacher_name = teacher_name;
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
    
    public String getteachername()
    {
    return teacher_name;
    }
    
    public String getfaculty(){
        return faculty;
    }
}
