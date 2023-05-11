package com.porfolio.egfap.Security.Service;

import com.porfolio.egfap.Security.Entity.Usuario;
import com.porfolio.egfap.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
      Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
      return UsuarioPrincipal.buid(usuario);
    }
    
}