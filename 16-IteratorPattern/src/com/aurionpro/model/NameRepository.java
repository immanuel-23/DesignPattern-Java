package com.aurionpro.model;

public class NameRepository implements IContainer {
	public String names[] = { "Robert", "John", "Julie", "Lora" };
	

	@Override
	public IIterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	public class NameIterator implements IIterator {
		int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (index < names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}

}
