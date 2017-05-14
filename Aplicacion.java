
/**
 * Write a description of class Aplicacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private Categoria categoria;
    private double pesoEnMB;
    private static final int DESCARGAS_PARA_SER_POPULAR = 2;
    private static final double PRECIO_INICIAL = 0.99;

    
    public Aplicacion(String identificador, double pesoEnMB, Categoria categoria)
    {
        super(identificador);
        this.categoria = categoria;
        this.pesoEnMB = pesoEnMB;
    }
    
    public double getTamanoEnMB()
    {
        return pesoEnMB;
    }
    
    public String getNombre()
    {
        return getIdentificador();
    }
    
    public String getCategoria()
    {
        return categoria.getNombreCategoria();
    }
    
    @Override
    public double getPrecio()
    {
        double precio = PRECIO_INICIAL;
        if (getNumeroVecesVendido() >= DESCARGAS_PARA_SER_POPULAR) {
            precio = categoria.getPrecioSiEsPopular();
        }        
        return precio;
    }
   
 
}
