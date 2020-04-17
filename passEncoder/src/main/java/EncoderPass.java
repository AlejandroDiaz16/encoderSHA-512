import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;

public class EncoderPass {
    public String encondePass(String pass,User user){

        String toReturn = null;
        final String pass1=user.getNombre()+user.getApellido()+"software" + pass;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(pass.getBytes("utf8"));
            final String encode512 = String.format("%0128x", new BigInteger(1, digest.digest()));
            toReturn = Base64.getEncoder().encodeToString(pass1.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    public boolean match(String pass, User user){
        final String code = encondePass(pass,user);
        if(code.equals("")){return true;}
        else{return false;}
    }
}
