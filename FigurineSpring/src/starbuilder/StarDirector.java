package starbuilder;

import geometria.*;

public class StarDirector {
	
private StarBuilder starBuilder;
    
    public void setStarBuilder(StarBuilder sb)
    {
    	starBuilder = sb; 
    }
    public Figura getFigura()
    { 
        return starBuilder.getStar(); 
    }
    
    public void constructStar()
    {
    	starBuilder.createNewStar();
    	starBuilder.buildPoligono();
    	starBuilder.buildPunte();

}

}
