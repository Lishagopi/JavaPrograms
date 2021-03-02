package com.company;
import java.util.Scanner;

public class Box {
    public int Volume(int length, int width, int height) {
        int vol;
        vol = length * width * height;
        return vol;
    }

    public double AreaOfSurface(int length, int width, int height) {
        double area;
        area = (0.5 * length * width * height);
        return area;
    }
}