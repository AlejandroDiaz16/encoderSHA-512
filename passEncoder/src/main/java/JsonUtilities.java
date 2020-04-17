import com.google.gson.Gson;

public class JsonUtilities {
    public String toJson(User obj){
       return new Gson().toJson(obj);
    }
    public User fromJson(String json){
        return new Gson().fromJson(json,User.class);
    }
}
