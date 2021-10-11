package coursestudent;


import java.util.List;

public class StudentMgmtSystem {
    public static void main(String[] args) {
        /*
        Course c1 = new Course("Web programiranje", 15, true);
        Course c2 = new Course("Elektrotehnika", 30, true);
        Course c3 = new Course("Java tečaj", 51,false);
        */

        Student s1 = new Student("Pero","Perić", null);
        Student s2 = new Student("Matija","Marić", null);
        Student s3 = new Student("Đuro","Đurić", null);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        StudentDaoSqlite studentDao = new StudentDaoSqlite("doc/students.db");
        studentDao.insertToDB(s1);
        studentDao.insertToDB(s2);

        System.out.println("List all students: ");
        List<Student> students =  studentDao.getAll();

        for(Student s : students) {
            System.out.println(s);
        }
        studentDao.close();
    }


}
