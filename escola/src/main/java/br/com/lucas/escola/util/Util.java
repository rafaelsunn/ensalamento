package br.com.lucas.escola.util;

import java.util.HashMap;
import java.util.Map;

public class Util {
	
	private static Map<String, String> mensagens = new HashMap<String, String>();

	public static String retornaMensagem(String key) {
		criaLista();
		return mensagens.get(key);
	}
	
	private static void criaLista() {
		
		// Cargo
		mensagens.put("cargo.adicionado.sucesso", "Cargo adicionado com sucesso.");
		mensagens.put("cargo.alterado.sucesso", "Cargo alterado com sucesso.");
	}
	
}
