
public class ParkingLotOwner implements ParkingLotObservers {
    private boolean isFullCapacity;
    private int parkingTime;

    @Override
    public void setCapacityFull() {
        isFullCapacity = true;
    }

    @Override
    public boolean isCapacityFull() {
        return isFullCapacity;
    }

    @Override
    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }

    @Override
    public int getParkingTime() {
        return parkingTime;
    }
}
