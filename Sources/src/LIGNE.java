//
//
//  
//
//


public class LIGNE {
	public int _IdLigne;
	public String _Name;
	public int BetweenStationTime[];
	public  STATION TabStation[];
	
	
	
	public LIGNE(int IdLigne, String Name, int[] Time,STATION[] tab)
	{
		//super();
		this._IdLigne = IdLigne;
		this._Name = Name;
		BetweenStationTime = Time;
		TabStation = tab;
	}

	/*---------------- GETTERS / SETTERS ----------------  */
	
	public int getIdLigne() 
	{
		return _IdLigne;
	}

	public void setIdLigne(int IdLigne)
	{
		this._IdLigne = IdLigne;
	}

	public String getName() 
	{
		return _Name;
	}

	public void setName(String Name) 
	{
		this._Name = Name;
	}

	public int[] getBetweenStationTime() 
	{
		return BetweenStationTime;
	}

	public void setBetweenStationTime(int[] betweenStationTime) 
	{
		BetweenStationTime = betweenStationTime;
	}

	public STATION[] getTabStation() 
	{
		return TabStation;
	}

	public void setTabStation(STATION[] tabStation) 
	{
		TabStation = tabStation;
	}
	
	
	
	/*---------------- METHODES / FONCTIONS ----------------  */
	
	
	public void ConstructTabStation() 
	{
	
	}
	
	

	public void ConstructTabBST() 
	{
	
	}
}
