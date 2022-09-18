/**
 * Nama  : KHOSYI NASYWA IMANDA
 * Kelas : SIB - 2E
 */
public class lampuHias extends lampu 
{

    public String color;

    public void setWarna(String newColor){
        color = newColor;
    }
    public void cetak()
    {
        super.cetak();
        System.out.println("Warna Lampu: " + color);
    }
    
}
