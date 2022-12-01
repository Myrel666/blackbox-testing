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

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_LandingPage  Mlajah/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Surat Masuk/Page_MythAuth/input_Email or username_login'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Surat Masuk/Page_MythAuth/input_Password_password'), 'eBUAS/aLjujCfzO2w9HVgw==')

WebUI.sendKeys(findTestObject('Object Repository/Surat Masuk/Page_MythAuth/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_MythAuth/button_Login'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_LandingPage  Mlajah/a_Admin'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Dashboard  RT WONOREJO/a_Surat'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Dashboard  RT WONOREJO/a_Surat Masuk'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/a_Tambah Surat'))

WebUI.setText(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Nomor Surat_noSurat'), '01')

WebUI.setText(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Perihal_perihal'), 'Undangan Rapat Desa')

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Asal_asal'))

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Tanggal_tgl'))

WebUI.setText(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/input_Asal_asal'), 'Palembang')

WebUI.click(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/button_Tambah'))

WebUI.doubleClick(findTestObject('Object Repository/Surat Masuk/Page_Surat Masuk  RT WONOREJO/td_Undangan Rapat Desa'))

