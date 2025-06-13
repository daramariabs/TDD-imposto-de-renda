package app;

public class IRPF {
    
	private float salario;
	private float contribuicaoPrevidenciaria;
    private String[] dependentes;
    
    public IRPF() {
      
        dependentes = new String[0]; 
    }
    
	public void cadastrarSalario(float salario) {
		this.salario += salario; 
	}
	
	public float getTotalSalario() {
		return this.salario;
	}
    
	public void cadastrarPrevidenciaOficial(float valor) {
        this.contribuicaoPrevidenciaria = valor;
    }

    public float getPrevidenciaOficial() {
        return this.contribuicaoPrevidenciaria;
    }
    
    public void cadastrarDependente(String nome) {
    
        String[] temp = new String[dependentes.length + 1];
        
        for (int i = 0; i < dependentes.length; i++) {
            temp[i] = dependentes[i];
        }
        
        temp[temp.length - 1] = nome;
        
        this.dependentes = temp;
    }

    public float getDeducaoDependentes() {
    	
    	return (float) (dependentes.length * 189.59);
    }
}