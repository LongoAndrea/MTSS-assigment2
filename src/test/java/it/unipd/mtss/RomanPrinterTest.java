package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {

    @Test
    public void testPrint_correctNumber(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(24)).thenReturn("XXIV");
            
            assertEquals(RomanPrinter.print(24),  "__   __  __   __   _____   __      __  \n"+
            "\\ \\ / /  \\ \\ / /  |_   _|  \\ \\    / /  \n"+  
            " \\ V /    \\ V /     | |     \\ \\  / /   \n"+ 
            "  > <      > <      | |      \\ \\/ /    \n"+  
            " / . \\    / . \\    _| |_      \\  /     \n"+   
            "/_/ \\_\\  /_/ \\_\\  |_____|      \\/      \n");
        }
   }

   @Test
    public void testPrint_numberUnderBoundaries(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(-8)).thenReturn("error: i numeri devo essere >= 1 e <= 1000");
            
            assertEquals(RomanPrinter.print(-8),  "error: i numeri devo essere >= 1 e <= 1000");
        }
   }

   @Test
    public void testPrint_numberOverBoundaries(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(1002)).thenReturn("error: i numeri devo essere >= 1 e <= 1000");
            
            assertEquals(RomanPrinter.print(1002),  "error: i numeri devo essere >= 1 e <= 1000");
        }
   }

   @Test
    public void testPrint_numberZero(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(0)).thenReturn("error: i numeri devo essere >= 1 e <= 1000");
            
            assertEquals(RomanPrinter.print(0),  "error: i numeri devo essere >= 1 e <= 1000");
        }
   }

    @Test
    public void testPrint_correctCharactersCXV(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(115)).thenReturn("CXV");
            
            assertEquals(RomanPrinter.print(115),  "  _____   __   __  __      __  \n"+
            " / ____|  \\ \\ / /  \\ \\    / /  \n"+  
            "| |        \\ V /    \\ \\  / /   \n"+ 
            "| |         > <      \\ \\/ /    \n"+  
            "| |____    / . \\      \\  /     \n"+   
            " \\_____|  /_/ \\_\\      \\/      \n");
        }
   }

    @Test
    public void testPrint_correctCharactersDLI(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(551)).thenReturn("DLI");
            
            assertEquals(RomanPrinter.print(551),  " _____     _         _____   \n"+
            "|  __ \\   | |       |_   _|  \n"+  
            "| |  | |  | |         | |    \n"+ 
            "| |  | |  | |         | |    \n"+  
            "| |__| |  | |____    _| |_   \n"+   
            "|_____/   |______|  |_____|  \n");
        }
   }

   @Test
    public void testPrint_correctCharacterM(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()-> IntegerToRoman.convert(1000)).thenReturn("M");
            
            assertEquals(RomanPrinter.print(1000),  " __  __   \n"+
            "|  \\/  |  \n"+  
            "| \\  / |  \n"+ 
            "| |\\/| |  \n"+  
            "| |  | |  \n"+   
            "|_|  |_|  \n");
        }
   }
}