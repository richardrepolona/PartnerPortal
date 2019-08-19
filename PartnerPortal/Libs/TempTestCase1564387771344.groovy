import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\RICHAR~1.REP\\AppData\\Local\\Temp\\Katalon\\20190729_160931\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://novareteam.outsystemscloud.com/PartnerPortal/Home.aspx?#!\')\n\nWebUI.click(findTestObject(\'Page_HomePage/a_Login or Sign-Up\'))\n\nWebUI.setText(findTestObject(\'Page_Registration Login/input_Name_DublinTheme_wt31blockwtMainContentWebPatterns_wt18blockwtColumn2WebPatterns_wt10blockwtContentwt33wtUserNameInput\'), \n    \'Richard\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Registration Login/input_Password_DublinTheme_wt31blockwtMainContentWebPatterns_wt18blockwtColumn2WebPatterns_wt10blockwtContentwt33wtPasswordInput\'), \n    \'Cg2NVYDeBKU=\')\n\nWebUI.click(findTestObject(\'Page_Registration Login/div_Password\'))\n\nWebUI.setEncryptedText(findTestObject(\'Page_Registration Login/input_Password_DublinTheme_wt31blockwtMainContentWebPatterns_wt18blockwtColumn2WebPatterns_wt10blockwtContentwt33wtPasswordInput\'), \n    \'Cg2NVYDeBKU=\')\n\nWebUI.click(findTestObject(\'Page_Registration Login/input_Password_DublinTheme_wt31blockwtMainContentWebPatterns_wt18blockwtColumn2WebPatterns_wt10blockwtContentwt33wtLoginButton\'))\n\nWebUI.click(findTestObject(\'Page_HomePage/input_Schedules_DublinTheme_wt290blockwtMainContentWebPatterns_wtSchedulesSectionblockwtActionswtUserHomepageCreateSched\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_HomePage/select_AccountManagerChristian JamesClientmagicMarkoMarveiMarveiMiles MoralesNovareOppoRichardRepolonaTerence Daquiz\'), \n    \'20\', true)\n\nnot_run: WebUI.click(findTestObject(\'Page_HomePage/td_30\'))\n\nWebUI.setText(findTestObject(\'Page_HomePage/textarea_Notes_WebPatterns_wt19blockwtMainContentWebPatterns_wt14blockwtContentwt12\'), \n    \'Test22222222\')\n\nWebUI.click(findTestObject(\'Page_HomePage/input_Notes_WebPatterns_wt19blockwtMainContentWebPatterns_wt14blockwtContentwt10\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

