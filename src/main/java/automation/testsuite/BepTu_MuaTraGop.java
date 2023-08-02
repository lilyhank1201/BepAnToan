package automation.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocator.BepTu_page;
import automation.pageLocator.DanhMucSanPham;

public class BepTu_MuaTraGop extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initChromeDrvier(CT_Account.webURL);
	}

	@Test
	public void MuaTraGopSS () throws InterruptedException {
		DanhMucSanPham Goto = new DanhMucSanPham (driver);
		Goto.GotoDetail();

		BepTu_page TraGopDetail = new BepTu_page (driver);
		TraGopDetail.GotoMuaTraGop();
		
		
		
	}

}