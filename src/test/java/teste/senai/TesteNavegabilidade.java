package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNavegabilidade {
	
	ChromeDriver driver;
	
	//pré teste
	@Before
	public void PreTeste () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Leandro\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br/");
			
		
	}
	//teste
	@Test
public void Teste () {
	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
	//driver.findElement(By.id("Busca1_btnBusca")).click();
	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);;
	
	
	}
	
	//pos teste
	@After
public void PosTeste () {
	
}
	
}

