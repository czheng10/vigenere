public class vigenere{

    public static void main(String[] args){
	String command= args[0];
	String plain = args[1];
	String keytext = args[2];
	Boolean encode = command.equals("encode");
	System.out.println(vigenereciph(encode, plain, keytext));
	
    }

    public static String vigenereciph (Boolean encode, String plain, String kt){
	String p = plain.toUpperCase();
	String k = kt.toUpperCase();
	return p;
    }
}
