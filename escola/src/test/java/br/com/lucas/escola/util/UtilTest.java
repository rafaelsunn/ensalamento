package br.com.lucas.escola.util;

import junit.framework.Assert;

import org.junit.Test;


public class UtilTest {

	@Test
	public void deveriaRetornarMensagemCargoAdicionadoComSucesso() {
		String mensagem = Util.retornaMensagem("cargo.adicionado.sucesso");
		Assert.assertEquals("Cargo adicionado com sucesso.", mensagem);
	}
	
	
}
