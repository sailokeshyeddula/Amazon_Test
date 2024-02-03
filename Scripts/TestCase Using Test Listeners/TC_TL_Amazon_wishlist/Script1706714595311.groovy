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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://www.amazon.com/')

//WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

//WebUI.setText(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon Sign-In/input_email'), 'lokeshsai674@gmail.com')

//WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon Sign-In/inputcontinue'))

//WebUI.setEncryptedText(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon Sign-In/input_password'), 'Kil7TJn2SLijfPVlUCkevA==')

//WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'da vinci code book')

WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon.com  da vinci code book/span_The Da Vinci Code (Robert Langdon)'))

WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_The Da Vinci Code (Robert Langdon) Bro_e0923b/input_submit.add-to-registry.wishlist'))

WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_The Da Vinci Code (Robert Langdon) Bro_e0923b/a_View Your List'))

//WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon.com/a_All'))

//WebUI.click(findTestObject('Object Repository/TC_TL_Amazon_wishlist/Page_Amazon.com/a_Sign Out'))

//WebUI.closeBrowser()

