package sample.cdi.service;

import java.sql.SQLException;

import javax.enterprise.context.Dependent;

import sample.cdi.dao.HelloDao;

@Dependent
public class HelloService implements SampleInterface {

	HelloDao helloDao = new HelloDao();

	@Override
	public void dataInsert(int id, String name) throws SQLException {
		// TODO Auto-generated method stub
		helloDao.insertWord(id, name);
	}

}
