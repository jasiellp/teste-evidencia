package com.br.search.product.dao;

import java.util.ArrayList;

import com.br.search.product.tabela.Cenario;
import com.br.search.product.tabela.Perfil;
import com.br.search.product.tabela.PreRequisito;
import com.br.search.product.tabela.Resultado;
import com.br.search.product.tabela.Status;
import com.br.search.product.util.WebCash;
import com.br.search.product.util.WebConexao;
import com.br.search.product.util.tabela.WebTable;

public class ResultadoDao
{
	  private static WebConexao com;  
	   
	  public static ArrayList<Cenario> getCenarios() throws Exception
	  {
		  	return getCenario(1);
	  }
	  
	  public static ArrayList<PreRequisito> getPreRequisito() throws Exception
	  {
		  	return getPreRequisito(1);
	  }
	  
	  public static ArrayList<Perfil> getPrePerfil() throws Exception
	  {
		  	return getPerfis(1);
	  }
		
	  public static ArrayList<Status> getStatus() throws Exception
	  {
		  	return getStatus(1);
	  }
		
	  
	  public static ArrayList<Resultado> getResultado() throws Exception
	  {
		  	return getResultado(1);
	  }
		
	  
	  private static ArrayList<Resultado> getResultado(int iIdResultado) throws Exception
	  {
			ArrayList<Resultado>  listaMarca = new ArrayList<Resultado>();
			
			com =  WebCash.getConexao(); 
			
			StringBuffer sbQuery = new StringBuffer();
			
			sbQuery.append("SELECT * FROM RESULTADO;");

			WebTable tabela = com.executeSQL(sbQuery, "Busca Resultado");
			
			int iNumLinhas = tabela.getNumLinha();
			
			for(int i = 0; i < iNumLinhas; i++)
			{  
				listaMarca.add(new Resultado(
						tabela.getInt("ID_RESULTADO", i),
						tabela.getInt("STATUS", i),
						tabela.getInt("CENARIO", i),
						tabela.getInt("PRE_REQUISITO", i),
						tabela.getInt("PERFIL", i),
						tabela.getInt("CATEGORIA", i),
						tabela.getInt("PASSO", i),
						tabela.getInt("TELA", i),
						tabela.getInt("SEQUENCIA_TESTE", i),
						tabela.getString("RESULTADO_ESPERADO", i),  
						tabela.getString("EVIDENCIA", i), 
						tabela.getString("DATA_TESTE", i) ));
			}
			
			return listaMarca;
		}
	  
	  
	  private static ArrayList<Status> getStatus(int iIdStatus) throws Exception
	  {
			ArrayList<Status>  listaMarca = new ArrayList<Status>();
			
			com =  WebCash.getConexao(); 
			
			StringBuffer sbQuery = new StringBuffer();
			
			sbQuery.append("Select * From  STATUS;");

			WebTable tabela = com.executeSQL(sbQuery, "Busca STATUS");
			
			int iNumLinhas = tabela.getNumLinha();
			
			for(int i = 0; i < iNumLinhas; i++)
			{  
				listaMarca.add(new Status(
						tabela.getInt("ID", i),   
						tabela.getString("NOME", i), 
						tabela.getString("DESCRICAO", i) ));
			}
			
			return listaMarca;
		}
	  
	  
	  private static ArrayList<Perfil> getPerfis(int iIdPerfil) throws Exception
	  {
			ArrayList<Perfil>  listaMarca = new ArrayList<Perfil>();
			
			com =  WebCash.getConexao(); 
			
			StringBuffer sbQuery = new StringBuffer();
			
			sbQuery.append("Select * From  PERFIL;");

			WebTable tabela = com.executeSQL(sbQuery, "Busca PERFIL");
			
			int iNumLinhas = tabela.getNumLinha();
			
			for(int i = 0; i < iNumLinhas; i++)
			{  
				listaMarca.add(new Perfil(
						tabela.getInt("ID", i),  
						tabela.getString("NOME_PERFIL", i), 
						tabela.getString("DESCRICAO_PERFIL", i), 
						tabela.getString("RESULTADO_CARACTERISTICO", i) ));
			}
			
			return listaMarca;
		}
	  
	  
	
	  private static ArrayList<PreRequisito> getPreRequisito(int iIdPreRequisito) throws Exception
	  {
			ArrayList<PreRequisito>  listaMarca = new ArrayList<PreRequisito>();
			
			com =  WebCash.getConexao(); 
			
			StringBuffer sbQuery = new StringBuffer();
			
			sbQuery.append("Select * From  PRE_REQUISITO;");

			WebTable tabela = com.executeSQL(sbQuery, "Busca PRE_REQUISITO");
			
			int iNumLinhas = tabela.getNumLinha();
			
			for(int i = 0; i < iNumLinhas; i++)
			{  
				listaMarca.add(new PreRequisito(
						tabela.getInt("ID", i),  
						tabela.getString("NOME", i), 
						tabela.getString("DESCRICAO", i) ));
			}
			
			return listaMarca;
		}
	  
	  
	  private static ArrayList<Cenario> getCenario(int iIdCenario) throws Exception
	  {
			ArrayList<Cenario>  listaMarca = new ArrayList<Cenario>();
			
			com =  WebCash.getConexao(); 
			
			StringBuffer sbQuery = new StringBuffer();
			
			sbQuery.append("Select * From  CENARIO;");

			WebTable tabela = com.executeSQL(sbQuery, "Busca Cenario");
			
			int iNumLinhas = tabela.getNumLinha();
			
			for(int i = 0; i < iNumLinhas; i++)
			{  
				listaMarca.add(new Cenario(
						tabela.getInt("ID_CENARIO", i), 
						tabela.getInt("PRE_REQUISITO", i), 
						tabela.getInt("CATEGORIA", i), 
						tabela.getString("NOME_CENARIO", i), 
						tabela.getString("RESULTADO_ESPERADO", i), 
						tabela.getString("DESCRICAO_RESULTADO", i)));
			}
			
			return listaMarca;
		}
	  
	   
}
