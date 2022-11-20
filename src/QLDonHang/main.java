package QLDonHang;

import java.util.Scanner;

public class main {
    private static DonHang[] Listhang;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        while (true) {
            System.out.println("1.Thêm đơn hàng: ");
            System.out.println("2.Hiện thị tất cả đơn hàng trong một ngày: ");
            System.out.println("3.Tìm kiếm đơn hàng theo tên hàng và ngày mua: ");
            System.out.println("4.Tìm kiếm tất cả đơn hàng thuộc cưa hàng:");
            System.out.println("5.sắp xếp đơn hàng trong 1 tháng theo số tiền từ cao đến thấp: ");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    Nhapvao();
                    break;
                case 2:
                    intt();
                    break;
                case 3:
                    timkiemten();
                    break;
//                case 4:
//                    timkiemsonhang();
//                    break;
//                case 5:
//                    tucaodenthap();
//                    break;
            }
        }
    }

    private static void timkiemten() {
    }

    private static void Nhapvao(){
        System.out.println("mời bạn thêm dơn hàng: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i=0; i<0;i++){
            System.out.println("nhap vào ten dơn hang" + (i+1));
            String name =sc.nextLine();
            System.out.println("nhap vao ngày mua: "+ (i+1));
            String day = sc.nextLine();
            System.out.println("nhap vào giá tiền : "+ (i+1));
            float money = Integer.parseInt(sc.nextLine());
            System.out.println("nhap vao tên cua hàng: " + (i+1));
            String namegoods = sc.nextLine();
            DonHang hang = new DonHang(name,day,money,namegoods);
            Listhang[i] = hang;
        }
    }
    private static void intt(){
        for (int i =0;i<Listhang.length;i++){
            Listhang[i].ttcuahang();
        }
    }
    private static void timkiemten(DonHang[] List){
        System.out.println("nhap hang can tim kiem: ");
        String name = sc.nextLine();
        System.out.println("ket qua");
        for (int i =0;i< Listhang.length;i++){
            if (List[i].getname().equals(name)){
                Listhang[i].ttcuahang();
            }
        }
    }
}
