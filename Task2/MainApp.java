package Homework.Task2;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    private static final String FILE = "D:\\Учеба Geekbrains\\14 Исключения в программировании\\Seminar3\\Homework\\Task2\\file.txt";
    private static final String COPYFILE = "D:\\Учеба Geekbrains\\14 Исключения в программировании\\Seminar3\\Homework\\Task2\\copyfile1.txt";

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        List<String> data = new ArrayList<String>();
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("four");
        data.add("five");
        try {
            fileManager.writeFileManager(FILE, data);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            List< String> dataFile = fileManager.readFileManager(FILE);
            System.out.println(dataFile);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            fileManager.copyFileManager(FILE, COPYFILE);
            System.out.println("Copy is ok=)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
