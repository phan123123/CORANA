package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logs {
    private static FileOutputStream writer;
    public static void initLog(String name){
        try {
            File file = new File(name);
            writer = new FileOutputStream(file);
            writer.write(("").getBytes());
            writer.close();
            writer = new FileOutputStream(file,true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void endLog(){
        try {
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void infoLn(Object o) {
        info(o);
        info("\n");
    }

    public static void infoLn(Object... os) {
        if (os.length == 0) {
            infoLn("");
        }
        for (Object o : os) {
            infoLn(o);
        }
    }

    public static void info(Object o) {
        System.out.print(toStr(o));
        try {
            writer.write(toStr(o).getBytes());
        } catch (IOException ex) {
        }
    }

    public static void info(Object... os) {
        for (int i = 0; i < os.length; i++) {
            info(os[i]);
            if (i < os.length - 1) {
                info(" ");
            }
        }
    }

    private static String toStr(Object o) {
        return o == null ? "null" : o.toString();
    }

    public static String shorten(String s) {
        return s.length() > 100 ? s.substring(0, 100) : s;
    }
}