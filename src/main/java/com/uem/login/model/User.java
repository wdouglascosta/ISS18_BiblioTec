package com.uem.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "*Informe um nome")
    private String name;

    @Column(name = "CPF")
    @CPF(message = "*Informe um CPF valido")
    @NotEmpty(message ="*Informe o CPF")
    private String cpf;

    @Column(name = "email")
    @Email(message = "*Informe um e-mail valido")
    @NotEmpty(message = "*Informe um e-mail")
    private String email;

    @Column(name = "password")
    @Length(min = 5, message = "*Sua senha deve ter pelo menos 5 caracteres\n")
    @NotEmpty(message = "*Por favor, forneça sua senha")
    private String password;

    @Column(name = "RG")
    @NotEmpty(message ="*Informe o RG")
    private String rg;

    @Column(name = "Sexo")
    @NotEmpty(message ="*Informe o sexo")
    private String sexo;

    @Column(name = "Endereco")
    @NotEmpty(message ="*Informe um endereco")
    private String endereco;

    @Column(name = "DataNasc")
    @NotEmpty(message ="*Informe a data de nascimento")
    private String dataNascimento;

    @Column(name = "Telefone")
    @NotEmpty(message ="*Informe o telefone")
    private String telefone;

    @Column(name = "Ativo")
    private int ativo;

    @Column(name = "TipoPessoa")
    private String tipoPessoa;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
