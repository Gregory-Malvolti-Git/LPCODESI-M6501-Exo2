
public class CarteCredit {
	protected double plafond;
	protected double encours;
	
	public boolean autorisePaiement(double montant) {
		return (this.encours + montant)<=plafond;
	}
}
