
/**
 * Write a description of class Libro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int numeroDePaginas;
    private boolean esFiccion;
    
    public Libro(String identificador, int ano, int numeroPaginas, boolean esFiccion)
    {
        super(identificador, ano);
        this.numeroDePaginas = numeroPaginas;
        this.esFiccion = esFiccion;
    }
    
    public int getNumeroPaginas()
    {
        return numeroDePaginas;
    }
    
    public boolean getFiccion()
    {
        return esFiccion;
    }
    
    @Override
    public double getPrecio()
    {
        return (numeroDePaginas / 100) * (getAno() - 2010);
    }
        
    
}
