package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Price {
    private double itemPrice;
    private item

    public Price(double _itemPrice) {
        this.itemPrice; = _itemPrice

    }

    public double getitemPrice() {
        return itemPrice;
    }

    public double setitemPrice() {
        return itemPrice;
    }

    public static void listPrice(ArrayList<Price> pList) {
        for (Price price : pList) {
            System.out.println(price.getitemPrice());
        }
    }
