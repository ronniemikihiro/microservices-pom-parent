package br.com.esales.rest.auth.security.entity;

import br.com.esales.enterprise.entity.UserSystem;
//import br.com.esales.enterprise.entity.Usuario;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
public class UserDetailsImpl implements UserDetails {

    private UserSystem userSystem;

    public UserDetailsImpl(UserSystem userSystem) {
        this.userSystem = userSystem;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(userSystem != null && userSystem.getRoles() != null) {
            final Set<GrantedAuthority> authorities = new HashSet<>();
            userSystem.getRoles().forEach(r -> authorities.add(new SimpleGrantedAuthority(r.getDescription().toUpperCase())));
            return authorities;
        }
        return null;
//        authorities.add(new SimpleGrantedAuthority("ADMIN"));
//        return authorities;
    }

    @Override
    public String getUsername() {
        return userSystem != null ? userSystem.getEmail() : null;
    }

    @Override
    public String getPassword() {
        return userSystem != null ? userSystem.getPassword() : null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
