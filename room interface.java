
public interface room {

    void RoomN(String RoomName);

    void RoomNum(int RoomNumber);

}

class languageRoom implements room {

    String Name;
    int Number;

    public languageRoom(String N, int num) {
        this.Name = N;
        this.Number = num;
    }

    public void RoomN(String RoomName) {
        Name = RoomName;
    }

    public void RoomNum(int RoomNumber) {
        Number = RoomNumber;
    }

    public void ptint() {
        System.out.println("RoomName is : \t" + Name + "\t  , RoomNumber : " + Number);
    }
class MusicRoom implements room{
    String Name;
    int Number; 

    public void RoomN(String RoomName) {
        Name = RoomName;
    }

    public void RoomNum(int RoomNumber) {
        Number = RoomNumber;
    }

    public void ptint() {
        System.out.println("RoomName is :\t " + Name + "\t , RoomNumber : " + Number);
    }
}
    public static void main(String[] args) {
        languageRoom ob = new languageRoom("English", 1); 
        ob.RoomN("English");
        ob.RoomNum(1);
        ob.ptint();
    }

}
