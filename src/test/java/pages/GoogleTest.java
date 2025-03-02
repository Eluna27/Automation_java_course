// Paquete donde se encuentra la clase
package pages;

// Dependencias utilizadas en esta prueba
import org.openqa.selenium.WebDriver; // Selenium WebDriver para controlar el navegador
import org.openqa.selenium.chrome.ChromeDriver; // Controlador específico para Chrome
import org.testng.annotations.AfterMethod; // Anotación de TestNG para ejecutar código después de cada método de prueba
import org.testng.annotations.BeforeMethod; // Anotación de TestNG para ejecutar código antes de cada método de prueba
import org.testng.annotations.Test; // Anotación de TestNG para definir un método de prueba
import io.github.bonigarcia.wdm.WebDriverManager; // Librería para gestionar automáticamente los controladores de navegador

// Definición de la clase
public class GoogleTest {

    // Declaración de la variable 'driver' para controlar el navegador
    private WebDriver driver;

    // Método que se ejecuta antes de cada prueba
    @BeforeMethod
    public void setup() {
        // Configura el controlador de Chrome usando WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Inicializa una instancia de ChromeDriver y la asigna a la variable 'driver'
        driver = new ChromeDriver();
    }

    // Método de prueba que abre Google
    @Test
    public void openGoogleTest() {
        // Navega a la URL de Google México
        driver.get("https://www.google.com.mx");
    }

    // Método que se ejecuta después de cada prueba
    @AfterMethod
    public void tearDown() {
        // Verifica si el controlador del navegador está inicializado
        if (driver != null) {
            // Cierra el navegador y finaliza la sesión de WebDriver
            driver.quit();
        }
    }
}