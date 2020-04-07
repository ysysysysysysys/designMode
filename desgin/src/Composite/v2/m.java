package Composite.v2;

public class m {
    public static void main(String[] args) {
        Com totalCom = new Com("totalCom");
        Staff zongjingli = new Staff("zongjingli");

        Com huanan = new Com("huanan");
        Depart jishubu = new Depart("jishubu");
        Staff staff1 = new Staff("1");
        Staff staff = new Staff("2");

        huanan.add(jishubu);
        jishubu.add(staff);
        jishubu.add(staff1);

        Depart caigoubu1 = new Depart("caigoubu");
        Staff staff2 = new Staff("3");
        huanan.add(caigoubu1);
        caigoubu1.add(staff2);

        Com huabei = new Com("huabei");
        Depart jishubu1 = new Depart("jishubu");
        Staff staff5 = new Staff("4");
        Staff staff4 = new Staff("5");
        Staff staff3 = new Staff("6");
        huabei.add(jishubu1);
        jishubu1.add(staff3);
        jishubu1.add(staff4);
        jishubu1.add(staff5);

        Com huazhong = new Com("huazhong");
        Depart caigoubu = new Depart("caigoubu");
        Staff staff8 = new Staff("7");
        Depart renshibu = new Depart("renshibu");
        Staff staff7 = new Staff("8");
        Staff staff6 = new Staff("9");

        huazhong.add(caigoubu);
        huazhong.add(renshibu);
        caigoubu.add(staff8);
        renshibu.add(staff7);
        renshibu.add(staff6);


        totalCom.add(huabei);
        totalCom.add(huazhong);
        totalCom.add(huanan);
        totalCom.add(zongjingli);

        totalCom.show(1);
    }
}
