package DbDviagem.Crud;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Passagem {
    private int idDestino;
    private String destino;
    private float valor;
    private LocalDateTime data;
    private LocalDateTime dataDeCompra;
    private int lugarCadeira;

    public Passagem(int idDestino, String destino, float valor, LocalDateTime data, LocalDateTime dataDeCompra,
            int lugarCadeira) {
        this.idDestino = idDestino;
        this.destino = destino;
        this.valor = valor;
        this.data = data;
        this.dataDeCompra = dataDeCompra;
        this.lugarCadeira = lugarCadeira;
    }

    public Passagem() {

    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void mostrarDestino(String destino) {
       
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(LocalDateTime dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public int getLugar() {
        return lugarCadeira;
    }

    public void setLugar(int lugar) {
        this.lugarCadeira = lugar;
    }

}
