package app;

public class IRPF {
    
	private float salario;
    
	public void cadastrarSalario(float salario) {
		this.salario += salario; 
	}
	
	public float getTotalSalario() {
		return this.salario;
	}
    
}