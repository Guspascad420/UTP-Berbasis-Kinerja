public class Main {

    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "082738193462");
        CarRider youhan = new CarRider("Bei Youhan", 20, "081726453744");
        CarRider ling = new CarRider("Ling\'er", 31, "082344769811");
        CarRider xiaoting = new CarRider("Shen Xiaoting", 23, "087261773216");

        CarData data = new CarData();
        data.addCar("SUV","N 1111 AB","Honda");
        data.addCar("SPORT","N 2222 AB","SSC Tuatara");
        data.addCar("TRUCK","N 3333 AB","Suzuki");
        data.addCar("SPORT", "N 199 AZ","Tesla");

        System.out.println("Ida Bagus Pascad Wijanata");
        System.out.println("215150700111029");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(0), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(xiaoting, data.carList.get(3), 4);

        System.out.println("");
        arsip.info();
    }
}
