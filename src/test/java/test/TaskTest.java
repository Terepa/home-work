package test;

import org.junit.jupiter.api.Test;
import pageobject.pages.LandingPage;
import webdriver.BaseFunc;
import pageobject.pages.VacanciesPage;


public class TaskTest {
    private final String HOME_PAGE_URL = "https://ctco.lv/";

    @Test
    public void checkVacancyCTCo() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(HOME_PAGE_URL);

        LandingPage landingPage = new LandingPage(baseFunc);
        landingPage.openCareers();
        landingPage.openVacancies();

        VacanciesPage vacanciesPage = new VacanciesPage(baseFunc);
        vacanciesPage.openVacancy();
        vacanciesPage.checkCount();


    }
}
