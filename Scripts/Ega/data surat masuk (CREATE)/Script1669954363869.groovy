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

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Masuk (25)'))

WebUI.setText(findTestObject('Object Repository/Page_MythAuth/input_Email or username_login (25)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MythAuth/input_Password_password (25)'), 'eBUAS/aLjujCfzO2w9HVgw==')

WebUI.click(findTestObject('Object Repository/Page_MythAuth/button_Login (24)'))

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Admin (24)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  RT WONOREJO/a_Surat (8)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  RT WONOREJO/a_Surat Masuk (5)'))

WebUI.click(findTestObject('Object Repository/Page_Surat Masuk  RT WONOREJO/a_Tambah Surat (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Surat Masuk  RT WONOREJO/input_Nomor Surat_noSurat (2)'), '001')

WebUI.setText(findTestObject('Object Repository/Page_Surat Masuk  RT WONOREJO/input_Perihal_perihal (3)'), 'Senam Massal')

WebUI.click(findTestObject('Object Repository/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Surat Masuk  RT WONOREJO/input_Asal_asal (2)'), 'Balai Desa')

WebUI.click(findTestObject('Object Repository/Page_Surat Masuk  RT WONOREJO/button_Tambah (2)'))

WebUI.closeBrowser()

