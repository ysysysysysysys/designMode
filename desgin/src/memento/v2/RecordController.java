package memento.v2;

public class RecordController {
    private RoleMem roleMem;

    public RoleMem getRoleMem() {
        return roleMem;
    }

    public void setRoleMem(RoleMem roleMem) {
        this.roleMem = roleMem;
    }

    public RecordController(RoleMem roleMem) {
        this.roleMem = roleMem;
    }
}
