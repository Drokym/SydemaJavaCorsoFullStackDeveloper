package starbuilder;

import geometria.*;

public abstract class StarBuilder{

	protected Figura figura;
	
	public Figura getStar()
    { 
        return figura; 
    }
    public void createNewStar()
    { 
    	figura = new FiguraComposta();
    }
    
    public abstract void buildPoligono();
    public abstract void buildPunte();
}
