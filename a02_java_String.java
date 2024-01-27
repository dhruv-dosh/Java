package Java;
public class a02_java_String {
    public static void main(){
        String d = "  dhruv  ";
        System.out.println(d.length());
        d.toUpperCase();
        System.out.println(d);
        d.toLowerCase();
        System.out.println(d);
        d.trim();//Cut extra spaces
        System.out.println(d);
        System.out.println(d.substring(2,4)); //begin and end index gives substring
        d.replace('d','l');//replace all char d with l
        d.startsWith("dh");//return boolean val
        d.endsWith("uv");//return boolean val
        d.charAt(2);
        d.indexOf('r');
        d.indexOf('u',2);//RETURN INDEX OF U AFTER INDEX 2
        d.lastIndexOf('r');//return where last r is present
        d.equals("dhruv");//return true if given string is equal

        
    }
}
