package automation.pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BepTu_page {
	WebDriver driver;

	private By btnMuaTraGop = By.xpath("(//span[contains(text(),'Mua trả góp')])[1]");
	private By list = By.xpath("//div[@class='relative z-10 md:pt-4 pt-[10px] px-3 pb-3 xl:pt-8']");
	private By btnSanPhamBepTuBinova = By.xpath("//h4[contains(text(),'Bếp từ Binova Bi-868-IT')]");
	private static String detailProductURL = "https://bepantoan.vn/bep-tu-binova-bi-868-it";
	private By Dangkymuatragop = By.xpath("//h3[contains(text(),'Đăng kí mua trả góp')]");

	public  BepTu_page(WebDriver _driver) {
		this.driver = _driver;
	}  

	public void clickSanPhamBepTuBinova() {
		WebElement ProductBinova = driver.findElement(btnSanPhamBepTuBinova);
		if (ProductBinova.isDisplayed()) {
			ProductBinova.click();
		}
	}

	// display mafn hifnh detail
	public static String getDetailProductURL() {
		return detailProductURL;

	}

	public void clickMuaTraGop() {
		WebElement muaTraGopButton = driver.findElement(btnMuaTraGop);
		if (muaTraGopButton.isDisplayed()) {
			muaTraGopButton.click();
		}
	}

	public boolean isDangkymuatragopPopupDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Dangkymuatragop));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}}