package com.testinium.utilities;

import java.io.*;

public class WriteToText {

    static String projectPath = System.getProperty("user.dir");

    static public String textFilePath = projectPath + "\\ProductInfo";

    private String readFromFile(String path) throws IOException {
        WriteToText.textFilePath = path;
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String fromFile = br.readLine();
        br.close();
        return fromFile;
    }

    public static void writeToFile(String str)  {
        FileWriter writer = null;
        try {
            writer = new FileWriter(textFilePath, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        try {
            bufferedWriter.write(str+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   }
