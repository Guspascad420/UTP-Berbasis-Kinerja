import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ive = new Scanner(System.in);
        boolean x;

        Magician mgc = new Magician(10, 60, 100);
        Healer hlr = new Healer(10, 10, 70);
        Warrior wro = new Warrior(30, 25, 80);
        Titan zirah = new Titan(0, 45, 200);
        String player = null;
        int chara = 0, i = 1;

        System.out.println("Selamat datang di game Defend FILKOM!");

        do {
            x = false;
            try {
                System.out.print("Silahkan masukkan nama player : ");
                player = ive.nextLine();
                ValidationException.validate(player);
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
                x = true;
            }
        } while (x);

        do {
            x = false;
            try {
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                chara = ive.nextInt();
                ValidationException.validate(chara);
            } catch (InputMismatchException e) {
                System.out.println("Tolong masukkan angka");
                x = true;
                ive.nextLine();
            }
            catch (ValidationException e) {
                System.out.println(e.getMessage());
                x = true;
                ive.nextLine();
            }
        } while (x);

        System.out.println("Selamat datang, "+player+"!");

        if (chara == 1) {
            mgc.info();
            while (mgc.getHP() != 0 && zirah.getHP() != 0) {
                System.out.println("=============TURN "+i+"=============");
                if (mgc.attack()) {
                    zirah.receiveDamage(mgc.getAttack());
                }
                if (zirah.attack()) {
                    mgc.receiveDamage(zirah.getAttack());
                }
                System.out.println("Enemy's HP : "+zirah.getHP());
                System.out.println(player+"'s HP : "+mgc.getHP());
                i++;
            }

            System.out.println("========================================");

            if (mgc.getHP() == 0) {
                System.out.println("Titan menang");
            }
            else {
                System.out.println(player + " menang");
            }

            System.out.println("============= PLAYER =============");
            mgc.info();
            System.out.println();
            System.out.println("============= MUSUH =============");
            zirah.info();
        }

        else if (chara == 2) {
            hlr.info();
            while (hlr.getHP() != 0 && zirah.getHP() != 0) {
                System.out.println("=============TURN "+i+"=============");
                if (hlr.attack()) {
                    zirah.receiveDamage(hlr.getAttack());
                }
                if (i % 2 == 0) {
                    System.out.println("Menggunakan skill Heal");
                    hlr.Heal();
                }
                if (zirah.attack()) {
                    hlr.receiveDamage(zirah.getAttack());
                }
                System.out.println("Enemy's HP : "+zirah.getHP());
                System.out.println(player+"'s HP : "+hlr.getHP());
                i++;
            }

            System.out.println("========================================");

            if (hlr.getHP() == 0) {
                System.out.println("Titan menang");
            }
            else {
                System.out.println(player + " menang");
            }

            System.out.println();

            System.out.println("============= PLAYER =============");
            hlr.info();
            System.out.println();
            System.out.println("============= MUSUH =============");
            zirah.info();
        }

        else if (chara == 3) {
            wro.info();
            while (wro.getHP() != 0 && zirah.getHP() != 0) {
                System.out.println("=============TURN "+i+"=============");
                if (wro.attack()) {
                    zirah.receiveDamage(wro.getAttack());
                }
                if (zirah.attack()) {
                    wro.receiveDamage(zirah.getAttack());
                }
                System.out.println("Enemy's HP : "+zirah.getHP());
                System.out.println(player+"'s HP : "+wro.getHP());
                i++;
            }

            System.out.println("========================================");

            if (wro.getHP() == 0) {
                System.out.println("Titan menang");
            }
            else {
                System.out.println(player + " menang");
            }

            System.out.println("============= PLAYER =============");
            wro.info();
            System.out.println();
            System.out.println("============= MUSUH =============");
            zirah.info();
        }

    }
}