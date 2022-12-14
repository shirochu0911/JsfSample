package sample.cdi.backingbean;

import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import sample.cdi.service.SampleInterface;

@Named
@RequestScoped
public class HelloBackingBean {
	
	@Inject
	private SampleInterface sampleInterface;

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String next() throws SQLException {
		
		this.sampleInterface.dataInsert(id, name);
		System.out.println("HellobackingBean");
        return "/view/output.xhtml";
    }
	
	public String back() {
		return "/view/input.xhtml";
	}

}
