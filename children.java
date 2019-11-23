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
public class children extends Garden {
    
    
       
       
    private int childLevel;
      private String parentName;//parent
    private String parentJob;
    
     public int getChildLevel() {
        return childLevel;
     }
        public String getGuardianName() {
        return parentName;

    }

    public String getGuardianJob() {
        return parentJob;
    } 
     public void setChildLevel() {
         int age = getAge();
        if (age == 4) {
            System.out.println("this child is accepting in Level one");
        } else if (age == 5) {
            System.out.println("this child is accepting in Level two");
        
        } 
        else {
            System.out.println("t");
        }
        
     }
     public void setGuardianName(String newName) {
        parentName = newName;
    }

    public void setGuardianJob(String newWorkAddrss) {
        parentJob = newWorkAddrss;

    } 
}
