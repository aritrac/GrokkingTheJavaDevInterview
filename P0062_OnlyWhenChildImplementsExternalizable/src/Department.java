public class Department {
    private int deptId;
    private String deptName;
    private int capacity;

    public Department(){
        System.out.println("No-arg constructor of Department class");
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return "Department [deptId=" + deptId + ", deptName=" + deptName + ", capacity=" + capacity + "]";
    }
}
