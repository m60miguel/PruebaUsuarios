package co.com.cliente.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.cliente.demo.model.Usuario;
import co.com.cliente.demo.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	@GetMapping
	public ArrayList<Usuario> listar() {
		return usuarioService.listar();
	}

	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		return this.usuarioService.save(usuario);
	}

	@GetMapping(path = "/{id}")
	public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id) {
		return this.usuarioService.listarId(id);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.usuarioService.delete(id);
		if (ok) {
			return "Se eliminó el usuario con id " + id;
		} else {
			return "No pudo eliminar el usuario con id" + id;
		}
	}
}
