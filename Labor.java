public class Labor
{
    private String gebaude;
    private String raum;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    public Labor(String gebaude, String raum, int stock, boolean beamer, int anzPlatze)
    {
       setGebaude(gebaude);
       setRaum(raum);
       setStock(stock);
       setBeamer(beamer);
       setAnzPlatze(anzPlatze);
        
    }
    
    public Labor(String gebaude, int stock, boolean beamer, int anzPlatze)
    {
       setGebaude(gebaude);
       setRaum("C.03.27A");
       setStock(stock);
       setBeamer(beamer);
       setAnzPlatze(anzPlatze);
        
    }
    
    public Labor(String gebaude, int stock, boolean beamer)
    {
       setGebaude(gebaude);
       setRaum("C.03.27A");
       setStock(stock);
       setBeamer(beamer);
       setAnzPlatze(20);
        
    }
    
    public Labor(String gebaude, int stock, int anzPlatze)
    {
       setGebaude(gebaude);
       setRaum("C.03.27A");
       setStock(stock);
       setBeamer(true);
       setAnzPlatze(anzPlatze);
        
    }
    
    public Labor(int stock)
    {
       setGebaude("C");
       setRaum("C.03.27A");
       setStock(stock);
       setBeamer(true);
       setAnzPlatze(20);
        
    }
    
     public Labor()
    {
       setGebaude("C");
       setRaum("C.03.27A");
       setStock(5);
       setBeamer(true);
       setAnzPlatze(20);
        
    }
    
    
    
    
    
    public void setGebaude(String gebaude)
    {
        this.gebaude = gebaude;
    }
    
     public void setRaum(String raum)
    {
        this.raum = raum;
    }
    
     public void setStock(int stock)
    {
        this.stock = stock;
    }
    
     public void setBeamer(boolean beamer)
    {
        this.beamer = beamer;
    }
    
     public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze = anzPlatze;
    }
    
    
    public String getGebaude()
    {
        return gebaude;
    }
    
    public String getRaum()
    {
        return raum;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getAnzPlatze()
    {
        return anzPlatze;
    }
    
    
   public String getZimmernummer()
    {
        String zimmernummer;
        int pos;

        pos = raum.lastIndexOf(".") + 1;
        zimmernummer = raum.substring(pos);

        return zimmernummer;

    }

    public String getLaborstock()
    {
    String stock;
    int pos1;
    int pos2;

    pos1 = raum.indexOf(".")+1;
    pos2 = raum.indexOf(".",pos1);
    stock = raum.substring(pos1,pos2);

    return stock;
    
    }

    
    public void printLabor()
    {
        System.out.println(true + " "  + gebaude + " 5." + "stock" + " - " + anzPlatze);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}