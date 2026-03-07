package eryder;

public class ERyder {
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


}

