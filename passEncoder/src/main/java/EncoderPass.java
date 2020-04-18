import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Base64;

public class EncoderPass {
    public String encondePass(String pass,User user){

        String toReturn = null;
        String pass1="software" + pass;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(pass1.getBytes("utf8"));
            String nuevo  =user.getNombre()+"-"+user.getApellido()+"-"+ String.format("%0128x", new BigInteger(1, digest.digest()));
            toReturn = Base64.getEncoder().encodeToString(nuevo.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    public boolean match(String pass, User user, String token){
        final String code = encondePass(pass,user);
        if(code.equals(token)){return true;}
        else{return false;}
    }
}
