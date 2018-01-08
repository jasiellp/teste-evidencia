package com.br.search.product;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.br.search.product.dao.ResultadoDao;
import com.br.search.product.tabela.Cenario;
import com.br.search.product.tabela.Perfil;
import com.br.search.product.tabela.PreRequisito;
import com.br.search.product.tabela.Resultado;
import com.br.search.product.tabela.Status;
import com.br.search.product.util.Sessao;
import com.br.search.product.util.WebLog;

@ManagedBean
@SessionScoped
public class TesteResultado implements Serializable
{
	private static final long serialVersionUID = -5217446585419927326L;

	 
	private String cenario,pre_requisito, perfil,statusf,dataex,sequencia; 


	public String getDataex()
	{
		return dataex;
	}

	public void setDataex(String dataex)
	{
		this.dataex = dataex;
	}

	public String getSequencia()
	{
		return sequencia;
	}

	public void setSequencia(String sequencia)
	{
		this.sequencia = sequencia;
	}

	public ArrayList<String> getDatasex()
	{
		return datasex;
	}

	public void setDatasex(ArrayList<String> datasex)
	{
		this.datasex = datasex;
	}

	public ArrayList<String> getSequencias()
	{
		return sequencias;
	}

	public void setSequencias(ArrayList<String> sequencias)
	{
		this.sequencias = sequencias;
	}

	private ArrayList<String> cenarios,pre_requisitos,perfis,status,datasex,sequencias;
	  




	private boolean vizivel;
 
	 
 			
 	 
	
	@PostConstruct
	public void init()
	{
		try
		{
			WebLog.NovoLog("Aplicacao", Sessao.retrieveSessionId());
		 
			this.cenarios 		 = new ArrayList<String>();
			this.perfis 		 = new ArrayList<String>();
			this.pre_requisitos  = new ArrayList<String>();
			this.status			 = new ArrayList<String>();
			this.datasex		 = new ArrayList<String>();
			this.sequencias		 = new ArrayList<String>();
			
			ArrayList<Cenario>  listaCenarios 		   = ResultadoDao.getCenarios();
			ArrayList<PreRequisito> listaPreRequisitos = ResultadoDao.getPreRequisito();
			ArrayList<Perfil> listaPerfil		       = ResultadoDao.getPrePerfil();
			ArrayList<Status> listastatus		       = ResultadoDao.getStatus();
			ArrayList<Resultado> listaResultados	   = ResultadoDao.getResultado();
			
			for(Cenario c : listaCenarios)
			{
				cenarios.add(c.getNome_cenario());
			}
			
			for(PreRequisito pr : listaPreRequisitos)
			{
				pre_requisitos.add(pr.getNome());
			}
			
			for(Perfil p : listaPerfil)
			{
				perfis.add(p.getNomePerfil());
			}
			 
			for(Status s : listastatus)
			{
				status.add(s.getNome());
			}
			
			for(Resultado r : listaResultados)
			{
				datasex.add(r.getData_teste());
				sequencias.add(String.valueOf(r.getSequencia_teste()));
			}
		     
			
			HashSet<String> hashSet = new HashSet<String>(sequencias);
			sequencias.clear();
			sequencias.addAll(hashSet);
			
			HashSet<String> hashSet_ = new HashSet<String>(datasex);
			datasex.clear();
			datasex.addAll(hashSet_);
		}
		catch (Exception e)
		{
			try
			{
				WebLog.logErro(e);
			}
			catch (Exception e1)
			{

			}
		}
	}
 
	public String getStatusf()
	{
		return statusf;
	}

	public void setStatusf(String statusf)
	{
		this.statusf = statusf;
	}
	
	public String getCenario()
	{
		return cenario;
	}

	public void setCenario(String tipo)
	{
		this.cenario = tipo;
	}

	public ArrayList<String> getCenarios()
	{
		return cenarios;
	}

	public void setCenarios(ArrayList<String> tipos)
	{
		this.cenarios = tipos;
	}
 

	public boolean isVizivel()
	{
		return vizivel;
	}

	public void setVizivel(boolean vizivel)
	{
		this.vizivel = vizivel;
	}
 
	private void clean()
	{
		setVizivel(false);
		 
	}

	public void onCenarioChange()
	{
		clean();

		if ((cenario != null) && (!cenario.equals("")))
		{
		 

		} 
		else
		{
			 
		}
	}
	
	public void onPerfilChange()
	{
		clean();

		if ((pre_requisito != null) && (!pre_requisito.equals("")))
		{
		 

		} 
		else
		{
			 
		}
	}
	
	public void onPreRequisitoChange()
	{
		clean();

		if ((pre_requisito != null) && (!pre_requisito.equals("")))
		{
		 

		} 
		else
		{
			 
		}
	}
	
	
	public void onStatusChange()
	{
		clean();

		if ((pre_requisito != null) && (!pre_requisito.equals("")))
		{
		 

		} 
		else
		{
			 
		}
	}
	
	public String getPre_requisito()
	{
		return pre_requisito;
	}

	public void setPre_requisito(String pre_requisito)
	{
		this.pre_requisito = pre_requisito;
	}

	public ArrayList<String> getPre_requisitos()
	{
		return pre_requisitos;
	}

	public void setPre_requisitos(ArrayList<String> pre_requisitos)
	{
		this.pre_requisitos = pre_requisitos;
	}


	public String getPerfil()
	{
		return perfil;
	}

	public void setPerfil(String perfil)
	{
		this.perfil = perfil;
	}

	public ArrayList<String> getPerfis()
	{
		return perfis;
	}

	public void setPerfis(ArrayList<String> perfis)
	{
		this.perfis = perfis;
	}

	public String jasiel()
	{
		
		System.out.println("----------------------Carga------------------------------");
		 
		
		 
	 
		System.out.println("------------------Fim----Carga------------------------------");
		
		
		
		return "/SearchProduct/cotacao";

	} 
	public void displayLocation()
	{

	 

		/*
		 * setVizivel(true); setLabelAno(ano_de.substring(0, 4));
		 * setLabelCombustivel(ano_de.substring(4, ano_de.length()));
		 * setLabelModelo(modelo); setLabelMarca(marca); setLabelPreco(sPreco);
		 */
	}

	public ArrayList<String> getStatus()
	{
		return status;
	}

	public void setStatus(ArrayList<String> status)
	{
		this.status = status;
	}
	
	public void redirect() throws IOException 
	{	   
	    FacesContext.getCurrentInstance().getExternalContext().redirect("investimento");
	}
}