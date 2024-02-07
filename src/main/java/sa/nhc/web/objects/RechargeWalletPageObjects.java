package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RechargeWalletPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {{
    put("rechargeButton",new HashMap<>(){{
        put("en","//span[text() = 'Wallet']");
//        put("ar","//span[text() = 'المحفظة']");
          put("ar","//span[contains(text(),'محفظة')]");
    }});
    put("chargeWalletButton",new HashMap<>(){{
        put("en","//button[text() = ' Charge your wallet ']");
        put("ar","//button[text() = ' اشحن محفظتك ']");
    }});
    put("text-Amount",new HashMap<>(){{
        put("en","//input[@data-name=\"custom_value\"]");
        put("ar","//input[@data-name=\"custom_value\"]");
    }});
    put("nextButton",new HashMap<>(){{
        put("en","//button[text() = ' Next ']");
        put("ar","//button[text() = ' التالي ']");
    }});
    put("popUpButton",new HashMap<>(){{
        put("en","//button[@class = 'close-button']");
    }});
    put("officerButton",new HashMap<>(){{
        put("en","//div[@class = 'flex-row']");
    }});
    put("madaPayButton",new HashMap<>(){{
        put("en","//h3[@class ='text-center mb-3']");
        put("ar","//h3[@class ='text-center mb-3']");
    }});
    put("cardNumberButton",new HashMap<>(){{
//        put("en","//input[@placeholder=\"رقم البطاقة\"]");
//        put("en","//input[@placeholder='رقم البطاقة']");
//        put("en","//iframe[@class=\"wpwl-control wpwl-control-iframe wpwl-control-cardNumber\"]");
        put("en","//input[@name=\"card.number\"]");
        put("ar","//input[@name=\"card.number\"]");
    }});
    put("cardNameButton",new HashMap<>(){{
        put("en","//input[@placeholder=\"اسم حامل البطاقة\"]");
        put("ar","//input[@placeholder=\"اسم حامل البطاقة\"]");
    }});
    put("cardCVVButton",new HashMap<>(){{
//        put("en","//input[@placeholder=\"رمز التحقق (CVV)\"]");
        put("en","//iframe[@name=\"card.cvv\"]");
        put("ar","//iframe[@name=\"card.cvv\"]");
    }});
    put("expiryDateButton",new HashMap<>(){{
        put("en","//input[@placeholder=\"شهر / سنة\"]");
        put("ar","//input[@placeholder=\"شهر / سنة\"]");
    }});
    put("payButton",new HashMap<>(){{
        put("en","//button[text() = 'إدفع الأن']");
        put("ar","//button[text() = 'إدفع الأن']");
    }});
    put("manageAccountButton",new HashMap<>(){{
        put("en","//span[text() = 'Manage Account']");
    }});
    put("text-CVV",new HashMap<>(){{
        put("en","//input[@name=\"card.cvv\"]");
        put("ar","//input[@name=\"card.cvv\"]");
    }});
    put("add-Iban",new HashMap<>(){{
        put("en","//a[text() = ' Go to \"Add new IBAN\" ']");
        put("ar","//a[text() = ' إضافة ايبان جديد ']");
    }});
    put("newIbanButton",new HashMap<>(){{
        put("en","//button[text() = ' Add new IBAN ']");
        put("ar","//button[text() = ' إضافة رقم آيبان جديد ']");
    }});
    put("ibanNumberButton",new HashMap<>(){{
        put("en","//input[@formcontrolname=\"iban_number\"]");
        put("ar","//input[@formcontrolname=\"iban_number\"]");
    }});
    put("accountOwnerName",new HashMap<>(){{
        put("en","//input[@formcontrolname=\"alias_name\"]");
        put("ar","//input[@formcontrolname=\"alias_name\"]");
    }});
    put("bankName",new HashMap<>(){{
        put("en","//input[@formcontrolname=\"bank_name\"]");
        put("ar","//input[@formcontrolname=\"bank_name\"]");
    }});
    put("bankAddress",new HashMap<>(){{
        put("en","//input[@formcontrolname=\"bank_address\"]");
        put("ar","//input[@formcontrolname=\"bank_address\"]");
    }});
    put("walletButton",new HashMap<>(){{
        put("en","//span[text() = 'Wallet']");
    }});
    put("saveButton",new HashMap<>(){{
        put("en","//button[text() = ' Save ']");
        put("ar","//button[text() = ' حفظ ']");
    }});
    put("submitButton",new HashMap<>(){{
        put("en","//input[@value = 'Submit']");
        put("ar","//input[@value = 'Submit']");
    }});
    put("testPaymentWindow",new HashMap<>(){{
        put("en","//h1[text() = '3D test payment']");
        put("ar","//h1[text() = '3D test payment']");
    }});
    put("rechargeWalletMessage",new HashMap<>(){{
            put("en","//h2[text() = 'Successfully completed charging your wallet']/parent::div");
            put("ar","//h2[text() = 'اكتمل شحن محفظتك بنجاح']");
    }});
    put("closePopUpButton",new HashMap<>(){{
        put("en","//button[@class = 'close-button']");
        put("ar","//button[@class = 'close-button']");
    }});
        put("verify-identity-btn", new HashMap<>(){{
            put ("en", "//button[@class=\"btn btn-primary\"]");
            put ("ar", "//button[@class=\"btn btn-primary\"]");
        }});
}};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }
    public static By rechargeButton()throws Exception {
        return By.xpath(get("rechargeButton"));
    }

    public static By chargeWalletButton() throws Exception{
        return By.xpath(get("chargeWalletButton"));
    }

    public static By enterAmount() throws Exception{
        return By.xpath(get("text-Amount"));
    }

    public static By clickNexxtButton() throws Exception{
        return By.xpath(get("nextButton"));
    }

    public static By popUpButton() throws Exception {
        return By.xpath(get("popUpButton"));
    }

    public static By officerButton() throws Exception{
        return By.xpath(get("officerButton"));
    }

    public static By madaPayButton()throws Exception {
        return By.xpath(get("madaPayButton"));
    }

    public static By cardNumberButton() throws Exception {
        return By.xpath(get("cardNumberButton"));
    }

    public static By expiryDateButton()throws Exception {
        return By.xpath(get("expiryDateButton"));
    }

    public static By cardNameButton() throws Exception {
        return By.xpath(get("cardNameButton"));
    }

    public static By clickCardCVV() throws Exception {
        return By.xpath(get("cardCVVButton"));
    }

    public static By clickPayButton()throws Exception {
        return By.xpath(get("payButton"));
    }

    public static By manageAccountButton() throws Exception{
        return By.xpath(get("manageAccountButton"));
    }

    public static By enterCardCVV() throws Exception{
        return By.xpath(get("text-CVV"));
    }

    public static By addIban() throws Exception{
        return By.xpath(get("add-Iban"));
    }

    public static By addNewIbanButton() throws Exception {
        return By.xpath(get("newIbanButton"));
    }

    public static By clickIbanNumber() throws Exception{
        return By.xpath(get("ibanNumberButton"));
    }

    public static By accountOwnerName() throws Exception {
        return By.xpath(get("accountOwnerName"));
    }

    public static By bankName() throws Exception{
        return By.xpath(get("bankName"));
    }

    public static By bankAddress() throws Exception {
        return By.xpath(get("bankAddress"));
    }

    public static By wallet() throws Exception {
        return By.xpath(get("walletButton"));
    }

    public static By saveButton() throws Exception{
        return By.xpath(get("saveButton"));
    }

    public static By submitButton() throws Exception {
        return By.xpath(get("submitButton"));
    }

    public static By testPaymentWindow() throws Exception {
        return By.xpath(get("testPaymentWindow"));
    }

    public static By rechargeWalletMessage() throws Exception{
        return By.xpath(get("rechargeWalletMessage"));
    }

    public static By closePopUpButton() throws Exception {
        return By.xpath("//button[@class = 'close-button']");
    }
    public static By verifyIdentityBTN() throws Exception{
        return By.xpath(get("verify-identity-btn"));
    }
}
