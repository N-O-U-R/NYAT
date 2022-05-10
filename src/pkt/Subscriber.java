package pkt;

public class Subscriber implements IObserver {
    private boolean Kontrol;
    private VeritabanDogrulama veritabani;

    Subscriber(){
        this.Kontrol = Login();
    }

    private boolean Login(){
        Boolean kontrol =true;
        veritabani = new VeritabanDogrulama();
        kontrol = veritabani.Dogrulama();
        return kontrol;
    }

    public boolean isTrue() {
        return Kontrol;
    }

    @Override
    public void update(String mesaj) {
        System.out.println(veritabani.username+"'a gelen mesaj->" + mesaj);
    }
}
