public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider() {
        return rider;
    }

    public void setRider(CarRider rider) {
        this.rider = rider;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getRentDur() {
        return rentDur;
    }

    public void setRentDur(int rentDur) {
        this.rentDur = rentDur;
    }
}
