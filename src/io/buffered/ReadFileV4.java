package io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class ReadFileV4 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] bytes = fis.readAllBytes();

        fis.close();
        long endTime = System.currentTimeMillis();

        fis.close();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("fileSize = " + bytes.length);
        System.out.println("Time = " + (endTime - startTime) + "ms");
    }
}
