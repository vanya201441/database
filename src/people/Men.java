package people;


import writeStudent.Write;

public class Men extends Student {

    public Men(String name, int estimates) {
        super(name, estimates);
    }

    Write write = new Write();
    @Override
    public void setMW() {
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






