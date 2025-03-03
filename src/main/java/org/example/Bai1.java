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


}
