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
//import java.util.*;
//
///**
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A cópia integral ou parcial desse código, seja para uso pessoal, profissional
// * ou educacional, é proibida.
// */
//@Entity
//@Table(name = "USUARIO")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
///*@EqualsAndHashCode
//@ToString*/
//@Builder
//public class Usuario implements AbstractEntity {
//
//    public static enum AUTENTICACAO {
//        EDI {
//            public String toString() {
//                return "Usuário @EDI";
//            }
//        },
//        LDAP {
//            public String toString() {
//                return "Apenas LDAP";
//            }
//        },
//        SO {
//            public String toString() {
//                return "Apenas Sistema operacional";
//            }
//        },
//        EDI_SO {
//            public String toString() {
//                return "Usuário @EDI e Sistema operacional";
//            }
//        },
//        EDI_LDAP {
//            public String toString() {
//                return "Usuário @EDI e LDAP";
//            }
//        },
//        EDI_SO_LDAP {
//            public String toString() {
//                return "Usuário @EDI, LDAP e Sistema operacional";
//            }
//        }
//    }
//
//    @Id
//    @GeneratedValue(generator = "InvTabUser")
//    @TableGenerator(name = "InvTabUser", table = "ID_GEN", allocationSize = 1,
//            pkColumnName = "ID_NAME", valueColumnName = "ID_VAL",
//            pkColumnValue = "USUARIO_ID")
//    @Column(name = "ID", nullable = false)
//    private Integer id;
//
//    @Column(name = "NOME", nullable = false)
//    private String nome;
//
//    @Column(name = "USERNAME", nullable = false)
//    private String username;
//
//    @Column(name = "SENHA", insertable = true, updatable = false)
//    private String senha;
//
//    @Column(name = "SETOR")
//    private String setor;
//
//    @Column(name = "CARGO")
//    private String cargo;
//
//    @Column(name = "DOMINIO")
//    private String dominio;
//
//    @Column(name = "TIPO_AUTENTICACAO", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private AUTENTICACAO tipoAutenticacao;
//
//    /*@BatchFetch(value = BatchFetchType.JOIN)
//    @JoinFetch(value = JoinFetchType.OUTER)*/
////    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
////    @ManyToOne(fetch = FetchType.EAGER)
////    private Empresa empresa;
//
////    @OneToMany(mappedBy = "usuario",
////            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
////    private List<UsuarioEmail> emails = new ArrayList<UsuarioEmail>();
//
//    /*@BatchFetch(value = BatchFetchType.JOIN)
//    @JoinFetch(value = JoinFetchType.OUTER)*/
////    @JoinColumn(name = "ID_PERFIL", referencedColumnName = "ID")
////    @ManyToOne(fetch = FetchType.EAGER)
////    private Perfil perfil;
//
//    @Column(name = "TENTATIVA_RECONEXAO")
//    private Integer tentativaReconexao;
//
//    @Column(name = "TEMPO_TENTATIVAS")
//    private Integer tempoTentativas;
//
//    @Column(name = "MAXIMO_CONEXOES")
//    private Integer maximoConexoes;
//
//    @Column(name = "DIRETORIO_ORIGEM")
//    private String diretorioOrigem;
//
//    @Column(name = "DIRETORIO_DESTINO")
//    private String diretorioDestino;
//
//    @Column(name = "MAXIMO_BANDA")
//    private Integer maximoBanda;
//
//    @Column(name = "TEMPO_LIMPEZA_LOGS_BANCO")
//    private Integer tempoLimpezaLogsBanco;
//
//    @Column(name = "ULTIMA_LIMPEZA_BANCO")
//    @Temporal(TemporalType.DATE)
//    private Date ultimaLimpezaBanco;
//
//    @Column(name = "DN_LDAP")
//    private String dnLdap;
//
//    @Column(name = "QT_TENTATIVAS")
//    private Integer quantidadeTentativas = 0;
//
//    @Column(name = "EXPIRA_SENHA")
//    @Temporal(TemporalType.DATE)
//    private Date expiraSenha;
//
//    @Column(name = "TIMEOUT_USUARIO")
//    private Integer timeout;
//
//    @Column(name = "CPF")
//    private String cpf;
//
//    @Column(name = "CERTIFICADO")
//    private String certificado;
//
//    @Column(name = "VERTICAL")
//    private String vertical;
//
//    @Column(name = "ULTIMO_ACESSO")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date ultimoAcesso;
//
//    @Column(name = "TELEFONE")
//    private String telefone;
//
//    @Column(name = "HASH_VALIDATION")
//    private String hashValidation;
//
//    @Column(name = "ATIVO")
//    private Short ativo;
//
//    @Column(name = "SERVICE", nullable = false)
//    private Short service;
//
//    @Column(name = "ACCESS_TOKEN")
//    private String accessToken;
//
//    /*@BatchFetch(value = BatchFetchType.JOIN)
//    @JoinFetch(value = JoinFetchType.OUTER)*/
////    @JoinColumn(name = "ID_ORGANIZACAO", referencedColumnName = "ID")
////    @ManyToOne(fetch = FetchType.EAGER)
////    private Organizacao organizacao;
//
//    @Column(name = "MULTICONEXAO", nullable = false)
//    private Short multiconexao;
//
//    @Column(name = "IP_CLIENT")
//    private String ipClient;
//
//    @Column(name = "DIRETORIO_ORIGEM_COPIA")
//    private String diretorioOrigemCopia;
//
//    @Column(name = "DIRETORIO_DESTINO_COPIA")
//    private String diretorioDestinoCopia;
//
//    @Column(name = "MASCARA_RENOMEIO")
//    private String mascaraRenomeio;
//
//    @Column(name = "RENOMEIO_COPIA_ORIGEM")
//    private String renomeioCopiaOrigem;
//
//    @Column(name = "RENOMEIO_COPIA_DESTINO")
//    private String renomeioCopiaDestino;
//
////    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
////    private Set<UsuarioGrupo> usuarioGrupos = new HashSet<UsuarioGrupo>();
//
//    @Column(name = "COMPARTILHAR_PASTA_CXA", nullable = false)
//    private boolean compartilharPasta;
//
//    @Transient
//    private String tipoAutenticacaoStr = null;
//
//    public Usuario(Integer id) {
//        this.id = id;
//    }
//
////    public Set<UsuarioGrupo> getUsuarioGrupos() {
////        return usuarioGrupos;
////    }
////
////    public void setUsuarioGrupos(Set<UsuarioGrupo> usuarioGrupos) {
////        this.usuarioGrupos = usuarioGrupos;
////    }
//
////    public Organizacao getOrganizacao() {
////        return organizacao;
////    }
////
////    public void setOrganizacao(Organizacao organizacao) {
////        this.organizacao = organizacao;
////    }
//
////    public List<UsuarioEmail> getEmails() {
////        return emails;
////    }
////
////    public void setEmails(List<UsuarioEmail> emails) {
////        this.emails = emails;
////    }
////
////    public Perfil getPerfil() {
////        if (perfil == null) {
////            this.perfil = new Perfil();
////        }
////        return perfil;
////    }
////
////    public void setPerfil(Perfil perfil) {
////        this.perfil = perfil;
////    }
//
////    public Empresa getEmpresa() {
////        return empresa;
////    }
////
////    public void setEmpresa(Empresa empresa) {
////        this.empresa = empresa;
////    }
//
//    public Integer getId() {
//        if (this.id == null) {
//            this.id = 0;
//        }
//        return this.id;
//    }
//
//    public Short getAtivo() {
//        if (ativo == null) {
//            ativo = 1;
//        }
//        return ativo;
//    }
//
//    public Short getMulticonexao() {
//        if (multiconexao == null) {
//            multiconexao = 0;
//        }
//        return multiconexao;
//    }
//
//    public boolean isActive() {
//        return this.getAtivo() != null && this.getAtivo().equals((short) 1);
//    }
//
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Usuario that = (Usuario) o;
////        if (this.usuarioGrupos != null ? !this.usuarioGrupos.equals(that.usuarioGrupos) : that.usuarioGrupos != null) return false;
//        return true;
//    }
//
//    public int hashCode() {
//        return (int) id * nome.hashCode() * username.hashCode();
//    }
//
//    public String toString() {
//        String name = nome;
//        if (vertical != null && !vertical.trim().isEmpty()) {
//            name = name + " - " + vertical;
//        }
//        return name;
//    }
//
//}