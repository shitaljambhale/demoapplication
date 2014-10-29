package SeleniumTests;

import org.openqa.selenium.ie.InternetExplorerDriver;
import pageFactory.CompanyPage;
import pageFactory.CareersPage;
import pageFactory.HomePage;
import pageFactory.RuralSourcingPage;
import pageFactory.LocationsPage;
import pageFactory.LeadershipPage;
import pageFactory.ClientsPage;
import utilities.Library;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
     /*
     Base Class to load all Page Objects with the WebElements
      */

@ContextConfiguration(locations = {"classpath*:selenium-applicationContext.xml"})
public class BaseConfigurationTest extends AbstractTestNGSpringContextTests {


    @Autowired
    public FirefoxDriver driver;


    @Autowired
    public Library library;

    public static final String BASE_URL = "${BaseURL}";


    public RuralSourcingPage ruralPage;
    public CareersPage careersPage;
    public ClientsPage clientPage;
    public HomePage homePage;
    public CompanyPage companyPage;
    public LocationsPage locationsPage;
    public LeadershipPage leadershipPage;

    public String baseURL;

    @Value(BASE_URL)
    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;

    }

    @BeforeClass
    public void setUp() {
        setUpAllPageObjects();
    }

    public static WebElement company_link;

    public void setUpAllPageObjects() {

        ruralPage = PageFactory.initElements(driver, RuralSourcingPage.class);
        clientPage = PageFactory.initElements(driver, ClientsPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        companyPage = PageFactory.initElements(driver, CompanyPage.class);
        careersPage = PageFactory.initElements(driver, CareersPage.class);
        locationsPage = PageFactory.initElements(driver, LocationsPage.class);
        leadershipPage = PageFactory.initElements(driver, LeadershipPage.class);
    }


}
