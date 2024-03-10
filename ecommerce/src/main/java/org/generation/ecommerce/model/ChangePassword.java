package org.generation.ecommerce.model;

public class ChangePassword {
	private String oldPassword;
	private String newPassword;
	
	//SE NECESITAN LOS DOS CONSTRUCTORES
	public ChangePassword() {}
	
	public ChangePassword(String oldPassword, String newPassword) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	@Override
	public String toString() {
		return "ChangePassword [oldPassword=" + oldPassword + ", newPassword=" + newPassword + "]";
	}
	
	
}
