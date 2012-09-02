package com.cavernsf.utils;

/**
 * Validation result value Object
 * @author Danilo Ferreira
 *
 */
public class ValidationResultVO {

	private boolean valido;
	private String mensagem;
	
	
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
