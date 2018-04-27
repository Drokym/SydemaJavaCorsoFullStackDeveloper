/** "Abstract Builder" */

package caffebuilder;

public abstract class CaffeBuilder {

		    protected Caffe caffe;
		    
		    public Caffe getCaffe()
		    { 
		        return caffe; 
		    }
		    public void createNewCaffeProduct()
		    { 
		    	caffe = new Caffe();
		    }
		    
			public void buildCaffe() {
				System.out.println(this.getClass().getSimpleName());
				
			}
		    protected abstract void buildAlcool();
		    protected abstract void buildSugar();
		    protected abstract void buildMilk();
	}

