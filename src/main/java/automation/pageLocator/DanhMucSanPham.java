package automation.pageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DanhMucSanPham {
	WebElement driver;
	@FindBy(xpath = "//span[contains(text(),'Danh mục sản phẩm')]")
	private WebElement btnDanhMucSanPham;
	@FindBy(xpath = "//div[contains(text(),'Bếp Từ')]")
	private WebElement btnBepTu;
	@FindBy(xpath = "//img[@src='https://static.bepantoan.vn/userfiles/images/456.jpg?w=100']")
	private WebElement HangSanXuatKaiNer;
	@FindBy(xpath = "//img[@src='https://static.bepantoan.vn/userfiles/images/Ảnh chụp Màn hình 2021-09-05 lúc 00_21_49.png?w=100']")
	private WebElement HangSanXuatBinova;
	@FindBy(xpath = "//img[@src='chrome-extension://mcgbeeipkmelnpldkobichboakdfaeon/images/logo-vertical.svg']")
	private WebElement HangSanXuat;
	@FindBy(xpath = "//span[contains(text(),'< 3.000.000')]")
	private WebElement MucgiaNhoHon3tr;
	@FindBy(xpath = "//span[contains(text(),'3.000.000 > 5.000.000')]")
	private WebElement Mucgiatu3den5tr;
	@FindBy(xpath = "//span[contains(text(),'5.000.000 > 10.000.000')]")
	private WebElement Mucgiatu5den10tr;
	@FindBy(xpath = "//span[contains(text(),'10.000.000 > 15.000.000')]")
	private WebElement Mucgiatu10den15tr;
	@FindBy(xpath = "(//span[contains(text(),' > 15.000.000')])[1]")
	private WebElement MucgiaLonHon15tr;
	@FindBy(xpath = "//span[contains(text(),'Chính Hãng')]")
	private WebElement btnXuatXuChinhHang; 
	@FindBy(xpath = "//span[contains(text(),'Italy')]")
	private WebElement btnXuatXuItaly;
	@FindBy(xpath = "//span[contains(text(),'1 bếp')]")
	private WebElement btnMotBep; 
	@FindBy(xpath = "//span[contains(text(),'2 bếp')]")
	private WebElement btnHaiBep;
	@FindBy(xpath = "(//span[contains(text(),'Bếp từ')])[1] ")
	private WebElement btnBepTuPhanLoai; 

	public DanhMucSanPham(WebDriver driver) {
		this.driver = (WebElement) driver;
		PageFactory.initElements(driver, this);
	}

	public void GotoDetail( ) throws InterruptedException {
		btnDanhMucSanPham.click();
		btnBepTu.click();
		Thread.sleep(2000);
		HangSanXuatBinova.click();
		Thread.sleep(2000);

		Mucgiatu10den15tr.click();
		Thread.sleep(2000);

		btnXuatXuItaly.click();
		Thread.sleep(2000);

		btnHaiBep.click();		
		Thread.sleep(2000);

		btnBepTuPhanLoai.click();  
		
	}
}
