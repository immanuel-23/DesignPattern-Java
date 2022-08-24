package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.NameRepository.NameIterator;

public class NameRepositoryArrayList implements IContainer {
	ArrayList<String> name = new ArrayList<>(Arrays.asList("Immanuel", "Rahul"));

	@Override
	public IIterator getIterator() {
		// TODO Auto-generated method stub
		return new NameArrayList();

	}

	public class NameArrayList implements IIterator {
		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (index < name.size())
				return true;
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext()) {
				return name.get(index++);
			}
			return null;
		}

	}

}
