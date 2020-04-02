package Facaed;

public class Facaed {
    private SysOne sysOne;
    private SysTwo sysTwo;
    private SysThree sysThree;
    private SysFour sysFour;

    public Facaed(){
        sysTwo = new SysTwo();
        sysOne = new SysOne();
        sysThree = new SysThree();
        sysFour = new SysFour();
    }

    public void methodA(){
        sysOne.show();
        sysTwo.show();
    }

    public void methodB(){
        sysThree.show();
        sysFour.show();
    }

    public void methodAll(){
        sysOne.show();
        sysTwo.show();
        sysThree.show();
        sysFour.show();
    }
}
