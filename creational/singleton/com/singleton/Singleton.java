package com.singleton;
public class Singleton {
	private static Singleton instance;
	private Singleton() {
	}

	public static  Singleton getInstance(){
		if(instance==null){
			synchronized (Singleton.class){
				if (instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	protected Object readResolve(){
		return getInstance();
	}
}
