package br.com.adriano.gestaodespesas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.adriano.gestaodespesas.builder.PessoaBuilder;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping(value = "/pessoa")
	public ResponseEntity<PessoaBuilder> index() {
		PessoaBuilder pessoaBuilder = new PessoaBuilder.Builder(true).brinco(true).tatuagem(true).build();
		return ResponseEntity.ok(pessoaBuilder);
	}
}
