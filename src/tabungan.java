public class tabungan extends Rekening {
    private double bungaTahunan;

    public tabungan(String namaPemilik, String nomorRekening, double saldoAwal, double bunga) {
        super(namaPemilik, nomorRekening, saldoAwal);
    }

    public void hitungBunga(int bulan){
        bungaTahunan = (bungaTahunan / 12) * getSaldo() * bulan;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println(" Bunga Tahunan : " + bungaTahunan);
    }
}