package Pages;

import LoggerUtillity.LoggerUtillity;
import ObjectData.FormsObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{
    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "firstname")
    private WebElement firstName;
    @FindBy(id = "lasttname")
    private WebElement lastName;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "Phno")
    private WebElement phoneNumber;
    @FindBy(id = "Addl1")
    private WebElement addressLine1;
    @FindBy(id = "Addl2")
    private WebElement addressLine2;
    @FindBy(id = "state")
    private WebElement state;
    @FindBy(id = "postalcode")
    private WebElement postalCode;
    @FindBy(css ="input[type='checkbox']")
    private WebElement TAC;
    @FindBy(css = "input[type='submit']")
    private WebElement submitButton;

    @FindBy(id = "male")
    private WebElement maleCheckbox;

    @FindBy(id = "female")
    private WebElement femaleCheckbox;

    @FindBy(id = "trans")
    private WebElement transCheckbox;

    @FindBy(id ="Date")
    private WebElement calendar;
    @FindBy(xpath = "/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[2]/div[2]/div/div/div/select")
    private WebElement selectCountryCode;
    @FindBy(xpath = "/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select")
    private WebElement selectCountry;

    @FindBy(xpath = "//label[text()='First Name']" )
    private WebElement fistNameLabel;
    @FindBy(xpath = "//label[text()='Last Name']")
    private WebElement lastNameLabel;
    @FindBy(xpath = "//label[text()='Email']")
    private WebElement emailLabel;
    @FindBy(xpath = "//label[text()='Country code']")
    private WebElement countryCodeLabel;
    @FindBy(xpath = "//label[text()='Phone Number']")
    private WebElement phoneLabel;
    @FindBy(xpath = "//label[text()='Address Line-1']")
    private WebElement add1Label;
    @FindBy(xpath = "//label[text()='Address Line-2']")
    private WebElement add2Label;
    @FindBy(xpath = "//label[text()='State']")
    private WebElement stateLabel;
    @FindBy(xpath = "//label[text()='Postal-Code']")
    private WebElement postalLabel;
    @FindBy(xpath = "//label[text()='Country']")
    private WebElement countryLabel;
    @FindBy(xpath = "//label[text()='Date Of Birth']")
    private WebElement dobLabel;
    @FindBy(xpath = "//label[text()='Gender']")
    private WebElement genderLabel;





    public void fillFirstName(String firstNameValue){
        elementMethods.fillElement(firstName,firstNameValue);
        LoggerUtillity.infoTest("The user fills his first name");
    }

    public void fillLastName(String lastNameValue){
        elementMethods.fillElement(lastName,lastNameValue);
        LoggerUtillity.infoTest("The user fills his last name");
    }

    public void fillEmail(String emailValue){
        elementMethods.fillElement(email,emailValue);
        LoggerUtillity.infoTest("The user fills his e-mail address");
    }

    public void fillPhoneNumber(String phoneNumberValue){
        elementMethods.fillElement(phoneNumber,phoneNumberValue);
        LoggerUtillity.infoTest("The user fills his phone number");
    }

    public void fillAddress1(String address1Value){
        elementMethods.fillElement(addressLine1,address1Value);
        LoggerUtillity.infoTest("The user fills his first address");
    }

    public void fillAddress2(String address2Value){
        elementMethods.fillElement(addressLine2,address2Value);
        LoggerUtillity.infoTest("The user fills his second address ");
    }

    public void fillPostalCode(String postalCodeValue){
        elementMethods.fillElement(postalCode,postalCodeValue);
        LoggerUtillity.infoTest("The user fills his postal code");
    }

    public void fillState(String stateValue){
        elementMethods.fillElement(state,stateValue);
        LoggerUtillity.infoTest("The user fills his state");
    }

    public void clickTAC(){
        elementMethods.clickElement(TAC);
        LoggerUtillity.infoTest("The user accepts terms and conditions ");
    }

    public void clickSubmit(){
        elementMethods.clickElement(submitButton);
        LoggerUtillity.infoTest("The user clicks the submit button ");
    }

    public void fillGender(String genderValue){
        if (genderValue == "Male") {
            elementMethods.clickElement(maleCheckbox);
        } else if (genderValue == "Female") {
            elementMethods.clickElement(femaleCheckbox);
        } else {
            elementMethods.clickElement(transCheckbox);
        }
        LoggerUtillity.infoTest("The user selects his gender ");
    }

    public void fillDob(String dobValue){
        elementMethods.fillElement(calendar,dobValue);
        LoggerUtillity.infoTest("The user selects his date of birth ");
    }


    public void  fillCountryCode(String countryCodeValue){
        elementMethods.fillPressElement(selectCountryCode,countryCodeValue,Keys.ENTER);
        LoggerUtillity.infoTest("The user fills his country code ");
    }

    public void fillCountry(String countryValue){
        elementMethods.selectTextElement(selectCountry, countryValue);
        LoggerUtillity.infoTest("The user fills his country ");
    }
    public void validateFirstNameLabel(String firstNameLabelExpected){
        elementMethods.validateElementText(fistNameLabel,firstNameLabelExpected);
        LoggerUtillity.infoTest("The users validates first field label");
    }
    public void validateLastNameLabel(String lastNameLabelExpected){
        elementMethods.validateElementText(lastNameLabel,lastNameLabelExpected);
        LoggerUtillity.infoTest("The users validates last name field label");
    }
    public void validateEmailLabel(String emailLabelExpected){
        elementMethods.validateElementText(emailLabel,emailLabelExpected);
        LoggerUtillity.infoTest("The users validates email field label");
    }

    public void validateCountryCodeLabel(String countryCodeLabelExpected){
        elementMethods.validateElementText(countryCodeLabel,countryCodeLabelExpected);
        LoggerUtillity.infoTest("The users validates country code field label");
    }
    public void validatePhoneLabel(String phoneLabelExpected){
        elementMethods.validateElementText(phoneLabel,phoneLabelExpected);
        LoggerUtillity.infoTest("The users validates phone field label");
    }
    public void validateAdd1Label(String add1LabelExpected){
        elementMethods.validateElementText(add1Label,add1LabelExpected);
        LoggerUtillity.infoTest("The users validates address1 field label");
    }
    public void validateAdd2Label(String add2LabelExpected){
        elementMethods.validateElementText(add2Label,add2LabelExpected);
        LoggerUtillity.infoTest("The users validates address2 field label");
    }
    public void validateStateLabel(String stateLabelExpected){
        elementMethods.validateElementText(stateLabel,stateLabelExpected);
        LoggerUtillity.infoTest("The users validates state field label");
    }
    public void validatePostalLabel(String postalLabelExpected){
        elementMethods.validateElementText(postalLabel,postalLabelExpected);
        LoggerUtillity.infoTest("The users validates postal code field label");
    }
    public void validateCountryLabel(String countrylLabelExpected){
        elementMethods.validateElementText(countryLabel,countrylLabelExpected);
        LoggerUtillity.infoTest("The users validates country field label");
    }
    public void validateDobLabel(String dobLabelExpected){
        elementMethods.validateElementText(dobLabel,dobLabelExpected);
        LoggerUtillity.infoTest("The users validates date of birth label");
    }
    public void validateGenderLabel(String genderLabelExpected){
        elementMethods.validateElementText(genderLabel,genderLabelExpected);
        LoggerUtillity.infoTest("The users validates gender field label");
    }





    public void fillForm(FormsObject formsObject){
        fillFirstName(formsObject.getFirstNameValue());
        fillLastName(formsObject.getLastNameValue());
        fillEmail(formsObject.getEmailValue());
        fillPhoneNumber(formsObject.getPhoneNumberValue());
        fillAddress1(formsObject.getAddress1Value());
        fillAddress2(formsObject.getAddress2Value());
        fillState(formsObject.getStateValue());
        fillPostalCode(formsObject.getPostalCodeValue());
        fillGender(formsObject.getGenderValue());
        fillDob(formsObject.getDobValue());
        fillCountryCode(formsObject.getCountryCodeValue());
        fillCountry(formsObject.getCountryValue());
        clickTAC();
        clickSubmit();

    }
    public void validateForm(FormsObject formsObject){
        validateFirstNameLabel(formsObject.getFirstNameLabelExpected());
        validateLastNameLabel(formsObject.getLastNameLabelExpected());
        validateEmailLabel(formsObject.getEmailLabelExpected());
        validateCountryCodeLabel(formsObject.getCountryCodeLabelExpected());
        validatePhoneLabel(formsObject.getPhoneLabelExpected());
        validateAdd1Label(formsObject.getAdd1LabelExpected());
        validateAdd2Label(formsObject.getAdd2LabelExpected());
        validateStateLabel(formsObject.getStateLabelExpected());
        validatePostalLabel(formsObject.getPostalLabelExpected());
        validateCountryLabel(formsObject.getCountryLabelExpected());
        validateDobLabel(formsObject.getDobLabelExpected());
        validateGenderLabel(formsObject.getGenderLabelExpected());
    }







}
