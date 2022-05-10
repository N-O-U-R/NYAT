package pkt;

public class Factory {
    public IIslem getInstance(String type){

        if(type.equalsIgnoreCase("sicaklik olcme"))
            return new SicaklikOlcme();
        else if(type.equalsIgnoreCase(("sogutucu ac")))
            return new SogutucuAcma();
        else if (type.equalsIgnoreCase(("sogutucu kapat")))
            return new SogutucuKapatma();
        return null;
    }
}
