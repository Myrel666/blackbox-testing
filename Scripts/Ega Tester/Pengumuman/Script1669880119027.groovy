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

WebUI.click(findTestObject('Object Repository/Pengumuman/Page_LandingPage  Mlajah/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Pengumuman/Page_MythAuth/input_Email or username_login'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Pengumuman/Page_MythAuth/input_Password_password'), 'eBUAS/aLjujCfzO2w9HVgw==')

WebUI.click(findTestObject('Object Repository/Pengumuman/Page_MythAuth/button_Login'))

WebUI.click(findTestObject('Object Repository/Pengumuman/Page_LandingPage  Mlajah/a_Admin'))

WebUI.click(findTestObject('Object Repository/Pengumuman/Page_Dashboard  RT WONOREJO/span_Pengumuman'))

WebUI.click(findTestObject('Object Repository/Pengumuman/Page_Pengumuman  RT WONOREJO/a_Tambah Pengumuman'))

WebUI.setText(findTestObject('Object Repository/Pengumuman/Page_Pengumuman  RT WONOREJO/input_Judul_judul'), 'Vaksin Massal')

WebUI.setText(findTestObject('Object Repository/Pengumuman/Page_Pengumuman  RT WONOREJO/textarea_Deskripsi_deskripsi'), 
    'Vaksin massal akan dilaksanakan di balai RT seharian non-stop bagi lansia harap segera vaksin!!!')

WebUI.click(findTestObject('Object Repository/Pengumuman/Page_Pengumuman  RT WONOREJO/button_Tambah'))

WebUI.closeBrowser()

