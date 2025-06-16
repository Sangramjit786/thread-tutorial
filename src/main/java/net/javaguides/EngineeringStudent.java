package net.javaguides;

public class EngineeringStudent implements Student{
    @Override
    public String getBio(String name) {
        return name + " is Engineering student !";
    }

//    public void getBio(String name) {
//        System.out.println(name + " is Engineering student !");;
//    }
}
