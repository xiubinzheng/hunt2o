package com.freedom.h2o.service;

import java.util.ArrayList;
import java.util.Date;

import com.freedom.h2o.bean.Address;
import com.freedom.h2o.bean.Fountain;

public class FountainSearchService {

	private static Fountain[] fountains = {
			new Fountain(3, "Big fish fountain", "fishy", new Date()),
			new Fountain(1, "Mary Williams", "curry", new Date()),
			new Fountain(2, "Jim Smith", "broccoli", new Date()),
			new Fountain(1, "Beverly Harris", "carrot", new Date()),
			new Fountain(2, "Thomas Frank", "angel", new Date()),
			new Fountain(3, "Jim Davidson", "asian", new Date()) };

	public ArrayList<Fountain> searchByfountainName(String fountainName) {
		ArrayList<Fountain> resultList = new ArrayList<Fountain>();

		for (int i = 0; i < fountains.length; i++) {
			if (fountains[i].getFountainName().toUpperCase()
					.indexOf(fountainName.toUpperCase()) != -1) {
				resultList.add(fountains[i]);
			}
		}
		return resultList;

	}

}
