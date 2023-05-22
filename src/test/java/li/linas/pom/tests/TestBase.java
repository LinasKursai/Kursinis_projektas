package li.linas.pom.tests;

import li.linas.pom.pages.Common;
import li.linas.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)

public abstract class TestBase {

    @BeforeMethod
    public abstract void seTup();

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}
