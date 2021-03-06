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

Mobile.startApplication('C:\\Users\\Owner\\Downloads\\Ecommerce Store Demo_v1.4.apk', false)

Mobile.tap(findTestObject('SKIPLOGIN/Tap_Skip Login'), 0)

Mobile.tap(findTestObject('SKIPLOGIN/Tap_Striptiga'), 0)

Mobile.tap(findTestObject('SKIPLOGIN/TitikTiga_MyWishList'), 0)

Mobile.getText(findTestObject('SKIPLOGIN/android.widget.TextView - Login First'), 0)

Mobile.getText(findTestObject('SKIPLOGIN/android.widget.TextView - Login first to view your wishlist'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SKIPLOGIN/Button - Login Now_Mywishlist'), 0)

Mobile.tap(findTestObject('SKIPLOGIN/Tap_Skip Login'), 0)

Mobile.getText(findTestObject('SKIPLOGIN/Text_ELECTRONICS'), 0)

Mobile.tap(findTestObject('SKIPLOGIN/Tap_ViewAllElectronics'), 0)

Mobile.getText(findTestObject('SKIPLOGIN/android.widget.TextView - iPhone XR'), 0)

Mobile.getText(findTestObject('SKIPLOGIN/android.widget.TextView - OPPO K3'), 0)

Mobile.getText(findTestObject('SKIPLOGIN/android.widget.TextView - Xiaomi Mi A3'), 0)

Mobile.tap(findTestObject('SKIPLOGIN/TapBack'), 0)

Mobile.scrollToText('GEEK LIGHTING Mens Zip Up Fleece Hoodie Winter Heavyweight Sherpa Lined Warm Jacket', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('SKIPLOGIN/android.widget.TextView - Search for products'), 0)

Mobile.setText(findTestObject('SKIPLOGIN/TAAP search'), 'OPPO K3', 0)

Mobile.closeApplication()

