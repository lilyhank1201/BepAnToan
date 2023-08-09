package automation.pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DanhMucSanPham {
	WebDriver driver;

	private By btnDanhMucSanPham = By.xpath("//span[contains(text(),'Danh mục sản phẩm')]");

	private By btnBepTu = By.xpath("//div[contains(text(),'Bếp Từ')]");

	private By HangSanXuatKaiNer = By.xpath("//img[@src='https://static.bepantoan.vn/userfiles/images/456.jpg?w=100']");

	private By btnMuaTraGop = By.xpath("(//span[contains(text(),'Mua trả góp')])[1]");
	private By HangSanXuatBinova = By.xpath(
			"//img[@src='https://static.bepantoan.vn/userfiles/images/Ảnh chụp Màn hình 2021-09-05 lúc 00_21_49.png?w=100']");
	private By HangSanXuat = By
			.xpath("//img[@src='chrome-extension://mcgbeeipkmelnpldkobichboakdfaeon/images/logo-vertical.svg']");

	private By MucgiaNhoHon3tr = By.xpath("//span[contains(text(),'< 3.000.000')]");
	private By Mucgiatu3den5tr = By.xpath("//span[contains(text(),'3.000.000 > 5.000.000')]");
	private By Mucgiatu5den10tr = By.xpath("//span[contains(text(),'5.000.000 > 10.000.000')]");
	private By Mucgiatu10den15tr = By.xpath("//span[contains(text(),'10.000.000 > 15.000.000')]");
	private By MucgiaLonHon15tr = By.xpath("(//span[contains(text(),' > 15.000.000')])[1]");
	private By btnXuatXuChinhHang = By.xpath("//span[contains(text(),'Chính Hãng')]");
	private By btnXuatXuItaly = By.xpath("//span[contains(text(),'Italy')]");
	private By btnMotBep = By.xpath("//span[contains(text(),'1 bếp')]");
	private By btnHaiBep = By.xpath("//span[contains(text(),'2 bếp')]");
	private By btnBepTuPhanLoai = By.xpath("(//span[contains(text(),'Bếp từ')])[1] ");

	public DanhMucSanPham(WebDriver _driver) {
		this.driver = _driver;
	}

	public void DanhMucSP() {
		WebElement clickDanhMucSP = driver.findElement(btnDanhMucSanPham);
		if (clickDanhMucSP.isDisplayed()) {
			clickDanhMucSP.click();
		}
	}
	public void HangSanXuatBinova() {
		WebElement chooseHangSanXuatBinova = driver.findElement(HangSanXuatBinova);
		if (chooseHangSanXuatBinova.isDisplayed()) {
			chooseHangSanXuatBinova.click();
		}
	}

	public void Mucgiatu10den15tr() {
		WebElement chooseMucgiatu10den15tr = driver.findElement(Mucgiatu10den15tr);
		if (chooseMucgiatu10den15tr.isDisplayed()) {
			chooseMucgiatu10den15tr.click();
		}
	}

	public void btnXuatXuItaly() {
		WebElement choosebtnXuatXuItaly = driver.findElement(btnXuatXuItaly);
		if (choosebtnXuatXuItaly.isDisplayed()) {
			choosebtnXuatXuItaly.click();
		}
	}

	public void btnHaiBep() {
		WebElement clickbtnHaiBep = driver.findElement(btnHaiBep);
		if (clickbtnHaiBep.isDisplayed()) {
			clickbtnHaiBep.click();
		}
	}

}
