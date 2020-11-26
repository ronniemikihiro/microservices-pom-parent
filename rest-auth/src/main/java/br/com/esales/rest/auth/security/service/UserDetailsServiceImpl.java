package br.com.esales.rest.auth.security.service;

import br.com.esales.enterprise.entity.UserSystem;
//import br.com.esales.enterprise.entity.Usuario;
import br.com.esales.enterprise.repository.UserSystemRepository;
//import br.com.esales.enterprise.repository.UsuarioRepository;
import br.com.esales.rest.auth.security.entity.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserSystemRepository userSystemRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final UserSystem userSystem = userSystemRepository.findByEmail(email);
        if(userSystem == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        return new UserDetailsImpl(userSystem);
    }
}
