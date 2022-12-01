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

WebUI.navigateToUrl('http://ega.infinityid.my.id/')

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Masuk (8)'))

WebUI.setText(findTestObject('Object Repository/Page_MythAuth/input_Email or username_login (8)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MythAuth/input_Password_password (8)'), 'eBUAS/aLjujCfzO2w9HVgw==')

WebUI.click(findTestObject('Object Repository/Page_MythAuth/button_Login (7)'))

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Admin (8)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  RT WONOREJO/a_Pengumuman (3)'))

WebUI.click(findTestObject('Object Repository/Page_Pengumuman  RT WONOREJO/i_test create pengumuman_fa fa-pencil (1)'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Pengumuman  RT WONOREJO/input_Judul_judul (5)'))

WebUI.setText(findTestObject('Object Repository/Page_Pengumuman  RT WONOREJO/input_Judul_judul (5)'), 'test update')

WebUI.setText(findTestObject('Object Repository/Page_Pengumuman  RT WONOREJO/textarea_test create pengumuman (1)'), 'test update pengumuman')

WebUI.click(findTestObject('Object Repository/Page_Pengumuman  RT WONOREJO/button_Ubah (3)'))

WebUI.click(findTestObject('Object Repository/Page_Pengumuman  RT WONOREJO/div_berhasil edit pengumuman (3)'))

WebUI.closeBrowser()

