package com.mycompany.practica3_1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Heroe")
public class Heroe {
    
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column (name="HeroesID")
    private int Id;
    
    @Column (name="Alias")
    private String Alias;
    
    @Column (name="Ataque")
    private int Ataque;
    
    @Column (name="Debilidades")
    private String Debilidades;
     
    @Column (name="Defensa")
    private int Defensa;
     
    @Column (name="Fortaleza")
    private String Fortaleza;
    
    @Column (name="Nivel")
    private int Nivel;
    
    @Column (name="Nombre")
    private String Nombre;
    
    @Column (name="Vida")
    private int Vida;
    
    public  Heroe(){
    
    }
    
    public Heroe (int id,String alias,int ataque, String debilidades, int defensa, String fortaleza,
            int nivel, String nombre, int vida ){
        this.Id = id;
        this.Alias = alias;
        this.Ataque = ataque;
        this.Debilidades = debilidades;
        this.Defensa = defensa;
        this.Fortaleza = fortaleza;
        this.Nivel = nivel;
        this.Nombre = nombre;
        this.Vida = vida;
    }

    
    
    public int getId(){
        return Id;
    }
    
    public void setId(int id){
        this.Id = id;
    }
    
    
    public String getAlias(){
        return Alias;
    }
    
    public void setAlias(String Alias){
        this.Alias = Alias;
    }
    
    
    public int getAtaque(){
        return Ataque;
    }
    
    public void setAtaque(int Ataque){
        this.Ataque = Ataque;
    }
    
    public String getDebilidades(){
        return Debilidades;
    }
    
    public void setDebilidades(String Debilidades){
        this.Debilidades = Debilidades;
    }
    
    public int getDefensa(){
        return Defensa;
    }
    
    public void setDefensa(int Defensa){
        this.Defensa = Defensa;
    }
  
    public String getFortaleza(){
        return Fortaleza;
    }
    
    public void setFortaleza(String Fortaleza){
        this.Fortaleza = Fortaleza;
    }
    
    public int getNivel(){
        return Nivel;
    }
    
    public void setNivel(int Nivel){
        this.Nivel = Nivel;
    }
    
      public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

     public int getVida(){
        return Vida;
    }
    
    public void setVida(int Vida){
        this.Vida = Vida;
    }
}