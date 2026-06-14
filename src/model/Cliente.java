package src.model;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private String estado;
    private TipoCliente tipoCliente;

    public Cliente(
            String nome,
            String email,
            String telefone,
            String estado,
            TipoCliente tipoCliente
    ) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.estado = estado;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}