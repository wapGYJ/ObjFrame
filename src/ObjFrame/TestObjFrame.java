package ObjFrame;

public class TestObjFrame {
    public static void main(String[] args) throws Exception {
        Student student = new Student("小明", 12, 100);
        Teacher teacher=new Teacher(40,"张三",8888);


        ObjFrame.theObjFrame(teacher);
        ObjFrame.theObjFrame(student);
    }
}
