package com.company;

import java.io.File;
import java.util.Arrays;

public class ue2 {
    public static void main(String[] args) {

        File dir = new File("C:/");
        File[] files;
        files= dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Dir: "+file);
            }else if (file.isFile()){
                System.out.println("File: "+file);
            }
        }
    }
}
