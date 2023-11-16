package bai2;

public class ManageTaiLieu {
    public int matailieu;
    public String nhaxuatban;
    public int sobanphathanh;

    public ManageTaiLieu(int matailieu, String nhaxuatban, int sobanphathanh) {
        this.matailieu = matailieu;
        this.nhaxuatban = nhaxuatban;
        this.sobanphathanh = sobanphathanh;
    }


    public int getMatailieu(int name) {
        return matailieu;
    }

    public void setMatailieu(int     matailieu) {
        this.matailieu = matailieu;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    @Override
    public String toString() {
        return "QuanLyTaiLieu{" +
                "matailieu='" + matailieu + '\'' +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", sobanphathanh=" + sobanphathanh +
                '}';
    }
}