package steps;

import lombok.extern.log4j.Log4j2;
import modalsWindow.AddSectionModal;
import modalsWindow.DeleteModal;
import org.openqa.selenium.WebDriver;
import pages.*;

@Log4j2
public class BaseStep {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    NewProjectPage newProjectPage;
    ProjectsPage scopeProjectsPage;
    CommonPage commonPage;
    ProjectPage projectPage;
    ProjectsPage projectsPage;
    DeleteModal deleteModal;
    TestSuitePage testSuitePage;
    AddSectionModal addSectionModal;
    TestCasePage testCasePage;

    public BaseStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        newProjectPage = new NewProjectPage(driver);
        scopeProjectsPage = new ProjectsPage(driver);
        commonPage = new CommonPage(driver);
        projectPage = new ProjectPage(driver);
        projectsPage = new ProjectsPage(driver);
        deleteModal = new DeleteModal(driver);
        testSuitePage = new TestSuitePage(driver);
        addSectionModal = new AddSectionModal(driver);
        testCasePage = new TestCasePage(driver);
    }
}
