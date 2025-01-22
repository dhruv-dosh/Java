package Java;
public class a02_java_String {
    public static void main(String [] args){
        //String is a java class which is used as datatype
        String a = new String("dhruv");
        String b = new String();
        String d = "  dhruv  "; //but java provide us a feature to write string like this


        //HERE ARE SOME FUNCTIONS TO MANIPULATE STRINGS
        System.out.println(d.length());
        d.toUpperCase();
        d.toLowerCase();
        d.trim();//Cut extra spaces
        System.out.println(d.substring(2,4)); //begin and end index gives substring
        d.replace('d','l');//replace all char d with l
        d.startsWith("dh");//return boolean val
        d.endsWith("uv");//return boolean val
        d.charAt(2); //return char at index
        d.indexOf('r'); //return index of char in String
        d.indexOf('u',2);//RETURN INDEX OF U AFTER INDEX 2
        d.lastIndexOf('r');//return where last r is present
        d.equals("dhruv");//return true if given string is equal

        
    }
}
