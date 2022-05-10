package pkt;

import java.util.Scanner;

public class AkilliCihaz {

    private IAgArayuzu agArayuzu;
    private Publisher p;
    private Subscriber s1 ;

    public AkilliCihaz() {
        agArayuzu=new AgArayuzu();
        p=new Publisher();
    }
    public static void bekle(int sure){
        try{
            Thread.sleep(sure);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public void basla(){
        do {
            s1 = new Subscriber();
        }while (!s1.isTrue());
        p.attach(s1);
        secim();
    }
    private void secim(){
        String secm;
        secm=agArayuzu.anaMenuGoster();
        switch (secm){
            case "1":
                agArayuzu.sogutucuAc();
                bekle(1200);
                break;
            case "2":
                agArayuzu.sogutucuKapat();
                bekle(1200);
                break;
            case "3":
                agArayuzu.sicaklikGonder();
                bekle(1200);
                break;
            case "4":
                System.out.println("Cikis yapiliyor!");
                bekle(1200);
                Runtime.getRuntime().exit(0);
                break;
            default:
                System.out.println("Yanlis deger girdiniz tekrar deneyin!");
                break;
        }
        System.out.println("\nDevam Etmek İstiyormusunuz? e(E)/h(H)");
        String userChoice = agArayuzu.veriAl();
        if (userChoice.equalsIgnoreCase("e")) {
            bekle(800);
            secim();
        } else
        if (userChoice.equalsIgnoreCase("h")) {
            System.out.println("Cikis yapiliyor!");
            bekle(800);
            Runtime.getRuntime().exit(0);
        }
        else {
            System.out.println("Yanlis deger girdiniz tekrar deneyin!");
        }
    }
}
