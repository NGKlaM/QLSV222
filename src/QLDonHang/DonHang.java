package QLDonHang;

public class DonHang {
    private String name;
    private float money;
    private String day;
    private String namegoods;

    public DonHang(String name, String money, float day, String namegoods) {
        this.name = name;
        this.money = Float.parseFloat(money);
        this.day = String.valueOf(day);
        this.namegoods = namegoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNamegoods() {
        return namegoods;
    }

    public void setNamegoods(String namegoods) {
        this.namegoods = namegoods;
    }
    public void ttcuahang(){
        System.out.println("thông tin phiếu hàng");
        System.out.println("Tên hàng :" + name + "Số tiền mua hàng: " + money + "ngày mua hàng: " + day +"Tên cửa hàng: "+ namegoods);
    }

    public Object getname() {
        return null;
    }

}
