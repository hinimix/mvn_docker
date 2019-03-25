package com;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * Created by hinimix on 18-12-11.
 */
public class Abc {
    public static void main(String[] args) throws IOException {
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.print(e);
            }
            System.out.println("hello");
        }
    }
}
