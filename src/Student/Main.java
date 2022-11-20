package Student;

import java.util.Scanner;

public class Main {
    private static Student[] ListSV;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        while (true) {
            System.out.println("1.Thêm SV: ");
            System.out.println("2.Tìm kiếm sv Theo tên: ");
            System.out.println("3.Liệt kê Sv có điểm trung bình >8: ");
            System.out.println("4.Sắp xếp Sv theo điểm trung bình từ cao xuống thấp: ");
            System.out.println("5.Liệt Kê tất cả Sinh viên là nữ và có đọ tuổi < 20: ");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    Nhapvao();
                    break;
                case 2:
                    Timkiemten();
                    break;
                case 3:
                    lietkediemtb();
                    break;
                case 4:
                    SapXepSv();
                    break;
                case 5:
                    Nunhohon20();
                    break;
            }
        }
    }
    private static void Nhapvao() {
        System.out.println("Moi ban nhap so luong SV can nhap: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("mời bạn nhập vào tên SV " + (i+1));
            String name = sc.nextLine();
            System.out.println("mời bạn nhập vào năm Sinh: " + (i+1));
            int year = Integer.parseInt(sc.nextLine());
            System.out.println("nhập vào giới tình: "+ (i+1));
            String sex = sc.nextLine();
            System.out.println("Nhập vào điểm TB"+ (i+1));
            int DTB = Integer.parseInt(sc.nextLine());
            Student SV = new Student(name,year,sex,DTB);
            ListSV[i] = SV;
        }
    }
    private static void Timkiemten() {
        System.out.println("mời bạn nhập vào số lượng SV: ");
        String name = sc.nextLine();
        System.out.println("kết quả tìm kiếm: ");
        for (int i = 0; i < ListSV.length; i++) {
            if (ListSV[i].getName().equals(name)) {
                ListSV[i].inttSV();
            }
        }
    }
    private static void lietkediemtb(){

for (int i = 0;i<8;i++){

}
    }
    private static void SapXepSv(){

    }
    private static void Nunhohon20(){

    }
}
