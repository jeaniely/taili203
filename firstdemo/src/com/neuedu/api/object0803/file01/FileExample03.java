package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.IOException;

public class FileExample03 {
    public static void main(String[] args) {
        File file=new File("test.txt");
        if(file.exists()){
            file.delete();
        }else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
