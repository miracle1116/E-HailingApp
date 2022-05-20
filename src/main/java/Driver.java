public class Driver {

    private String name, customer, status,latitude,longitude;
    private int capacity , estimatedArrivalTime;
    private double reputation;

    public Driver(String name, int capacity, String latitude, String longitude) {
        this.name = name;
        this.capacity = capacity;
        this.latitude= latitude;
        this.longitude= longitude;
        status="available";
        customer="-";
    }

    public void getStartingPoint(){

    }

    public void getDestinationPoint(){

    }

    public void setStatus(){

    }

    public void setCustomer(){

    }

    public void setLatitude(){

    }

    public void setLongitude(){

    }
    public void setReputation(){

    }
    public void setEstimatedArrivalTime(){

    }

    public String getName() {
        return name;
    }

    public String getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public double getReputation() {
        return reputation;
    }
}
