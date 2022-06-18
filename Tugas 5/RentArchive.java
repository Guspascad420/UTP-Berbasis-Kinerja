import java.util.ArrayList;
import java.util.List;

public class RentArchive {
   private List<CarRent> rentData = new ArrayList<>();

   public void Rent(CarRider rider, Car car, int rentDur) {
       if (car.getStatus()) {
           System.out.println("MOBIL BERHASIL DISEWA");
           car.setStatus(false);
           rentData.add(new CarRent(rider, car, rentDur));
       }

       else if (!car.getStatus()) {
           System.out.println("MAAF, MOBIL SUDAH DISEWA");
       }
   }

   public void info() {
        System.out.println("------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("------------------------------");

       for (CarRent yujin : rentData) {
            System.out.println("NAMA PEMINJAM : "+yujin.getRider().getName());
            System.out.println("TIPE MOBIL : "+yujin.getCar().getCarType());
            System.out.println("NO. POLISI : "+yujin.getCar().getPolNum());
            System.out.println("LAMA RENTAL : "+yujin.getRentDur());
            System.out.println("------------------------------");
       }
   }


}
