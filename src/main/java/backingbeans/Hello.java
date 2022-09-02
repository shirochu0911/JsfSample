package backingbeans;

import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import dao.HelloDao;

@Named
@RequestScoped
public class Hello {

	private String familyName;
	private String firstName;

    public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String next() throws SQLException {
		
		HelloDao hellodao = new HelloDao();
		hellodao.insertWord(familyName);
		
		setFamilyName(familyName+"今日もいい天気だ");
        return "/faces/output.xhtml";
    }

}
