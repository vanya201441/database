package people;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Student {
    //private static String e;
    protected static int estimates;
    protected static String name;

    public Student(String name, int estimates) {

        this.name = name;
        this.estimates = estimates;

    }

    protected abstract void setMW() throws IOException;
    protected abstract void writeS();

    protected abstract void selectC();


}









