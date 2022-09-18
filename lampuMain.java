/**
 * Nama  : KHOSYI NASYWA IMANDA
 * Kelas : SIB - 2E
 */

public class lampuMain {
  public static void main(String[] args){
      
    //pembuatan objek 1 yang berasal dari class lampu
   lampu lmp1 = new lampu();
     lmp1.setMerek("Philip");
     lmp1.setHarga(20000);
     lmp1.cetak();  

//pembuatan objek 2 yang berasal dari class lampuHias
    lampuHias lmp2 = new lampuHias();
     lmp2.setMerek("Panasonic");
     lmp2.setHarga(29000);
     lmp2.setWarna("kuning");
     lmp2.cetak(); 
     
     //pembuatan objek 3 yang berasal dari class lampuAquarium
     lampuAquarium lmp3 = new lampuAquarium();
     lmp3.setMerek("Metal Halide");
     lmp3.setHarga(65000);
     lmp3.setWarna("biru");
     lmp3.setJumlah(3);
     lmp3.cetak();

  }  
}

  