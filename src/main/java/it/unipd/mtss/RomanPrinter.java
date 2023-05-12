////////////////////////////////////////////////////////////////////
// Andrea Longo 2008090
// Federico Pivetta 2009693
////////////////////////////////////////////////////////////////////
package it.unipd.mtss; 
 
import java.util.HashMap;  
 
 
public class RomanPrinter{ 
    public static String print(int num){ 
        return printAsciiArt(IntegerToRoman.convert(num));
    } 
 
 private static String printAsciiArt(String romanNumber) { 
        if(romanNumber == "error: i numeri devo essere >= 1 e <= 1000"){
            System.out.println(romanNumber);
            return romanNumber;
        }
            
        HashMap<String, String[]> letters = new HashMap<String, String[]>(); 
        letters.put("I", new String[] {" _____ ","|_   _|","  | |  ","  | |  "," _| |_ ","|_____|"});
        letters.put("V", new String[] {"__      __","\\ \\    / /"," \\ \\  / / ","  \\ \\/ /  ","   \\  /   ","    \\/    "});
        letters.put("X", new String[] {"__   __","\\ \\ / /"," \\ V / ","  > <  "," / . \\ ","/_/ \\_\\"});
        letters.put("L", new String[] {" _      ","| |     ","| |     ","| |     ","| |____ ","|______|"});
        letters.put("C", new String[] {"  _____ "," / ____|","| |     ","| |     ","| |____ "," \\_____|"});
        letters.put("D", new String[] {" _____  ","|  __ \\ ","| |  | |","| |  | |","| |__| |","|_____/ "});
        letters.put("M", new String[] {" __  __ ","|  \\/  |","| \\  / |","| |\\/| |","| |  | |","|_|  |_|"});
            
        int vallength = romanNumber.length(); 
            
        
        String risultato ="";
        
        for(int i = 0; i < 6; i++){ 
            for(int j = 0; j < vallength; j++){ 
                String tmp = letters.get(String.valueOf(romanNumber.charAt(j)))[i];                 
                System.out.print(tmp); 
                System.out.print("  "); 
                risultato += tmp + "  ";
            } 
            System.out.print("\n");
            risultato += "\n";
        } 
        return risultato;
    } 
  
 }