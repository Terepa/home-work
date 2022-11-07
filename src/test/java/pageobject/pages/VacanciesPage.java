package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webdriver.BaseFunc;


public class VacanciesPage {

    private final By VACANCY_BTN = By.id("menu-item-5079");
    private final By PARAGRAPH_SKILLS_AND_QUALIFICATION = By.xpath(".//*[contains(text(),'TEST AUTOMATION ENGINEER')]//..//ul[1]");
    public final By SKILLS_AND_QUALIFICATION_ITEM = By.xpath("li");
    private BaseFunc baseFunc;

    public VacanciesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void openVacancy() {
        baseFunc.click(VACANCY_BTN);

    }

    public void checkCount() {
        baseFunc.wait.until(ExpectedConditions.presenceOfElementLocated(PARAGRAPH_SKILLS_AND_QUALIFICATION));
        Assertions.assertTrue(baseFunc.isPresentElement(PARAGRAPH_SKILLS_AND_QUALIFICATION), "Element is not visible");
        Assertions.assertEquals(baseFunc.getChildElementsCount(PARAGRAPH_SKILLS_AND_QUALIFICATION, SKILLS_AND_QUALIFICATION_ITEM), 8);
    }
}

