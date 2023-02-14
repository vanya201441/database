package writeStudent;

import people.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Write extends Student {
    public Write() {
        super(name, estimates);
    }

    @Override
    protected void setMW() throws IOException {

    }

    public void writeS(){
        try{
            Thread.sleep(100);

            FileWriter filem = new FileWriter("infomen.txt", true);


            PrintWriter wrm = new PrintWriter(filem);





            Scanner scannerm = new Scanner(System.in);

            while (true) {
                String str = scannerm.nextLine();


                wrm.append(str + "\n");




                System.out.printf("Do you want to create a new student? Enter YES to continue or EXIT to exit");
                if ("exit".equalsIgnoreCase(scannerm.nextLine())){

                    wrm.close();
                    System.exit(0);

                }
            }

        }catch(IOException | InterruptedException e){
            System.out.printf("ERROR" + e);
        }
    }

    @Override
    public void selectC() {

    }

}
