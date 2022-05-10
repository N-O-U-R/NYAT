package pkt;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{

    private IMerkeziIslemBirimi merkeziIslemBirimi;
    private Scanner scan=new Scanner(System.in);

    public AgArayuzu() {
        merkeziIslemBirimi=new MerkeziIslemBirimi();
    }

    public String veriAl() {
        return scan.next();
    }
    public void mesaj(String mesaj){
        System.out.println(mesaj);
    }
    @Override
    public void sogutucuAc() {
        merkeziIslemBirimi.eyleyiciyeGonder("1");
    }
    @Override
    public void sogutucuKapat() {
        merkeziIslemBirimi.eyleyiciyeGonder("2");
    }
    @Override
    public void sicaklikGonder(){
        merkeziIslemBirimi.sicaklikAlgilayiciyaGonder();
    }

    public String anaMenuGoster(){
        mesaj("************************************");
        mesaj(" <<< Ana Menu >>> ");
        mesaj("1. Sogutucu Ac ");
        mesaj("2. Sogutucu Kapat");
        mesaj("3. Sicaklik goster");
        mesaj("4. Cikis ");
        mesaj("Lutfan Bir Islem sec : ");
        return veriAl();
    }
}
