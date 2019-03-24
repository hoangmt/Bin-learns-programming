package com.company;
import java.util.Scanner;
class Main {
    static double speed_test(String variable_names) {
        double variable;
        System.out.println(variable_names);
        Scanner input = new Scanner(System.in);
        variable = input.nextDouble();
        System.out.println(variable);
        return variable;
    }

    public static void main(String[] args) {
    double gio, phut, phut_sang_h, giay, giay_sang_h,thoi_gian,quang_duong,van_toc;
    gio = speed_test("Nhap vao gia tri cua h");
    System.out.println("So h la: " + gio);
    phut = speed_test("Nhap vao gia tri cua phut");
    System.out.println("So phut la: " + phut);
    phut_sang_h = phut/60;
    System.out.println("Converted minutes to hours " + phut_sang_h);
    giay = speed_test("Nhap vao gia tri cua giay: ");
    System.out.println("So giay la: " + giay);
    giay_sang_h = giay/3600;
    System.out.println("Converted seconds to hours: " + giay_sang_h);
    thoi_gian = gio + phut_sang_h + giay_sang_h;
    System.out.println("Thoi gian di het quang duong la: " + thoi_gian);
    quang_duong = speed_test("Nhap do dai cua quang duong: ");
    System.out.println("Do dai cua quang duong la: " + quang_duong);
    van_toc = quang_duong/thoi_gian;
    System.out.println("Van toc cua vat la: " + van_toc);
    //lul y r u so gei
    }
}
