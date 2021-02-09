package src.com.demo.basic.referance;

import java.util.Date;
import java.awt.*;

public class PointDemo {
    public static void main(String[] args) {
        Date now = new Date();
        Point point1 = new Point(1, 2);
        Point point2 = point1;

        point2.x = 2;
        System.out.println(point1);
    }
}
