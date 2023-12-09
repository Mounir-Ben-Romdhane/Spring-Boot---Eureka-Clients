package com.example.eurekaclientcurrency.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Currency {

    @Id
    private Long id;

    private String code; // Code de la devise (par exemple, USD, EUR)
    private String name; // Nom complet de la devise (par exemple, US Dollar, Euro)
    private String symbol; // Symbole de la devise (par exemple, $, €)

    public Currency(String code, String name, String symbol) {
        this.code=code;
        this.name=name;
        this.symbol=symbol;
    }

    public Currency() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
