package com.box;

import java.util.*;

public class BoxTester {

    public static void main(String[] args) {
        BoxSelect();
    }

    private static void BoxSelect() {
        Box box3 = new Box3();
        Box box5 = new Box5();
        HashMap<String, Box> boxes = new HashMap<>();
        boxes.put(box5.getName(), box5);
        boxes.put(box3.getName(), box3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height:");
        float height = scanner.nextFloat();

        SortedSet<String> boxesSortByName = new TreeSet<>(boxes.keySet());

        for (String key: boxesSortByName){
            Box box = boxes.get(key);
            if (box.validate(length, width, height)){
                System.out.println("Your selected Box is " +  box.getName() + " and the price is $" + box.getPrice());
                break;
            }
        }
    }
}
