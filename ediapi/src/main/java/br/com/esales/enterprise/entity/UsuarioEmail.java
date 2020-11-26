///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.esales.enterprise.entity;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
///**
// *
// *
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A c�pia integral ou parcial desse c�digo, seja para uso pessoal, profissional ou
// * educacional, � proibida.
// *
// * @author Marison Gomes
// */
//@Entity
//@Table(name = "USUARIO_EMAIL")
//public class UsuarioEmail implements Serializable {
//
//    @Id
//    @Column(name = "ID", nullable = false)
//    private Integer id;
//    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
//    @ManyToOne
//    private Usuario usuario;
//    @Column(name = "EMAIL")
//    private String email;
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
//
//
//}
