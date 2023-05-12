package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest 
{
    @Test
    public void testConvert_numberIntoBoundaries()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(12);
        //Assert
        assertEquals("XII",ris);
    }

    @Test
    public void testConvert_numberOverBoundaries()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(1030);
        //Assert
        assertEquals("error: i numeri devo essere >= 1 e <= 1000",ris);
    }

    @Test
    public void testConvert_numberUnderBoundaries()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(-6);
        //Assert
        assertEquals("error: i numeri devo essere >= 1 e <= 1000",ris);
    }

    @Test
    public void testConvert_numberZero()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(0);
        //Assert
        assertEquals("error: i numeri devo essere >= 1 e <= 1000",ris);
    }

    @Test
    public void testConvert_returnedCharacter()
    {
        //Arrange
        String[] ris = new String[7];
        //Act
        ris[0] = IntegerToRoman.convert(1);
        ris[1] = IntegerToRoman.convert(1000);
        ris[2] = IntegerToRoman.convert(100);
        ris[3] = IntegerToRoman.convert(500);
        ris[4] = IntegerToRoman.convert(10);
        ris[5] = IntegerToRoman.convert(50);
        ris[6] = IntegerToRoman.convert(5);
        //Assert
        assertEquals("I",ris[0]);
        assertEquals("M",ris[1]);
        assertEquals("C",ris[2]);
        assertEquals("D",ris[3]);
        assertEquals("X",ris[4]);
        assertEquals("L",ris[5]);
        assertEquals("V",ris[6]);
    }
}