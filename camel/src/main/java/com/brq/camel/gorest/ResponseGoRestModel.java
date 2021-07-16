package com.brq.camel.gorest;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseGoRestModel {
	
	private MetaGoRestModel meta;
	private ArrayList<DataGoRestModel> data;

}
