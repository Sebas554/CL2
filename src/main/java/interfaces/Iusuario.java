package interfaces;

import model.TblUsuariocl2;

public interface Iusuario {
	TblUsuariocl2 validarUsuario(String usuario, String password);

}
