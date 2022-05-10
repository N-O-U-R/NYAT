package pkt;

public class MerkeziIslemBirimi implements IMerkeziIslemBirimi{
    private IEyleyici eyleyici;
    private ISicaklikAlgilayici sicaklikAlgilayici;
    public MerkeziIslemBirimi(){
        eyleyici= new Eyleyici();
        sicaklikAlgilayici=new SicaklikAlgilayici();
    }
    @Override
    public void eyleyiciyeGonder(String secim){
        if(secim.equals("1")){
            eyleyici.sogutucuAc();
        }
        if(secim.equals("2")){
            eyleyici.sogutucuKapat();
        }
    }

    @Override
    public void sicaklikAlgilayiciyaGonder() {
        sicaklikAlgilayici.sicaklikOku();
    }
}
