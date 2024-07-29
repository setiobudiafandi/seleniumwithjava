import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/cucumber/report.json","html:target/cucumber/report.html","pretty"},
        features = {
               "src/test/resources/features/Login.feature"
        }
//        tags = {"@TestCaseKey=BPA-T2242"}
)

public class CucumberTestSuite {
    
}
