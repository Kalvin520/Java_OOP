package Tickets;

import 多型練習.Dog;

import java.util.Scanner;

public class tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("機票原價：");
        double price = sc.nextDouble();
        System.out.println("月份：");
        int month = sc.nextInt();
        System.out.println("倉位");
        String type = sc.next();
        double rs = calc(price,month,type);
        System.out.println("您當期購買機票價格為:"+rs);
    }

    public static double calc(double money, int month, String type){
        if(month >= 5 && month <= 10){
            switch (type){
                case "Economic":
                    money *= 0.85;
                    break;
                case "VIP":
                    money *= 0.9;
                    break;
                default:
                    System.out.println("輸入倉位不正確");
                    money = -1;
            }
        }
        else if (month >= 11 && month <= 12 || month >= 1&& month <=4){
            switch (type){
                case "Economic":
                    money *= 0.65;
                    break;
                case "VIP":
                    money *= 0.7;
                    break;
                default:
                    System.out.println("輸入倉位不正確");
                    money = -1;
            }
        }
        else {
            System.out.println("月份有問題");
            money = -1;
        }
        return money;
    }
}
