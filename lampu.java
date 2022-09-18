/**
 * Nama  : KHOSYI NASYWA IMANDA
 * Kelas : SIB - 2E
 */
public class lampu {
    private String merek;
    private int harga;
    
 public void setMerek(String newMerk)
    {
        merek = newMerk;
    }
    
    public void setHarga(int newHarga)
    {
        harga = newHarga;
    }
     
     public void cetak()
    {
        System.out.println("Merek lampu: "+ merek);
        System.out.println("Harga lampu: "+ harga);
    }

    // public void setWarna(String newWarna) {
    //     warna = newWarna;
    // }
   
}


        
        
 