/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kindergarden;

/**
 *
 * @author dell
 */
public class teachers  extends Garden {
   
   private  String occupation;
    private int salary ;

public int getsalary(){
   return salary; 
}
public void setsalary(int newsalary){
    newsalary=salary;
   
}
public String getOccuation(){
    return occupation;
}
public void setOccupation(String newOccupation){
    
}
}