package pkt;

import java.util.Random;


public class SicaklikAlgilayici implements  ISicaklikAlgilayici{
    private IIslem islem;
    public SicaklikAlgilayici(){
        Factory iyf = new Factory();
        this.islem=iyf.getInstance("sicaklik olcme");
    }

    @Override
    public void sicaklikOku() {
        islem.islemYap();
    }
}
