package model;

/**
 * @author Tafseer Haider
 * 26 Sep. 2020
 */
public enum Status
{
	available ("available"),
	placed("placed"),
	pending("pending"),
    sold("sold");
	
	private String value;
	
	Status (String value)
	{
		this.value = value;
	}

}
