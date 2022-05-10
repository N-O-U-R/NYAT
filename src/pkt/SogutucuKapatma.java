package pkt;

public class SogutucuKapatma implements IIslem{
    private AkilliCihaz cihaz;
    public void islemYap() {
        System.out.println("Sogutucu Kapatiliyor!");
        cihaz.bekle(1000);
        System.out.println("Lutfen Bekleyiniz.");
        cihaz.bekle(1000);
        System.out.println("SOGUTUCU : KAPALI");
    }

}
