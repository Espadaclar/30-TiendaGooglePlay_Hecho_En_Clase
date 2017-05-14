
/**
 * Write a description of class Pelicula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    private int duracionEnMinutos;
    private int calidad;
    private static int CALIDAD_FULLHD = 1080;
    
    public Pelicula(String identificador, int ano, int duracion, int calidad)
    {
        super(identificador, ano);
        this.duracionEnMinutos = duracion;
        this.calidad = calidad;
    }

    public int getDuracion()
    {
        return duracionEnMinutos;
    }
    
    public String getCalidad()
    {     
        return (calidad >= CALIDAD_FULLHD) ? "FullHD" : "HD";
    }
    
    @Override
    public double getPrecio()
    {
        double precio = 5;
        if (calidad == CALIDAD_FULLHD) {
            precio = 10;
        }

        if (getAno() < 2000) {
            precio = precio/2;
        }
        
        return precio;
    }
}
