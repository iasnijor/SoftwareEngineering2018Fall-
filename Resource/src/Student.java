/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojen
 */
public class Student {
    private String Name;
    private Schedule  schedule;
    private String Subject;
    public Student(String Name,Schedule schedule,String Subject){
        this.Name= Name;
        this.schedule=schedule;
        this.Subject=Subject;
    }
    
    
    public String getName(){
        return Name;
    }
    public String getSubject(){
        return Subject;
    }
    
}




