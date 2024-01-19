// HERE WE IMPORT AND USE PACKAGES
import usingpackages.a25_java_UsingPack1; //IMPORTING PACKAGES
import usingpackages.one.a25_java_UsingPack2; //IMPORTING PACKAGES

public class a25_java_UsingPack3{
    public static void main(String[] args) {
        System.out.println("RUNNINF FILE ( a25_java_UsingPack3 ) WHILE USING PACKAGES.");
        a25_java_UsingPack1 obj1 = new a25_java_UsingPack1();  //CREATING OBJECT OF CLASS
        a25_java_UsingPack2 obj2 = new a25_java_UsingPack2(); //CREATING OBJECT OF CLASS
        System.out.println("Calling Method of (a25_java_UsingPack1) :"+obj1.num()); //USING METHOD OF IMPORTED CLASS
        obj2.greet(); //USING METHOD OF IMPORTED CLASS
    }
}