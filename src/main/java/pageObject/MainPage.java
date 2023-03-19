package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;


    //Кнопка Заказать вверху
    private static final By TOP_ORDER_BUTTON =
            By.cssSelector(".Button_Button__ra12g");

    //Кнопка Заказать внизу
    private static final By BOTTOM_ORDER_BUTTON =
            By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");


    public static String[] questionArrowButtons = new String[]{
            "accordion__heading-0",
            "accordion__heading-1",
            "accordion__heading-2",
            "accordion__heading-3",
            "accordion__heading-4",
            "accordion__heading-5",
            "accordion__heading-6",
            "accordion__heading-7"

    };
    public static String[] answerArrowFields = new String[] {
            "//div[@id='accordion__panel-0']/p",
            "//div[@id='accordion__panel-1']/p",
            "//div[@id='accordion__panel-2']/p",
            "//div[@id='accordion__panel-3']/p",
            "//div[@id='accordion__panel-4']/p",
            "//div[@id='accordion__panel-5']/p",
            "//div[@id='accordion__panel-6']/p",
            "//div[@id='accordion__panel-7']/p"
    };

////Раздел Вопросы о важном
//    //стрелочка1
//    private static final By CURSOR_ARROW_OF_DROPDOWN1 =
//            By.id("accordion__heading-0");
//
//    //Поле с текстом после нажатия на стрелочку1
//    private static final By TEXT_OF_DROPDOWN1 =
//            By.id("accordion__panel-0");
//    //Ожидаемый текст1
//    private final String expectedDropdownText1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
//
//    //Стрелочка2
//    private static final By CURSOR_ARROW_OF_DROPDOWN2 =
//            By.id("accordion__heading-1");
//    //Поле с текстом после нажатия на стрелочку2
//    private static final By TEXT_OF_DROPDOWN2 =
//            By.id("accordion__panel-1");
//    //Ожидаемый текст2
//    private final String expectedDropdownText2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
//    //Стрелочка3
//    private static final By CURSOR_ARROW_OF_DROPDOWN3 =
//            By.id("accordion__heading-2");
//    //Поле с текстом после нажатия на стрелочку3
//    private static final By TEXT_OF_DROPDOWN3 =
//            By.id("accordion__panel-2");
//    //Ожидаемый текст3
//    private final String expectedDropdownText3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
//    //Стрелочка4
//    private static final By CURSOR_ARROW_OF_DROPDOWN4 =
//            By.id("accordion__heading-3");
//    //Поле с текстом после нажатия на стрелочку4
//    private static final By TEXT_OF_DROPDOWN4 =
//            By.id("accordion__panel-3");
//    //Ожидаемый текст4
//    private final String expectedDropdownText4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
//    //Стрелочка5
//    private static final By CURSOR_ARROW_OF_DROPDOWN5 =
//            By.id("accordion__heading-4");
//    //Поле с текстом после нажатия на стрелочку5
//    private static final By TEXT_OF_DROPDOWN5 =
//            By.id("accordion__panel-4");
//    //Ожидаемый текст5
//    private final String expectedDropdownText5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
//    //Стрелочка6
//    private static final By CURSOR_ARROW_OF_DROPDOWN6 =
//            By.id("accordion__heading-5");
//    //Поле с текстом после нажатия на стрелочку6
//    private static final By TEXT_OF_DROPDOWN6 =
//            By.id("accordion__panel-5");
//    //Ожидаемый текст6
//    private final String expectedDropdownText6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
//    //Стрелочка7
//    private static final By CURSOR_ARROW_OF_DROPDOWN7 =
//            By.id("accordion__heading-6");
//    //Поле с текстом после нажатия на стрелочку7
//    private static final By TEXT_OF_DROPDOWN7 =
//            By.id("accordion__panel-6");
//    //Ожидаемый текст7
//    private final String expectedDropdownText7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои";
//    //Стрелочка8
//    private static final By CURSOR_ARROW_OF_DROPDOWN8 =
//            By.id("accordion__heading-7");
//    //Поле с текстом после нажатия на стрелочку8
//    private static final By TEXT_OF_DROPDOWN8 =
//            By.id("accordion__panel-7");
//    //Ожидаемый текст8
//    private final String expectedDropdownText8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    //Нажать на верхнюю кнопку
    public void clickTopOrderButton() {
        driver.findElement(TOP_ORDER_BUTTON).click();
    }
    //Нажать на нижнюю кнопку
    public void clickBottomOrderButton() {
        driver.findElement(BOTTOM_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(BOTTOM_ORDER_BUTTON));
        driver.findElement(BOTTOM_ORDER_BUTTON).click();
    }

