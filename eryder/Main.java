package eryder;

public class Main {
    public static void main(String[] args) {
        /*ERyder eryder1=new ERyder();
        eryder1.printBikeDetails();
        System.out.println("=================");
        eryder1.setBatteryLevel(1001);
        eryder1.printBikeDetails();
        System.out.println("=================");
        ERyder eryder2=new ERyder("217250212", 20, true, 12.0f);
        eryder2.printBikeDetails();
        eryder2.ride();
        System.out.println("=================");
        ERyder eryder3=new ERyder("217250212", 2001, false, 12.0f);
        eryder3.printBikeDetails();
        eryder3.ride();*/
        ERyder eryder1=new ERyder("217250212", 20, true, 12.0f);
        eryder1.printRideDetails(123);
        ERyder eryder2=new ERyder("ID123", 10, true, 12.0f,"Alice-Liuxinyu",123456789L);
        eryder2.printRideDetails(456);
        eryder2.useCalculateFare(123);
    }
}

