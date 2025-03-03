package org.example;

public class Bai1 {

    public Integer tinhTong(){
        int tong = 0;
        for (int i = 1; i <= 50 ; i++) {
            if(i % 2 == 0){
                tong += i;
                if (i % 8 == 0){
                    continue;
                }
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.tinhTong();
        System.out.println(bai1.tinhTong());
    }
}
