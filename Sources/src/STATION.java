//
//
// 
//

public class STATION {
	
	private int _IdStation;
	private String _NameStation;
	private int _Signalisation;
	private int _MaxCapacity;
	private int _CurrentCapacity;
	private boolean _Available;
	private int _NumberConnection;
	public STATION next_station;
	public RAME r;
	
	public STATION(String nameStation)
	{
		this._NameStation=nameStation;
	}
	
	public STATION(int IdStation, String NameStation, int Signalisation,
			int MaxCapacity, int CurrentCapacity, boolean Available,
			int NumberConnection) {
		this._IdStation = IdStation;
		this._NameStation = NameStation;
		this._Signalisation = Signalisation;
		this._MaxCapacity = MaxCapacity;
		this._CurrentCapacity = CurrentCapacity;
		this._Available = Available;
		this._NumberConnection = NumberConnection;
	}

	
				/*---------------- GETTERS / SETTERS ----------------  */
	
	public RAME getRame(){
		return r;
	}
	
	public void setRame(RAME rame)
	{
		r=rame;
	}
	
	public int getIdStation() {
		return _IdStation;
	}

	public void setIdStation(int idStation) {
		_IdStation = idStation;
	}

	public String getNameStation() {
		return _NameStation;
	}

	public void setNameStation(String nameStation) {
		_NameStation = nameStation;
	}

	public int getSignalisation() {
		return _Signalisation;
	}

	public void setSignalisation(int signalisation) {
		_Signalisation = signalisation;
	}

	public int getMaxCapacity() {
		return _MaxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		_MaxCapacity = maxCapacity;
	}

	public int getCurrentCapacity() {
		return _CurrentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity) {
		_CurrentCapacity = currentCapacity;
	}
	public void setAvailable(boolean available) {
		_Available = available;
	}

	public int getNumberConnection() {
		return _NumberConnection;
	}

	public void setNumberConnection(int numberConnection) {
		_NumberConnection = numberConnection;
	}
	
	
				/*---------------- METHODES / FONCTIONS ----------------  */
	
	public void AddStation() 
	{
	
	}
	
	

	public boolean isAvailable() 
	{
		return _Available;
	}
	
	public void RemplissageRame()
	{
		int ramePop=r.getCurrentCapacity(); // On récupère les voyageurs présents dans la rame
		
		if((ramePop+_CurrentCapacity) < r.getMaxCapacity() )
		{ // Si la population de la rame + celle de la station ne dépasse pas la capacité max ALORS
			
			r.setCurrentCapacity(_CurrentCapacity+ramePop);
			
		}else /*SINON on calcule le nombre de voyageurs max que l'on peux laissé monter dans la rame
			et on met le reste dans le CurrentCapacity de la station*/
		{
			r.setCurrentCapacity(r.getMaxCapacity()-ramePop);
			_CurrentCapacity-=ramePop;
			
		}
	}
	
	public int getTauxRemplissage()
	{
		// COnnection a la BDD
		return 0;
	}
	
	public void remplissage()
	{
		int tauxRemplissage=getTauxRemplissage();
		
		if((tauxRemplissage+_CurrentCapacity) < this._MaxCapacity )
		{ // Si la population de la station + celle de la station ne dépasse pas la capacité max ALORS
			
			this.setCurrentCapacity(_CurrentCapacity+tauxRemplissage);
			
		}else /*SINON on envoie une nouvelle RAME */
		{
			//envoi new Rame
			
			// FAIRE AVEC UN THROW EXCEPTION
			
		}
		
	}
	
	
	public void vidage()
	{
		int txvidage = 0; // ATTENTION !!!!! Valeur récupéré de la bdd
		int ramePOP=r.getCurrentCapacity();
		r.setCurrentCapacity(ramePOP-txvidage);
		
	}
	

}
