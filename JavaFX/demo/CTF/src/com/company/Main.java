package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    private static ArrayList<String> combined = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<String> passwords = new ArrayList<>();

        try{
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream("attempt2.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                // string to array
                StringBuilder sb = new StringBuilder();
                String[] strSplit = strLine.split(":");
                sb.append(strSplit[0]);
                sb.append(strSplit[1]);
                combined.add(sb.toString());
//                names.add(strSplit[0]);
//                passwords.add(strSplit[1]);

                // Print the content on the console
//                System.out.println (strLine);

//                System.out.println(names);

            }
            //Close the input stream
            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        for(String namez : combined)
        {
            System.out.println(namez);
        }
    }


}


