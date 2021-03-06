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

Mobile.tap(findTestObject('Object Repository/SIGNIN - SIGNUP/android.widget.TextView - New here Sign Up'), 0)

Mobile.setText(findTestObject('SIGNIN - SIGNUP/android.widget.EditText_FullName'), 'Nadhira', 0)

Mobile.setText(findTestObject('SIGNIN - SIGNUP/android.widget.EditText_EmailAddress'), 'nadhira@yahoo.com', 0)

Mobile.setText(findTestObject('SIGNIN - SIGNUP/android.widget.EditText_Password'), 'nadhira123', 0)

Mobile.setText(findTestObject('SIGNIN - SIGNUP/android.widget.EditText_ConfirmPassword'), 'nadhira123', 0)

Mobile.tap(findTestObject('Object Repository/SIGNIN - SIGNUP/android.widget.Button - SIGN UP'), 0)

Mobile.tap(findTestObject('Object Repository/SIGNIN - SIGNUP/android.widget.TextView - Already have account Sign In'), 0)

Mobile.setText(findTestObject('SIGNIN - SIGNUP/android.widget.EditText_SignInEmail'), 'nadhira@yahoo.com', 0)

Mobile.setText(findTestObject('SIGNIN - SIGNUP/android.widget.EditText_SignInPassword'), 'nadhira123', 0)

Mobile.tap(findTestObject('Object Repository/SIGNIN - SIGNUP/android.widget.Button - SIGN IN'), 0)


Mobile.closeApplication()

