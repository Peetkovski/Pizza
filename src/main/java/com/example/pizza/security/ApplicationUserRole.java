package com.example.pizza.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.example.pizza.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    CUSTOMER(Sets.newHashSet()),
    WORKER(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));


    private final Set<ApplicationUserPermission> permissions;


    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }


    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }


    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {

        Set<SimpleGrantedAuthority> permissionsAuthority = getPermissions().stream()
                .map(permissions -> new SimpleGrantedAuthority(permissions.getPermission()))
                .collect(Collectors.toSet());

        permissionsAuthority.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

        return permissionsAuthority;
    }

}