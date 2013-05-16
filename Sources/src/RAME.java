//
//
//
//

public class RAME {
	

	private int _IdRame;
	private int _NormalCapacity;
	private int _MaxCapacity;
	private int _CurrentCapacity;
	private int _CurrentPosition;
	
	
	
	public RAME(int IdRame, int NormalCapacity, int MaxCapacity,int CurrentCapacity, int CurrentPosition)
	{
		//  super();  ??? WTF? 
		this._IdRame = IdRame;
		this._NormalCapacity = NormalCapacity;
		this._MaxCapacity = MaxCapacity;
		this._CurrentCapacity = CurrentCapacity;
		this._CurrentPosition = CurrentPosition;
	}

				/*---------------- GETTERS / SETTERS ----------------  */
	
	
	

	public int getIdRame()
	{
		return _IdRame;
	}

	public void setIdRame(int IdRame) 
	{
		this._IdRame = IdRame;
	}

	public int getNormalCapacity() 
	{
		return _NormalCapacity;
	}

	public void setNormalCapacity(int NormalCapacity)
	{
		this._NormalCapacity = NormalCapacity;
	}

	public int getMaxCapacity() 
	{
		return _MaxCapacity;
	}

	public void setMaxCapacity(int MaxCapacity) 
	{
		this._MaxCapacity = MaxCapacity;
	}

	public int getCurrentCapacity() 
	{
		return _CurrentCapacity;
	}

	public void setCurrentCapacity(int CurrentCapacity)
	{
		this._CurrentCapacity = CurrentCapacity;
	}

	public int getCurrentPosition() 
	{
		return _CurrentPosition;
	}

	public void setCurrentPosition(int CurrentPosition) 
	{
		this._CurrentPosition = CurrentPosition;
	}
	
				/*---------------- METHODES / FONCTIONS ----------------*/
	
	public void AddRame()
	{
		
		
	}

	public void RemoveRame()
	{
		
	}
	
	public void StopRame() {
	
	}
}
