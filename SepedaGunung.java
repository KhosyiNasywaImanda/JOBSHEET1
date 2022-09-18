//Nama  : khosyi nasywa imanda
//kelas : SIB-2E
//Nim   : 2141762103

public class SepedaGunung extends Sepeda 
{
    
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue)
    {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
