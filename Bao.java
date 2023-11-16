package bai2;

public class Bao extends ManageTaiLieu{
    public String getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    private String ngayphathanh;
    public Bao(int matailieu, String nhaxuatban, int sobanphathanh , String ngayphathanh) {
        super(matailieu, nhaxuatban, sobanphathanh);
        this.ngayphathanh=ngayphathanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayphathanh='" + ngayphathanh + '\'' +
                ", matailieu='" + matailieu + '\'' +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", sobanphathanh=" + sobanphathanh +
                '}';
    }
}
