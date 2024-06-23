package testentidades;

import java.util.List;

import dao.ClassProductoimp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl2 producto = new TblProductocl2();
        ClassProductoimp crud = new ClassProductoimp();

        /*
        //Testeamos el metodo registrar
        producto.setNombrecl2("Sharmpoo");
        producto.setPrecioventacl2(4.50);
        producto.setPreciocompcl2(5.00);
        producto.setEstadocl2("Excelente");
        producto.setDescripcl2("Sharmpoo pantene 50mls");
        crud.RegistrarProducto(producto);
        
*/
        
        //Testeamos el metodo listar
        List<TblProductocl2> listarProducto = crud.ListarProducto();
        for(TblProductocl2 p:listarProducto){
            System.out.println("Código: "+p.getIdproductocl2()+"\n"+
                                "Nombre: "+p.getNombrecl2()+"\n"+
                                "Precio de Venta: "+p.getPrecioventacl2()+"\n"+
                                "Precio de Compra: "+p.getPreciocompcl2()+"\n"+
                                "Estado: "+p.getEstadocl2()+"\n"+
                                "Descripción: "+p.getDescripcl2()+"\n");
        }
	}

}
