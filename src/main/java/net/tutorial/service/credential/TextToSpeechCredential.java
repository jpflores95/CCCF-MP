package net.tutorial.service.credential;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class TextToSpeechCredential{
    public String username;
    public String password;

    public TextToSpeechCredential(){
        try {
            String envApp = System.getenv("VCAP_APPLICATION");
            String envServices = System.getenv("VCAP_SERVICES");

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(envServices);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray vcapArray = (JSONArray) jsonObject.get("text_to_speech");
            JSONObject vcap = (JSONObject) vcapArray.get(0);
            JSONObject credentials = (JSONObject) vcap.get("credentials");
            username = credentials.get("username").toString();
            password = credentials.get("password").toString();
            }catch(ParseException pe){
            System.err.println("TextToSpeechCredential() ParseException: " + pe.getMessage());
        }
    }

    public String toString(){
        String str = "";
        str += "username: " + username + "\n";
        str += "password: " + password + "\n";
        return str;
    }
}
