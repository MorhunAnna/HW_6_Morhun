package org.example;

public class MyArray {

    private String[] stringArray;
    private int sizeArray;
    private int maxSize;

    public MyArray(int maxSize) {
        this.stringArray = new String[maxSize];
        this.sizeArray = 0;
        this.maxSize = maxSize;
    }

    public int length() {
        return sizeArray;
    }

    public void put(String string) {
        if (sizeArray == maxSize) {
            String[] newArray = new String[maxSize * 2];
            for (int i = 0; i < sizeArray; i++) {
                newArray[i] = stringArray[i];
            }
            stringArray = newArray;
            maxSize *= 2;
        }
        stringArray[sizeArray++] = string;
    }

    public String get() {
    if (sizeArray == 0) {
        System.out.println("No more elements");
        return "";
    }
        String firstElement = stringArray[0];
        for (int i = 0; i < sizeArray - 1; i++) {
            stringArray[i] = stringArray[i + 1];
        }
        stringArray[sizeArray - 1] = null;
        sizeArray--;
        return firstElement;
    }
}