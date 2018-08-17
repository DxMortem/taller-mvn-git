package co.edu.escuelaing.arem.TallerMVNGIT;

import co.edu.escuelaing.arem.LinkedList.SimpleLinkedList;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    protected static SimpleLinkedList list;

    public static void main(String[] args) {
        BufferedReader bIn;
        try {
            bIn = new BufferedReader(new FileReader("input.txt"));
            list = new SimpleLinkedList();
            String ln = bIn.readLine();
            while(ln != null){
                ln = ln.trim();
                list.append(Integer.parseInt(ln));
                ln = bIn.readLine();
            }
            System.out.println("mean = "+String.valueOf(mean(list)));
            System.out.println("standard deviation = "+String.valueOf(standardDeviation(list)));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static double mean(SimpleLinkedList list){
        return (double)list.sum()/(list.getSize());
    }

    public static double standardDeviation(SimpleLinkedList list){
        double sumatoria =0;
        for(int i=0; i<list.getSize(); i++){
            sumatoria+= Math.pow(list.positionValue(i)-mean(list),2);
        }
        return Math.sqrt(sumatoria/(list.getSize()-1));
    }
}
