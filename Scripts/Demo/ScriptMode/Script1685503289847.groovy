import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import io.github.bonigarcia.wdm.WebDriverManager as WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\salin\\Downloads\\chromedriver_win32\\chromedriver.exe')

// Setup WebDriverManager --TEST-- to download and configure ChromeDriver
WebDriverManager.chromedriver().setup()

// Set Chrome options
ChromeOptions options = new ChromeOptions()

options.addArguments('--headless')

// Create WebDriver instance with Chrome options
WebDriver driver = new ChromeDriver(options)

// Set the WebDriver for Katalon Studio
DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.delay(10)

// Get the title of the page
WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/h6_Dashboard'), 10)

String pageTitle = WebUI.getText(findTestObject('Object Repository/Page_OrangeHRM/h6_Dashboard'))

println('Page Title: ' + pageTitle)

WebUI.closeBrowser()

