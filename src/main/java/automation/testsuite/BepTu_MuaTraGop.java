package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocator.BepTu_page;
import automation.pageLocator.DanhMucSanPham;

public class BepTu_MuaTraGop extends CommonBase {

	private WebDriver driver;
	private BepTu_page GotoBepTu;

	@BeforeTest
	public void openChromeDriver() {  
		driver = initChromeDrvier(CT_Account.webURL);
	}

	@Test
	public void MuaTraGopSS() throws InterruptedException {
		DanhMucSanPham Goto = new DanhMucSanPham(driver);
		Goto.GotoDetail();
		GotoBepTu = new BepTu_page(driver); 
		GotoBepTu.clickSanPhamBepTuBinova();
		GotoBepTu.clickMuaTraGop();
		assertTrue(GotoBepTu.isDangkymuatragopPopupDisplayed());

	}

}