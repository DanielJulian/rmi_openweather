package edu.undav.pdist.entities;

import org.junit.Assert;
import org.junit.Test;

public class CiudadTest {

	@Test
	public void newEmpleado() {
		String id = "2";
		String nombre = "nombre";

		Ciudad empleado = new Ciudad(nombre, id);

		Assert.assertEquals(id, empleado.getId());
		Assert.assertEquals(nombre, empleado.getNombre());
	}
}
