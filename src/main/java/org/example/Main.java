package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(5);

        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4th");
        array.put("5th");

        System.out.println("Length: " + array.length());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println("Length: " + array.length());
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println("Length before put element: " + array.length());
        array.put("new Elem");
        System.out.println("Length after put element: " + array.length());
        System.out.println(array.get());

    }
}