

public class LEVEL1 extends LEVEL
{
     RECHTECK[] boden;
    
    public LEVEL1()
    {
        boden=new RECHTECK[7];
        
        boden[0].setzeMittelpunkt(10, -10);
        boden[1].setzeMittelpunkt(13, -10);
        boden[2].setzeMittelpunkt(16, -10);
        boden[3].setzeMittelpunkt(19, -10);
        boden[4].setzeMittelpunkt(21, -10);
        boden[5].setzeMittelpunkt(24, -10);
        boden[6].setzeMittelpunkt(27, -10);
        
        boden[0].setzeGroesse(3, 2);
        boden[1].setzeGroesse(3, 2);
        boden[2].setzeGroesse(3, 2);
        boden[3].setzeGroesse(3, 2);
        boden[4].setzeGroesse(3, 2);
        boden[5].setzeGroesse(3, 2);
        boden[6].setzeGroesse(3, 2);
        
       
    }
    
    
 
}
