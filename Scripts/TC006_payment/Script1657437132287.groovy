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

WebUI.openBrowser('https://sayurku.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Sayurku - Sayurku.com/loginButton1'))

WebUI.setText(findTestObject('Page_Login - Sayurku.com/inputEmailTextElement1'), 'lusianadina114@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - Sayurku.com/inputPasswordtextElement1'), 'rb2CInWgqAcWJK5F8lpFybl5Q7jl9GH3')

WebUI.click(findTestObject('Page_Login - Sayurku.com/loginBtn1'))

WebUI.click(findTestObject('Page_Profil - Sayurku.com/produkCategoryButton'))

WebUI.click(findTestObject('Page_Sayur - Sayurku.com/categoriIkanButton'))

WebUI.click(findTestObject('Page_Sayur - Sayurku.com/textHargaRp. 22.500'))

WebUI.click(findTestObject('Page_Sayur - Sayurku.com/ikanAsinPedaProduk'))

WebUI.click(findTestObject('Page_Ikan Asin Peda 500gr each - Sayurku.com/ikanAsinPedaProduct'))

WebUI.click(findTestObject('Page_Ikan Asin Peda 500gr each - Sayurku.com/ikanAsinProduct'))

WebUI.click(findTestObject('Page_Ikan Asin Peda 500gr each - Sayurku.com/ikanAsinImg'))

WebUI.click(findTestObject('Page_Ikan Asin Peda 500gr each - Sayurku.com/harga'))

WebUI.click(findTestObject('Object Repository/Page_Ikan Asin Peda 500gr each - Sayurku.com/td_Rp. 22.500  255 gram'))

WebUI.setText(findTestObject('Page_Ikan Asin Peda 500gr each - Sayurku.com/inputQuantity'), '2')

WebUI.click(findTestObject('Page_List Order - Sayurku.com/listOrder'))

WebUI.click(findTestObject('Page_List Order - Sayurku.com/ikanAsinPeda'))

WebUI.click(findTestObject('Object Repository/Page_Ikan Asin Peda 500gr each - Sayurku.com/img_1'))

WebUI.click(findTestObject('Page_List Order - Sayurku.com/Ikan Asin Peda 500gr eachRp. 22.500255 gram'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/input__txttglkirim'))

WebUI.click(findTestObject('Object Repository/Page_List Order - Sayurku.com/td_45.000'))

WebUI.click(findTestObject('Page_List Order - Sayurku.com/totalHargaRp. 45.000'))

WebUI.click(findTestObject('Page_List Order - Sayurku.com/kirimOrderButton'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/span_Form Order'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/td_Ikan Asin Peda 500gr each 255 gram'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/td_2'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/td_Rp. 22.500'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/td_Rp. 45.000'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/td_Grand Total'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/td_Rp. 45.000'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/h2_KIRIM ORDER SEKARANG'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/p_Silahkan lengkapi form berikut'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/div_Nama Pemesantes12'))

WebUI.click(findTestObject('Object Repository/Page_Form Order - Sayurku.com/div_Telepon081393048412'))

WebUI.setText(findTestObject('Page_Form Order - Sayurku.com/noteArea'), 'yang bagus ya')

WebUI.click(findTestObject('Page_Form Order - Sayurku.com/orderButton'))

WebUI.closeBrowser()

