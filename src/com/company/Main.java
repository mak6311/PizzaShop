package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char SIZE_CODE = 'S';
        final char PRIC_CODE = 'P';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Price> pList = new ArrayList<>();
        ArrayList<Size> sList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer( _customerid: 1, _customerName: "Muhammad Khalid");
        Order order1 = new Order( _orderid: 1);
        Transaction trans1 = new Transaction(1,);

        Menu menu1 = new Menu(_menuid: 1, _menuid: "Plain"_menuPrice: "$7.00");
        Menu menu2 = new Menu(_menuid: 2, _menuid: "Meat"_menuPrice: "$8.75");
        Menu menu3 = new Menu(_menuid: 3, _menuid: "Extra"_menuPrice: "$9.25");
        Menu menu4 = new Menu(_menuid: 4, _menuid: "Veg"_menuPrice: "$8.00");
        Menu menu4 = new Menu(_menuid: 5, _menuid: "Cheesesteak", _menuPrice: "$9.50");


        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        oList.add(order1);
        tList.add(trans1);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(main.addCustomer());
                    break;
                case CUST_PRNT : Customer.printCustomer(cList);
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : //Order.addOrders();
                    break;
                case TRAN_CODE : Transaction.listTransactions(tList);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer(){
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }
}
