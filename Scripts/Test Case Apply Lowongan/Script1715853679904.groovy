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

WebUI.navigateToUrl('https://intermoni.my.id/')

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Intern Monitoring/input_Email_email'), 'dimasmhs@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Intern Monitoring/input_Password_hs-toggle-password'), 'STHXi5z88sQjYwmfOpsi7g==')

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/a_Cari Internship'))

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/a_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/button_Ya, Apply'))

WebUI.click(findTestObject('Object Repository/Page_Intern Monitoring/button_OK'))

WebUI.closeBrowser()

