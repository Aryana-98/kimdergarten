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
public class Garden {

     private String Name;
     private int age;
    private String Gender;
   private  String Address;
    private long mobileNumber;
     
    private String e_mail;

    public String getChildName() {
        return Name;

    }

    public int getAge() {
        return age;

    }


    public String getGennder() {
        return Gender;

    }

    public String getChildAddress() {
        return Address;

    }

   

    public long getMobileNumber() {
        return mobileNumber;

    }

    public String getE_mail() {
        return e_mail;
    }

    public void setName(String newName) {

        Name = newName;
    }

    public void setAge(int newAge) {
//        if (newAge >= 3 && newAge <= 6) {
//            System.out.println("this child is accepting");
//        } else {
//            System.out.println("this child is not accepting");
//        }
        age=newAge;
    }
    public void setGender(String newChildGender) {
        Gender = newChildGender;

    }

    public void setAddress(String newAddress) {
     Address=newAddress;
       
    }

    public void setMobileNumber(long newNumber) {
        mobileNumber = newNumber;
    }

    public void setE_mail(String newE_mail) {
        e_mail = newE_mail;
    } 
    
    public static void main(String[] args) {
       Garden ob = new Garden();
ob.setName("Aryana");

        ob.setAge(4);


        ob.setGender("Female");

        ob.setAddress("ibrahim ahmed");


        ob.setE_mail("arayan@gmail.com");
         
    
        System.out.println(ob.getChildName());
        System.out.println(ob.getAge());
//        System.out.println(ob.getChildLevel());
        System.out.println(ob.getGennder());
        System.out.println(ob.getChildAddress());
//        System.out.println(ob.getGuardianName());
//        System.out.println(ob.getGuardianJob());
        System.out.println(ob.getMobileNumber());
        System.out.println(ob.getE_mail());
//        System.out.println(ob.salary);
      
        System.out.println("insertion is successfuly....");
    
}
}
        
      