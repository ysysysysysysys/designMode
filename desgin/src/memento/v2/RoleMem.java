package memento.v2;

public class RoleMem {
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

    public RoleMem(int shengming, int gongji, int fangyu) {
        this.shengming = shengming;
        this.gongji = gongji;
        this.fangyu = fangyu;
    }
}
