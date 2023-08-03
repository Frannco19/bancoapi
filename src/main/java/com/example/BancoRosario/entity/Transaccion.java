package com.example.BancoRosario.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;
    private BigDecimal monto;

    @ManyToOne
    @JoinColumn(name = "clienteOrigen")
    private Cliente clienteOrigen;

    @ManyToOne
    @JoinColumn(name = "clienteDestino")
    private Cliente clienteDestimo;

    // Constructor, getters y setters

    public Transaccion() {
    }

    public Transaccion(Long id, LocalDateTime fecha, BigDecimal monto, Cliente clienteOrigen, Cliente clienteDestimo) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.clienteOrigen = clienteOrigen;
        this.clienteDestimo = clienteDestimo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }

    public void setClienteOrigen(Cliente clienteOrigen) {
        this.clienteOrigen = clienteOrigen;
    }

    public Cliente getClienteDestimo() {
        return clienteDestimo;
    }

    public void setClienteDestimo(Cliente clienteDestimo) {
        this.clienteDestimo = clienteDestimo;
    }
}
