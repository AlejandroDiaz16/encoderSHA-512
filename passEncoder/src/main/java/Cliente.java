import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Cliente {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //CreateUser
        User user = new User("sergio", "bustos", "sergiobustos@gmail.com");
        //toJson
        String userJson = new JsonUtilities().toJson(user);
        //fromJson
        User userFromJson = new JsonUtilities().fromJson(userJson);
        //contraseña
        System.out.println("Ingrese contraseña: ");
        final String password = br.readLine();

        String encodedPassword =
                new EncoderPass().encondePass(password, user);
        System.out.println("The SHA-512 of \"" + password +
                "\" is:" + encodedPassword);
    }
}
