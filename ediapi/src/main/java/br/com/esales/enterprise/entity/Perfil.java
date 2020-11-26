///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.esales.enterprise.entity;
//
///*import org.eclipse.persistence.annotations.BatchFetch;
//import org.eclipse.persistence.annotations.BatchFetchType;
//import org.eclipse.persistence.annotations.JoinFetch;
//import org.eclipse.persistence.annotations.JoinFetchType;*/
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Set;
//
///**
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A cópia integral ou parcial desse código, seja para uso pessoal, profissional
// * ou educacional, é proibida.
// */
//@Entity
//@Table(name = "PERFIL")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
//@Builder
//public class Perfil implements java.io.Serializable {
//
//    @Id
//    @GeneratedValue(generator = "InvTabPerfil")
//    @TableGenerator(name = "InvTabPerfil", table = "ID_GEN", allocationSize = 1,
//            pkColumnName = "ID_NAME", valueColumnName = "ID_VAL",
//            pkColumnValue = "PERFIL_ID")
//    @Column(name = "ID", nullable = false)
//    private Integer id;
//
//    @Column(name = "NOME", nullable = false)
//    private String nome;
//
//    @OneToMany(mappedBy = "perfil")
//    private Set<Usuario> usuarios;
//
//    @JoinTable(name="PERFIL_PERMISSAO",
//            joinColumns={ @JoinColumn(name="ID_PERFIL", referencedColumnName="ID") },
//            inverseJoinColumns={ @JoinColumn(name="ID_PERMISSAO", referencedColumnName="ID") })
//    /*@BatchFetch(value = BatchFetchType.JOIN)
//    @JoinFetch(value = JoinFetchType.OUTER)*/
//    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
//    private Set<Permissao> permissoes;
//
//    /*@OneToMany(mappedBy = "perfil", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private Collection<PerfilServidor> servidores;
//
//    @OneToMany(mappedBy = "perfil", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private Collection<PerfilConta> contas;*/
//
//    public boolean isAdmin() {
//        return this.nome.toLowerCase() == "admin" || this.id == 1 || this.hasAdminPermission();
//    }
//
//    private boolean hasAdminPermission() {
//        return this.permissoes != null && this.permissoes.stream().anyMatch(p -> p != null && p.getCodigo().equals("ADMUG"));
//    }
//}
