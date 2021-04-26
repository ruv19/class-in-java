
package javaapplication4;


public class bisiklet {
    
    insan binmisInsan;
    
    public bisiklet()
    {
        binmisInsan=null;
    }
    
    
    public bisiklet(insan gelenInsan)
    {
        binmisInsan=gelenInsan;
    }
    public void bin(insan gelenInsan) {
        
        if(binmisInsan== null)
        {
            binmisInsan=gelenInsan;
            System.out.println(binmisInsan.getIsim()+" bisiklete binmemiş!!! ");
        }
        else
        {
            System.out.println("Zaten "+binmisInsan.getIsim()+" binmiş.");
        }
    }
  
}