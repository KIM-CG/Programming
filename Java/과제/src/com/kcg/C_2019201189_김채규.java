package com.kcg;

import java.util.Scanner;

abstract class Camera {
    private String model;
    private String company;
    protected int memory;
    protected int filmcount;
    int sel, count;

    abstract void photo();
    abstract void save();

    String getModel() {
        return model;
    }

    String getCompany() {
        return company;
    }

    Camera(String model, String company, int memory, int filmcount) {
        this.model = model;
        this.company = company;
        this.memory = memory;
        this.filmcount = filmcount;
    }
}

class DSLR extends Camera {
    int picture = 0;
    int pixel;
    DSLR(String model, String company, int pixel, int memory, int filmcount) {
        super(model, company, memory, filmcount);
        this.pixel = pixel;
    }

    @Override
    void photo() {
        if (memory >= 50) {
            memory-=50; picture++;
            System.out.println("DSLR 사진기의 용량은 " + memory + "KB 남았고, 현재 사진수는 " + picture + "개 입니다.");
        }
        else {
            System.out.println("DSLR 사진기에 남은 용량이 없습니다.");
            return;
        }
    }

    @Override
    void save() {
        if (filmcount >= 1) {
            filmcount -= picture;
            picture = 0;
            System.out.println("DSLR 사진기의 남은 필름수는 " + filmcount + "개 입니다.");
        } else {
            System.out.println("DSLR 사진기의 필름이 없어서 더 이상 저장할 수 없습니다.");
            return;
        }
    }
}

class 폴라로이드 extends Camera {
    int picture = 0;
    String color;

    폴라로이드(String model, String company, String color, int memory, int filmcount) {
        super(model, company, memory, filmcount);
        this.color = color;
    }

    @Override
    void photo() {
        if (memory >= 50) {
            memory-=50; picture++;
            System.out.println("폴라로이드 사진기의 용량은 " + memory + "KB 남았고, 현재 사진수는 " + picture + "개 입니다.");
        } else {
            System.out.println("폴라로이드 사진기에 남은 용량이 없습니다.");
            return;
        }
    }

    @Override
    void save() {
        if (filmcount >= 1) {
            filmcount -= picture;
            picture = 0;
            System.out.println("폴라로이드 사진기의 남은 필름수는 " + filmcount + "개 입니다.");
        } else {
            System.out.println("폴라로이드 사진기의 필름이 없어서 더 이상 저장할 수 없습니다.");
            return;
        }
    }
}

public class C_2019201189_김채규 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSLR ds = new DSLR("SM-500", "Samsung", 1700, 300, 20);
        폴라로이드 po = new 폴라로이드("Mini-200", "Canon", "노랑", 200, 15);
        int sel1, sel2;
        while(true) {
            System.out.println("1. DSLR");
            System.out.println("2. 폴라로이드");
            System.out.println("3. 종료");
            System.out.print("선택하세요 >> ");
            sel1 = sc.nextInt();
            if (sel1 == 1) {
                System.out.println("모델명 : " + ds.getModel() + " | 제조사 : " + ds.getCompany() + " | 메모리 : " + ds.memory + "KB | 필름수 : " + ds.filmcount + " | 화소수 : " + ds.pixel + "픽셀");
            } else if (sel1 == 2){
                System.out.println("모델명 : " + po.getModel() + " | 제조사 : " + po.getCompany() + " | 메모리 : " + po.memory + "KB | 필름수 : " + po.filmcount + " | 색상 : " + po.color + "색");
            } else {
                return;
            }
            System.out.println("1. 사진찍기");
            System.out.println("2. 저장하기");
            System.out.println("3. 종료");
            System.out.print("선택하세요 >> ");
            sel2 = sc.nextInt();
            if (sel1 == 1 && sel2 == 1) {
                ds.photo();
            } else if (sel1 == 1 && sel2 == 2) {
                ds.save();
            } else if (sel1 == 2 && sel2 == 1) {
                po.photo();
            } else if (sel1 == 2 && sel2 == 2) {
                po.save();
            } else {
                sc.close();
                return;
            }
        }
    }
}