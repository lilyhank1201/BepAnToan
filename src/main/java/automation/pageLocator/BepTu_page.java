package automation.pageLocator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BepTu_page {
	WebElement driver;

	@FindBy(xpath = "//div[@class='relative z-10 md:pt-4 pt-[10px] px-3 pb-3 xl:pt-8']")
	private WebElement list;

	@FindBy(xpath = "//h4[contains(text(),'Bếp từ Binova Bi-868-IT')]")
	private WebElement btnSanPhamBếptừBinova;

	@FindBy(xpath = "https://bepantoan.vn/bep-tu-binova-bi-868-it")
	private WebElement detail;
	@FindBy(xpath = "(//span[contains(text(),'Mua trả góp')])[1]")
	private WebElement btnMuaTraGop;

	@FindBy(xpath = "//h3[contains(text(),'Đăng kí mua trả góp')]")
	private WebElement Đăngkímuatrảgóp;

	public BepTu_page(WebDriver driver) {
		this.driver = (WebElement) driver;
		PageFactory.initElements(driver, this);
	}

	public void GotoMuaTraGop( ) {
		btnSanPhamBếptừBinova.click();
		// display mafn hifnh detail
		((JavascriptExecutor) driver).executeScript("window.open('https://bepantoan.vn/bep-tu-binova-bi-868-it)");
		btnMuaTraGop.click();
		Alert alert = ((WebDriver) driver).switchTo().alert();

	}
}
