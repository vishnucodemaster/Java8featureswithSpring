package Base64Encoding;

import java.util.Base64;

public class  Exampleforbase64 {  
        public static void main(String[] args) {  
            // Getting encoder  
            Base64.Encoder encoder = Base64.getUrlEncoder();  
            // Encoding URL  
            String eStr = encoder.encodeToString("https://www.oitolabs.io/".getBytes());  
            System.out.println("Encoded URL: "+eStr);  
            // Getting decoder  
            Base64.Decoder decoder = Base64.getUrlDecoder();  
            // Decoding URl  
            String dStr = new String(decoder.decode(eStr));  
            System.out.println("Decoded URL: "+dStr);  
        }  
    }  

//Base64.Decoder-This class implements a decoder for decoding byte data using the Base64
//encoding scheme as specified in RFC 4648 and RFC 2045.

//Base64.Encoder-This class implements an encoder for encoding byte data using the Base64 
//encoding scheme as specified in RFC 4648 and RFC 2045.