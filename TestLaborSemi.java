
//eigene Übung TG hat noch keine Übung dazu hochgeladen
public class TestLaborSemi
{
    public void testStockgibtesnicht()
    {
        Labor stock1;
        
        stock1 = new Labor("C", -5, 20);
        
        //Ergebnis Fehlermeldung
        
        System.out.println(stock1.getStock());
        
        //Ergebnis 5
        
        
    }
    
    
    public void testStockOk()
    {
        Labor stock2;
        
        stock2 = new Labor("A", 15,20);
        //Ergebnis keine Fehlermeldung
        
        System.out.println(stock2.getStock());
        //Ergebnis 15
        
    }
    
    public void testZuhoch()
    {
        Labor stock3;
        
        stock3 = new Labor("B", 25,20);
        //Ergebnis Fehlermeldung
        
        System.out.println(stock3.getStock());
        
        //Ergebni 5
        
        
    }
}
