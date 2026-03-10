package eryder;

public class ERyder {
    /*private static final String COMPANY_NAME="ERyder";
    private static final double BASE_FARE=1.0;
    private static final double PER_MINUTE_FARE=0.5;

    private final String LINKED_ACCOUNT;
    private final long LINKED_PHONE_NUMBER;

    private int totalUsageInMinutes;
    private double totalFare;*/

    private String bikeID;
    private int batteryLevel;
    public boolean isAvailable;
    public float kmDriven;

    public ERyder(String bikeID,int batteryLevel,boolean isAvailable,float kmDriven){
        this.bikeID=bikeID;
        setBatteryLevel(batteryLevel);
        this.isAvailable=isAvailable;
        this.kmDriven=kmDriven;

        
    }
    public ERyder(){
        bikeID="No ID";
        batteryLevel=0;
        isAvailable=false;
        kmDriven=0.0f;
    }
    public void setBikeID(String bikeID){
        this.bikeID=bikeID;
    }
    public String getBikeID(){
        return bikeID;
    }
    public void setBatteryLevel(int batteryLevel){
        if(batteryLevel>=0 && batteryLevel<=100){
            this.batteryLevel=batteryLevel;
        }
        else{
            System.out.println("This batteryLevel is wrong!");
        }
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void setKmDriven(float kmDriven){
        this.kmDriven=kmDriven;
    }
    public float getKmDriven(){
        return kmDriven;
    }
    public void ride(){
        if(batteryLevel>0 && isAvailable==true){
            System.out.println("The bike is available!");
        }
        else{
            System.out.println("The bike is not available!");
        }
    }
    public void printBikeDetails(){
        System.out.println("bikeID:"+bikeID);
        System.out.println("batteryLevel:"+batteryLevel+"%");
        System.out.println("isAvailable:"+isAvailable);
        System.out.println("kmDriven:"+kmDriven+"km");
    }
    /*public void printRideDetails(int usageInMinutes){
        totalUsageInMinutes = usageInMinutes;
        System.out.println("bike company name:"+COMPANY_NAME);
        System.out.println("linked account:"+LINKED_ACCOUNT);
        System.out.println("linked phone number:"+LINKED_PHONE_NUMBER);
        System.out.println("bikeID:"+bikeID);
        System.out.println("usage in minutes:"+totalUsageInMinutes+"minutes");
        System.out.println("total fare:"+calculateFare(usageInMinutes)+"RMB");
    }
    private double calculateFare(int usageInMinutes){
        totalFare=BASE_FARE + (PER_MINUTE_FARE *usageInMinutes);
        return totalFare;
    }
    public double useCalculateFare(int usageInMinutes){
        return calculateFare(usageInMinutes);
    }*/
}

