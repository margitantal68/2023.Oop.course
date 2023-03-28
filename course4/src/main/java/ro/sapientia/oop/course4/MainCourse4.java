package ro.sapientia.oop.course4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainCourse4 {
    public static void main(String[] args) {
        int[] intArray = new int[ 5 ];
        System.out.print("Primitiv tipusu tomb. Egeszek: ");
        for (int i = 0; i < intArray.length ; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        double[] doubleArray = {1.2, -6.7, 8.9};
        System.out.print("Primitiv tipusu tomb. Valosak: ");
        for(double d: doubleArray){
            System.out.print(d + " ");
        }
        System.out.println();
        Point points[] = new Point[ 3 ];
        System.out.print("Referencia tipusu tomb. Inicializalas elott: ");
        for(Point point: points) {
            System.out.print(point +" ");
        }
        System.out.println();
        for (int i = 0; i < points.length; i++) {
            points[ i ] = new Point(i, i);
        }
        System.out.print("Referencia tipusu tomb. Inicializalas utan: ");
        for(Point point: points) {
            System.out.print(point +" ");
        }
        System.out.println();
        System.out.println("\nARRAYLIST");
        ArrayList<String> gyumolcsok = new ArrayList<>();
        System.out.println("\tMeret: " + gyumolcsok.size());
        gyumolcsok.add("alma");
        gyumolcsok.add("korte");
        gyumolcsok.add("banan");
        System.out.println("\tMeret: " + gyumolcsok.size());

        for (String gyumolcs: gyumolcsok) {
            System.out.print(gyumolcs + " ");
        }
        System.out.println();
        for (int i = 0; i <gyumolcsok.size() ; i++) {
            System.out.print( gyumolcsok.get(i) + " ");
        }
        System.out.println();
        String torlendo = "korte";
        System.out.println("Elemek: " + gyumolcsok);
        System.out.println("Torles: " + torlendo);
        for(String gy: gyumolcsok) {
            if( gy.equals(torlendo)) {
                gyumolcsok.remove(torlendo);
                break;
            }
        }
        System.out.println("Torles utan: " + gyumolcsok);
    }
}
