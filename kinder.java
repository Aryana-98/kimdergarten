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
public class kinder {

   
   public static void main(String[] args) {
       manager ob1=new manager();
       ob1.setsalary(1000);
       System.out.println(ob1.getsalary());
       
       teachers ob2=new teachers();
       ob2.setsalary(500);
       ob2.setOccupation("music");
       System.out.println(ob2.getsalary());
       
       children ob3=new children();
       ob3.setGuardianName("Mahmud");
       ob3.setGuardianJob("Doctor");
       System.out.println(ob3.getChildLevel());
       System.out.println(ob3.getGuardianName());
       System.out.println(ob3.getGuardianJob());
       
       
   }
}
