package interfaces;

import java.util.List;

import model.TblProductocl2;

public interface Iproducto {
	public void RegistrarProducto(TblProductocl2 producto);
    public List<TblProductocl2> ListarProducto();

}
