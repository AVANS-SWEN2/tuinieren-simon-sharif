public class TuinDomotica {
    private boolean daglicht;
    private boolean regen;
    private Schakelaar slimmeschakelaar;
    private Sproeier sproeier;
    
    public TuinDomotica() {
        super();
        sproeier = new Sproeier();
        slimmeschakelaar = Schakelaar.AUTOMATISCH;
    }
    
    public void domoticaRun() {
    	switch(slimmeschakelaar) {
    	
    	case AUTOMATISCH: 
    		if (daglicht == false && regen == false) {
    			sproeier.sproeien();
    		}
    		break;
    	
    	case AAN:
			sproeier.sproeien();
    		break;
    	
    	case UIT:
    		break;
    	}
    }
    

	public void setDaglicht(boolean daglicht) {
		this.daglicht = daglicht;
	}
	
    public boolean getDaglicht() {
        return daglicht;
    }

    public boolean getRegen() {
        return regen;
    }
    public void setRegen(Boolean regen) {
        this.regen = regen;
    }

    public Schakelaar getSlimmeschakelaar() {
        return slimmeschakelaar;
    }

    public void setSlimmeschakelaar(Schakelaar slimmeschakelaar) {
        this.slimmeschakelaar = slimmeschakelaar;
    }
}
