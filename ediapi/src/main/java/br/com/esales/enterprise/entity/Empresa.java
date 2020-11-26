///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.esales.enterprise.entity;
//
//import javax.persistence.*;
//import java.util.stream.Collectors;
//
///**
// *
// *
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A c�pia integral ou parcial desse c�digo, seja para uso pessoal, profissional
// * ou educacional, � proibida.
// *
// * @author Marison Gomes
// */
//@Entity
//@Table(name = "EMPRESA")
//public class Empresa implements java.io.Serializable {
//
//    @Id
//    @GeneratedValue(generator = "InvTabemp")
//    @TableGenerator(name = "InvTabemp", table = "ID_GEN",
//            pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", allocationSize = 1,
//            pkColumnValue = "EMPRESA_ID")
//    @Column(name = "ID", nullable = false)
//    private Integer id;
//
//    @Column(name = "NOME", nullable = false)
//    private String nome;
//
//    @Column(name = "CONTA", nullable = false)
//    private String conta;
//
//    @Column(name = "USERNAME", nullable = false)
//    private String username;
//
//    @Column(name = "SENHA", nullable = false)
//    private String password;
//
//    @Column(name = "CAIXA", nullable = false)
//    private String caixa;
//
//    @Column(name = "LIMITE_KB", nullable = false)
//    private Integer limiteKb;
//
//    @Column(name = "LIMITE_ARQUIVOS", nullable = false)
//    private Integer limiteArquivos;
//
//    /*@Column(name = "PERMITE_LISTAR", nullable = false)
//    private Short permiteListar = 1;
//    @OneToMany(mappedBy = "empresa",
//            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private List<EmpresaPasta> diretorios;
//
//    @OneToMany(mappedBy = "origem",
//            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private List<EmpresaRegra> origens;*/
//
//
////    @OneToMany(mappedBy = "destino",
////    cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
////    private List<EmpresaRegra> destinos;
//
//
//    /*@JoinColumn(name = "ID_USUARIO_CAIXA", referencedColumnName = "ID")
//    @ManyToOne
//    private Usuario usuario;
//
//    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID")
//    @ManyToOne
//    private GrupoEmpresa grupo;
//
//    @Column(name = "PASTA_COMPARTILHADA")
//    private String pastaCompartilhada;*/
//
//    /*public GrupoEmpresa getGrupo() {
//        return grupo;
//    }
//
//    public void setGrupo(GrupoEmpresa grupo) {
//        this.grupo = grupo;
//    }
//
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }*/
//
////    public List<EmpresaRegra> getDestinos() {
////        if(destinos == null){
////            destinos=new ArrayList<EmpresaRegra>();
////        }
////        return destinos;
////    }
//
////    public void setDestinos(List<EmpresaRegra> destinos) {
////        this.destinos = destinos;
////    }
//
//    /*public List<EmpresaRegra> getOrigens() {
//        if (origens == null) {
//            origens = new ArrayList<EmpresaRegra>();
//        }
//        return origens;
//    }
//
//    public void setOrigens(List<EmpresaRegra> origens) {
//        this.origens = origens;
//    }*/
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//
//    /*public List<EmpresaPasta> getDiretorios() {
//        if (diretorios == null) {
//            diretorios = new ArrayList<EmpresaPasta>();
//        }
//        return diretorios;
//    }
//
//    public void setDiretorios(List<EmpresaPasta> diretorios) {
//        this.diretorios = diretorios;
//    }*/
//
//    public Integer getLimiteArquivos() {
//        return limiteArquivos;
//    }
//
//    public void setLimiteArquivos(Integer limiteArquivos) {
//        this.limiteArquivos = limiteArquivos;
//    }
//
//    public Integer getLimiteKb() {
//        return limiteKb;
//    }
//
//    public void setLimiteKb(Integer limiteKb) {
//        this.limiteKb = limiteKb;
//    }
//
//    /*public Short getPermiteListar() {
//        return permiteListar;
//    }
//
//    public void setPermiteListar(Short permiteListar) {
//        this.permiteListar = permiteListar;
//    }*/
//
//    public String getCaixa() {
//        return caixa;
//    }
//
//    public void setCaixa(String caixa) {
//        this.caixa = caixa;
//    }
//
//    public String getConta() {
//        return conta;
//    }
//
//    public void setConta(String conta) {
//        this.conta = conta;
//    }
//
//    public Integer getId() {
//        if (this.id == null) {
//            this.id = 0;
//        }
//        return this.id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getDesc() {
//        return toString();
//    }
//
//    /*public String toString() {
//        String temp = nome;
//        if (StringUtils.isNotBlank(getCaixa())) {
//            temp = getCaixa() + " - " + temp;
//        }
//        return temp;
//    }
//
//    public String getPastaCompartilhada() {
//        return pastaCompartilhada;
//    }
//
//    public void setPastaCompartilhada(String pastaCompartilhada) {
//        this.pastaCompartilhada = pastaCompartilhada;
//    }
//
//    public boolean isSharedFolder() {
//        return StringUtils.isNotBlank(this.pastaCompartilhada);
//    }
//
//    public List<EmpresaRegra> getSourcesByRule(Integer id) {
//        return this.getOrigens().stream()
//                .filter(er -> er.getRegra() != null && er.getRegra().getId().equals(id))
//                .collect(Collectors.toList());
//    }*/
//}
