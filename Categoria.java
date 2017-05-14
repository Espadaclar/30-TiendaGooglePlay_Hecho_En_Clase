
/**
 * Enumeration class Categoria - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Categoria
{
    JUEGOS("Juegos", 5), COMUNICACIONES("Comunicaciones", 2), MULTIMEDIA("Multimedia", 2), PRODUCTIVIDAD("Productividad", 10);
    
    private String nombreCategoria;
    private double precioSiEsPopular;
    
    Categoria(String nombreCategoria, double precioSiEsPopular)
    {
        this.nombreCategoria = nombreCategoria;
        this.precioSiEsPopular = precioSiEsPopular;
    }
    
    
    public String getNombreCategoria()
    {
        return nombreCategoria;
    }
    
    public double getPrecioSiEsPopular()
    {
        return precioSiEsPopular;
    }
}
