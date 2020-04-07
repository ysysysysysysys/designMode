package memento.v2;

public class M {
    public static void main(String[] args) {
        Role role = new Role(100, 100, 100);
        System.out.println("boss之前 状态");
        role.show();

        System.out.println("存档");
        RoleMem roleMem = role.create();
        RecordController recordController = new RecordController(roleMem);

        role.setFangyu(0);
        role.setGongji(0);
        role.setShengming(0);
        System.out.println("没打过");
        role.show();

        System.out.println("恢复存档");
        role.recover(recordController.getRoleMem());
        role.show();
    }
}
