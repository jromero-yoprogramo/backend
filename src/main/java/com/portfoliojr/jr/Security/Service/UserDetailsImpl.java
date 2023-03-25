package com.portfoliojr.jr.Security.Service;

import com.portfoliojr.jr.Security.Entity.Usuario;
import com.portfoliojr.jr.Security.Entity.UsuarioPrincipal;
import javax.transaction.Transactional;
//import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
         Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
         return UsuarioPrincipal.build(usuario);
    }
}
