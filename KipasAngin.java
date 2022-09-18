/**
 * Nama  : KHOSYI NASYWA IMANDA
 * Kelas : SIB - 2E
 */
 
public class KipasAngin {
   private String merk;
   private int harga;

   public void setMerk(String newMerk){
       merk = newMerk;
   }
   
   public void setHarga(int setHarga){
       harga = setHarga;
   }
   
   public void cetak(){
       System.out.println("Merk Kipas angin : " + merk);
       System.out.println("Harga kipas Angin : " + harga);
   }

}
