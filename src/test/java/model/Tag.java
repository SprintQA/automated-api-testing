package model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tafseer Haider
 * 26 Sep. 2020
 */
@Data
@Builder
public class Tag
{
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	
	public Tag (Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
