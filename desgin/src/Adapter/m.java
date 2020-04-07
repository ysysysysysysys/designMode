package Adapter;

public class m {
    public static void main(String[] args) {
        Guards guards = new Guards("麦迪");
        guards.attack();

        Forwards f = new Forwards("巴蒂尔");
        f.attack();

        Translate translate = new Translate("姚明");
        translate.attack();
        translate.defense();
    }
}
