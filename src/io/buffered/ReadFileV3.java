package io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class ReadFileV3 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);

        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;

        while ((data = bis.read()) != -1) {
            fileSize++;
        }
        bis.close();


        long endTime = System.currentTimeMillis();

        fis.close();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("fileSize = " + fileSize);
        System.out.println("Time = " + (endTime - startTime) + "ms");
    }
}
