///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.esales.enterprise.entity;
//
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.TableGenerator;
//
///**
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A cópia integral ou parcial desse código, seja para uso pessoal, profissional
// * ou educacional, é proibida.
// */
//@Entity
//@Table(name = "ORGANIZACAO")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString(onlyExplicitlyIncluded = true)
//@Builder
//public class Organizacao implements java.io.Serializable {
//
//    @Id
//    @GeneratedValue(generator = "InvTaborg")
//    @TableGenerator(name = "InvTaborg", table = "ID_GEN",
//    pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", allocationSize = 1,
//    pkColumnValue = "ORGANIZACAO_ID")
//    @Column(name = "ID", nullable = false)
//    private Integer id;
//
//    @Column(name = "NOME", nullable = false)
//    @ToString.Include
//    private String nome;
//
//    @Column(name = "CNPJ")
//    private String cnpj;
//
//    @Column(name = "CODIGO")
//    private String codigo;
//
//    @Column(name = "TITULO")
//    private String titulo;
//
//    @Column(name = "SUBTITULO")
//    private String subtitulo;
//
//    @OneToMany(mappedBy = "organizacao", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private List<Usuario> usuarios = new ArrayList<>();
//
//}
