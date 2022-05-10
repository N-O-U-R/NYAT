package pkt;

import java.util.Random;

public class SicaklikOlcme implements IIslem{
    private Random rand = new Random();
    private ISubject publisher;
    private AkilliCihaz cihaz;


    @Override
    public void islemYap() {
        int rand_int = rand.nextInt(50);
        System.out.println("Sicaklik Olculuyor.");
        cihaz.bekle(800);
        System.out.print("Sicaklik: ");
        System.out.println(rand_int);
    }
}
