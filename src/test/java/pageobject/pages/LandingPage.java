package pageobject.pages;

import org.openqa.selenium.By;
import webdriver.BaseFunc;

public class LandingPage {

        private final By CAREERS_BTN = By.id("menu-item-127");
        private final By VACANCIES_BTN = By.id("menu-item-131");
        private BaseFunc baseFunc;

        public LandingPage(BaseFunc baseFunc) {
            this.baseFunc = baseFunc;
        }

        public void openCareers() {
            baseFunc.click(CAREERS_BTN);
        }

        public void openVacancies() {
            baseFunc.click(VACANCIES_BTN);
        }

    }

