package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Persist {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Virat", 32);
            FileOutputStream fs = new FileOutputStream("fs.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fs);

            obj.writeObject(s1);
            obj.flush();
            obj.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
