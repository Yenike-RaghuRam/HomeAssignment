package Set1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountVowelsFromtxtfile {
    public static int count_vowels() throws IOException {
        String data;
        Path filePath = Paths.get("src//Set1//One.txt");
        System.out.println(filePath.toAbsolutePath());
        data = new String(Files.readAllBytes(filePath));
        System.out.println(data);
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for(int i=0; i<data.length();i++){
            if(vowels.contains(Character.toLowerCase(data.charAt(i)))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(count_vowels());
    }
}
