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

//WebUI.callTestCase(findTestCase('TC_Amazon_Home_002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.amazon.com/?ref_=nav_ya_signin')

WebUI.setText(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'Sony alpha')

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com. Spend less. Smile more/div_sony alpha 7 iii'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com  sony alpha 7 iii/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com  sony alpha 7 iii/a_1                                        _aa7e84'))

WebUI.rightClick(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com Shopping Cart/div_Sony Alpha a7 III 24.2MP Full Frame Mir_fd4d59'))

WebUI.rightClick(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com Shopping Cart/ul_Sony Alpha a7 III 24.2MP Full Frame Mirr_97b5a6'))

WebUI.click(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com Shopping Cart/h2_Your Items'))

WebUI.rightClick(findTestObject('Object Repository/TC_Amazon_Home_004_OR/Page_Amazon.com Shopping Cart/div_Sony Alpha a7 III 24.2MP Full Frame Mir_94049c'))

//WebUI.closeBrowser()

