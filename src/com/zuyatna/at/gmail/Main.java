package com.zuyatna.at.gmail;

interface SolidGeometry {

    void volume(double a, double b, double c);
}

class Cube implements SolidGeometry {

    @Override
    public void volume(double a, double b, double c) {
        System.out.println("cube: side, 0, 0");
        System.out.println(Math.pow(a, 3));
    }
}

class RectangularPrism implements SolidGeometry {

    @Override
    public void volume(double a, double b, double c) {
        System.out.println("rect.prism: length, width, height");
        System.out.println(a*b*c);
    }
}

class Cylinder implements SolidGeometry {

    @Override
    public void volume(double a, double b, double c) {
        System.out.println("cylinder: r, height, 0");
        System.out.println(Math.PI*Math.pow(a, 2)*b);
    }
}

public class Main {

    public static void main(String[] args) {

        SolidGeometry cube = new Cube();
        cube.volume(4,0,0);

        SolidGeometry prism = new RectangularPrism();
        prism.volume(3,7,10);

        SolidGeometry cylinder = new Cylinder();
        cylinder.volume(4, 6, 0);
    }
}
