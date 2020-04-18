import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Cliente {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //CreateUser
        System.out.println("Ingrese nombre del usuario");
        String nombre=br.readLine();
        System.out.println("Ingrese Apellido del usuario");
        String apellido=br.readLine();
        User user = new User(nombre, apellido, "sergiobustos@gmail.com");
        //contraseña
        System.out.println("Ingrese contraseña: ");
        final String password = br.readLine();
        //toJson
        String userJson = new JsonUtilities().toJson(user);
        //fromJson
        User userFromJson = new JsonUtilities().fromJson(userJson);


        String encodedPassword =
                new EncoderPass().encondePass(password, user);
        System.out.println("The SHA-512 of \"" + password +
                "\" is:" + encodedPassword);

        System.out.println("Token  verificar");
        String token = br.readLine();
        if(new EncoderPass().match(password,user,token)){ System.out.println("allowed");
        }else{ System.out.println("Not Allowed"); }
    }
}
