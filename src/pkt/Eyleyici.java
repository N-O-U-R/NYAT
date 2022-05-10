package pkt;

public class Eyleyici implements IEyleyici{
    private IIslem sogutucuAcma;
    private IIslem sogutucuKapatma;

    public Eyleyici(){
        Factory iyf = new Factory();
        sogutucuAcma=iyf.getInstance("sogutucu ac");
        sogutucuKapatma=iyf.getInstance("sogutucu kapat");
    }
    @Override
    public void sogutucuAc() {
        sogutucuAcma.islemYap();
    }

    @Override
    public void sogutucuKapat() {
        sogutucuKapatma.islemYap();
    }
}
