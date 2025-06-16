package net.javaguides;

public class Test2 {
    public static void main(String[] args) {
//        EngineeringStudent engineeringStudent = new EngineeringStudent();
//        String ram = engineeringStudent.getBio("Ram");
//        System.out.println(ram);

        Student engineeringStudent = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is Engineering student";
            }
        };

//        Student engineeringStudent = new Student() {
//            @Override
//            public void getBio(String name) {
//                System.out.println(name + " is Engineering student");
//            }
//        };

        Student lawStudent = name -> name + " is low student";

        String bio = engineeringStudent.getBio("Ram");
        System.out.println(bio);
    }
}
