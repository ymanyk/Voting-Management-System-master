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
class User {

   private String voter_id,name,address,gender;
    int age;
    
    public User (String voterid,String name,String address,String gender,int age)
            {
            this.voter_id=voterid;
            this.address=address;
            this.name=name;
            this.gender=gender;
            this.age=age;
            
            }
    public String getvoterid()
    {
    return voter_id;}
    public String getname()
    {
    return name;}
    public String getgender()
    {
    return gender;
    
    }
    public int getage()
    {
    return age;
    }
    public String getaddress()
    {
    return address;
    
    }

    
    
}
