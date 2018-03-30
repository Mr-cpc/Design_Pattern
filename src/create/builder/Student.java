package create.builder;

/**
 * Created by waiting on 2018/3/30.
 */
public class Student {
    String name;
    String address;
    Integer stuId;
    private Student(){}
    public static class Builder {
        Student stu;

        public Builder() {
            this.stu = new Student();
        }

        public Builder name(String name) {
            stu.name = name;
            return this;
        }
        public Builder address(String address) {
            stu.address = address;
            return this;
        }
        public Builder stuId(int stuId) {
            stu.stuId = stuId;
            return this;
        }
        public Student build() {
            return stu;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", stuId=" + stuId +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student.Builder().address("海淀区").name("jack").stuId(1).build();
        System.out.println(student);
    }
}
