package com.josh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList listing = new ArrayList();
        listing.add("red");
        listing.add("green");
        listing.add("blue");
        if (listing.contains("yellow")) {
            System.out.println("The list contains 'yellow'");
        }
        if (listing.contains("red")) {
            System.out.println("The list contains 'red'");
        }
            ArrayList myList = new ArrayList();
            myList.add("Josh");
            myList.add("MCTC");
            myList.add("blue");

            ArrayList cerealList = new ArrayList();
            cerealList.add("Oatmeal");
            cerealList.add("Cornflakes");
            cerealList.add("Special K");
            cerealList.remove("Oatmeal");
            cerealList.add("Capt N Crunch");

        ArrayList transportationList = new ArrayList();
        transportationList.add("Bus");
        transportationList.add("Train");
        transportationList.add("Car");
        transportationList.set(1, "Bike");

        System.out.println(transportationList);

        ArrayList animals = new ArrayList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Zebra");
        animals.add("Tiger");
        animals.add("Cow");
        animals.remove(2);
        System.out.println(animals);


        LinkedList animals2 = new LinkedList();
        animals2.add("Dog");
        animals2.add("Cat");
        animals2.add("Zebra");
        animals2.add("Tiger");
        animals2.add("Cow");


        LinkedList animals3 = new LinkedList();

        animals3.add(0,animals2.get(2));
        animals2.remove(2);
        System.out.println(animals3);


        }
    }

