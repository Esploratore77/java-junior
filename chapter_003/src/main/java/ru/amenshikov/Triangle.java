package ru.amenshikov;
public class Triangle {
public Point a;
public Point b;
public Point c;

public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}

public double area() {
       //calculate the triangle area
       double AB = this.a.distanceTo(b);
       double AC = this.a.distanceTo(c);
       double BC = this.b.distanceTo(c);
       double semiPerimeter = (AB + AC + BC)/2.0;
       double areaOfTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - AB) * (semiPerimeter - AC) * (semiPerimeter - BC));
       if (areaOfTriangle == 0) 
         {System.out.println("Error to build triangle");
          return 0;  }
       else return areaOfTriangle;
 }
}