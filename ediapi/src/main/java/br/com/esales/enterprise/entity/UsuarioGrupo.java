//
//package br.com.esales.enterprise.entity;
//
//
//import lombok.*;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.*;
//
///**
// * Copyright - Todos os direitos reservados a E-Sales Integration Solutions
// *
// * A cópia integral ou parcial desse código, seja para uso pessoal, profissional
// * ou educacional, é proibida.
// */
//@Entity
//@Table(name = "USUARIO_GRUPO")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
//@Builder
//public class UsuarioGrupo implements Serializable {
//
//    @Id
//    @GeneratedValue(generator = "InvTabUsuarioGrupo")
//    @TableGenerator(name = "InvTabUsuarioGrupo", table = "ID_GEN",
//            pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", allocationSize = 1,
//            pkColumnValue = "USUARIO_GRUPO_ID")
//    @Column(name = "ID", nullable = false)
//    private Integer id;
//
//    @Column(name = "ID_USUARIO")
//    private long ID_USUARIO;
//
//    @Column(name = "ID_GRUPO")
//    private long ID_GRUPO;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID", updatable = false, insertable = false)
//    private Usuario usuario;
//
//    @ManyToOne(fetch =  FetchType.EAGER)
//    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID", updatable = false, insertable = false)
//    private GrupoUsuarios grupoUsuarios;
//
//    @Column(name = "DT_CRIACAO")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dataCriacao;
//
//    @Column(name = "INICIO")
//    @Temporal(TemporalType.DATE)
//    private Date dataInicio;
//
//    @Column(name = "FIM")
//    @Temporal(TemporalType.DATE)
//    private Date dataFim;
//
//    @Column(name = "ATIVO")
//    private boolean ativo = true;
//
//    public Date getDataCriacao() {
//        if (this.dataCriacao == null) {
//            this.dataCriacao = new Date();
//        }
//        return dataCriacao;
//    }
//
//}
