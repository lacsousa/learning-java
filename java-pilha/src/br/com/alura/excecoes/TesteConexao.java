package br.com.alura.excecoes;

public class TesteConexao {

	public static void main(String[] args) {
			
		
			// Java 1.7 
		try (Conexao conexao = new Conexao() ) {
			conexao.leDados();
			//conexao.close();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		//-----------------------------
		
		/* Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		} finally {
			System.out.println("finally");
			if(con != null) {
				con.close();
			}
		} */
		

	}

}
