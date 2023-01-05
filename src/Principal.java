import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JButton;

import com.servicios.Usuario.FuncionalidadBeanRemote;
import com.servicios.Usuario.InstitutoBeanRemote;
import com.servicios.Usuario.ProfesionBeanRemote;
import com.servicios.Usuario.RolBeanRemote;
import com.servicios.Usuario.UsuarioBeanRemote;

import Controller.ConHome;
import Controller.ConLogin;
import Helper.Auxiliar;
import Helper.Globals;
//import Model.ModUsuario;
import View.VisLogin;
import model.Funcionalidad;
import model.Rol;
import model.Usuario;

public class Principal {

	public static void main(String[] args) throws Exception {
		UsuarioBeanRemote ubr = (UsuarioBeanRemote) InitialContext
				.doLookup("FromTables/UsuarioBean!com.servicios.Usuario.UsuarioBeanRemote");
		FuncionalidadBeanRemote fbr = (FuncionalidadBeanRemote) InitialContext
				.doLookup("FromTables/FuncionalidadBean!com.servicios.Usuario.FuncionalidadBeanRemote");
		RolBeanRemote rbr = (RolBeanRemote) InitialContext
				.doLookup("FromTables/RolBean!com.servicios.Usuario.RolBeanRemote");

		try {
			// ALTA FUNCIONALIDADES

			Funcionalidad f01 = new Funcionalidad();
			Funcionalidad f02 = new Funcionalidad();
			Funcionalidad f03 = new Funcionalidad();
			Funcionalidad f04 = new Funcionalidad();
			Funcionalidad f05 = new Funcionalidad();
			Funcionalidad f06 = new Funcionalidad();
			Funcionalidad f07 = new Funcionalidad();
			Funcionalidad f08 = new Funcionalidad();
			Funcionalidad f09 = new Funcionalidad();
			Funcionalidad f10 = new Funcionalidad();
			Funcionalidad f11 = new Funcionalidad();
			Funcionalidad f12 = new Funcionalidad();

			f01.setNombre("Estaciones");
			f02.setNombre("Departamentos");
			f03.setNombre("Profesiones");
			f04.setNombre("Casillas");
			f05.setNombre("Localidades");
			f06.setNombre("Institutos");
			f07.setNombre("Forms");
			f08.setNombre("Zonas");
			f09.setNombre("Roles");
			f10.setNombre("Parametros");
			f11.setNombre("Actividad");
			f12.setNombre("Usr");

			System.out.println((fbr.altaFuncionalidad(f01)) ? "Func 01 registrada" : "Func 01 no registrada");
			System.out.println((fbr.altaFuncionalidad(f02)) ? "Func 02 registrada" : "Func 02 no registrada");
			System.out.println((fbr.altaFuncionalidad(f03)) ? "Func 03 registrada" : "Func 03 no registrada");
			System.out.println((fbr.altaFuncionalidad(f04)) ? "Func 04 registrada" : "Func 04 no registrada");
			System.out.println((fbr.altaFuncionalidad(f05)) ? "Func 05 registrada" : "Func 05 no registrada");
			System.out.println((fbr.altaFuncionalidad(f06)) ? "Func 06 registrada" : "Func 06 no registrada");
			System.out.println((fbr.altaFuncionalidad(f07)) ? "Func 07 registrada" : "Func 07 no registrada");
			System.out.println((fbr.altaFuncionalidad(f08)) ? "Func 08 registrada" : "Func 08 no registrada");
			System.out.println((fbr.altaFuncionalidad(f09)) ? "Func 09 registrada" : "Func 09 no registrada");
			System.out.println((fbr.altaFuncionalidad(f10)) ? "Func 10 registrada" : "Func 10 no registrada");
			System.out.println((fbr.altaFuncionalidad(f11)) ? "Func 11 registrada" : "Func 11 no registrada");
			System.out.println((fbr.altaFuncionalidad(f12)) ? "Func 12 registrada" : "Func 12 no registrada");

			ArrayList<Funcionalidad> funcAdministrador = new ArrayList<Funcionalidad>(fbr.obtenerTodos());
			System.out.println("Obtenidas las funcionalidades de administrador -> " + funcAdministrador.size());
			ArrayList<Funcionalidad> funcExperto = new ArrayList<Funcionalidad>(fbr.obtenerDeExperto());
			System.out.println("Obtenidas las funcionalidades de experto -> " + funcExperto.size());
			ArrayList<Funcionalidad> funcComun = new ArrayList<Funcionalidad>(fbr.obtenerDeComun());
			System.out.println("Obtenidas las funcionalidades de usuario común -> " + funcComun.size());

			// ALTA DE ROLES
			Rol administrador = new Rol();
			Rol profesional = new Rol();
			Rol comun = new Rol();

			System.out.println("Alta de roles");

			administrador.setNombre("Administrador");
			profesional.setNombre("Experto");
			comun.setNombre("Común");

			System.out.println(
					(rbr.altaRol(administrador)) ? "Rol administrador registrado" : "Rol administrador no registrado");
			System.out.println(
					(rbr.altaRol(profesional)) ? "Rol profesional registrado" : "Rol profesional no registrado");
			System.out.println((rbr.altaRol(comun)) ? "Rol común registrado" : "Rol común no registrado");

			
			System.out.println("Incluidas las funcionalidades de los roles");

			ArrayList<Rol> roles = new ArrayList<Rol>(rbr.obtenerTodos());			
			
			
			for (Rol rol : roles) {
				if (rol.getNombre().equals("Administrador")) {
					System.out.println("o admin???");					
					rol.setFuncionalidades(funcAdministrador);
					System.out.println("*****************************");
					for (Funcionalidad f : rol.getFuncionalidades()) {
						System.out.println(f.getNombre());
					}
				} else if (rol.getNombre().equals("Experto")) {
					System.out.println("o experto???");
					rol.setFuncionalidades(funcAdministrador);
				} else {
					System.out.println("o común???");
					rol.setFuncionalidades(funcComun);
				}
				System.out.println((rbr.modificarRol(rol)) ? "Foreach > rol modificado" : "Foreach > rol NO modificado");
			}

			System.out.println("Maradona did nothing wrong");
			
//			// ALTA DE USUARIOS
//			Usuario u1 = new Usuario();
//			Usuario u2 = new Usuario();
//			Usuario u3 = new Usuario();
//			Usuario u4 = new Usuario();
//			Usuario u5 = new Usuario();
//
//			ArrayList<Rol> listaRoles = new ArrayList<Rol>();
//			listaRoles = rbr.obtenerTodos();
//
//			u1.setNombre("Bruno");
//			u1.setApellido("Fernandez");
//			u1.setEmail("bruno@correo.com");
//			u1.setNick("Bruno");
//			;
//			u1.setPass(Auxiliar.passwordToHash("1234"));
//			u1.setCi("55554444");
//			u1.setRole(listaRoles.get(0));
//
//			u2.setNombre("Diego");
//			u2.setApellido("González");
//			u2.setEmail("diego@correo.com");
//			u2.setNick("LaVoz");
//			;
//			u2.setPass(Auxiliar.passwordToHash("1234"));
//			u2.setCi("87654321");
//			u2.setRole(listaRoles.get(1));
//
//			u3.setNombre("Leandro");
//			u3.setApellido("do Carmo");
//			u3.setEmail("leandro@correo.com");
//			u3.setNick("Lea");
//			;
//			u3.setPass(Auxiliar.passwordToHash("1234"));
//			u3.setCi("40189991");
//			u3.setRole(listaRoles.get(2));
//
//			u4.setNombre("Marcelo");
//			u4.setApellido("Ottati");
//			u4.setEmail("marcelo@correo.com");
//			u4.setNick("Marce");
//			;
//			u4.setPass(Auxiliar.passwordToHash("1234"));
//			u4.setCi("12345678");
//			u4.setRole(listaRoles.get(0));
//
//			u5.setNombre("William");
//			u5.setApellido("Píriz");
//			u5.setEmail("willi@correo.com");
//			u5.setNick("Willi");
//			;
//			u5.setPass(Auxiliar.passwordToHash("1234"));
//			u5.setCi("44446666");
//			u5.setRole(listaRoles.get(2));
//
//			if (ubr.altaUsuario(u1) == true) {
//				System.out.println("Usuario 1 registrado");
//			} else {
//				System.out.println("Error usuario 1");
//			}
//			if (ubr.altaUsuario(u2) == true) {
//				System.out.println("Usuario 2 registrado");
//			} else {
//				System.out.println("Error usuario 2");
//			}
//			if (ubr.altaUsuario(u3) == true) {
//				System.out.println("Usuario 3 registrado");
//			} else {
//				System.out.println("Error usuario 3");
//			}
//			if (ubr.altaUsuario(u4) == true) {
//				System.out.println("Usuario 4 registrado");
//			} else {
//				System.out.println("Error usuario 4");
//			}
//			if (ubr.altaUsuario(u5) == true) {
//				System.out.println("Usuario 5 registrado");
//			} else {
//				System.out.println("Error usuario 5");
//			}
//
//			ConLogin cl = new ConLogin();
			// System.out.println(f1.getNombre());
		} catch (Exception ex) {
//			System.out.println(ex.getStackTrace());
			ex.printStackTrace();
		}
//		RolBeanRemote rbr = (RolBeanRemote) InitialContext.doLookup("PDTejb/RolBean!com.servicios.RolBeanRemote");
//		Rol r1 = new Rol();
//		r1.setNombre("Administrador");
//		r1.setDescripcion("Administrador de sistema");
//		r1.addFuncionalidad(f1);
//		rbr.alta(r1);
//		// rbr.alta("Administrador", "Administrador de sistema");
////		rbr.alta("Experto", "Creador de formularios");
////		rbr.alta("Común", "Completa formularios");
//
////		
//		// obtener un usuario
//		// asignarle a usua un rol
//
////
//		InstitutoBeanRemote ibr = (InstitutoBeanRemote) InitialContext
//				.doLookup("PDTejb/InstitutoBean!com.servicios.InstitutoBeanRemote");
//		ibr.alta("UTEC", "Universidad Tecnológica del Uruguay");
//		ibr.alta("UTU", "Universidad del Trabajo del Uruguay");
//
		// ProfesionBeanRemote pbr = (ProfesionBeanRemote) InitialContext
		// .doLookup("PDTejb/ProfesionBean!com.servicios.ProfesionBeanRemote");
		// pbr.altaProfesion("Lic. en TI", "Licenciado en Tecnologías de la
		// Información");
		// pbr.altaProfesion("Ing. Mecatrónica", "Ingeniero en Mecatrónica");
		// pbr.altaProfesion("Ing. Biomédica", "Ingeniero en Biomédica");

		// vincular roles con funcionalidades

	}

}
