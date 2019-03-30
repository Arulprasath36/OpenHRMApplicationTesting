package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Page_Objects {
	
	@FindBy(id="searchSystemUser_userName")
	public static WebElement userName;
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userRole;
	@FindBy(id="searchSystemUser_status")
	public static WebElement userStatus;
	@FindBy(id="searchBtn")
	public static WebElement searchButton;
	@FindBy(xpath="//tr/td[3]")
	public static WebElement userRoleValue;
	@FindBy(xpath="//tr/td[5]")
	public static WebElement userStatusValue;
	@FindBy(linkText="Admin")
	public static WebElement adminLink;
	@FindBy(linkText="User Management")
	public static WebElement userManagementLink;
	@FindBy(linkText="Users")
	public static WebElement usersLink;	

}
