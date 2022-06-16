package co.com.cliente.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.cliente.demo.model.Usuario;
import co.com.cliente.demo.repositories.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public ArrayList<Usuario> listar() {
		return (ArrayList<Usuario>) usuarioRepository.findAll();
	}

	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Optional<Usuario> listarId(long id) {
		return usuarioRepository.findById(id);
	}

	public boolean delete(long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}

	}

}
