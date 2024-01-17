package Java;
// POLYMORPHISM MEANS SAME BODY WITH DIFFERENT FUNCTION ( 1 THING WITH DIFFERENT FORMS )
// IN THIS SMARTPHONE IS PHONE WHICH PERFORM GPS, CAMERA, MUSIC FUNCTION THAT IS CALLED POLYMORPHISM
/*
    DMD IS ALSO USED FOR THIS TYPE OF CODES IN WHICH IF USER WANT TO USE GPS THEN HE
    CAN NOT USE METHODS OF OTHER INTERFACE OR CLASS
*/

class Phone22{
    public void inf(){
        System.out.println("I AM A PHONE...");
    }
}

interface Gps22{
     void gps221();
}
interface Camera22{
    void camera222();
}

interface Music22{
    void music223();
}

class SmartPhone22 extends Phone22 implements Gps22,Camera22,Music22{

    @Override
    public void camera222() {
        System.out.println("STARTING CAMERA");
    }

    @Override
    public void music223() {
        System.out.println("STARTING MUSIC");
    }

    @Override
    public void gps221() {
        System.out.println("STARTING GPS");
    }

    public void runAll(){
        System.out.println("I AM A SMARTPHONE METHOD AND I WILL PERFORM ALL FUNCTION");
    }

}
public class a22_java_polymorphismInInterface {
    public static void main(String[] args) {
       Gps22 s22 = new SmartPhone22();// TAKING REFERENCE OF GPS AND MAKING OBJECT OF SMARTPHONE
       s22.gps221();// VALID
        // s22.music223(); // NOT VALID IF GPS IS REFERENCE
        // SmartPhone22 S221= new SmartPhone22(); // CAN USE ALL METHODS IN SMARTPHONE
    }
}