//////////////////////////////////////////////////////////////////////////////
    //Проверка нажатия на стрелочку1
    public void clickCursorArrowOfDropdown1(int index){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.id(questionArrowButtons[index])));
        driver.findElement(By.id(questionArrowButtons[index])).click();
    }
    //Проверка текста элемента стрелочки1
    public String getDropdownText1(int index){
        return driver.findElement(By.xpath(answerArrowFields[index])).getText();
    }
    //////////////////////////////////////////////////////////////////////////////
    //Проверка нажатия на стрелочку2
//    public void clickCursorArrowOfDropdown2(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[1])));
//        driver.findElement(By.id(questionArrowButtons[1])).click();
//    }
//    //Проверка текста элемента стрелочки2
//    public String getDropdownText2(){
//        return driver.findElement(By.id(answerArrowFields[1])).getText();
//    }
//    //////////////////////////////////////////////////////////////////////////////
//    //Проверка нажатия на стрелочку3
//    public void clickCursorArrowOfDropdown3(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[2])));
//        driver.findElement(By.id(questionArrowButtons[2])).click();
//    }
//    //Проверка текста элемента стрелочки3
//    public String getDropdownText3(){
//        return driver.findElement(By.id(answerArrowFields[2])).getText();
//    }
//    //////////////////////////////////////////////////////////////////////////////
//    //Проверка нажатия на стрелочку4
//    public void clickCursorArrowOfDropdown4(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[3])));
//        driver.findElement(By.id(questionArrowButtons[3])).click();
//    }
//    //Проверка текста элемента стрелочки4
//    public String getDropdownText4(){
//        return driver.findElement(By.id(answerArrowFields[3])).getText();
//    }
//    //////////////////////////////////////////////////////////////////////////////
//    //Проверка нажатия на стрелоку5
//    public void clickCursorArrowOfDropdown5(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[4])));
//        driver.findElement(By.id(questionArrowButtons[4])).click();
//    }
//    //Проверка текста элемента стрелочки5
//    public String getDropdownText5(){
//        return driver.findElement(By.id(answerArrowFields[4])).getText();
//    }
//    //////////////////////////////////////////////////////////////////////////////
//    //Проверка нажатия на стрелчоку6
//    public void clickCursorArrowOfDropdown6(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[5])));
//        driver.findElement(By.id(questionArrowButtons[5])).click();
//    }
//    //Проверка текста элемента стрелочки6
//    public String getDropdownText6(){
//        return driver.findElement(By.id(answerArrowFields[5])).getText();
//    }
//    //////////////////////////////////////////////////////////////////////////////
//    //Проверка нажатия на стрелоку7
//    public void clickCursorArrowOfDropdown7(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[6])));
//        driver.findElement(By.id(questionArrowButtons[6])).click();
//    }
//    //Проверка текста элемента стрелочки7
//    public String getDropdownText7(){
//        return driver.findElement(By.id(answerArrowFields[6])).getText();
//    }
//    //////////////////////////////////////////////////////////////////////////////
//    //Проверка нажатия на стрелоку8
//    public void clickCursorArrowOfDropdown8(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(By.id(questionArrowButtons[7])));
//        driver.findElement(By.id(questionArrowButtons[7])).click();
//    }
//    //Проверка текста элемента стрелочки8
//    public String getDropdownText8(){
//        return driver.findElement(By.id(answerArrowFields[7])).getText();
//    }
}
