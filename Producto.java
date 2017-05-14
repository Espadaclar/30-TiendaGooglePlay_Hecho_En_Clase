
/**
 * Write a description of class Producto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private String identificador;
    private int numeroDeVecesQueSeHaVendido;
    
    public Producto(String identificador)
    {
        this.identificador = identificador;
        numeroDeVecesQueSeHaVendido = 0;
    }
    
    protected String getIdentificador()
    {
        return identificador;
    }
    
    protected double getNumeroVecesVendido()
    {
        return numeroDeVecesQueSeHaVendido;
    }
    
    public void vender()
    {
        numeroDeVecesQueSeHaVendido++;
    }
    
    public abstract double getPrecio();
    
}
