package com.br.search.product.tabela;

public class PreRequisito
{
			private int id;
			private String nome;
			private String descricao;
			
			
			public int getId()
			{
				return id;
			}



			public String getNome()
			{
				return nome;
			}



			public String getDescricao()
			{
				return descricao;
			}
 
			
			public PreRequisito(int id, String nome, String descricao )
			{
				this.id=id;
				this.nome=nome;
				this.descricao=descricao;
			}
			
}
