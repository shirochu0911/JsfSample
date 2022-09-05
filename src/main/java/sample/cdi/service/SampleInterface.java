package sample.cdi.service;

import java.sql.SQLException;

public interface SampleInterface {

	void dataInsert(int id,String name) throws SQLException;
}
