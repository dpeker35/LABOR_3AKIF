

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//eigenes Beispiel nicht vom TG
public class TestJunit
{
    @Test
    public void testStockgibtesnicht()
    {
        Labor stock1;
        
        stock1 = new Labor("C", -5, 20);
        
        
        assertEquals(stock1.getStock(),5);
        
        
        
        
    }
    
    @Test
    public void testStockOk()
    {
        Labor stock2;
        
        stock2 = new Labor("A", 15,20);
        
        
        assertEquals(stock2.getStock(), 15);
        
        
    }
    
    @Test
    public void testZuhoch()
    {
        Labor stock3;
        
        stock3 = new Labor("B", 25,20);
        
        
        assertEquals(stock3.getStock(), 5);
        
        
}

}
