package com.gdupt.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	
	private static final long serialVersionUID = -8462045705194120945L;
	private long id;
	private String name;
	
	

}
