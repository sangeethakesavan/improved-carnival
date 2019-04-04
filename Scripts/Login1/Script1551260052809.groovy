import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Login in to the 2020 PRT Page')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:4200/')

WebUI.setText(findTestObject('Object Repository/Login1/Page_2020/input_ 2020 Delivery Limited 2'), 'sangeethakesavan@jmangroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login1/Page_2020/input_ 2020 Delivery Limited 2_1'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Login1/Page_2020/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login1/Page_2020/img'), 0, FailureHandling.STOP_ON_FAILURE)

assert WebUI.getUrl() == 'http://192.168.0.28:4200/dashboard'

