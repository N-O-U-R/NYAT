package pkt;

public class SogutucuAcma implements IIslem{
    private AkilliCihaz cihaz;
    public void islemYap() {
        System.out.println("Sogutucu Aciliyor!");
        cihaz.bekle(1000);
        System.out.println("Lutfen Bekleyiniz.");
        cihaz.bekle(1000);
        System.out.println("SOGUTUCU : ACIK");
    }
}
