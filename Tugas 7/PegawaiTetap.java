public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return super.gaji() + upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap    : "+getNama()+"\nNo. KTP          : "+getNoKTP() +
                "\nUpah             : "+(int)getUpah()+"\nPendapatan       : "+(int)gaji();
    }
}
