public class Main {
    public static void main(String[] args) {

        Manusia man1 = new Manusia("Walter White", "3923842934",
                true, true);
        Manusia woman1 = new Manusia("Shen Xiaoting", "3912891823",
                false, false);
        Manusia man2 = new Manusia("Saul Goodman", "3982917264",
                true, true);

        System.out.println("Ida Bagus Pascad Wijanata");
        System.out.println("215150700111029");
        System.out.println("============================================");

        System.out.println(man1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(woman1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(man2.toString());

        System.out.println("============================================");

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Shin Ryujin", "351923848239",
                false, false, "205150601111018",
                3.70);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Erling Haaland", "356718346188",
                true, false, "215160721111092", 3.6);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Ariana Grande", "402819278397",
                false, false, "208750310222076", 3.2);

        System.out.println(mhs1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(mhs2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(mhs3.toString());

        System.out.println("============================================");

        Pekerja pekerja1 = new Pekerja(7, 22,
                "1951024392", "Karl Marx", "351717969", true, true);
        Pekerja pekerja2 = new Pekerja(9, 23, "49283748201",
                "Vladimir Putin", "37261826729", true, true);
        Pekerja pekerja3 = new Pekerja(8, 23, "571989279",
                "Ahn Yujin", "392891808363", false, false);

        System.out.println(pekerja1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(pekerja2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(pekerja3.toString());

        System.out.println("============================================");

        Manajer manajer1 = new Manajer(9, 20,
                "204837283728", "Kim Jong Un", "351707384392",
                true, false, 1500);
        Manajer manajer2 = new Manajer(8, 22,
                "501928378472", "Martin Braithwaite", "367829179272",
                true, true, 1400);
        Manajer manajer3 = new Manajer(8, 24,
                "708728478909", "Sana Minatozaki", "35739279008",
                false, false, 1450);

        System.out.println(manajer1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(manajer2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(manajer3.toString());

        System.out.println("============================================");
    }
}

