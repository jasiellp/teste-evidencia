package com.br.search.product.tabela;

public class Cenario
{
	
	


	private int id_cenario, pre_requisito, categoria;
	
	private String nome_cenario, resultado_esperado, descrição_resultado;
	
	
	public Cenario(int id_cenario, int pre_requisito,int categoria,String nome_cenario, String resultado_esperado, String descrição_resultado)
	{ 
		this.id_cenario	   = id_cenario;  
		this.pre_requisito = pre_requisito; 
		this.categoria	   = categoria;
		this.nome_cenario        = nome_cenario;
		this.resultado_esperado  = resultado_esperado;
		this.descrição_resultado = descrição_resultado;
	
	} 
	
	
	public int getId_cenario()
	{
		return id_cenario;
	}


	public void setId_cenario(int id_cenario)
	{
		this.id_cenario = id_cenario;
	}


	public int getPre_requisito()
	{
		return pre_requisito;
	}


	public void setPre_requisito(int pre_requisito)
	{
		this.pre_requisito = pre_requisito;
	}


	public int getCategoria()
	{
		return categoria;
	}


	public void setCategoria(int categoria)
	{
		this.categoria = categoria;
	}


	public String getNome_cenario()
	{
		return nome_cenario;
	}


	public void setNome_cenario(String nome_cenario)
	{
		this.nome_cenario = nome_cenario;
	}


	public String getResultado_esperado()
	{
		return resultado_esperado;
	}


	public void setResultado_esperado(String resultado_esperado)
	{
		this.resultado_esperado = resultado_esperado;
	}


	public String getDescrição_resultado()
	{
		return descrição_resultado;
	}


	public void setDescrição_resultado(String descrição_resultado)
	{
		this.descrição_resultado = descrição_resultado;
	}

}