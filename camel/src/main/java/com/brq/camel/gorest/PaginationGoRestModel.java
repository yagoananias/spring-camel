package com.brq.camel.gorest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationGoRestModel {
	
	private int total;
	private int pages;
	private int page;
	private int limit;
	
	private LinksGoRestModel links;

}
