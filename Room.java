/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;


 class Room {
     int numberRoom;

    public void display() {
        System.out.println(" this room is finding in kindergarten ");
    }
}
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
class languageRoom extends Room {

    public void display() {
        System.out.println("English Room ");
        super.display();
    }
//    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    class MusicRoom extends Room {

   public void display() {
       System.out.println("Music Room");
      super.display();
        }
    }
//    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    class DrawRoom extends Room {

        public void display() {
            System.out.println("Music Room");
            super.display();
        }
    }
    public static void main(String[] args) {

        Room ob = new languageRoom();
        ob.display();
    }
}
