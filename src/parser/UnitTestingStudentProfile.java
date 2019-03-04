package parser;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student stu = new Student();
        stu.setFirstName("Mohammad");
        stu.setLastName("Hossain");
        stu.setScore("1234");
        stu.setId("111");
            System.out.println(stu.getFirstName() + " " +stu.getLastName()+" " + stu.getScore() + " "+stu.getId());

    }
}
