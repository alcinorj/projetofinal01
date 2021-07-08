package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class CadastrarFuncionarioTest {
	
	//atributo
	WebDriver driver;
		
	@Dado("^Acessar a p�gina de cadastro de funcion�rio$")
	public void acessar_a_p�gina_de_cadastro_de_funcion�rio() {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("http://prjfinalteste-001-site1.ctempurl.com/Home/Exercicio01");
		
	}

	@Dado("^Informar o nome do funcion�rio \"([^\"]*)\"$")
	public void informar_o_nome_do_funcion�rio(String nome) {
		driver.findElement(By.xpath("//*[@id=\"Nome\"]")).sendKeys(nome);
			    	    
	}

	@Dado("^Informar o CPF do funcion�rio \"([^\"]*)\"$")
	public void informar_o_CPF_do_funcion�rio(String cpf) {
		driver.findElement(By.xpath("//*[@id=\"CPF\"]")).sendKeys(cpf);
			    
	}

	@Dado("^Informar a data de admiss�o do funcion�rio \"([^\"]*)\"$")
	public void informar_a_data_de_admiss�o_do_funcion�rio(String dataAdmissao) {
		driver.findElement(By.xpath("//*[@id=\"DataAdmissao\"]")).sendKeys(dataAdmissao);
	    
	}

	@Dado("^Informar o resumo de atividades \"([^\"]*)\"$")
	public void informar_o_resumo_de_atividades(String atividades) {
		driver.findElement(By.xpath("//*[@id=\"ResumoAtividades\"]")).sendKeys(atividades);
	    
	}

	@Quando("^Solicitar o cadastro$")
	public void solicitar_o_cadastro() {
		driver.findElement(By.xpath("//*[@id=\"btnCadastro\"]")).click();
	    
	}

	@Ent�o("^Sistema informa que cadastro realizado com sucesso$")
	public void sistema_informa_que_cadastro_realizado_com_sucesso() {
		String mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]")).getText();
		assertEquals(mensagem, "Funcion�rio cadastrado com sucesso");	    
	}

	@Ent�o("^Sistema informa que todos os campos s�o obrigat�rios$")
	public void sistema_informa_que_todos_os_campos_s�o_obrigat�rios() {
		String erroNome = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[1]/div[1]/span")).getText();
		String erroCpf = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[1]/div[2]/span")).getText();
		String erroAdmissao = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[2]/div[1]/span")).getText();
		String erroAtividade = driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[2]/div[2]/span")).getText();
	
		assertEquals(erroNome, "Informe o nome do funcion�rio.");
		assertEquals(erroCpf, "Informe o cpf do funcion�rio.");
		assertEquals(erroAdmissao, "Informe a data de admiss�o do funcion�rio.");
		assertEquals(erroAtividade, "Informe o resumo de atividades do funcion�rio");
	
	}
	
}
