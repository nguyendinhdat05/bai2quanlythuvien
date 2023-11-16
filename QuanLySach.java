package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<ManageTaiLieu> danhSachTaiLieu = new ArrayList<>();

    public void add(ManageTaiLieu manageTaiLieu) {
        danhSachTaiLieu.add(manageTaiLieu);
    }

    public void delete(int name ) {
        int index = -1;
        for (int i = 0; i < this.danhSachTaiLieu.size(); i++) {
            if (name == this.danhSachTaiLieu.get(i).getMatailieu(name)){
                index = i;
            }
        }
        this.danhSachTaiLieu.remove(index);
    }
    public void findAll() {
        for (int i = 0; i < this.danhSachTaiLieu.size(); i++) {
            System.out.println(danhSachTaiLieu.get(i));
        }
    }
    // hàm tìm matailieu
    public void findMaTailieu(int mataulieu) {
        int index = -1;
        for (int i = 0; i < this.danhSachTaiLieu.size(); i++) {
            if ( mataulieu == this.danhSachTaiLieu.get(i).getMatailieu(mataulieu)){
                index = i;
            }
        }
        System.out.println(this.danhSachTaiLieu.get(index));
    }
}
