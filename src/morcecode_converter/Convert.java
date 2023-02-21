package morcecode_converter;

import java.util.HashMap;

public class Convert {public String text_mc_l = "";
    public String code = "";
    public String[] valueArray;
    HashMap<String, String> converter = new HashMap<>();
    public String[] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] morsecode = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**",
            "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**"};

    public String getMC(String key) {
        for (int i = 0; i < english.length; i++) {
            converter.put(english[i], morsecode[i]);
        }
        key = key.toUpperCase();
        for (int i = 0; i < key.length(); i++) {
            if (converter.get(Character.toString(key.charAt(i))) != null) {
                text_mc_l += converter.get(Character.toString(key.charAt(i)));
                if (i != (key.length() - 1)) {
                    text_mc_l += " ";
                }
            } else {
                text_mc_l += " ";
            }
        }
        return text_mc_l;
    }

    public String getEnglish(String value) {
        for (int i = 0; i < english.length; i++) {
            converter.put(morsecode[i], english[i]);
        }
        valueArray = value.split(" ");
        for (int i = 0; i < valueArray.length; i++) {
            if (converter.get(valueArray[i]) != null) {
                code = code + converter.get(valueArray[i]) + "";
            } else {
                code = code + " ";
            }
        }
        return code;
    }
}
