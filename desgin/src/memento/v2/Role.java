package memento.v2;

public class Role {
    private int shengming;
    private int gongji;
    private int fangyu;

    public int getShengming() {
        return shengming;
    }

    public void setShengming(int shengming) {
        this.shengming = shengming;
    }

    public int getGongji() {
        return gongji;
    }

    public void setGongji(int gongji) {
        this.gongji = gongji;
    }

    public int getFangyu() {
        return fangyu;
    }

    public void setFangyu(int fangyu) {
        this.fangyu = fangyu;
    }

    public Role(int shengming, int gongji, int fangyu) {
        this.shengming = shengming;
        this.gongji = gongji;
        this.fangyu = fangyu;
    }

    public RoleMem create(){
        return new RoleMem(this.shengming,this.gongji,this.fangyu);
    }

    public void recover(RoleMem roleMem){
        this.fangyu =roleMem.getFangyu();
        this.gongji = roleMem.getGongji();
        this.shengming = roleMem.getShengming();
    }

    public void show(){
        System.out.println(fangyu);
        System.out.println(shengming);
        System.out.println(gongji);
    }
}
