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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://www.sociolla.com')

WebUI.click(findTestObject('Object Repository/login/Page_Situs Kosmetik Terlengkap  Terpercaya _e5bd73/button_'))

WebUI.click(findTestObject('Object Repository/login/Page_Situs Kosmetik Terlengkap  Terpercaya _e5bd73/a_LOGIN WITH'))

WebUI.setText(findTestObject('Object Repository/login/Page_Situs Kosmetik Terlengkap  Terpercaya _e5bd73/input_Alamat Email  Username_username'), 
    'iostreamstr@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Situs Kosmetik Terlengkap  Terpercaya _e5bd73/input_Password_password'), 
    '/NceyljXOv6QoxHbGCe7Ww==')

WebUI.click(findTestObject('login/Page_Situs Kosmetik Terlengkap  Terpercaya _e5bd73/button_MASUK KE SOCIOLLA'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/div_Username  Email  Password  salah'), 
    0)

WebUI.closeBrowser()

