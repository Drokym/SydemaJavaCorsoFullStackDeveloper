package caffebuilder;

/** "Director" */
public class Barman
{
    private CaffeBuilder caffeBuilder;
    
    public void setCaffeBuilder(CaffeBuilder cb)
    {
    	caffeBuilder = cb; 
    }
    public Caffe getCaffe()
    { 
        return caffeBuilder.getCaffe(); 
    }
    
    public void constructCaffe()
    {
    	caffeBuilder.createNewCaffeProduct();
    	caffeBuilder.buildCaffe();
    	caffeBuilder.buildAlcool();
    	caffeBuilder.buildSugar();
    	caffeBuilder.buildMilk();
}
    
}
    
    
    
    