import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    
    
    public GooglePlay()
    {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
    }
    
    public void addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
    public void addProducto(Producto producto)
    {
        productos.add(producto);
    }
    
    public int getNumeroUsuarios()
    {
        return usuarios.size();
    }
    
    public int getNumeroProductos()
    {
        return productos.size();
    }
    
    public double comprar(String emailUsuario, String identificador)
    {
        double costeCompra = -1;
        
        Usuario usuarioBuscado = null;
        Producto productoBuscado = null;
        
        int contador = 0;
        while (contador < usuarios.size() && usuarioBuscado == null) {
            if (usuarios.get(contador).getNombreCuenta().equals(emailUsuario)) {
                usuarioBuscado = usuarios.get(contador);
            }
            contador++;
        }
       
        contador = 0;
        while (contador < productos.size() && productoBuscado == null) {
            if (productos.get(contador).getIdentificador().equals(identificador)) {
                productoBuscado = productos.get(contador);
            }
            contador++;
        }
        
        if (usuarioBuscado != null && productoBuscado != null) {
            costeCompra = productoBuscado.getPrecio();
            productoBuscado.vender();
        }
        
        return costeCompra;
    }
    
    
}





