package com.brq.camel.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.brq.camel.models.UsuarioModel;

@RestController
@RequestMapping (value = "usuarios")
public class UsuarioController {
	
	private ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
	
	//construtor chama metodo
	public UsuarioController() {
		this.adicionarUsuarios();
	}
	
	@GetMapping(value = "")
	public ArrayList<UsuarioModel> getAll() {
		return this.usuarios;
	}
	
	//pega o path params
	@GetMapping(value = "{id}")
	public UsuarioModel getOne(@PathVariable("id") int id) {
		return this.usuarios.get(id);
	}
	
	//post salva usuario
	@PostMapping (value = "")
	public void save(@RequestBody UsuarioModel usuario) {
		this.usuarios.add(usuario);
	}
	
	//edit patch
	@PatchMapping(value = "{id}")
	public UsuarioModel update(
			@RequestBody UsuarioModel usuario,
			@PathVariable("id") int id) {
		
		for (int i = 0; i < this.usuarios.size(); i++) {
			if(id == this.usuarios.get(i).getId()) {
				this.usuarios.get(i).setEmail(usuario.getEmail());
				this.usuarios.get(i).setName(usuario.getName());
			}
		} return usuario;
	}
	
	//instancia um novo usuario e insere no arraylist
	private void adicionarUsuarios() {
		UsuarioModel usuario = new UsuarioModel(1, "Yaguim", "yago@teste.com");
		this.usuarios.add(usuario);
		usuario = new UsuarioModel(2, "Andressa", "dre@teste.com");
		this.usuarios.add(usuario);
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable("id") int id) throws Exception {
		try {
			this.usuarios.remove(id);
		} catch (IndexOutOfBoundsException e) {
			throw new Exception("ID não encontrado!");
		}catch (Exception e) {
			throw new Exception("Erro no servidor.");
		}
	}

}
