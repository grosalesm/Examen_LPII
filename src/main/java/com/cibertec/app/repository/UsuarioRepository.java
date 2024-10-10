package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.app.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query(value="SELECT u.idusuario,u.usuario,u.nombres,u.apellidos,u.clave,u.idrol "
			+ "FROM usuario u where u.usuario = :usuario and u.clave = :clave",nativeQuery = true)
	public Usuario findByUsuarioAndClave(@Param("usuario") String usuario,@Param("clave") String clave);
}
