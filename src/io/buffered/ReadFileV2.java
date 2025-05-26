package io.buffered;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class ReadFileV2 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        int size;
        int fileSize = 0;
        while ((size = fis.read(buffer)) != -1) {
            fileSize += size;
        }
        long endTime = System.currentTimeMillis();

        fis.close();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("fileSize = " + fileSize);
        System.out.println("Time = " + (endTime - startTime) + "ms");
    }
}
