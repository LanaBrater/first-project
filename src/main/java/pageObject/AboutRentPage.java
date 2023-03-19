package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AboutRentPage {

    private final WebDriver driver;

    //Заголовок страницы Для кого самокат
    private static final By ABOUT_RENT_PAGE_TITLE =
            By.cssSelector(".Order_Header__BZXOb");

    //Выбор даты доставки самоката
    private static final By DELIVERY_DATE_SELECTION =
            By.cssSelector(".Input_Input__1iN_Z.Input_Responsible__1jDKN[placeholder='* Когда привезти самокат']");

    //Меню выбора срока аренды
    private static final By RENT_DURATION_SELECTION =
            By.cssSelector(".Dropdown-control");

    //Выбор цвета самоката
    private static final By SCOOTER_COLOUR_SELECTION =
            By.cssSelector(".Order_Checkboxes__3lWSI");

    //Поле ввода комментария курьеру
    private static final By COMMENT_FOR_DELIVERY_MAN_FIELD =
            By.cssSelector(".Input_Input__1iN_Z.Input_Responsible__1jDKN[placeholder='Комментарий для курьера']");

    //Кнопка Заказать внутри формы
    private static final By ORDER_BUTTON_INSIDE_OF_FORM =
            By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");

    //Всплывающее окно подтверждения заказа с кнопкой Да
    private static final By ORDER_CONFIRMATION_MODAL_WINDOW =
            By.cssSelector(".Order_ModalHeader__3FDaJ");

    //Окно подтверждения заказа
    private static final By CONFIRMATION_ORDER_WINDOW =
            By.xpath("//div[text(),'Заказ оформлен'");


    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Проверка отображения заголовка
    public void checkAboutRentPageTitle() {
        driver.findElement(ABOUT_RENT_PAGE_TITLE).getText();
    }

    //Выбрать дату доставки
    public void chooseDeliveryDate(String date) {
        driver.findElement(DELIVERY_DATE_SELECTION).sendKeys(date);
        driver.findElement(DELIVERY_DATE_SELECTION).sendKeys(Keys.ENTER);
    }

    //Выбрать срок аренды
    public void chooseRentDuration(String duration) {
        driver.findElement(RENT_DURATION_SELECTION).click();
        String rentOptionTemplate = ".//div[@class='Dropdown-menu']//*[text()='%s']";
        String rentLocator = String.format(rentOptionTemplate, duration);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(rentLocator)));
        driver.findElement(By.xpath(rentLocator)).click();
    }

    //Выбрать цвет самоката
    public void chooseScooterColour(String colour) {
//        driver.findElement(SCOOTER_COLOUR_SELECTION).click();
        String colorScooterFieldOption = "//*[@id='%s']";
        String colorLocator = String.format(colorScooterFieldOption, colour);
        driver.findElement(By.xpath(colorLocator)).click();
    }

    //Написать комментарий курьеру
    public void setCommentForDeliveryMan(String comment) {
        driver.findElement(COMMENT_FOR_DELIVERY_MAN_FIELD).sendKeys(comment);
    }

    //Нажать кнопку Заказать
    public void clickOrderButtonInsideOfForm() {
        driver.findElement(ORDER_BUTTON_INSIDE_OF_FORM).click();
    }

    //Проверить появление окна подтверждения заказа с кнопкой Да
    public void isOrderConfirmationModalWindowVisible() {
        driver.findElement(ORDER_CONFIRMATION_MODAL_WINDOW).getText();
    }

    public void checkConfirmationWindow(){
        driver.findElement(CONFIRMATION_ORDER_WINDOW).getText();
    }
}
