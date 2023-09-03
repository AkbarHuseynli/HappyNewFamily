package src.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileUtility {

    private static void writeIntoFile(String fileName, String text, boolean append) throws IOException {

        //try-with resourcess
        // makes us sure that these resources in the try block will be closed
        try (
                FileWriter fw = new FileWriter(fileName); // writes into File called  
                BufferedWriter bw = new BufferedWriter(fw) //buffer wall among the stuff
        ) {

            bw.write(text);

        }
    }

    public static void appendFile(String fileName, String text) throws IOException {

        writeIntoFile(fileName, text, true);
    }

    public static void writeIntoFile(String fileName, String text) throws IOException {

        writeIntoFile(fileName, text, false);
    }

    public static void byteWrite(String fileName, byte[] data) throws IOException {
        File file = new File(fileName);
        try (FileOutputStream fop = new FileOutputStream(file)) {

            fop.write(data);
            fop.flush();
        }

        System.out.println("Done");

    }

    public static String readFile(String fileName) throws IOException {
        try (InputStream in = new FileInputStream(fileName);
             InputStreamReader read = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(read)) {
            String line;
            String result = "";
            while ((line = reader.readLine()) != null) result += line + "\n";
            return result;
        }
    }

    public static byte[] byteRead(String fileName) throws Exception {
        File file = new File(fileName);

        try (FileInputStream in = new FileInputStream(file);) {
            byte[] data = new byte[(int) file.length()];
            in.read(data);
            return data;
        } finally {
            System.out.println("METHOD WILL DO ITS DUTY WHETHER EXCEPTION WILL OCCUR OR NOT!");
        }

        //to get result use to string method to convert byte array into string

    }

    public static void nioWriteBytes(String fileName, String text) throws IOException {
        Path filepath = Paths.get(fileName);
        Files.write(filepath, text.getBytes());
    }

    public static byte[] nioReadBytes(String fileName) throws IOException {
        Path filepath = Paths.get(fileName);
        byte[] data = Files.readAllBytes(filepath);
        return data;

    }

    public static Object readFileDeserialize(String name) {
        Object obj = null;
        try (
                FileInputStream fins = new FileInputStream(name);
                ObjectInputStream in = new ObjectInputStream(fins);) {
            obj = in.readObject();
        } finally {
            return obj;
        }

    }

    public static boolean writeObjectToFile(Object object, String name) throws Exception {
        try (
                FileOutputStream fout = new FileOutputStream(name);
                ObjectOutputStream oos = new ObjectOutputStream(fout))
        {
            oos.writeObject(object);
            if (oos != null) {
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static String readByScanner(File fileName) {
        try (Scanner sc = new Scanner(fileName)) {

            String result = "";
            while (sc.hasNext()) {
                result += sc.nextLine() + "\n";

            }
            return result;
        } catch (Exception ex) {
            System.err.println("EXCEPTION OCCURED WHILE READING");
            return null;
        }

//        User u = (User) FileUtility.readFileDeserialize("test.obj");
        //FileUtility.writeObjectToFile(u, "test.obj");

    }


}
