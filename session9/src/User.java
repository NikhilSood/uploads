
public class User {
	
	int uid;
	String name;
	String phn;
	String email;
	String address;
	public User() {
	}
	public User(int uid, String name, String phn, String email, String address) {
		this.uid = uid;
		this.name = name;
		this.phn = phn;
		this.email = email;
		this.address = address;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", phn=" + phn + ", email=" + email + ", address=" + address
				+ "]";
	}
	
	
	

}
