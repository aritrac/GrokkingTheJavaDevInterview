import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student extends Department implements Externalizable {
    private int studentId;
    private String studentName;
    private int age;
    public Student(){
        System.out.println("No-arg constructor of Student class");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + "]";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(getDeptId());
        out.writeUTF(getDeptName());
        out.writeInt(studentId);
        out.writeUTF(studentName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setDeptId(in.readInt());
        setDeptName(in.readUTF());
        studentId = in.readInt();
        studentName = in.readUTF();
    }
}
