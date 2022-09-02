package javabeans;

public class Memory {

	private String word;
	private java.sql.Timestamp createDate;
	
	public Memory() {
		
	}
	
	public Memory(String word, java.sql.Timestamp createDate) {
		super();
		this.word = word;
		this.createDate = createDate;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public java.sql.Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.sql.Timestamp createDate) {
		this.createDate = createDate;
	}


	
	
}
