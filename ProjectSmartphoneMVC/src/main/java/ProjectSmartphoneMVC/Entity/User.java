package ProjectSmartphoneMVC.Entity;

public class User {
	private int id;
	private String fullname;
	private String email;
	private String phone_number;
	private String address;
	private String userName;
	private String password;
	private int role_id ;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int id, String fullname, String email, String phone_number, String address, String userName,
			String password, int role_id) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.role_id = role_id;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
	
}
