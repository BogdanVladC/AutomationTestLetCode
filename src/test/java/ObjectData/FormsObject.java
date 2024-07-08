package ObjectData;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class FormsObject extends GeneralObject {

    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String phoneNumberValue;
    private String address1Value;
    private String address2Value;
    private String stateValue;
    private String postalCodeValue;
    private String genderValue;
    private String dobValue;
    private String countryCodeValue;
    private String countryValue;
    private String firstNameLabelExpected;
    private String lastNameLabelExpected;
    private String emailLabelExpected;
    private String countryCodeLabelExpected;
    private String phoneLabelExpected;
    private String add1LabelExpected;
    private String add2LabelExpected;
    private String stateLabelExpected;
    private String postalLabelExpected;
    private String countryLabelExpected;
    private String dobLabelExpected;
    private String genderLabelExpected;

    public FormsObject(Map<String, String> testData) {
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "phoneNumberValue":
                    setPhoneNumberValue(testData.get(key));
                    break;
                case "address1Value":
                    setAddress1Value(testData.get(key));
                    break;
                case "address2Value":
                    setAddress2Value(testData.get(key));
                    break;
                case "stateValue":
                    setStateValue(testData.get(key));
                    break;
                case "postalCodeValue":
                    setPostalCodeValue(testData.get(key));
                    break;
                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "dobValue":
                    setDobValue(testData.get(key));
                    break;
                case "countryCodeValue":
                    setCountryCodeValue(testData.get(key));
                    break;
                case "countryValue":
                    setCountryValue(testData.get(key));
                    break;
                case "firstNameLabelExpected":
                    setFirstNameLabelExpected(testData.get(key));
                    break;
                case "lastNameLabelExpected":
                    setLastNameLabelExpected(testData.get(key));
                    break;
                case "emailLabelExpected":
                    setEmailLabelExpected(testData.get(key));
                    break;
                case "countryCodeLabelExpected":
                    setCountryCodeLabelExpected(testData.get(key));
                    break;
                case "phoneLabelExpected":
                    setPhoneLabelExpected(testData.get(key));
                    break;
                case "add1LabelExpected":
                    setAdd1LabelExpected(testData.get(key));
                    break;
                case "add2LabelExpected":
                    setAdd2LabelExpected(testData.get(key));
                    break;
                case "stateLabelExpected":
                    setStateLabelExpected(testData.get(key));
                    break;
                case "postalLabelExpected":
                    setPostalLabelExpected(testData.get(key));
                    break;
                case "countryLabelExpected":
                    setCountryLabelExpected(testData.get(key));
                    break;
                case "dobLabelExpected":
                    setDobLabelExpected(testData.get(key));
                    break;
                case "genderLabelExpected":
                    setGenderLabelExpected(testData.get(key));
            }
        }

    }
}