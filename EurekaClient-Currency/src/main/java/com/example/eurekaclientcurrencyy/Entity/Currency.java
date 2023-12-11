package com.example.eurekaclientcurrencyy.Entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Currency {

    @Id
    @GeneratedValue

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
