package edu.bookcrudproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import edu.bookcrudproject.constraint.NameContains;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="book")
@Setter
@Getter
public class Book {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	@NotNull(message="name is required")
	@NameContains(substring="book", message="name should contain book name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="pages")
	private Integer pages;
}
