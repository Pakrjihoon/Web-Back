package vo;

import java.sql.Date;

public class Group {
	private int groupId;
	private String name;
	private Date debutDate;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return groupId+") "+ name + "/ 데뷔날짜 : "+debutDate;
	}
	public Group() {
		
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}
	
}
