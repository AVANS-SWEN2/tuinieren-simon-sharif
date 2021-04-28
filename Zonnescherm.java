
public class Zonnescherm {
	private boolean regen;
	private boolean daglicht;
	private boolean stand;

	public Zonnescherm() {
		stand = false;
	}

	public boolean getDaglicht() {
		return daglicht;
	}

	public void setDaglicht(boolean daglicht) {
		this.daglicht = daglicht;
	}

	public boolean getRegen() {
		return regen;
	}

	public void setRegen(Boolean regen) {
		this.regen = regen;
	}

	public void setStand(boolean stand) {
		this.stand = stand;
	}
	
	public void zonneschermRun() {
		if (stand == true) {
			System.out.println("Zonnescherm staat aan.");
		} 
		else {
			System.out.println("Zonnescherm staat uit.");

		}
	}
}
