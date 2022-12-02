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

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Masuk (14)'))

WebUI.setText(findTestObject('Object Repository/Page_MythAuth/input_Email or username_login (14)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MythAuth/input_Password_password (14)'), 'eBUAS/aLjujCfzO2w9HVgw==')

WebUI.click(findTestObject('Object Repository/Page_MythAuth/button_Login (13)'))

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Admin (14)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  RT WONOREJO/a_Data Warga (5)'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/a_Add (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/input_Nama Lengkap_namaLengkap (3)'), 'warga create')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/input_NIK_nik (1)'), '111')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/input_KK_kk (1)'), '11')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/input_Alamat_alamat (2)'), 'jalan warga')

WebUI.click(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/button_Tambah (1)'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Warga  RT WONOREJO/div_berhasil tambah data warga (1)'))

WebUI.closeBrowser()

