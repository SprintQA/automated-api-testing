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
public class Pet
{
	@JsonProperty
	private Integer id;
	@JsonProperty
	private Category category;
	@JsonProperty
	private String name;
	@JsonProperty
	private List<String> photourls;
	@JsonProperty
	private List<Tag> tags;
	private Status status;	

}
