package Homework.Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;



public class FileManager {
    public void copyFileManager(String oldFileName, String newFileName) throws IOException {
        try (InputStream inStream = new FileInputStream(oldFileName);
                OutputStream outStream = new FileOutputStream(newFileName);) {
            byte[] buffer = new byte[1024];
            int length = inStream.read(buffer);
            while (length > 0) {
                outStream.write(buffer, 0, length);
            }

        } catch (IOException e) {
            throw new FileNotFoundException("File " + oldFileName + " not found.");
        }
    }
    public void writeFileManager(String fileName, List<String> newData) throws FileNotWriteException, IOException {
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (String line : newData) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();               
            }
        } catch (IOException e) {
            throw new FileNotWriteException(fileName +" can't write.");
        }
    }
    public List<String> readFileManager(String fileName) throws IOException {
        List<String> newList = new ArrayList<String>();
        File file = new File(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String lineNewList = bufferedReader.readLine();
            while (lineNewList != null) {
                newList.add(lineNewList);
            }

        } catch (IOException e) {
            throw new FileNotFoundException(fileName + " not found.");
        }
        return newList;
    }
}
