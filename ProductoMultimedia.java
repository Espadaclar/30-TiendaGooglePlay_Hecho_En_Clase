
/**
 * Write a description of class ProductoMultimedia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    private int ano;
    
    public ProductoMultimedia(String identificador, int ano)
    {
        super(identificador);
        this.ano = ano;
    }
    
    public String getTitulo()
    {
        return getIdentificador();
    }
    
    public int getAno()
    {
        return ano;
    }
    
    

}
