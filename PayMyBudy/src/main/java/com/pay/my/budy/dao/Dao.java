package com.pay.my.budy.dao;

import java.util.ArrayList;

public interface Dao {
	
	public <T> void add(T t);
	
	public <T> void update(T t);
	
	public <T> void delete(T t);
	
	public <T> void getUser(T t);
	
	public <T> ArrayList<T> getAll();

}
