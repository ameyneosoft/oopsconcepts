package serialization;

import serialization.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {
    public static void main(String[] args) throws IOException,ClassNotFoundException, ClassCastException{
        FileInputStream fs = new FileInputStream("fs.txt");
        ObjectInputStream obj = new ObjectInputStream(fs);
        Student st = (Student) obj.readObject();
        System.out.println(st.name +" , "+ st.age);


    }
}
