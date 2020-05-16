package KCG;

class Shape {
    void draw() {
        System.out.println("부모 그리기");
    }
}

class Line extends Shape {
    void draw() {
        System.out.println("선 그리기");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("원 그리기");
    }
}

class Rect extends Shape {
    void draw() {
        System.out.println("사각형 그리기");
    }
}


public class KCG_2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        Line n = new Line();
        n.draw();
        Circle c = new Circle();
        c.draw();
        Rect r = new Rect();
        r.draw();
        Shape sh = new Line();
        sh.draw();
        Shape sh2 = new Rect();
        sh2.draw();

        Shape k [] = new Shape[3];
        k[0] = new Line();
        k[1] = new Circle();
        k[2] = new Rect();

        for(int i = 0; i < k.length; i++) {
            k[i].draw();
        }
    }
}
