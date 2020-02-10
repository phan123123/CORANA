/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executor;

import enums.Variation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import utils.Logs;

/**
 *
 * @author phan123123
 */
public class Testing {

    public static void main(String[] args) {
        Logs.initLog("null.log");
        String inpFile = "/home/phan123123/Desktop/JAIST-Internship/corana/samples/12bd4f82a1f57e1e85b89f0014208782/12bd4f82a1f57e1e85b89f0014208782";
        String variation = "M7";
        Executor.execute(Variation.valueOf(variation), inpFile);
        Logs.endLog();
        /*
        InputStream fileInputStream = ClassLoader.getSystemResourceAsStream("resources/smt-funcs/bvclz.smt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("--->>  "+line);
            }
            br.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }
}
