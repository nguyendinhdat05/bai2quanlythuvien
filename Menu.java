package bai2;

import java.util.Scanner;

public class Menu {
    QuanLySach quanLySach = new QuanLySach();
    static Scanner inputInt = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);

    public void menuQuanLy() {
        int choice ;
        do {
            System.out.println(" " +
                    "\n 1.sách" +
                    "\n 2.báo" +
                    "\n 3.tạp chí");
            System.out.println("Choice");
            choice = inputInt.nextInt();


            if (choice == 1) {
                int choice1;
                do {
                    System.out.println("----Menu----\n"
                            + "1.Thêm  \n"
                            + "2.Xóa Tài Liệu Theo Mã Tài Liệu\n"
                            + "3.Hiển Thị Tất Cả Thông Tin\n"
                            + "4.Tìm Kiếm Mã Tài Liệu\n"
                            + "0.Thoát");
                    System.out.println("Choice");
                    choice1 = inputInt.nextInt();
                    switch (choice1) {
                        case 1:
                            addSach();
                            break;
                        case 2:
                            System.out.println("nhập vào mã tài liệu ");
                            int name = inputInt.nextInt();
                            quanLySach.delete(name);
                            break;
                        case 3:
                            quanLySach.findAll();
                            break;
                        case 4:
                            System.out.println("nhập mã để tìm ");
                            int maTailiue = inputInt.nextInt();
                            quanLySach.findMaTailieu(maTailiue);
                            break;
                    }

                } while (choice1 != 0);
            }

            if (choice == 2) {
                int choice2;
                do {
                    System.out.println("----Menu----\n"
                            + "1.Thêm  \n"
                            + "2.Xóa Tài Liệu Theo Mã Tài Liệu\n"
                            + "3.Hiển Thị Tất Cả Thông Tin\n"
                            + "0.Thoát");
                    System.out.println("Choice");
                    choice2 = inputInt.nextInt();
                    switch (choice2) {
                        case 1:
                            addBao();
                            break;
                        case 2:
                            System.out.println("nhập vào mã tài liệu ");
                            int name = inputInt.nextInt();
                            quanLySach.delete(name);
                            break;
                        case 3:
                            quanLySach.findAll();
                            break;
                    }

                } while (choice2 != 0);
            }

            if (choice == 3) {
              int choice3;
                do {
                    System.out.println("----Menu----\n"
                            + "1.Thêm  \n"
                            + "2.Xóa Tài Liệu Theo Mã Tài Liệu\n"
                            + "3.Hiển Thị Tất Cả Thông Tin\n"
                            + "0.Thoát");
                    System.out.println("Choice");
                    choice3 = inputInt.nextInt();
                    switch (choice3) {
                        case 1:
                            addTapChi();
                            break;
                        case 2:
                            System.out.println("nhập vào mã tài liệu ");
                            int name = inputInt.nextInt();
                            quanLySach.delete(name);
                            break;
                        case 3:
                            quanLySach.findAll();
                            break;
                    }

                } while (choice3 != 0);
            }
        }while (choice!=0);

    }

    public void addSach() {
        System.out.println(" Nhập Mã Tài Liệu");
        int maTaiLieu = inputInt.nextInt();
        System.out.println(" Nhập Tên Nhà Xuất Bản");
        String tenNhaXanXuat = inputString.nextLine();
        System.out.println("Nhập Số Bản Phát Hành");
        int soBanPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Tên Tác Giả");
        String tenTacGia = inputString.nextLine();
        System.out.println("Nhập Số Trang");
        int soTrang = inputInt.nextInt();
        Sach sach = new Sach(maTaiLieu, tenNhaXanXuat, soBanPhatHanh, tenTacGia, soTrang);
        quanLySach.add(sach);

    }

    public void addBao() {
        System.out.println(" Nhập Mã Tài Liệu");
        int maTaiLieu = inputInt.nextInt();
        System.out.println(" Nhập Tên Nhà Xuất Bản");
        String tenNhaXanXuat = inputString.nextLine();
        System.out.println("Nhập Số Bản Phát Hành");
        int soBanPhatHanh = inputInt.nextInt();
        System.out.println("Nhập ngày phát hành");
        String ngayPhatHanh = inputString.nextLine();
        Bao bao = new Bao(maTaiLieu, tenNhaXanXuat, soBanPhatHanh, ngayPhatHanh);
        quanLySach.add(bao);
    }

    public void addTapChi() {
        System.out.println(" Nhập Mã Tài Liệu");
        int maTaiLieu = inputInt.nextInt();
        System.out.println(" Nhập Tên Nhà Xuất Bản");
        String tenNhaXanXuat = inputString.nextLine();
        System.out.println("Nhập Số Bản Phát Hành");
        int soBanPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Số Phát Hành");
        int soPhatHanh = inputInt.nextInt();
        System.out.println("Nhập Tháng Phát Hành");
        int thangPhatHanh = inputInt.nextInt();
        TapChi tapChi = new TapChi(maTaiLieu, tenNhaXanXuat, soBanPhatHanh, soPhatHanh, thangPhatHanh);
        quanLySach.add(tapChi);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuQuanLy();
    }
}
