package com.br.search.product.tabela;

public class Resultado
{
	public int getId_resultado()
	{
		return id_resultado;
	}
	
	public int getStatus()
	{
		return status;
	}
	
	public int getCenario()
	{
		return cenario;
	}
	
	public int getPre_requisito()
	{
		return pre_requisito;
	}
	
	public int getPerfil()
	{
		return perfil;
	}
	
	public int getCategoria()
	{
		return categoria;
	}
	
	public int getPasso()
	{
		return passo;
	}
	
	public int getTela()
	{
		return tela;
	}
	
	public String getResultado_esperado()
	{
		return resultado_esperado;
	}
	
	public String getEvidencia()
	{
		return evidencia;
	}
	
	public String getData_teste()
	{
		return data_teste;
	}
	
	
	private int id_resultado, 
			    status,
			    cenario,
			    pre_requisito,
			    perfil,
			    categoria,
			    passo,
			    tela,
			    sequencia_teste;
	
	public int getSequencia_teste()
	{
		return sequencia_teste;
	}


	private String  resultado_esperado, 
				    evidencia,
				    data_teste;




	public Resultado(int id_resultado, 
			int status,
			int cenario,
			int pre_requisito,
			int perfil,
			int categoria,
			int passo,
			int tela,
			int sequencia_teste,
			 String  resultado_esperado, 
			 String  evidencia,
			 String  data_teste)
	{
	
		
		this.sequencia_teste=sequencia_teste;
		this.id_resultado=id_resultado; 
		this.status=status;
		this.cenario=cenario;
		this.pre_requisito=pre_requisito;
		this.perfil=perfil;
		this.categoria=categoria;
		this.passo=passo;
		this.tela=tela;
		this.resultado_esperado=resultado_esperado; 
		this.evidencia=evidencia;
		this.data_teste=data_teste;
		
		
	}




}
