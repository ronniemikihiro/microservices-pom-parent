///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.esales.enterprise.entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//
///**
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A cópia integral ou parcial desse código, seja para uso pessoal, profissional
// * ou educacional, é proibida.
// */
//@Entity
//@Table(name = "PERMISSAO")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@ToString
//@Builder
//public class Permissao implements java.io.Serializable{
//
//    @Id
//    @Column(name = "ID", nullable = false)
//    @EqualsAndHashCode.Include
//    private Integer id;
//
//    @Column(name = "NOME", nullable = false)
//    private String nome;
//
//    @Column(name = "CODIGO", nullable = false)
//    private String codigo;
//
//    @Column(name = "ACTION")
//    private String action;
//
//    public boolean hasPermission(String code) {
//        boolean found = false;
//        String[] codes = code.split(",");
//        for (int i = 0; (found == false && i < codes.length); i++) {
//            if (this.getCodigo().equals(codes[i]) || this.getAction().equals(codes[i]) || this.getAction().contains(codes[i])) {
//                found = true;
//            }
//        }
//        return found;
//    }
//}