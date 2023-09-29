package homework_nr_8;

import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, String> dictionaryMap = new HashMap<>();
        dictionaryMap.put("Power","Putere");
        dictionaryMap.put("Glasses","Ochelari");
        dictionaryMap.put("Chair","Scaun");
        dictionaryMap.put("Friend","Prieten");
        dictionaryMap.put("Invoice","Factura fiscala");
        dictionaryMap.put("Computer","Calculator");
        dictionaryMap.put("File","Fișier");
        dictionaryMap.put("Price","preț");
        dictionaryMap.put("Key","Cheie");
        dictionaryMap.put("Help","Ajutor");
        System.out.println(dictionaryMap);
    }
}
