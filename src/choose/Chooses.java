package choose;

import people.Men;
import people.Student;
import people.Women;


import java.io.IOException;
import java.util.Scanner;

public class Chooses extends Student {
    private static int select;

    public Chooses() {
        super(name, estimates);
    }


    public void selectC(){


    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();

        switch (select) {

        case 1:
            System.out.printf("1.people.Men\n2.people.Women\n0.Back\n");
            Scanner scanner1 = new Scanner(System.in);
            int select1 = scanner1.nextInt();


            switch (select1) {
                case 1:
                    Men wrm = new Men(name, estimates);
                    wrm.setMW();
                    break;
                case 2:
                    Women wrw = new Women(name, estimates);
                    wrw.setMW();
                    break;
                case 0:
                default:
                    System.out.printf("Please replay try");

                    break;
            }
            break;
        case 2:
            System.out.printf("1.people.Men\n2.people.Women\n0.Back\n");
            Scanner scanner2 = new Scanner(System.in);
            int select2 = scanner2.nextInt();

            switch (select2) {
                case 1:
                    Men wrm = new Men(name, estimates);

                    break;
                case 2:
                    Women wrw = new Women(name, estimates);

                    break;

                case 0:

                    break;

                default:
                    System.out.printf("Please replay try");
                    break;
            }

    }


}

    @Override
    public void setMW() throws IOException {

    }

    @Override
    public void writeS() {

    }
}
