package ?dev3;

public class Student extends User {
	private String password;
	private String address;
	private String email;

	public Student() {

	}

	public Student(String password, String address, String email) {
		this.password = password;
		this.address = address;
		this.email = email;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
