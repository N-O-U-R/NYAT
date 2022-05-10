package pkt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class VeritabanDogrulama implements IVeritabanDogrulama{

        public String username;
        private static String password="123";
        private static String dbUrl="jdbc:postgresql://localhost:5432/NYAT";
        private static String userName="postgres";
        Scanner scanner = new Scanner(System.in);
        private Connection baglan(){
            Connection conn=null;
            try{
                conn = DriverManager.getConnection(dbUrl,userName,password);
                if (conn != null)
                System.out.println("Veritabannna baglanildi!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conn;
        }
        @Override
        public boolean Dogrulama(){
            Connection conn=this.baglan();
            System.out.println("Kullanici adi giriniz: ");
            String ad = scanner.nextLine();

            String ifade= "SELECT *  FROM \"kullanicilar\" WHERE username='" + ad + "'";
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(ifade);
                conn.close();
                if(rs.next()==false){
                    System.out.println("Boyle bir kullanici adi bulunamadi.\n\n");
                    return false;
                }
                else{
                    username=ad;
                    System.out.println("Sifre Giriniz:");
                    String sifre = scanner.nextLine();
                    String kullaniciSifre = rs.getString("password");
                    if (sifre.equals(kullaniciSifre)){
                        System.out.println("Giris basarili.");
                        return true;
                    }
                    else{
                        System.out.println("Sifre yanlistir.\n\n");
                        return false;
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
                return false;
            }
        }
    }


