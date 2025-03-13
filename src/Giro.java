public class Giro extends Rekening {
    private double saldoMinimum;
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldoAwal, double saldoMinimum, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldoAwal);
        this.saldoMinimum = saldoMinimum;
        this.limitPenarikan = limitPenarikan;
    }

    public double getSaldoMinimum() {
        return saldoMinimum;
    }

    public void setSaldoMinimum(double saldoMinimum) {
        if (saldoMinimum >= 0) {
            this.saldoMinimum = saldoMinimum;
        } else {
            System.out.println("Saldo minimum tidak boleh negatif.");
        }
    }

    public double getLimitPenarikan() {
        return limitPenarikan;
    }

    public void setLimitPenarikan(double limitPenarikan) {
        if (limitPenarikan >= 0) {
            this.limitPenarikan = limitPenarikan;
        } else {
            System.out.println("Limit penarikan tidak boleh negatif.");
        }
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= limitPenarikan && getSaldo() - jumlah >= saldoMinimum) {
            super.tarik(jumlah);
        } else {
            System.out.println("Transaksi gagal: Melebihi limit atau saldo minimum.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Saldo Minimum: " + getSaldoMinimum());
        System.out.println("Limit Penarikan: " + getLimitPenarikan());
    }
}