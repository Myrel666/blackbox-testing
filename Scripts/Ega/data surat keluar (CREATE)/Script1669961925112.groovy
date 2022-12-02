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

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Masuk (32)'))

WebUI.setText(findTestObject('Object Repository/Page_MythAuth/input_Email or username_login (32)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MythAuth/input_Password_password (32)'), 'eBUAS/aLjujCfzO2w9HVgw==')

WebUI.click(findTestObject('Object Repository/Page_MythAuth/button_Login (31)'))

WebUI.click(findTestObject('Object Repository/Page_LandingPage  Mlajah/a_Admin (30)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  RT WONOREJO/a_Surat (14)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  RT WONOREJO/a_Surat Keluar (3)'))

WebUI.click(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/a_Tambah Surat'))

WebUI.setText(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/input_Nomor Surat_noSurat (1)'), '002')

WebUI.setText(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/input_Perihal_perihal (2)'), 'Undangan senam')

WebUI.click(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/input_Tanggal_tgl (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/input_Tujuan_asal (1)'), 'Kantor Lurah')

WebUI.click(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/button_Tambah (1)'))

WebUI.click(findTestObject('Object Repository/Page_Surat Keluar  RT WONOREJO/div_Data surat berhasil ditambahkan (1)'))

WebUI.closeBrowser()

