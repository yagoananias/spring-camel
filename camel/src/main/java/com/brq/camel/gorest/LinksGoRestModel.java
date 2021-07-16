package com.brq.camel.gorest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinksGoRestModel {
	
	private String previous;
	private String current;
	private String next;

}
