import java.util.Base64;

public class Base64EncodeAndDecode
{
	public static void main(String[] args) {
	    String message = "Hello world!";
		byte[] encodedBytes = Base64.getEncoder().encode(message.getBytes());
        System.out.println(String.format("Encoded bytes : %s ", new String(encodedBytes)));
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        System.out.println(String.format("Decoded bytes : %s ",  new String(decodedBytes)));
	}
	
}
