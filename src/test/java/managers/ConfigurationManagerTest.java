package managers;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationManagerTest {

    @org.junit.jupiter.api.Test
    void getProperty() {
        assertEquals(ConfigurationManager.getProperty("path.page.allproducts"), "/allproducts.jsp");
    }
}