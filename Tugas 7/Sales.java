public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public double getKomisi() {
        return komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    @Override
    public double gaji() {
        return super.gaji() + getPenjualan() * getKomisi();
    }

    @Override
    public String toString() {
        return "Sales           : "+getNama()+"\nNo. KTP         : "+getNoKTP()
                +"\nTotal Penjualan : "+getPenjualan()+"\nBesaran Komisi  : "
                +getKomisi()+"\nPendapatan      : "+(int)gaji();
    }
}
