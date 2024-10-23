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

WebUI.navigateToUrl('https://www.radarbox.com/')

WebUI.click(findTestObject('Object Repository/Page_AirNav RadarBox - Global Flight Tracki_da097f/path'))

WebUI.click(findTestObject('Object Repository/Page_AirNav RadarBox - Global Flight Tracki_da097f/a_Subscriptions'))

WebUI.click(findTestObject('Object Repository/Page_Subscription Premium Plans - AirNav Ra_bd420d/a_subscriptions'))

WebUI.click(findTestObject('Object Repository/Page_Subscription Premium Plans - AirNav Ra_bd420d/div_Solutions'))

WebUI.click(findTestObject('Object Repository/Page_Subscription Premium Plans - AirNav Ra_bd420d/span_Store'))

WebUI.click(findTestObject('Object Repository/Page_Subscription Premium Plans - AirNav Ra_bd420d/a_Shop Now'))

WebUI.click(findTestObject('Object Repository/Page_RadarBox Store - AirNav RadarBox - Glo_6a4893/img'))

/////////////

