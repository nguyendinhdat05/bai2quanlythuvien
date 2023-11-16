package bai2;

public class Sach extends ManageTaiLieu {
    private String tentacgia;
    private int sotrang;

    public Sach(int matailieu, String nhaxuatban, int sobanphathanh , String tentacgia , int sotrang) {
        super(matailieu, nhaxuatban, sobanphathanh);
        this.tentacgia=tentacgia;
        this.sotrang=sotrang;
    }
    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "sotrang=" + sotrang +
                ", matailieu='" + matailieu + '\'' +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", sobanphathanh=" + sobanphathanh +
                '}';
    }
}
