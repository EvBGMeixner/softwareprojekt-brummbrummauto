
public class Jump extends SPIEL
{
    
    RECHTECK[] boden;
    
    
    public Jump()
    {
        super();
        
        LEVEL1();
        zeigeKoordinatensystem(true);
    }
    
    
    
    public void LEVEL1()
    {
        boden=new RECHTECK[7];
        
        for (int i=0; i< boden.length;i++){
            boden[i]=new RECHTECK();
            boden[i].setzeGroesse(5,2);
            boden[i].setzeFarbe("weiß");
            
            
        }
        
        boden[0].setzeMittelpunkt(-15, -10);
        boden[1].setzeMittelpunkt(-10, -10);
        boden[2].setzeMittelpunkt(-5, -10);
        boden[3].setzeMittelpunkt(0, -10);
        boden[4].setzeMittelpunkt(5, -10);
        boden[5].setzeMittelpunkt(10, -10);
        boden[6].setzeMittelpunkt(15, -10);
        
        
                
       
    }
}
