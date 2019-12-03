package com.hcl.project;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
    static List<Student> lstStudent=null;
    static ResourceBundle rb=null;
    static{
        lstStudent=new ArrayList<Student>();
        rb=ResourceBundle.getBundle("student");
    }
    public String addStudentDao(Student student){
        lstStudent.add(student);
        return rb.getString("add");
    }
    public List<Student> showStudentDao(){
        return lstStudent;
    }
    public Student searchStudentDao(int sno){
        Student objStudent=null;
        for (Student student : lstStudent) {
            if(student.getSno()==sno){
                
            }
            
        }
        return objStudent;
    }
    public String deleteStudentDao(int sno){
        String result="";
        Student student=searchStudentDao(sno);
        if(student!=null){
            lstStudent.remove(student);
            return rb.getString("delete");
        }else{
            return rb.getString("not found");
        }
        
            
    }
    
    public String updateStudentDao(Student objStudent){
        Student student=searchStudentDao(objStudent.getSno());
        String result="";
        if(student!=null){
            for (Student s : lstStudent) {
                if(s.getSno()==objStudent.getSno()){
                    s.setName(objStudent.getName());
                    s.setCity(objStudent.getCity());
                    s.setCgp(objStudent.getCgp());
                }
                
            }
            return rb.getString("upd");
        }else{
            return rb.getString("not found");
        }
        
        
       
        
    }

}