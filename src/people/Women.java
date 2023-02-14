package people;

import writeStudent.Write;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Women extends Student {
    public Women(String name , int estimates) {
        super(name, estimates);
    }

    Write write = new Write();
    @Override
    public void setMW(){
        System.out.printf("Good day, please fill in info about student\n");

        write.writeS();




    }

    @Override
    public void writeS() {

    }

    @Override
    public void selectC() {

    }
}

