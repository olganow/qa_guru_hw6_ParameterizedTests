
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CambridgeWebTest {



    @BeforeEach
    static void setUp() {
        open("https://dictionary.cambridge.org/");
    }

    @Test
    void cambridgeSearchOneWordTest() {
        String testData = "guttersnipe";
        $("#searchword").setValue(testData);
        $("button[type='submit']").click();
        $x("//h2[contains(text(),'Examples')]")
                .shouldHave(text("EXAMPLES of "+testData));
    }



}
