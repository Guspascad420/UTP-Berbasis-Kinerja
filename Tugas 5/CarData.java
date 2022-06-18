import java.util.ArrayList;
import java.util.List;

public class CarData {
    List<Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar() {
        System.out.println("------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("------------------------------");

        for (Car ryujin : carList) {
            System.out.println("TIPE MOBIL  : " +ryujin.getCarType());
            System.out.println("NO. POLISI  : "+ryujin.getPolNum());
            System.out.println("MERK MOBIL  : "+ryujin.getMerk());
            System.out.println("------------------------------");
        }

    }
}
