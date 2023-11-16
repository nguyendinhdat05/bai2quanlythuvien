package bai2;

public class TapChi extends ManageTaiLieu {
    private int sophathanh;
    private int thangphathanh;
    public TapChi(int matailieu, String nhaxuatban, int sobanphathanh , int sophathanh , int thangphathanh) {
        super(matailieu, nhaxuatban, sobanphathanh);
        this.sophathanh=sophathanh;
        this.thangphathanh=thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "sophathanh=" + sophathanh +
                ", thangphathanh=" + thangphathanh +
                ", matailieu='" + matailieu + '\'' +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", sobanphathanh=" + sobanphathanh +
                '}';
    }
}
