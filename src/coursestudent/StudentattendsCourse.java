package coursestudent;

public class StudentattendsCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Web programiranje", 15, true);
        Course c2 = new Course("Elektrotehnika", 30, true);
        Course c3 = new Course("Java tečaj", 51,false);
        Student s1 = new Student("Pero","Perić", c1);
        Student s2 = new Student("Matija","Marić", c2);
        Student s3 = new Student("Đuro","Đurić", c3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
