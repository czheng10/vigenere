/**************************************************************************
Cindy Zheng 
Mr. Konstantinovich
Cybersecurity
Vigenere Ciphere 

Encoding and decoding plaintext given a key.
 *************************************************************************/
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
	String answer = "";
	String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	String keytext = k;
	//matching key to plaintext
	for (int i = k.length(); i<p.length(); i++){
	    keytext = keytext + (k.charAt(i % k.length()));
	}
	//encoding
	if (encode){
	    for (int i = 0; i<p.length(); i++){
		    int position = (alpha.indexOf(p.charAt(i)) + alpha.indexOf(keytext.charAt(i))) % 26;
		    answer = answer + alpha.charAt(position);
		}
	    }
	
	//decoding
	else {
	    for (int i = 0; i<p.length(); i++){
		int position = (alpha.indexOf(p.charAt(i)) - alpha.indexOf(keytext.charAt(i)));
		if (position < 0){
		    position+= 26;
		}
		answer = answer + alpha.charAt(position);
	    }
        }
    return answer;
    }
}
