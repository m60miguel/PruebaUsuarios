package co.com.cliente.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import co.com.cliente.demo.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long> {

}
