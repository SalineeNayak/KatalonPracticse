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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Object Repository/Page_Google/button_No thanks'))

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea__q'), 'What is katalon')

WebUI.click(findTestObject('Object Repository/Page_What is katalon - Google Search/h3_Katalon Software Quality Management Platform'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Software Quality Management Platform/div_Documentation'))

WebUI.switchToWindowTitle('About Katalon Platform | Katalon Docs')

WebUI.click(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/ul_About Katalon PlatformGeneral informatio_543605'))

WebUI.click(findTestObject('Object Repository/Page_About Katalon Platform  Katalon Docs/a_Get started with the Katalon Platform'))

WebUI.click(findTestObject('Object Repository/Page_Get started with the Katalon Platform _7ef9e7/a_SeleniumTestNGJUnit Migration to Katalon Studio'))

