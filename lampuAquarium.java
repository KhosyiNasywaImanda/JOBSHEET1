/**
 * Nama  : KHOSYI NASYWA IMANDA
 * Kelas : SIB - 2E
 */
public class lampuAquarium extends lampuHias{

    private int jumlah;

    public void setJumlah(int newJumlah){
        jumlah = newJumlah;
    }

    public void cetak(){

        super.cetak();
        System.out.println("Jumlah lampu: " +jumlah + " buah");
    }
    
}
