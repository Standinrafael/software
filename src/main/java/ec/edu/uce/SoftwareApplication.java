package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Curso;
import ec.edu.uce.service.ICursoService;
import ec.edu.uce.service.IDocenteService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IGestorDocenteService;
import ec.edu.uce.service.IGestorEstudianteService;
import ec.edu.uce.service.IGestorUsuario;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IUsuarioService;



@SpringBootApplication
public class SoftwareApplication implements CommandLineRunner {

	@Autowired
	private IDocenteService docenteService;
	
	@Autowired
	private ICursoService cursoService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IGestorEstudianteService gestorEstudiante;
	
	@Autowired
	private IGestorDocenteService gestorDocente; 
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IGestorUsuario gestorUsuario;
	
	
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(SoftwareApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//------------------------------------------Insertar Curso------------------------------------------------------------------------
//		Curso curso1= new Curso();
//		curso1.setNombre("Primero");
//		curso1.setParalelo("A");
//		
//		Curso curso2=new Curso();
//		curso2.setNombre("Primero");
//		curso2.setParalelo("B");
//		
//		Curso curso3= new Curso();
//		curso3.setNombre("Segundo");
//		curso3.setParalelo("A");
//		
//		Curso curso4=new Curso();
//		curso4.setNombre("Segundo");
//		curso4.setParalelo("B");
//		
//		Curso curso5= new Curso();
//		curso5.setNombre("Tercero");
//		curso5.setParalelo("A");
//		
//		Curso curso6=new Curso();
//		curso6.setNombre("Tercero");
//		curso6.setParalelo("B");
//		
//		Curso curso7= new Curso();
//		curso7.setNombre("Cuarto");
//		curso7.setParalelo("A");
//		
//		Curso curso8=new Curso();
//		curso8.setNombre("Cuarto");
//		curso8.setParalelo("B");
//		
//		Curso curso9= new Curso();
//		curso9.setNombre("Quinto");
//		curso9.setParalelo("A");
//		
//		Curso curso10=new Curso();
//		curso10.setNombre("Quinto");
//		curso10.setParalelo("B");
//		
//		Curso curso11= new Curso();
//		curso11.setNombre("Sexto");
//		curso11.setParalelo("A");
//		
//		Curso curso12=new Curso();
//		curso12.setNombre("Sexto");
//		curso12.setParalelo("B");
//		
//		Curso curso13= new Curso();
//		curso13.setNombre("Septimo");
//		curso13.setParalelo("A");
//		
//		Curso curso14=new Curso();
//		curso14.setNombre("Septimo");
//		curso14.setParalelo("B");
//		
//		
//		
//		this.cursoService.insertarCurso(curso1);
//		this.cursoService.insertarCurso(curso2);
//		this.cursoService.insertarCurso(curso3);
//		this.cursoService.insertarCurso(curso4);
//		this.cursoService.insertarCurso(curso5);
//		this.cursoService.insertarCurso(curso6);
//		this.cursoService.insertarCurso(curso7);
//		this.cursoService.insertarCurso(curso8);
//		this.cursoService.insertarCurso(curso9);
//		this.cursoService.insertarCurso(curso10);
//		this.cursoService.insertarCurso(curso11);
//		this.cursoService.insertarCurso(curso12);
//		this.cursoService.insertarCurso(curso13);
//		this.cursoService.insertarCurso(curso14);
		
		//-------------------------------------------------------------Insertar Materia------------------------------------------------------
//		
//		Materia materia1= new Materia();
//		materia1.setNombre("Matematicas");
//		
//		Materia materia2=new Materia();
//		materia2.setNombre("Lenguaje");
//		
//		Materia materia3= new Materia();
//		materia3.setNombre("Sociales");
//		
//		Materia materia4=new Materia();
//		materia4.setNombre("Ciencias");
//		
//		Materia materia5= new Materia();
//		materia5.setNombre("Aleman");
//		
//		
//		
//		this.materiaService.insertarMateria(materia1);
//		this.materiaService.insertarMateria(materia2);
//		this.materiaService.insertarMateria(materia3);
//		this.materiaService.insertarMateria(materia4);
//		this.materiaService.insertarMateria(materia5);
//		
		
		
		
		//------------------------------------------Insertar Estudiantes-------------------------------------------------------------------
//		Estudiante estudiante1= new Estudiante();
//		estudiante1.setNombre("Julissa Stefania");
//		estudiante1.setApellido("Jaramillo Hidalgo");
//		estudiante1.setCorreo("jusjh@gutemberg.edu.ec");
//		estudiante1.setContrasenia("67890");
//		estudiante1.setDireccion("Alameda y Perez Hidalgo");
//		estudiante1.setEdad(5);
//		estudiante1.setNumeroMateria(5);
//		estudiante1.setTelefono("0225633");
//		estudiante1.setMatematicas(new BigDecimal("8.00"));
//		estudiante1.setLenguaje(new BigDecimal("8.00"));
//		estudiante1.setSociales(new BigDecimal("8.00"));
//		estudiante1.setCiencias(new BigDecimal("8.00"));
//		estudiante1.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante2= new Estudiante();
//		estudiante2.setNombre("Julian Rafael");
//		estudiante2.setApellido("Sanchez Iñiguez");
//		estudiante2.setCorreo("jurai@gutemberg.edu.ec");
//		estudiante2.setContrasenia("67890");
//		estudiante2.setDireccion("Esmeraldas y napo");
//		estudiante2.setEdad(5);
//		estudiante2.setNumeroMateria(5);
//		estudiante2.setTelefono("022555");
//		estudiante2.setMatematicas(new BigDecimal("0.00"));
//		estudiante2.setLenguaje(new BigDecimal("9.00"));
//		estudiante2.setSociales(new BigDecimal("9.00"));
//		estudiante2.setCiencias(new BigDecimal("9.00"));
//		estudiante2.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante3= new Estudiante();
//		estudiante3.setNombre("Felipe Alexander");
//		estudiante3.setApellido("Suing Bailon");
//		estudiante3.setCorreo("fesuba@gutemberg.edu.ec");
//		estudiante3.setContrasenia("67890");
//		estudiante3.setDireccion("Alameda y Perez Hidalgo");
//		estudiante3.setEdad(5);
//		estudiante3.setNumeroMateria(5);
//		estudiante3.setTelefono("0225633");
//		estudiante3.setMatematicas(new BigDecimal("10.00"));
//		estudiante3.setLenguaje(new BigDecimal("10.00"));
//		estudiante3.setSociales(new BigDecimal("10.00"));
//		estudiante3.setCiencias(new BigDecimal("10.00"));
//		estudiante3.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante4= new Estudiante();
//		estudiante4.setNombre("Paulina Yahaira");
//		estudiante4.setApellido("Andrade Sanchez");
//		estudiante4.setCorreo("payan@gutemberg.edu.ec");
//		estudiante4.setContrasenia("67890");
//		estudiante4.setDireccion("Esmeraldas y napo");
//		estudiante4.setEdad(5);
//		estudiante4.setNumeroMateria(5);
//		estudiante4.setTelefono("022555");
//		estudiante4.setMatematicas(new BigDecimal("8.00"));
//		estudiante4.setLenguaje(new BigDecimal("8.00"));
//		estudiante4.setSociales(new BigDecimal("8.00"));
//		estudiante4.setCiencias(new BigDecimal("8.00"));
//		estudiante4.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante5= new Estudiante();
//		estudiante5.setNombre("Victor Manuel");
//		estudiante5.setApellido("Monroy Abendaño");
//		estudiante5.setCorreo("vimoa@gutemberg.edu.ec");
//		estudiante5.setContrasenia("67890");
//		estudiante5.setDireccion("Alameda y Perez Hidalgo");
//		estudiante5.setEdad(5);
//		estudiante5.setNumeroMateria(5);
//		estudiante5.setTelefono("0225633");
//		estudiante5.setMatematicas(new BigDecimal("0.00"));
//		estudiante5.setLenguaje(new BigDecimal("9.00"));
//		estudiante5.setSociales(new BigDecimal("9.00"));
//		estudiante5.setCiencias(new BigDecimal("9.00"));
//		estudiante5.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante6= new Estudiante();
//		estudiante6.setNombre("Pedro Pablo");
//		estudiante6.setApellido("Velasco Ibarra");
//		estudiante6.setCorreo("pepai@gutemberg.edu.ec");
//		estudiante6.setContrasenia("67890");
//		estudiante6.setDireccion("Esmeraldas y napo");
//		estudiante6.setEdad(5);
//		estudiante6.setNumeroMateria(5);
//		estudiante6.setTelefono("022555");
//		estudiante6.setMatematicas(new BigDecimal("10.00"));
//		estudiante6.setLenguaje(new BigDecimal("10.00"));
//		estudiante6.setSociales(new BigDecimal("10.00"));
//		estudiante6.setCiencias(new BigDecimal("10.00"));
//		estudiante6.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante7= new Estudiante();
//		estudiante7.setNombre("William Rigoberto");
//		estudiante7.setApellido("Mayorga Montaño");
//		estudiante7.setCorreo("wimam@gutemberg.edu.ec");
//		estudiante7.setContrasenia("67890");
//		estudiante7.setDireccion("Alameda y Perez Hidalgo");
//		estudiante7.setEdad(6);
//		estudiante7.setNumeroMateria(5);
//		estudiante7.setTelefono("0225633");
//		estudiante7.setMatematicas(new BigDecimal("8.00"));
//		estudiante7.setLenguaje(new BigDecimal("0.00"));
//		estudiante7.setSociales(new BigDecimal("8.00"));
//		estudiante7.setCiencias(new BigDecimal("8.00"));
//		estudiante7.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante8= new Estudiante();
//		estudiante8.setNombre("Andy Esteban");
//		estudiante8.setApellido("Chiriboga Villacres");
//		estudiante8.setCorreo("achivi@gutemberg.edu.ec");
//		estudiante8.setContrasenia("67890");
//		estudiante8.setDireccion("Esmeraldas y napo");
//		estudiante8.setEdad(6);
//		estudiante8.setNumeroMateria(5);
//		estudiante8.setTelefono("022555");
//		estudiante8.setMatematicas(new BigDecimal("9.00"));
//		estudiante8.setLenguaje(new BigDecimal("9.00"));
//		estudiante8.setSociales(new BigDecimal("9.00"));
//		estudiante8.setCiencias(new BigDecimal("9.00"));
//		estudiante8.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante9= new Estudiante();
//		estudiante9.setNombre("Richard Ramiro");
//		estudiante9.setApellido("Ramirez Rosales");
//		estudiante9.setCorreo("rirales@gutemberg.edu.ec");
//		estudiante9.setContrasenia("67890");
//		estudiante9.setDireccion("Alameda y Perez Hidalgo");
//		estudiante9.setEdad(6);
//		estudiante9.setNumeroMateria(5);
//		estudiante9.setTelefono("0225633");
//		estudiante9.setMatematicas(new BigDecimal("10.00"));
//		estudiante9.setLenguaje(new BigDecimal("10.00"));
//		estudiante9.setSociales(new BigDecimal("10.00"));
//		estudiante9.setCiencias(new BigDecimal("10.00"));
//		estudiante9.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante10= new Estudiante();
//		estudiante10.setNombre("Anthony Alexander");
//		estudiante10.setApellido("Calvache Molina");
//		estudiante10.setCorreo("ancamo@gutemberg.edu.ec");
//		estudiante10.setContrasenia("67890");
//		estudiante10.setDireccion("Esmeraldas y napo");
//		estudiante10.setEdad(6);
//		estudiante10.setNumeroMateria(5);
//		estudiante10.setTelefono("022555");
//		estudiante10.setMatematicas(new BigDecimal("8.00"));
//		estudiante10.setLenguaje(new BigDecimal("0.00"));
//		estudiante10.setSociales(new BigDecimal("8.00"));
//		estudiante10.setCiencias(new BigDecimal("8.00"));
//		estudiante10.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante11= new Estudiante();
//		estudiante11.setNombre("Miriam del Rocio");
//		estudiante11.setApellido("Velazquez Ibarra");
//		estudiante11.setCorreo("mivi@gutemberg.edu.ec");
//		estudiante11.setContrasenia("67890");
//		estudiante11.setDireccion("Alameda y Perez Hidalgo");
//		estudiante11.setEdad(6);
//		estudiante11.setNumeroMateria(5);
//		estudiante11.setTelefono("0225633");
//		estudiante11.setMatematicas(new BigDecimal("9.00"));
//		estudiante11.setLenguaje(new BigDecimal("9.00"));
//		estudiante11.setSociales(new BigDecimal("9.00"));
//		estudiante11.setCiencias(new BigDecimal("9.00"));
//		estudiante11.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante12= new Estudiante();
//		estudiante12.setNombre("Oscar Manuel");
//		estudiante12.setApellido("Correa Correa");
//		estudiante12.setCorreo("oscor@gutemberg.edu.ec");
//		estudiante12.setContrasenia("67890");
//		estudiante12.setDireccion("Esmeraldas y napo");
//		estudiante12.setEdad(6);
//		estudiante12.setNumeroMateria(5);
//		estudiante12.setTelefono("022555");
//		estudiante12.setMatematicas(new BigDecimal("10.00"));
//		estudiante12.setLenguaje(new BigDecimal("10.00"));
//		estudiante12.setSociales(new BigDecimal("10.00"));
//		estudiante12.setCiencias(new BigDecimal("10.00"));
//		estudiante12.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante13= new Estudiante();
//		estudiante13.setNombre("Carlos Alexander");
//		estudiante13.setApellido("Diaz Diaz");
//		estudiante13.setCorreo("cadiaz@gutemberg.edu.ec");
//		estudiante13.setContrasenia("67890");
//		estudiante13.setDireccion("Alameda y Perez Hidalgo");
//		estudiante13.setEdad(7);
//		estudiante13.setNumeroMateria(5);
//		estudiante13.setTelefono("0225633");
//		estudiante13.setMatematicas(new BigDecimal("8.00"));
//		estudiante13.setLenguaje(new BigDecimal("8.00"));
//		estudiante13.setSociales(new BigDecimal("8.00"));
//		estudiante13.setCiencias(new BigDecimal("8.00"));
//		estudiante13.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante14= new Estudiante();
//		estudiante14.setNombre("Luis Leonel");
//		estudiante14.setApellido("Cervantes Ontaneda");
//		estudiante14.setCorreo("luico@gutemberg.edu.ec");
//		estudiante14.setContrasenia("67890");
//		estudiante14.setDireccion("Esmeraldas y napo");
//		estudiante14.setEdad(7);
//		estudiante14.setNumeroMateria(5);
//		estudiante14.setTelefono("022555");
//		estudiante14.setMatematicas(new BigDecimal("9.00"));
//		estudiante14.setLenguaje(new BigDecimal("9.00"));
//		estudiante14.setSociales(new BigDecimal("9.00"));
//		estudiante14.setCiencias(new BigDecimal("9.00"));
//		estudiante14.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante15= new Estudiante();
//		estudiante15.setNombre("Mayra Elizabeth");
//		estudiante15.setApellido("Hernandez Molina");
//		estudiante15.setCorreo("mayher@gutemberg.edu.ec");
//		estudiante15.setContrasenia("67890");
//		estudiante15.setDireccion("Alameda y Perez Hidalgo");
//		estudiante15.setEdad(7);
//		estudiante15.setNumeroMateria(5);
//		estudiante15.setTelefono("0225633");
//		estudiante15.setMatematicas(new BigDecimal("10.00"));
//		estudiante15.setLenguaje(new BigDecimal("10.00"));
//		estudiante15.setSociales(new BigDecimal("0.00"));
//		estudiante15.setCiencias(new BigDecimal("10.00"));
//		estudiante15.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante16= new Estudiante();
//		estudiante16.setNombre("Jimy Alexander");
//		estudiante16.setApellido("Carcelen Moraloes");
//		estudiante16.setCorreo("jicama@gutemberg.edu.ec");
//		estudiante16.setContrasenia("67890");
//		estudiante16.setDireccion("Esmeraldas y napo");
//		estudiante16.setEdad(7);
//		estudiante16.setNumeroMateria(5);
//		estudiante16.setTelefono("022555");
//		estudiante16.setMatematicas(new BigDecimal("8.00"));
//		estudiante16.setLenguaje(new BigDecimal("8.00"));
//		estudiante16.setSociales(new BigDecimal("8.00"));
//		estudiante16.setCiencias(new BigDecimal("8.00"));
//		estudiante16.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante17= new Estudiante();
//		estudiante17.setNombre("Jessica Carolina");
//		estudiante17.setApellido("Quichimbo Pino");
//		estudiante17.setCorreo("jequin@gutemberg.edu.ec");
//		estudiante17.setContrasenia("67890");
//		estudiante17.setDireccion("Alameda y Perez Hidalgo");
//		estudiante17.setEdad(7);
//		estudiante17.setNumeroMateria(5);
//		estudiante17.setTelefono("0225633");
//		estudiante17.setMatematicas(new BigDecimal("9.00"));
//		estudiante17.setLenguaje(new BigDecimal("9.00"));
//		estudiante17.setSociales(new BigDecimal("9.00"));
//		estudiante17.setCiencias(new BigDecimal("9.00"));
//		estudiante17.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante18= new Estudiante();
//		estudiante18.setNombre("Dennis Alexander");
//		estudiante18.setApellido("Pilco Rosales");
//		estudiante18.setCorreo("depiro@gutemberg.edu.ec");
//		estudiante18.setContrasenia("67890");
//		estudiante18.setDireccion("Esmeraldas y napo");
//		estudiante18.setEdad(7);
//		estudiante18.setNumeroMateria(5);
//		estudiante18.setTelefono("022555");
//		estudiante18.setMatematicas(new BigDecimal("10.00"));
//		estudiante18.setLenguaje(new BigDecimal("10.00"));
//		estudiante18.setSociales(new BigDecimal("0.00"));
//		estudiante18.setCiencias(new BigDecimal("10.00"));
//		estudiante18.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante19= new Estudiante();
//		estudiante19.setNombre("Juan Pablo");
//		estudiante19.setApellido("Valdivieso Perez");
//		estudiante19.setCorreo("juvupe@gutemberg.edu.ec");
//		estudiante19.setContrasenia("67890");
//		estudiante19.setDireccion("Alameda y Perez Hidalgo");
//		estudiante19.setEdad(8);
//		estudiante19.setNumeroMateria(5);
//		estudiante19.setTelefono("0225633");
//		estudiante19.setMatematicas(new BigDecimal("8.00"));
//		estudiante19.setLenguaje(new BigDecimal("8.00"));
//		estudiante19.setSociales(new BigDecimal("8.00"));
//		estudiante19.setCiencias(new BigDecimal("8.00"));
//		estudiante19.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante20= new Estudiante();
//		estudiante20.setNombre("Juan Fernando");
//		estudiante20.setApellido("Ramon Carcelen");
//		estudiante20.setCorreo("juralen@gutemberg.edu.ec");
//		estudiante20.setContrasenia("67890");
//		estudiante20.setDireccion("Esmeraldas y napo");
//		estudiante20.setEdad(8);
//		estudiante20.setNumeroMateria(5);
//		estudiante20.setTelefono("022555");
//		estudiante20.setMatematicas(new BigDecimal("9.00"));
//		estudiante20.setLenguaje(new BigDecimal("9.00"));
//		estudiante20.setSociales(new BigDecimal("9.00"));
//		estudiante20.setCiencias(new BigDecimal("0.00"));
//		estudiante20.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante21= new Estudiante();
//		estudiante21.setNombre("Johan Andres");
//		estudiante21.setApellido("Zea Carpio");
//		estudiante21.setCorreo("jozea@gutemberg.edu.ec");
//		estudiante21.setContrasenia("67890");
//		estudiante21.setDireccion("Alameda y Perez Hidalgo");
//		estudiante21.setEdad(8);
//		estudiante21.setNumeroMateria(5);
//		estudiante21.setTelefono("0225633");
//		estudiante21.setMatematicas(new BigDecimal("10.00"));
//		estudiante21.setLenguaje(new BigDecimal("10.00"));
//		estudiante21.setSociales(new BigDecimal("10.00"));
//		estudiante21.setCiencias(new BigDecimal("10.00"));
//		estudiante21.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante22= new Estudiante();
//		estudiante22.setNombre("Cristian David");
//		estudiante22.setApellido("Carrera Lopez");
//		estudiante22.setCorreo("crisloca@gutemberg.edu.ec");
//		estudiante22.setContrasenia("67890");
//		estudiante22.setDireccion("Esmeraldas y napo");
//		estudiante22.setEdad(8);
//		estudiante22.setNumeroMateria(5);
//		estudiante22.setTelefono("022555");
//		estudiante22.setMatematicas(new BigDecimal("8.00"));
//		estudiante22.setLenguaje(new BigDecimal("8.00"));
//		estudiante22.setSociales(new BigDecimal("8.00"));
//		estudiante22.setCiencias(new BigDecimal("8.00"));
//		estudiante22.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante23= new Estudiante();
//		estudiante23.setNombre("Luis Maximiliano");
//		estudiante23.setApellido("Montalvo Ortiz");
//		estudiante23.setCorreo("lumono@gutemberg.edu.ec");
//		estudiante23.setContrasenia("67890");
//		estudiante23.setDireccion("Alameda y Perez Hidalgo");
//		estudiante23.setEdad(8);
//		estudiante23.setNumeroMateria(5);
//		estudiante23.setTelefono("0225633");
//		estudiante23.setMatematicas(new BigDecimal("9.00"));
//		estudiante23.setLenguaje(new BigDecimal("9.00"));
//		estudiante23.setSociales(new BigDecimal("9.00"));
//		estudiante23.setCiencias(new BigDecimal("0.00"));
//		estudiante23.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante24= new Estudiante();
//		estudiante24.setNombre("Jorge Rafael");
//		estudiante24.setApellido("Villamar Flores");
//		estudiante24.setCorreo("jorvis@gutemberg.edu.ec");
//		estudiante24.setContrasenia("67890");
//		estudiante24.setDireccion("Esmeraldas y napo");
//		estudiante24.setEdad(8);
//		estudiante24.setNumeroMateria(5);
//		estudiante24.setTelefono("022555");
//		estudiante24.setMatematicas(new BigDecimal("10.00"));
//		estudiante24.setLenguaje(new BigDecimal("10.00"));
//		estudiante24.setSociales(new BigDecimal("10.00"));
//		estudiante24.setCiencias(new BigDecimal("10.00"));
//		estudiante24.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante25= new Estudiante();
//		estudiante25.setNombre("Luz Maria");
//		estudiante25.setApellido("Borja Abad");
//		estudiante25.setCorreo("luboa@gutemberg.edu.ec");
//		estudiante25.setContrasenia("67890");
//		estudiante25.setDireccion("Alameda y Perez Hidalgo");
//		estudiante25.setEdad(9);
//		estudiante25.setNumeroMateria(5);
//		estudiante25.setTelefono("0225633");
//		estudiante25.setMatematicas(new BigDecimal("8.00"));
//		estudiante25.setLenguaje(new BigDecimal("8.00"));
//		estudiante25.setSociales(new BigDecimal("8.00"));
//		estudiante25.setCiencias(new BigDecimal("8.00"));
//		estudiante25.setAleman(new BigDecimal("0.00"));
//		
//		Estudiante estudiante26= new Estudiante();
//		estudiante26.setNombre("Helen Cristina");
//		estudiante26.setApellido("Espinoza Fernandez");
//		estudiante26.setCorreo("hefer@gutemberg.edu.ec");
//		estudiante26.setContrasenia("67890");
//		estudiante26.setDireccion("Esmeraldas y napo");
//		estudiante26.setEdad(9);
//		estudiante26.setNumeroMateria(5);
//		estudiante26.setTelefono("022555");
//		estudiante26.setMatematicas(new BigDecimal("9.00"));
//		estudiante26.setLenguaje(new BigDecimal("9.00"));
//		estudiante26.setSociales(new BigDecimal("9.00"));
//		estudiante26.setCiencias(new BigDecimal("9.00"));
//		estudiante26.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante27= new Estudiante();
//		estudiante27.setNombre("Mario Fernando");
//		estudiante27.setApellido("Carrillo Chavez");
//		estudiante27.setCorreo("macavez@gutemberg.edu.ec");
//		estudiante27.setContrasenia("67890");
//		estudiante27.setDireccion("Alameda y Perez Hidalgo");
//		estudiante27.setEdad(9);
//		estudiante27.setNumeroMateria(5);
//		estudiante27.setTelefono("0225633");
//		estudiante27.setMatematicas(new BigDecimal("10.00"));
//		estudiante27.setLenguaje(new BigDecimal("10.00"));
//		estudiante27.setSociales(new BigDecimal("10.00"));
//		estudiante27.setCiencias(new BigDecimal("10.00"));
//		estudiante27.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante28= new Estudiante();
//		estudiante28.setNombre("Veronica Cristina");
//		estudiante28.setApellido("Tapia Castillo");
//		estudiante28.setCorreo("vetallo@gutemberg.edu.ec");
//		estudiante28.setContrasenia("67890");
//		estudiante28.setDireccion("Esmeraldas y napo");
//		estudiante28.setEdad(9);
//		estudiante28.setNumeroMateria(5);
//		estudiante28.setTelefono("022555");
//		estudiante28.setMatematicas(new BigDecimal("8.00"));
//		estudiante28.setLenguaje(new BigDecimal("8.00"));
//		estudiante28.setSociales(new BigDecimal("8.00"));
//		estudiante28.setCiencias(new BigDecimal("8.00"));
//		estudiante28.setAleman(new BigDecimal("0.00"));
//		
//		Estudiante estudiante29= new Estudiante();
//		estudiante29.setNombre("Noelia Stefany");
//		estudiante29.setApellido("Veintimilla Rios");
//		estudiante29.setCorreo("noe@gutemberg.edu.ec");
//		estudiante29.setContrasenia("67890");
//		estudiante29.setDireccion("Alameda y Perez Hidalgo");
//		estudiante29.setEdad(9);
//		estudiante29.setNumeroMateria(5);
//		estudiante29.setTelefono("0225633");
//		estudiante29.setMatematicas(new BigDecimal("9.00"));
//		estudiante29.setLenguaje(new BigDecimal("9.00"));
//		estudiante29.setSociales(new BigDecimal("9.00"));
//		estudiante29.setCiencias(new BigDecimal("9.00"));
//		estudiante29.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante30= new Estudiante();
//		estudiante30.setNombre("Diego Dario");
//		estudiante30.setApellido("Tapia Palacios");
//		estudiante30.setCorreo("dietapia@gutemberg.edu.ec");
//		estudiante30.setContrasenia("67890");
//		estudiante30.setDireccion("Esmeraldas y napo");
//		estudiante30.setEdad(9);
//		estudiante30.setNumeroMateria(5);
//		estudiante30.setTelefono("022555");
//		estudiante30.setMatematicas(new BigDecimal("10.00"));
//		estudiante30.setLenguaje(new BigDecimal("10.00"));
//		estudiante30.setSociales(new BigDecimal("10.00"));
//		estudiante30.setCiencias(new BigDecimal("10.00"));
//		estudiante30.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante31= new Estudiante();
//		estudiante31.setNombre("Stefany Carolina");
//		estudiante31.setApellido("Arciniega Aguilar");
//		estudiante31.setCorreo("scalar@gutemberg.edu.ec");
//		estudiante31.setContrasenia("67890");
//		estudiante31.setDireccion("Alameda y Perez Hidalgo");
//		estudiante31.setEdad(10);
//		estudiante31.setNumeroMateria(5);
//		estudiante31.setTelefono("0225633");
//		estudiante31.setMatematicas(new BigDecimal("8.00"));
//		estudiante31.setLenguaje(new BigDecimal("8.00"));
//		estudiante31.setSociales(new BigDecimal("8.00"));
//		estudiante31.setCiencias(new BigDecimal("8.00"));
//		estudiante31.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante32= new Estudiante();
//		estudiante32.setNombre("Valeria Fatima");
//		estudiante32.setApellido("Valladarez Gonzales");
//		estudiante32.setCorreo("vavago@gutemberg.edu.ec");
//		estudiante32.setContrasenia("67890");
//		estudiante32.setDireccion("Esmeraldas y napo");
//		estudiante32.setEdad(10);
//		estudiante32.setNumeroMateria(5);
//		estudiante32.setTelefono("022555");
//		estudiante32.setMatematicas(new BigDecimal("9.00"));
//		estudiante32.setLenguaje(new BigDecimal("9.00"));
//		estudiante32.setSociales(new BigDecimal("9.00"));
//		estudiante32.setCiencias(new BigDecimal("9.00"));
//		estudiante32.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante33= new Estudiante();
//		estudiante33.setNombre("Katherine Viviana");
//		estudiante33.setApellido("Maza Maza");
//		estudiante33.setCorreo("kamaza@gutemberg.edu.ec");
//		estudiante33.setContrasenia("67890");
//		estudiante33.setDireccion("Alameda y Perez Hidalgo");
//		estudiante33.setEdad(10);
//		estudiante33.setNumeroMateria(5);
//		estudiante33.setTelefono("0225633");
//		estudiante33.setMatematicas(new BigDecimal("0.00"));
//		estudiante33.setLenguaje(new BigDecimal("10.00"));
//		estudiante33.setSociales(new BigDecimal("10.00"));
//		estudiante33.setCiencias(new BigDecimal("10.00"));
//		estudiante33.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante34= new Estudiante();
//		estudiante34.setNombre("Dario Esteban");
//		estudiante34.setApellido("Arevalo Donoso");
//		estudiante34.setCorreo("dadolo@gutemberg.edu.ec");
//		estudiante34.setContrasenia("67890");
//		estudiante34.setDireccion("Esmeraldas y napo");
//		estudiante34.setEdad(10);
//		estudiante34.setNumeroMateria(5);
//		estudiante34.setTelefono("022555");
//		estudiante34.setMatematicas(new BigDecimal("8.00"));
//		estudiante34.setLenguaje(new BigDecimal("8.00"));
//		estudiante34.setSociales(new BigDecimal("8.00"));
//		estudiante34.setCiencias(new BigDecimal("8.00"));
//		estudiante34.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante35= new Estudiante();
//		estudiante35.setNombre("Carolina del Rocio");
//		estudiante35.setApellido("Juca Lopez");
//		estudiante35.setCorreo("caroju@gutemberg.edu.ec");
//		estudiante35.setContrasenia("67890");
//		estudiante35.setDireccion("Alameda y Perez Hidalgo");
//		estudiante35.setEdad(10);
//		estudiante35.setNumeroMateria(5);
//		estudiante35.setTelefono("0225633");
//		estudiante35.setMatematicas(new BigDecimal("9.00"));
//		estudiante35.setLenguaje(new BigDecimal("9.00"));
//		estudiante35.setSociales(new BigDecimal("9.00"));
//		estudiante35.setCiencias(new BigDecimal("9.00"));
//		estudiante35.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante36= new Estudiante();
//		estudiante36.setNombre("Walter Fernando");
//		estudiante36.setApellido("Cevallos Arias");
//		estudiante36.setCorreo("wacea@gutemberg.edu.ec");
//		estudiante36.setContrasenia("67890");
//		estudiante36.setDireccion("Esmeraldas y napo");
//		estudiante36.setEdad(10);
//		estudiante36.setNumeroMateria(5);
//		estudiante36.setTelefono("022555");
//		estudiante36.setMatematicas(new BigDecimal("10.00"));
//		estudiante36.setLenguaje(new BigDecimal("10.00"));
//		estudiante36.setSociales(new BigDecimal("10.00"));
//		estudiante36.setCiencias(new BigDecimal("10.00"));
//		estudiante36.setAleman(new BigDecimal("0.00"));
//		
//		Estudiante estudiante37= new Estudiante();
//		estudiante37.setNombre("Jose Alexander");
//		estudiante37.setApellido("Arias Andrade");
//		estudiante37.setCorreo("joara@gutemberg.edu.ec");
//		estudiante37.setContrasenia("67890");
//		estudiante37.setDireccion("Alameda y Perez Hidalgo");
//		estudiante37.setEdad(11);
//		estudiante37.setNumeroMateria(5);
//		estudiante37.setTelefono("0225633");
//		estudiante37.setMatematicas(new BigDecimal("8.00"));
//		estudiante37.setLenguaje(new BigDecimal("8.00"));
//		estudiante37.setSociales(new BigDecimal("8.00"));
//		estudiante37.setCiencias(new BigDecimal("8.00"));
//		estudiante37.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante38= new Estudiante();
//		estudiante38.setNombre("Gustavo Rafael");
//		estudiante38.setApellido("Sanchez Iñiguez");
//		estudiante38.setCorreo("gus@gutemberg.edu.ec");
//		estudiante38.setContrasenia("67890");
//		estudiante38.setDireccion("Esmeraldas y napo");
//		estudiante38.setEdad(11);
//		estudiante38.setNumeroMateria(5);
//		estudiante38.setTelefono("022555");
//		estudiante38.setMatematicas(new BigDecimal("9.00"));
//		estudiante38.setLenguaje(new BigDecimal("0.00"));
//		estudiante38.setSociales(new BigDecimal("9.00"));
//		estudiante38.setCiencias(new BigDecimal("9.00"));
//		estudiante38.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante39= new Estudiante();
//		estudiante39.setNombre("Maria Eugenia");
//		estudiante39.setApellido("Suing Bailon");
//		estudiante39.setCorreo("mausi@gutemberg.edu.ec");
//		estudiante39.setContrasenia("67890");
//		estudiante39.setDireccion("Alameda y Perez Hidalgo");
//		estudiante39.setEdad(11);
//		estudiante39.setNumeroMateria(5);
//		estudiante39.setTelefono("0225633");
//		estudiante39.setMatematicas(new BigDecimal("10.00"));
//		estudiante39.setLenguaje(new BigDecimal("10.00"));
//		estudiante39.setSociales(new BigDecimal("10.00"));
//		estudiante39.setCiencias(new BigDecimal("10.00"));
//		estudiante39.setAleman(new BigDecimal("10.00"));
//		
//		Estudiante estudiante40= new Estudiante();
//		estudiante40.setNombre("Milton Alexander");
//		estudiante40.setApellido("Morales Perez");
//		estudiante40.setCorreo("mimopeza@gutemberg.edu.ec");
//		estudiante40.setContrasenia("67890");
//		estudiante40.setDireccion("Esmeraldas y napo");
//		estudiante40.setEdad(11);
//		estudiante40.setNumeroMateria(5);
//		estudiante40.setTelefono("022555");
//		estudiante40.setMatematicas(new BigDecimal("8.00"));
//		estudiante40.setLenguaje(new BigDecimal("8.00"));
//		estudiante40.setSociales(new BigDecimal("8.00"));
//		estudiante40.setCiencias(new BigDecimal("8.00"));
//		estudiante40.setAleman(new BigDecimal("8.00"));
//		
//		Estudiante estudiante41= new Estudiante();
//		estudiante41.setNombre("Giselle Estefania");
//		estudiante41.setApellido("Guarnizo Ordoñez");
//		estudiante41.setCorreo("giguas@gutemberg.edu.ec");
//		estudiante41.setContrasenia("67890");
//		estudiante41.setDireccion("Alameda y Perez Hidalgo");
//		estudiante41.setEdad(11);
//		estudiante41.setNumeroMateria(5);
//		estudiante41.setTelefono("0225633");
//		estudiante41.setMatematicas(new BigDecimal("9.00"));
//		estudiante41.setLenguaje(new BigDecimal("0.00"));
//		estudiante41.setSociales(new BigDecimal("9.00"));
//		estudiante41.setCiencias(new BigDecimal("9.00"));
//		estudiante41.setAleman(new BigDecimal("9.00"));
//		
//		Estudiante estudiante42= new Estudiante();
//		estudiante42.setNombre("Melissa Fernanda");
//		estudiante42.setApellido("Cajas Jaramillo");
//		estudiante42.setCorreo("mecaja@gutemberg.edu.ec");
//		estudiante42.setContrasenia("67890");
//		estudiante42.setDireccion("Esmeraldas y napo");
//		estudiante42.setEdad(11);
//		estudiante42.setNumeroMateria(5);
//		estudiante42.setTelefono("022555");
//		estudiante42.setMatematicas(new BigDecimal("10.00"));
//		estudiante42.setLenguaje(new BigDecimal("10.00"));
//		estudiante42.setSociales(new BigDecimal("10.00"));
//		estudiante42.setCiencias(new BigDecimal("10.00"));
//		estudiante42.setAleman(new BigDecimal("10.00"));
//		
//		
//		
//		this.estudianteService.insertarEstudiante(estudiante1);
//		this.estudianteService.insertarEstudiante(estudiante2);
//		this.estudianteService.insertarEstudiante(estudiante3);
//		this.estudianteService.insertarEstudiante(estudiante4);
//		this.estudianteService.insertarEstudiante(estudiante5);
//		this.estudianteService.insertarEstudiante(estudiante6);
//		this.estudianteService.insertarEstudiante(estudiante7);
//		this.estudianteService.insertarEstudiante(estudiante8);
//		this.estudianteService.insertarEstudiante(estudiante9);
//		this.estudianteService.insertarEstudiante(estudiante10);
//		this.estudianteService.insertarEstudiante(estudiante11);
//		this.estudianteService.insertarEstudiante(estudiante12);
//		this.estudianteService.insertarEstudiante(estudiante13);
//		this.estudianteService.insertarEstudiante(estudiante14);
//		this.estudianteService.insertarEstudiante(estudiante15);
//		this.estudianteService.insertarEstudiante(estudiante16);
//		this.estudianteService.insertarEstudiante(estudiante17);
//		this.estudianteService.insertarEstudiante(estudiante18);
//		this.estudianteService.insertarEstudiante(estudiante19);
//		this.estudianteService.insertarEstudiante(estudiante20);
//		this.estudianteService.insertarEstudiante(estudiante21);
//		this.estudianteService.insertarEstudiante(estudiante22);
//		this.estudianteService.insertarEstudiante(estudiante23);
//		this.estudianteService.insertarEstudiante(estudiante24);
//		this.estudianteService.insertarEstudiante(estudiante25);
//		this.estudianteService.insertarEstudiante(estudiante26);
//		this.estudianteService.insertarEstudiante(estudiante27);
//		this.estudianteService.insertarEstudiante(estudiante28);
//		this.estudianteService.insertarEstudiante(estudiante29);
//		this.estudianteService.insertarEstudiante(estudiante30);
//		this.estudianteService.insertarEstudiante(estudiante31);
//		this.estudianteService.insertarEstudiante(estudiante32);
//		this.estudianteService.insertarEstudiante(estudiante33);
//		this.estudianteService.insertarEstudiante(estudiante34);
//		this.estudianteService.insertarEstudiante(estudiante35);
//		this.estudianteService.insertarEstudiante(estudiante36);
//		this.estudianteService.insertarEstudiante(estudiante37);
//		this.estudianteService.insertarEstudiante(estudiante38);
//		this.estudianteService.insertarEstudiante(estudiante39);
//		this.estudianteService.insertarEstudiante(estudiante40);
//		this.estudianteService.insertarEstudiante(estudiante41);
//		this.estudianteService.insertarEstudiante(estudiante42);
//		
		
		
		//----------------------------------------------Insertar Docente----------------------------------------------------------------------
//		Docente docente1= new Docente ();
//		docente1.setNombre("Blanca Mariana");
//		docente1.setApellido("Perez Idrovo");
//		docente1.setContrasenia("12345");
//		docente1.setCorreo("bmapi@gutemberg.edu.ec");
//		docente1.setDireccion("La Alborada");
//		docente1.setEdad(29);
//		docente1.setNumeroCurso(2);
//		docente1.setTelefono("02626996");
//		
//		Docente docente2= new Docente ();
//		docente2.setNombre("Segundo Fernando");
//		docente2.setApellido("Arevalo Lopez");
//		docente2.setContrasenia("12345");
//		docente2.setCorreo("sefal@gutemberg.edu.ec");
//		docente2.setDireccion("La Armenia");
//		docente2.setEdad(35);
//		docente2.setNumeroCurso(2);
//		docente2.setTelefono("02555555");
//		
//		Docente docente3= new Docente ();
//		docente3.setNombre("Maria Fernanda");
//		docente3.setApellido("Andrade Pazmiño");
//		docente3.setContrasenia("12345");
//		docente3.setCorreo("mafep@gutemberg.edu.ec");
//		docente3.setDireccion("Comite del Pueblo");
//		docente3.setEdad(27);
//		docente3.setNumeroCurso(3);
//		docente3.setTelefono("02555998");
//		
//		Docente docente4= new Docente ();
//		docente4.setNombre("Daniel Alexander");
//		docente4.setApellido("Carrillo Perez");
//		docente4.setContrasenia("12345");
//		docente4.setCorreo("daecp@gutemberg.edu.ec");
//		docente4.setDireccion("Santo Domingo");
//		docente4.setEdad(45);
//		docente4.setNumeroCurso(2);
//		docente4.setTelefono("025478999");
//		
//		Docente docente5= new Docente ();
//		docente5.setNombre("Ana Cristina");
//		docente5.setApellido("Sanchez Abad");
//		docente5.setContrasenia("12345");
//		docente5.setCorreo("acsa@gutemberg.edu.ec");
//		docente5.setDireccion("El Zoologico");
//		docente5.setEdad(25);
//		docente5.setNumeroCurso(2);
//		docente5.setTelefono("02888999");
//		
//		Docente docente6= new Docente ();
//		docente6.setNombre("Karolain Anahi");
//		docente6.setApellido("Calva Calva");
//		docente6.setContrasenia("12345");
//		docente6.setCorreo("kacal@gutemberg.edu.ec");
//		docente6.setDireccion("Mercado Mayorista");
//		docente6.setEdad(31);
//		docente6.setNumeroCurso(3);
//		docente6.setTelefono("0267896");
//		
//		Docente docente7= new Docente ();
//		docente7.setNombre("Pablo Andres");
//		docente7.setApellido("Carrera Carpio");
//		docente7.setContrasenia("12345");
//		docente7.setCorreo("pacc@gutemberg.edu.ec");
//		docente7.setDireccion("18 de Noviembre");
//		docente7.setEdad(37);
//		docente7.setNumeroCurso(2);
//		docente7.setTelefono("0254444");
//		
//		Docente docente8= new Docente ();
//		docente8.setNombre("Luis Fernando");
//		docente8.setApellido("Quizhpe Espinoza");
//		docente8.setContrasenia("12345");
//		docente8.setCorreo("lufeqe@gutemberg.edu.ec");
//		docente8.setDireccion("Jipiro Alto");
//		docente8.setEdad(36);
//		docente8.setNumeroCurso(2);
//		docente8.setTelefono("0251111");
//		
//		Docente docente9= new Docente ();
//		docente9.setNombre("Stefany Anahi");
//		docente9.setApellido("Patiño Espinoza");
//		docente9.setContrasenia("12345");
//		docente9.setCorreo("stapes@gutemberg.edu.ec");
//		docente9.setDireccion("La Armenia");
//		docente9.setEdad(35);
//		docente9.setNumeroCurso(3);
//		docente9.setTelefono("02555555");
//		
//		Docente docente10= new Docente ();
//		docente10.setNombre("Josselyn Anahi");
//		docente10.setApellido("Calva Cueva");
//		docente10.setContrasenia("12345");
//		docente10.setCorreo("josaca@gutemberg.edu.ec");
//		docente10.setDireccion("La Armenia");
//		docente10.setEdad(35);
//		docente10.setNumeroCurso(2);
//		docente10.setTelefono("02555555");
//		
//		Docente docente11= new Docente ();
//		docente11.setNombre("Andrea Nataly");
//		docente11.setApellido("Jumbo Jumbo");
//		docente11.setContrasenia("12345");
//		docente11.setCorreo("anjuju@gutemberg.edu.ec");
//		docente11.setDireccion("La Alborada");
//		docente11.setEdad(29);
//		docente11.setNumeroCurso(2);
//		docente11.setTelefono("0266996");
//		
//		Docente docente12= new Docente ();
//		docente12.setNombre("Fredy Alexander");
//		docente12.setApellido("Crespo Montaño");
//		docente12.setContrasenia("12345");
//		docente12.setCorreo("felemon@gutemberg.edu.ec");
//		docente12.setDireccion("La Armenia");
//		docente12.setEdad(35);
//		docente12.setNumeroCurso(3);
//		docente12.setTelefono("02555555");
//		
//		Docente docente13= new Docente ();
//		docente13.setNombre("Luis Roberto");
//		docente13.setApellido("Machado Obando");
//		docente13.setContrasenia("12345");
//		docente13.setCorreo("fido@gutemberg.edu.ec");
//		docente13.setDireccion("La Armenia");
//		docente13.setEdad(35);
//		docente13.setNumeroCurso(2);
//		docente13.setTelefono("02555555");
//		
//		Docente docente14= new Docente ();
//		docente14.setNombre("Leonardo Isaac");
//		docente14.setApellido("Ordoñez Espinoza");
//		docente14.setContrasenia("12345");
//		docente14.setCorreo("isaaco@gutemberg.edu.ec");
//		docente14.setDireccion("La Armenia");
//		docente14.setEdad(35);
//		docente14.setNumeroCurso(2);
//		docente14.setTelefono("02555555");
//		
//		Docente docente15= new Docente ();
//		docente15.setNombre("Michelle Anahi");
//		docente15.setApellido("Villacres Vera");
//		docente15.setContrasenia("12345");
//		docente15.setCorreo("mivive@gutemberg.edu.ec");
//		docente15.setDireccion("La Armenia");
//		docente15.setEdad(35);
//		docente15.setNumeroCurso(3);
//		docente15.setTelefono("02555555");
//		
//		
//		this.docenteService.insertarDocente(docente1);
//		this.docenteService.insertarDocente(docente2);
//		this.docenteService.insertarDocente(docente3);
//		this.docenteService.insertarDocente(docente4);
//		this.docenteService.insertarDocente(docente5);
//		this.docenteService.insertarDocente(docente6);
//		this.docenteService.insertarDocente(docente7);
//		this.docenteService.insertarDocente(docente8);
//		this.docenteService.insertarDocente(docente9);
//		this.docenteService.insertarDocente(docente10);
//		this.docenteService.insertarDocente(docente11);
//		this.docenteService.insertarDocente(docente12);
//		this.docenteService.insertarDocente(docente13);
//		this.docenteService.insertarDocente(docente14);
//		this.docenteService.insertarDocente(docente15);
//		
		
		//----------------------------------Unir docente con materia---------------------------------------------------------------------
		
//		List<Docente> listaDocentes1= new ArrayList<>();
//		List<Docente> listaDocentes2= new ArrayList<>();
//		List<Docente> listaDocentes3= new ArrayList<>();
//		List<Docente> listaDocentes4= new ArrayList<>();
//		List<Docente> listaDocentes5= new ArrayList<>();
//		
//		
//		Materia materiab1= this.materiaService.buscarMateriaPorId(1);
//		Materia materiab2= this.materiaService.buscarMateriaPorId(2);
//		Materia materiab3= this.materiaService.buscarMateriaPorId(3);
//		Materia materiab4= this.materiaService.buscarMateriaPorId(4);
//		Materia materiab5= this.materiaService.buscarMateriaPorId(5);
//		
//				
//				
//		Docente docenteb1=this.docenteService.buscarDocentePorId(1);
//		docenteb1.setMateria(materiab1);
//		Docente docenteb2=this.docenteService.buscarDocentePorId(2);
//		docenteb2.setMateria(materiab1);
//		Docente docenteb3=this.docenteService.buscarDocentePorId(3);
//		docenteb3.setMateria(materiab1);
//		Docente docenteb4=this.docenteService.buscarDocentePorId(4);
//		docenteb4.setMateria(materiab2);
//		Docente docenteb5=this.docenteService.buscarDocentePorId(5);
//		docenteb5.setMateria(materiab2);
//		Docente docenteb6=this.docenteService.buscarDocentePorId(6);
//		docenteb6.setMateria(materiab2);
//		Docente docenteb7=this.docenteService.buscarDocentePorId(7);
//		docenteb7.setMateria(materiab3);
//		Docente docenteb8=this.docenteService.buscarDocentePorId(8);
//		docenteb8.setMateria(materiab3);
//		Docente docenteb9=this.docenteService.buscarDocentePorId(9);
//		docenteb9.setMateria(materiab3);
//		Docente docenteb10=this.docenteService.buscarDocentePorId(10);
//		docenteb10.setMateria(materiab4);
//		Docente docenteb11=this.docenteService.buscarDocentePorId(11);
//		docenteb11.setMateria(materiab4);
//		Docente docenteb12=this.docenteService.buscarDocentePorId(12);
//		docenteb12.setMateria(materiab4);
//		Docente docenteb13=this.docenteService.buscarDocentePorId(13);
//		docenteb13.setMateria(materiab5);
//		Docente docenteb14=this.docenteService.buscarDocentePorId(14);
//		docenteb14.setMateria(materiab5);
//		Docente docenteb15=this.docenteService.buscarDocentePorId(15);
//		docenteb15.setMateria(materiab5);
//		
//				
//		listaDocentes1.add(docenteb1);
//		listaDocentes1.add(docenteb2);		
//		listaDocentes1.add(docenteb3);
//		
//		listaDocentes2.add(docenteb4);
//		listaDocentes2.add(docenteb5);
//		listaDocentes2.add(docenteb6);
//		
//		listaDocentes3.add(docenteb7);
//		listaDocentes3.add(docenteb8);
//		listaDocentes3.add(docenteb9);
//		
//		listaDocentes4.add(docenteb10);
//		listaDocentes4.add(docenteb11);
//		listaDocentes4.add(docenteb12);
//		
//		listaDocentes5.add(docenteb13);
//		listaDocentes5.add(docenteb14);
//		listaDocentes5.add(docenteb15);
//		
//		
//		materiab1.setDocentes(listaDocentes1);
//		materiab2.setDocentes(listaDocentes2);
//		materiab3.setDocentes(listaDocentes3);
//		materiab4.setDocentes(listaDocentes4);
//		materiab5.setDocentes(listaDocentes5);
//		
//		this.materiaService.actualizarMateria(materiab1);
//		this.materiaService.actualizarMateria(materiab2);
//		this.materiaService.actualizarMateria(materiab3);
//		this.materiaService.actualizarMateria(materiab4);
//		this.materiaService.actualizarMateria(materiab5);
//		
//		this.docenteService.actualizarDocente(docenteb1);
//		this.docenteService.actualizarDocente(docenteb2);
//		this.docenteService.actualizarDocente(docenteb3);
//		this.docenteService.actualizarDocente(docenteb4);
//		this.docenteService.actualizarDocente(docenteb5);
//		this.docenteService.actualizarDocente(docenteb6);
//		this.docenteService.actualizarDocente(docenteb7);
//		this.docenteService.actualizarDocente(docenteb8);
//		this.docenteService.actualizarDocente(docenteb9);
//		this.docenteService.actualizarDocente(docenteb10);
//		this.docenteService.actualizarDocente(docenteb11);
//		this.docenteService.actualizarDocente(docenteb12);
//		this.docenteService.actualizarDocente(docenteb13);
//		this.docenteService.actualizarDocente(docenteb14);
//		this.docenteService.actualizarDocente(docenteb15);
		
		

		//-------------------------------- Unir estudiante con curso-------------------------------------------------------------------
		
		
		
//		List<Estudiante> lista1= new ArrayList<>();
//		List<Estudiante> lista2= new ArrayList<>();
//		List<Estudiante> lista3= new ArrayList<>();
//		List<Estudiante> lista4= new ArrayList<>();
//		List<Estudiante> lista5= new ArrayList<>();
//		List<Estudiante> lista6= new ArrayList<>();
//		List<Estudiante> lista7= new ArrayList<>();
//		List<Estudiante> lista8= new ArrayList<>();
//		List<Estudiante> lista9= new ArrayList<>();
//		List<Estudiante> lista10= new ArrayList<>();
//		List<Estudiante> lista11= new ArrayList<>();
//		List<Estudiante> lista12= new ArrayList<>();
//		List<Estudiante> lista13= new ArrayList<>();
//		List<Estudiante> lista14= new ArrayList<>();
//		
//		
//		Curso cursob1= this.cursoService.buscarCursoPorId(1);
//		Curso cursob2= this.cursoService.buscarCursoPorId(2);
//		Curso cursob3= this.cursoService.buscarCursoPorId(3);
//		Curso cursob4= this.cursoService.buscarCursoPorId(4);
//		Curso cursob5= this.cursoService.buscarCursoPorId(5);
//		Curso cursob6= this.cursoService.buscarCursoPorId(6);
//		Curso cursob7= this.cursoService.buscarCursoPorId(7);
//		Curso cursob8= this.cursoService.buscarCursoPorId(8);
//		Curso cursob9= this.cursoService.buscarCursoPorId(9);
//		Curso cursob10= this.cursoService.buscarCursoPorId(10);
//		Curso cursob11= this.cursoService.buscarCursoPorId(11);
//		Curso cursob12= this.cursoService.buscarCursoPorId(12);
//		Curso cursob13= this.cursoService.buscarCursoPorId(13);
//		Curso cursob14= this.cursoService.buscarCursoPorId(14);
//		
//					
//				
//		Estudiante estudianteb1= this.estudianteService.buscarEstudiantePorId(1);
//		estudianteb1.setCurso(cursob1);
//		
//		Estudiante estudianteb2= this.estudianteService.buscarEstudiantePorId(2);
//		estudianteb2.setCurso(cursob1);
//		
//		Estudiante estudianteb3= this.estudianteService.buscarEstudiantePorId(3);
//		estudianteb3.setCurso(cursob1);
//		
//
//		Estudiante estudianteb4= this.estudianteService.buscarEstudiantePorId(4);
//		estudianteb4.setCurso(cursob2);
//		
//		Estudiante estudianteb5= this.estudianteService.buscarEstudiantePorId(5);
//		estudianteb5.setCurso(cursob2);
//		
//		Estudiante estudianteb6= this.estudianteService.buscarEstudiantePorId(6);
//		estudianteb6.setCurso(cursob2);
//		
//
//		Estudiante estudianteb7= this.estudianteService.buscarEstudiantePorId(7);
//		estudianteb7.setCurso(cursob3);
//		
//		Estudiante estudianteb8= this.estudianteService.buscarEstudiantePorId(8);
//		estudianteb8.setCurso(cursob3);
//		
//		Estudiante estudianteb9= this.estudianteService.buscarEstudiantePorId(9);
//		estudianteb9.setCurso(cursob3);
//		
//
//		Estudiante estudianteb10= this.estudianteService.buscarEstudiantePorId(10);
//		estudianteb10.setCurso(cursob4);
//		
//		Estudiante estudianteb11= this.estudianteService.buscarEstudiantePorId(11);
//		estudianteb11.setCurso(cursob4);
//		
//		Estudiante estudianteb12= this.estudianteService.buscarEstudiantePorId(12);
//		estudianteb12.setCurso(cursob4);
//		
//
//		Estudiante estudianteb13= this.estudianteService.buscarEstudiantePorId(13);
//		estudianteb13.setCurso(cursob5);
//		
//		Estudiante estudianteb14= this.estudianteService.buscarEstudiantePorId(14);
//		estudianteb14.setCurso(cursob5);
//		
//		Estudiante estudianteb15= this.estudianteService.buscarEstudiantePorId(15);
//		estudianteb15.setCurso(cursob5);
//		
//
//		Estudiante estudianteb16= this.estudianteService.buscarEstudiantePorId(16);
//		estudianteb16.setCurso(cursob6);
//		
//		Estudiante estudianteb17= this.estudianteService.buscarEstudiantePorId(17);
//		estudianteb17.setCurso(cursob6);
//		
//		Estudiante estudianteb18= this.estudianteService.buscarEstudiantePorId(18);
//		estudianteb18.setCurso(cursob6);
//		
//
//		Estudiante estudianteb19= this.estudianteService.buscarEstudiantePorId(19);
//		estudianteb19.setCurso(cursob7);
//		
//		Estudiante estudianteb20= this.estudianteService.buscarEstudiantePorId(20);
//		estudianteb20.setCurso(cursob7);
//		
//		Estudiante estudianteb21= this.estudianteService.buscarEstudiantePorId(21);
//		estudianteb21.setCurso(cursob7);
//		
//
//		Estudiante estudianteb22= this.estudianteService.buscarEstudiantePorId(22);
//		estudianteb22.setCurso(cursob8);
//		
//		Estudiante estudianteb23= this.estudianteService.buscarEstudiantePorId(23);
//		estudianteb23.setCurso(cursob8);
//		
//		Estudiante estudianteb24= this.estudianteService.buscarEstudiantePorId(24);
//		estudianteb24.setCurso(cursob8);
//		
//
//		Estudiante estudianteb25= this.estudianteService.buscarEstudiantePorId(25);
//		estudianteb25.setCurso(cursob9);
//		
//		Estudiante estudianteb26= this.estudianteService.buscarEstudiantePorId(26);
//		estudianteb26.setCurso(cursob9);
//		
//		Estudiante estudianteb27= this.estudianteService.buscarEstudiantePorId(27);
//		estudianteb27.setCurso(cursob9);
//		
//
//		Estudiante estudianteb28= this.estudianteService.buscarEstudiantePorId(28);
//		estudianteb28.setCurso(cursob10);
//		
//		Estudiante estudianteb29= this.estudianteService.buscarEstudiantePorId(29);
//		estudianteb29.setCurso(cursob10);
//		
//		Estudiante estudianteb30= this.estudianteService.buscarEstudiantePorId(30);
//		estudianteb30.setCurso(cursob10);
//		
//
//		Estudiante estudianteb31= this.estudianteService.buscarEstudiantePorId(31);
//		estudianteb31.setCurso(cursob11);
//		
//		Estudiante estudianteb32= this.estudianteService.buscarEstudiantePorId(32);
//		estudianteb32.setCurso(cursob11);
//		
//		Estudiante estudianteb33= this.estudianteService.buscarEstudiantePorId(33);
//		estudianteb33.setCurso(cursob11);
//		
//
//		Estudiante estudianteb34= this.estudianteService.buscarEstudiantePorId(34);
//		estudianteb34.setCurso(cursob12);
//		
//		Estudiante estudianteb35= this.estudianteService.buscarEstudiantePorId(35);
//		estudianteb35.setCurso(cursob12);
//		
//		Estudiante estudianteb36= this.estudianteService.buscarEstudiantePorId(36);
//		estudianteb36.setCurso(cursob12);
//		
//
//		Estudiante estudianteb37= this.estudianteService.buscarEstudiantePorId(37);
//		estudianteb37.setCurso(cursob13);
//		
//		Estudiante estudianteb38= this.estudianteService.buscarEstudiantePorId(38);
//		estudianteb38.setCurso(cursob13);
//		
//		Estudiante estudianteb39= this.estudianteService.buscarEstudiantePorId(39);
//		estudianteb39.setCurso(cursob13);
//		
//
//		Estudiante estudianteb40= this.estudianteService.buscarEstudiantePorId(40);
//		estudianteb40.setCurso(cursob14);
//		
//		Estudiante estudianteb41= this.estudianteService.buscarEstudiantePorId(41);
//		estudianteb41.setCurso(cursob14);
//		
//		Estudiante estudianteb42= this.estudianteService.buscarEstudiantePorId(42);
//		estudianteb42.setCurso(cursob14);
//	
//		
//		lista1.add(estudianteb1);
//		lista1.add(estudianteb2);
//		lista1.add(estudianteb3);
//		
//		
//		lista2.add(estudianteb4);
//		lista2.add(estudianteb5);
//		lista2.add(estudianteb6);
//		
//		lista3.add(estudianteb7);
//		lista3.add(estudianteb8);
//		lista3.add(estudianteb9);
//		
//		lista4.add(estudianteb10);
//		lista4.add(estudianteb11);
//		lista4.add(estudianteb12);
//		
//		lista5.add(estudianteb13);
//		lista5.add(estudianteb14);
//		lista5.add(estudianteb15);
//		
//		lista6.add(estudianteb16);
//		lista6.add(estudianteb17);
//		lista6.add(estudianteb18);
//		
//		lista7.add(estudianteb19);
//		lista7.add(estudianteb20);
//		lista7.add(estudianteb21);
//		
//		lista8.add(estudianteb22);
//		lista8.add(estudianteb23);
//		lista8.add(estudianteb24);
//		
//		lista9.add(estudianteb25);
//		lista9.add(estudianteb26);
//		lista9.add(estudianteb27);
//		
//		lista10.add(estudianteb28);
//		lista10.add(estudianteb29);
//		lista10.add(estudianteb30);
//		
//		lista11.add(estudianteb31);
//		lista11.add(estudianteb32);
//		lista11.add(estudianteb33);
//		
//		lista12.add(estudianteb34);
//		lista12.add(estudianteb35);
//		lista12.add(estudianteb36);
//		
//		lista13.add(estudianteb33);
//		lista13.add(estudianteb38);
//		lista13.add(estudianteb39);
//		
//		lista14.add(estudianteb40);
//		lista14.add(estudianteb41);
//		lista14.add(estudianteb42);
//		
//		cursob1.setEstudiantes(lista1);
//		cursob2.setEstudiantes(lista2);
//		cursob3.setEstudiantes(lista3);
//		cursob4.setEstudiantes(lista4);
//		cursob5.setEstudiantes(lista5);
//		cursob6.setEstudiantes(lista6);
//		cursob7.setEstudiantes(lista7);
//		cursob8.setEstudiantes(lista8);
//		cursob9.setEstudiantes(lista9);
//		cursob10.setEstudiantes(lista10);
//		cursob11.setEstudiantes(lista11);
//		cursob12.setEstudiantes(lista12);
//		cursob13.setEstudiantes(lista13);
//		cursob14.setEstudiantes(lista14);
//		
//		this.cursoService.actualizarCurso(cursob1);
//		this.cursoService.actualizarCurso(cursob2);
//		this.cursoService.actualizarCurso(cursob3);
//		this.cursoService.actualizarCurso(cursob4);
//		this.cursoService.actualizarCurso(cursob5);
//		this.cursoService.actualizarCurso(cursob6);
//		this.cursoService.actualizarCurso(cursob7);
//		this.cursoService.actualizarCurso(cursob8);
//		this.cursoService.actualizarCurso(cursob9);
//		this.cursoService.actualizarCurso(cursob10);
//		this.cursoService.actualizarCurso(cursob11);
//		this.cursoService.actualizarCurso(cursob12);
//		this.cursoService.actualizarCurso(cursob13);
//		this.cursoService.actualizarCurso(cursob14);
//		
//		this.estudianteService.actualizarEstudiante(estudianteb1);
//		this.estudianteService.actualizarEstudiante(estudianteb2);
//		this.estudianteService.actualizarEstudiante(estudianteb3);
//		this.estudianteService.actualizarEstudiante(estudianteb4);
//		this.estudianteService.actualizarEstudiante(estudianteb5);
//		this.estudianteService.actualizarEstudiante(estudianteb6);
//		this.estudianteService.actualizarEstudiante(estudianteb7);
//		this.estudianteService.actualizarEstudiante(estudianteb8);
//		this.estudianteService.actualizarEstudiante(estudianteb9);
//		this.estudianteService.actualizarEstudiante(estudianteb10);
//		this.estudianteService.actualizarEstudiante(estudianteb11);
//		this.estudianteService.actualizarEstudiante(estudianteb12);
//		this.estudianteService.actualizarEstudiante(estudianteb13);
//		this.estudianteService.actualizarEstudiante(estudianteb14);
//		this.estudianteService.actualizarEstudiante(estudianteb15);
//		this.estudianteService.actualizarEstudiante(estudianteb16);
//		this.estudianteService.actualizarEstudiante(estudianteb17);
//		this.estudianteService.actualizarEstudiante(estudianteb18);
//		this.estudianteService.actualizarEstudiante(estudianteb19);
//		this.estudianteService.actualizarEstudiante(estudianteb20);
//		this.estudianteService.actualizarEstudiante(estudianteb21);
//		this.estudianteService.actualizarEstudiante(estudianteb22);
//		this.estudianteService.actualizarEstudiante(estudianteb23);
//		this.estudianteService.actualizarEstudiante(estudianteb24);
//		this.estudianteService.actualizarEstudiante(estudianteb25);
//		this.estudianteService.actualizarEstudiante(estudianteb26);
//		this.estudianteService.actualizarEstudiante(estudianteb27);
//		this.estudianteService.actualizarEstudiante(estudianteb28);
//		this.estudianteService.actualizarEstudiante(estudianteb29);
//		this.estudianteService.actualizarEstudiante(estudianteb30);
//		this.estudianteService.actualizarEstudiante(estudianteb31);
//		this.estudianteService.actualizarEstudiante(estudianteb32);
//		this.estudianteService.actualizarEstudiante(estudianteb33);
//		this.estudianteService.actualizarEstudiante(estudianteb34);
//		this.estudianteService.actualizarEstudiante(estudianteb35);
//		this.estudianteService.actualizarEstudiante(estudianteb36);
//		this.estudianteService.actualizarEstudiante(estudianteb37);
//		this.estudianteService.actualizarEstudiante(estudianteb38);
//		this.estudianteService.actualizarEstudiante(estudianteb39);
//		this.estudianteService.actualizarEstudiante(estudianteb40);
//		this.estudianteService.actualizarEstudiante(estudianteb41);
//		this.estudianteService.actualizarEstudiante(estudianteb42);
//		
		
		// --------------------------------------Unir docente curso--------------------------------------------------------------
		
//		List<Curso> listaCurso1= new ArrayList<>();		
//		List<Curso> listaCurso2= new ArrayList<>();
//		List<Curso> listaCurso3= new ArrayList<>();
//		
//		
//		List<Docente> listaDocente12= new ArrayList<>();		
//		List<Docente> listaDocente34= new ArrayList<>();
//		List<Docente> listaDocente567= new ArrayList<>();
//		
//		
//		Curso cursob1= this.cursoService.buscarCursoPorId(1);
//		Curso cursob2= this.cursoService.buscarCursoPorId(2);
//		Curso cursob3= this.cursoService.buscarCursoPorId(3);
//		Curso cursob4= this.cursoService.buscarCursoPorId(4);
//		Curso cursob5= this.cursoService.buscarCursoPorId(5);
//		Curso cursob6= this.cursoService.buscarCursoPorId(6);
//		Curso cursob7= this.cursoService.buscarCursoPorId(7);
//		Curso cursob8= this.cursoService.buscarCursoPorId(8);
//		Curso cursob9= this.cursoService.buscarCursoPorId(9);
//		Curso cursob10= this.cursoService.buscarCursoPorId(10);
//		Curso cursob11= this.cursoService.buscarCursoPorId(11);
//		Curso cursob12= this.cursoService.buscarCursoPorId(12);
//		Curso cursob13= this.cursoService.buscarCursoPorId(13);
//		Curso cursob14= this.cursoService.buscarCursoPorId(14);
//		
//		Docente docenteb1=this.docenteService.buscarDocentePorId(1);
//		Docente docenteb2=this.docenteService.buscarDocentePorId(2);
//		Docente docenteb3=this.docenteService.buscarDocentePorId(3);
//		Docente docenteb4=this.docenteService.buscarDocentePorId(4);
//		Docente docenteb5=this.docenteService.buscarDocentePorId(5);
//		Docente docenteb6=this.docenteService.buscarDocentePorId(6);
//		Docente docenteb7=this.docenteService.buscarDocentePorId(7);
//		Docente docenteb8=this.docenteService.buscarDocentePorId(8);
//		Docente docenteb9=this.docenteService.buscarDocentePorId(9);
//		Docente docenteb10=this.docenteService.buscarDocentePorId(10);
//		Docente docenteb11=this.docenteService.buscarDocentePorId(11);
//		Docente docenteb12=this.docenteService.buscarDocentePorId(12);
//		Docente docenteb13=this.docenteService.buscarDocentePorId(13);
//		Docente docenteb14=this.docenteService.buscarDocentePorId(14);
//		Docente docenteb15=this.docenteService.buscarDocentePorId(15);
//
//		
//		listaDocente12.add(docenteb1);
//		listaDocente12.add(docenteb4);
//		listaDocente12.add(docenteb7);
//		listaDocente12.add(docenteb10);
//		listaDocente12.add(docenteb13);
//		
//		listaDocente34.add(docenteb2);
//		listaDocente34.add(docenteb5);
//		listaDocente34.add(docenteb8);
//		listaDocente34.add(docenteb11);
//		listaDocente34.add(docenteb14);
//		
//		listaDocente567.add(docenteb3);
//		listaDocente567.add(docenteb6);
//		listaDocente567.add(docenteb9);
//		listaDocente567.add(docenteb12);
//		listaDocente567.add(docenteb15);
//		
//	
//		listaCurso1.add(cursob1);
//		listaCurso1.add(cursob2);
//		listaCurso1.add(cursob3);
//		listaCurso1.add(cursob4);
//		
//		listaCurso2.add(cursob5);
//		listaCurso2.add(cursob6);
//		listaCurso2.add(cursob7);
//		listaCurso2.add(cursob8);
//		
//		listaCurso3.add(cursob9);
//		listaCurso3.add(cursob10);
//		listaCurso3.add(cursob11);
//		listaCurso3.add(cursob12);
//		listaCurso3.add(cursob13);
//		listaCurso3.add(cursob14);
//		
//		cursob1.setListaDocente(listaDocente12);
//		cursob2.setListaDocente(listaDocente12);
//		cursob3.setListaDocente(listaDocente12);
//		cursob4.setListaDocente(listaDocente12);
//		cursob5.setListaDocente(listaDocente34);
//		cursob6.setListaDocente(listaDocente34);
//		cursob7.setListaDocente(listaDocente34);
//		cursob8.setListaDocente(listaDocente34);
//		cursob9.setListaDocente(listaDocente567);
//		cursob10.setListaDocente(listaDocente567);
//		cursob11.setListaDocente(listaDocente567);
//		cursob12.setListaDocente(listaDocente567);
//		cursob13.setListaDocente(listaDocente567);
//		cursob14.setListaDocente(listaDocente567);
//		
//		
//		docenteb1.setListaCurso(listaCurso1);
//		docenteb2.setListaCurso(listaCurso2);
//		docenteb3.setListaCurso(listaCurso3);
//		docenteb4.setListaCurso(listaCurso1);
//		docenteb5.setListaCurso(listaCurso2);
//		docenteb6.setListaCurso(listaCurso3);
//		docenteb7.setListaCurso(listaCurso1);
//		docenteb8.setListaCurso(listaCurso2);
//		docenteb9.setListaCurso(listaCurso3);
//		docenteb10.setListaCurso(listaCurso1);
//		docenteb11.setListaCurso(listaCurso2);
//		docenteb12.setListaCurso(listaCurso3);
//		docenteb13.setListaCurso(listaCurso1);
//		docenteb14.setListaCurso(listaCurso2);
//		docenteb15.setListaCurso(listaCurso3);
//		
//		
//		this.cursoService.actualizarCurso(cursob1);
//		this.cursoService.actualizarCurso(cursob2);
//		this.cursoService.actualizarCurso(cursob3);
//		this.cursoService.actualizarCurso(cursob4);
//		this.cursoService.actualizarCurso(cursob5);
//		this.cursoService.actualizarCurso(cursob6);
//		this.cursoService.actualizarCurso(cursob7);
//		this.cursoService.actualizarCurso(cursob8);
//		this.cursoService.actualizarCurso(cursob9);
//		this.cursoService.actualizarCurso(cursob10);
//		this.cursoService.actualizarCurso(cursob11);
//		this.cursoService.actualizarCurso(cursob12);
//		this.cursoService.actualizarCurso(cursob13);
//		this.cursoService.actualizarCurso(cursob14);
//		
//		this.docenteService.actualizarDocente(docenteb1);
//		this.docenteService.actualizarDocente(docenteb2);
//		this.docenteService.actualizarDocente(docenteb3);
//		this.docenteService.actualizarDocente(docenteb4);
//		this.docenteService.actualizarDocente(docenteb5);
//		this.docenteService.actualizarDocente(docenteb6);
//		this.docenteService.actualizarDocente(docenteb7);
//		this.docenteService.actualizarDocente(docenteb8);
//		this.docenteService.actualizarDocente(docenteb9);
//		this.docenteService.actualizarDocente(docenteb10);
//		this.docenteService.actualizarDocente(docenteb11);
//		this.docenteService.actualizarDocente(docenteb12);
//		this.docenteService.actualizarDocente(docenteb13);
//		this.docenteService.actualizarDocente(docenteb14);
//		this.docenteService.actualizarDocente(docenteb15);
//		
		
		
		//--------------------------Unir estudiante con materia--------------------------------------------------------
		
//		List<Estudiante> listaEstudiante1= new ArrayList<>();
//		
//		
//		List<Materia> listaMateria1= new ArrayList<>();
//		
//		
//		
//		Estudiante estudianteb1=this.estudianteService.buscarEstudiantePorId(1);
//		Estudiante estudianteb2=this.estudianteService.buscarEstudiantePorId(2);
//		Estudiante estudianteb3=this.estudianteService.buscarEstudiantePorId(3);
//		Estudiante estudianteb4=this.estudianteService.buscarEstudiantePorId(4);
//		Estudiante estudianteb5=this.estudianteService.buscarEstudiantePorId(5);
//		Estudiante estudianteb6=this.estudianteService.buscarEstudiantePorId(6);
//		Estudiante estudianteb7=this.estudianteService.buscarEstudiantePorId(7);
//		Estudiante estudianteb8=this.estudianteService.buscarEstudiantePorId(8);
//		Estudiante estudianteb9=this.estudianteService.buscarEstudiantePorId(9);
//		Estudiante estudianteb10=this.estudianteService.buscarEstudiantePorId(10);
//		Estudiante estudianteb11=this.estudianteService.buscarEstudiantePorId(11);
//		Estudiante estudianteb12=this.estudianteService.buscarEstudiantePorId(12);
//		Estudiante estudianteb13=this.estudianteService.buscarEstudiantePorId(13);
//		Estudiante estudianteb14=this.estudianteService.buscarEstudiantePorId(14);
//		Estudiante estudianteb15=this.estudianteService.buscarEstudiantePorId(15);
//		Estudiante estudianteb16=this.estudianteService.buscarEstudiantePorId(16);
//		Estudiante estudianteb17=this.estudianteService.buscarEstudiantePorId(17);
//		Estudiante estudianteb18=this.estudianteService.buscarEstudiantePorId(18);
//		Estudiante estudianteb19=this.estudianteService.buscarEstudiantePorId(19);
//		Estudiante estudianteb20=this.estudianteService.buscarEstudiantePorId(20);
//		Estudiante estudianteb21=this.estudianteService.buscarEstudiantePorId(21);
//		Estudiante estudianteb22=this.estudianteService.buscarEstudiantePorId(22);
//		Estudiante estudianteb23=this.estudianteService.buscarEstudiantePorId(23);
//		Estudiante estudianteb24=this.estudianteService.buscarEstudiantePorId(24);
//		Estudiante estudianteb25=this.estudianteService.buscarEstudiantePorId(25);
//		Estudiante estudianteb26=this.estudianteService.buscarEstudiantePorId(26);
//		Estudiante estudianteb27=this.estudianteService.buscarEstudiantePorId(27);
//		Estudiante estudianteb28=this.estudianteService.buscarEstudiantePorId(28);
//		Estudiante estudianteb29=this.estudianteService.buscarEstudiantePorId(29);
//		Estudiante estudianteb30=this.estudianteService.buscarEstudiantePorId(30);
//		Estudiante estudianteb31=this.estudianteService.buscarEstudiantePorId(31);
//		Estudiante estudianteb32=this.estudianteService.buscarEstudiantePorId(32);
//		Estudiante estudianteb33=this.estudianteService.buscarEstudiantePorId(33);
//		Estudiante estudianteb34=this.estudianteService.buscarEstudiantePorId(34);
//		Estudiante estudianteb35=this.estudianteService.buscarEstudiantePorId(35);
//		Estudiante estudianteb36=this.estudianteService.buscarEstudiantePorId(36);
//		Estudiante estudianteb37=this.estudianteService.buscarEstudiantePorId(37);
//		Estudiante estudianteb38=this.estudianteService.buscarEstudiantePorId(38);
//		Estudiante estudianteb39=this.estudianteService.buscarEstudiantePorId(39);
//		Estudiante estudianteb40=this.estudianteService.buscarEstudiantePorId(40);
//		Estudiante estudianteb41=this.estudianteService.buscarEstudiantePorId(41);
//		Estudiante estudianteb42=this.estudianteService.buscarEstudiantePorId(42);
//		
//		
//		
//		Materia materiab1=this.materiaService.buscarMateriaPorId(1);		
//		Materia materiab2=this.materiaService.buscarMateriaPorId(2);
//		Materia materiab3=this.materiaService.buscarMateriaPorId(3);
//		Materia materiab4=this.materiaService.buscarMateriaPorId(4);
//		Materia materiab5=this.materiaService.buscarMateriaPorId(5);
//		
//		
//		
//		listaMateria1.add(materiab1);
//		listaMateria1.add(materiab2);
//		listaMateria1.add(materiab3);
//		listaMateria1.add(materiab4);
//		listaMateria1.add(materiab5);
//		
//		listaEstudiante1.add(estudianteb1);
//		listaEstudiante1.add(estudianteb2);
//		listaEstudiante1.add(estudianteb3);
//		listaEstudiante1.add(estudianteb4);
//		listaEstudiante1.add(estudianteb5);
//		listaEstudiante1.add(estudianteb6);
//		listaEstudiante1.add(estudianteb7);
//		listaEstudiante1.add(estudianteb8);
//		listaEstudiante1.add(estudianteb9);
//		listaEstudiante1.add(estudianteb10);
//		listaEstudiante1.add(estudianteb11);
//		listaEstudiante1.add(estudianteb12);
//		listaEstudiante1.add(estudianteb13);
//		listaEstudiante1.add(estudianteb14);
//		listaEstudiante1.add(estudianteb15);
//		listaEstudiante1.add(estudianteb16);
//		listaEstudiante1.add(estudianteb17);
//		listaEstudiante1.add(estudianteb18);
//		listaEstudiante1.add(estudianteb19);
//		listaEstudiante1.add(estudianteb20);
//		listaEstudiante1.add(estudianteb21);
//		listaEstudiante1.add(estudianteb22);
//		listaEstudiante1.add(estudianteb23);
//		listaEstudiante1.add(estudianteb24);
//		listaEstudiante1.add(estudianteb25);
//		listaEstudiante1.add(estudianteb26);
//		listaEstudiante1.add(estudianteb27);
//		listaEstudiante1.add(estudianteb28);
//		listaEstudiante1.add(estudianteb29);
//		listaEstudiante1.add(estudianteb30);
//		listaEstudiante1.add(estudianteb31);
//		listaEstudiante1.add(estudianteb32);
//		listaEstudiante1.add(estudianteb33);
//		listaEstudiante1.add(estudianteb34);
//		listaEstudiante1.add(estudianteb35);
//		listaEstudiante1.add(estudianteb36);
//		listaEstudiante1.add(estudianteb37);
//		listaEstudiante1.add(estudianteb38);
//		listaEstudiante1.add(estudianteb39);
//		listaEstudiante1.add(estudianteb40);
//		listaEstudiante1.add(estudianteb41);
//		listaEstudiante1.add(estudianteb42);
//		
//	

//		
//		
//		
//		estudianteb1.setListaMateria(listaMateria1);
//		estudianteb2.setListaMateria(listaMateria1);
//		estudianteb3.setListaMateria(listaMateria1);
//		estudianteb4.setListaMateria(listaMateria1);
//		estudianteb5.setListaMateria(listaMateria1);
//		estudianteb6.setListaMateria(listaMateria1);
//		estudianteb7.setListaMateria(listaMateria1);
//		estudianteb8.setListaMateria(listaMateria1);
//		estudianteb9.setListaMateria(listaMateria1);
//		estudianteb10.setListaMateria(listaMateria1);
//		estudianteb11.setListaMateria(listaMateria1);
//		estudianteb12.setListaMateria(listaMateria1);
//		estudianteb13.setListaMateria(listaMateria1);
//		estudianteb14.setListaMateria(listaMateria1);
//		estudianteb15.setListaMateria(listaMateria1);
//		estudianteb16.setListaMateria(listaMateria1);
//		estudianteb17.setListaMateria(listaMateria1);
//		estudianteb18.setListaMateria(listaMateria1);
//		estudianteb19.setListaMateria(listaMateria1);
//		estudianteb20.setListaMateria(listaMateria1);
//		estudianteb21.setListaMateria(listaMateria1);
//		estudianteb22.setListaMateria(listaMateria1);
//		estudianteb23.setListaMateria(listaMateria1);
//		estudianteb24.setListaMateria(listaMateria1);
//		estudianteb25.setListaMateria(listaMateria1);
//		estudianteb26.setListaMateria(listaMateria1);
//		estudianteb27.setListaMateria(listaMateria1);
//		estudianteb28.setListaMateria(listaMateria1);
//		estudianteb29.setListaMateria(listaMateria1);
//		estudianteb30.setListaMateria(listaMateria1);
//		estudianteb31.setListaMateria(listaMateria1);
//		estudianteb32.setListaMateria(listaMateria1);
//		estudianteb33.setListaMateria(listaMateria1);
//		estudianteb34.setListaMateria(listaMateria1);
//		estudianteb35.setListaMateria(listaMateria1);
//		estudianteb36.setListaMateria(listaMateria1);
//		estudianteb37.setListaMateria(listaMateria1);
//		estudianteb38.setListaMateria(listaMateria1);
//		estudianteb39.setListaMateria(listaMateria1);
//		estudianteb40.setListaMateria(listaMateria1);
//		estudianteb41.setListaMateria(listaMateria1);
//		estudianteb42.setListaMateria(listaMateria1);
//		
//
//		materiab1.setListaEstudiante(listaEstudiante1);
//		materiab2.setListaEstudiante(listaEstudiante1);
//		materiab3.setListaEstudiante(listaEstudiante1);
//		materiab4.setListaEstudiante(listaEstudiante1);
//		materiab5.setListaEstudiante(listaEstudiante1);
//		
//		
//		//actualiza la entidad dodne se crea la tabla
//		
//		this.materiaService.actualizarMateria(materiab1);
//		this.materiaService.actualizarMateria(materiab2);
//		this.materiaService.actualizarMateria(materiab3);
//		this.materiaService.actualizarMateria(materiab4);
//		this.materiaService.actualizarMateria(materiab5);
//		
//		this.estudianteService.actualizarEstudiante(estudianteb1);
//		this.estudianteService.actualizarEstudiante(estudianteb2);
//		this.estudianteService.actualizarEstudiante(estudianteb3);
//		this.estudianteService.actualizarEstudiante(estudianteb4);
//		this.estudianteService.actualizarEstudiante(estudianteb5);
//		this.estudianteService.actualizarEstudiante(estudianteb6);
//		this.estudianteService.actualizarEstudiante(estudianteb7);
//		this.estudianteService.actualizarEstudiante(estudianteb8);
//		this.estudianteService.actualizarEstudiante(estudianteb9);
//		this.estudianteService.actualizarEstudiante(estudianteb10);
//		this.estudianteService.actualizarEstudiante(estudianteb11);
//		this.estudianteService.actualizarEstudiante(estudianteb12);
//		this.estudianteService.actualizarEstudiante(estudianteb13);
//		this.estudianteService.actualizarEstudiante(estudianteb14);
//		this.estudianteService.actualizarEstudiante(estudianteb15);
//		this.estudianteService.actualizarEstudiante(estudianteb16);
//		this.estudianteService.actualizarEstudiante(estudianteb17);
//		this.estudianteService.actualizarEstudiante(estudianteb18);
//		this.estudianteService.actualizarEstudiante(estudianteb19);
//		this.estudianteService.actualizarEstudiante(estudianteb20);
//		this.estudianteService.actualizarEstudiante(estudianteb21);
//		this.estudianteService.actualizarEstudiante(estudianteb22);
//		this.estudianteService.actualizarEstudiante(estudianteb23);
//		this.estudianteService.actualizarEstudiante(estudianteb24);
//		this.estudianteService.actualizarEstudiante(estudianteb25);
//		this.estudianteService.actualizarEstudiante(estudianteb26);
//		this.estudianteService.actualizarEstudiante(estudianteb27);
//		this.estudianteService.actualizarEstudiante(estudianteb28);
//		this.estudianteService.actualizarEstudiante(estudianteb29);
//		this.estudianteService.actualizarEstudiante(estudianteb30);
//		this.estudianteService.actualizarEstudiante(estudianteb31);
//		this.estudianteService.actualizarEstudiante(estudianteb32);
//		this.estudianteService.actualizarEstudiante(estudianteb33);
//		this.estudianteService.actualizarEstudiante(estudianteb34);
//		this.estudianteService.actualizarEstudiante(estudianteb35);
//		this.estudianteService.actualizarEstudiante(estudianteb36);
//		this.estudianteService.actualizarEstudiante(estudianteb37);
//		this.estudianteService.actualizarEstudiante(estudianteb38);
//		this.estudianteService.actualizarEstudiante(estudianteb39);
//		this.estudianteService.actualizarEstudiante(estudianteb40);
//		this.estudianteService.actualizarEstudiante(estudianteb41);
//		this.estudianteService.actualizarEstudiante(estudianteb42);
//		
//		
		
		//----------------------------------------------------------Insertar Usuarios------------------------------------------------------
//		
//		Usuario usuario1= new Usuario();
//		usuario1.setNombre("Blanca Mariana");
//		usuario1.setApellido("Perez Idrovo");
//		usuario1.setTipo("Docente");
//		usuario1.setCorreo("bmapi@gutemberg.edu.ec");
//		usuario1.setContrasenia("12345");
//		
//		Usuario usuario2= new Usuario();
//		usuario2.setNombre("Segundo Fernando");
//		usuario2.setApellido("Arevalo Lopez");
//		usuario2.setTipo("Docente");
//		usuario2.setCorreo("sefal@gutemberg.edu.ec");
//		usuario2.setContrasenia("12345");
//		
//		Usuario usuario3= new Usuario();
//		usuario3.setNombre("Maria Fernanda");
//		usuario3.setApellido("Andrade Pazmiño");
//		usuario3.setTipo("Docente");
//		usuario3.setCorreo("mafep@gutemberg.edu.ec");
//		usuario3.setContrasenia("12345");
//		
//		Usuario usuario4= new Usuario();
//		usuario4.setNombre("Daniel Alexander");
//		usuario4.setApellido("Carrillo Perez");
//		usuario4.setTipo("Docente");
//		usuario4.setCorreo("daecp@gutemberg.edu.ec");
//		usuario4.setContrasenia("12345");
//		
//		Usuario usuario5= new Usuario();
//		usuario5.setNombre("Ana Cristina");
//		usuario5.setApellido("Sanchez Abad");
//		usuario5.setTipo("Docente");
//		usuario5.setCorreo("acsa@gutemberg.edu.ec");
//		usuario5.setContrasenia("12345");
//		
//		Usuario usuario6= new Usuario();
//		usuario6.setNombre("Karolain Anahi");
//		usuario6.setApellido("Calva Calva");
//		usuario6.setTipo("Docente");
//		usuario6.setCorreo("kacal@gutemberg.edu.ec");
//		usuario6.setContrasenia("12345");
//		
//		Usuario usuario7= new Usuario();
//		usuario7.setNombre("Pablo Andres");
//		usuario7.setApellido("Carrera Carpio");
//		usuario7.setTipo("Docente");
//		usuario7.setCorreo("pacc@gutemberg.edu.ec");
//		usuario7.setContrasenia("12345");
//		
//		Usuario usuario8= new Usuario();
//		usuario8.setNombre("Luis Fernando");
//		usuario8.setApellido("Quizhpe Espinoza");
//		usuario8.setTipo("Docente");
//		usuario8.setCorreo("lufeqe@gutemberg.edu.ec");
//		usuario8.setContrasenia("12345");
//		
//		Usuario usuario9= new Usuario();
//		usuario9.setNombre("Stefany Anahi");
//		usuario9.setApellido("Patiño Espinoza");
//		usuario9.setTipo("Docente");
//		usuario9.setCorreo("stapes@gutemberg.edu.ec");
//		usuario9.setContrasenia("12345");
//		
//		Usuario usuario10= new Usuario();
//		usuario10.setNombre("Josselyn Anahi");
//		usuario10.setApellido("Calva Cueva");
//		usuario10.setTipo("Docente");
//		usuario10.setCorreo("josaca@gutemberg.edu.ec");
//		usuario10.setContrasenia("12345");
//		
//		Usuario usuario11= new Usuario();
//		usuario11.setNombre("Andrea Nataly");
//		usuario11.setApellido("Jumbo Jumbo");
//		usuario11.setTipo("Docente");
//		usuario11.setCorreo("anjuju@gutemberg.edu.ec");
//		usuario11.setContrasenia("12345");
//		
//		Usuario usuario12= new Usuario();
//		usuario12.setNombre("Fredy Alexander");
//		usuario12.setApellido("Crespo Montaño");
//		usuario12.setTipo("Docente");
//		usuario12.setCorreo("felemon@gutemberg.edu.ec");
//		usuario12.setContrasenia("12345");
//		
//		Usuario usuario13= new Usuario();
//		usuario13.setNombre("Luis Roberto");
//		usuario13.setApellido("Machado Obando");
//		usuario13.setTipo("Docente");
//		usuario13.setCorreo("fido@gutemberg.edu.ec");
//		usuario13.setContrasenia("12345");
//		
//		Usuario usuario14= new Usuario();
//		usuario14.setNombre("Leonardo Isaac");
//		usuario14.setApellido("Ordoñez Espinoza");
//		usuario14.setTipo("Docente");
//		usuario14.setCorreo("isaaco@gutemberg.edu.ec");
//		usuario14.setContrasenia("12345");
//		
//		Usuario usuario15= new Usuario();
//		usuario15.setNombre("Michelle Anahi");
//		usuario15.setApellido("Villacres Vera");
//		usuario15.setTipo("Docente");
//		usuario15.setCorreo("mivive@gutemberg.edu.ec");
//		usuario15.setContrasenia("12345");
//		
//		Usuario usuario16= new Usuario();
//		usuario16.setNombre("Julissa Stefania");
//		usuario16.setApellido("Jaramillo Hidalgo");
//		usuario16.setTipo("Estudiante");
//		usuario16.setCorreo("jusjh@gutemberg.edu.ec");
//		usuario16.setContrasenia("67890");
//		
//		Usuario usuario17= new Usuario();
//		usuario17.setNombre("Julian Rafael");
//		usuario17.setApellido("Sanchez Iñiguez");
//		usuario17.setTipo("Estudiante");
//		usuario17.setCorreo("jurai@gutemberg.edu.ec");
//		usuario17.setContrasenia("67890");
//		
//		Usuario usuario18= new Usuario();
//		usuario18.setNombre("Felipe Alexander");
//		usuario18.setApellido("Suing Bailon");
//		usuario18.setTipo("Estudiante");
//		usuario18.setCorreo("fesuba@gutemberg.edu.ec");
//		usuario18.setContrasenia("67890");
//		
//		Usuario usuario19= new Usuario();
//		usuario19.setNombre("Paulina Yahaira");
//		usuario19.setApellido("Andrade Sanchez");
//		usuario19.setTipo("Estudiante");
//		usuario19.setCorreo("payan@gutemberg.edu.ec");
//		usuario19.setContrasenia("67890");
//		
//		Usuario usuario20= new Usuario();
//		usuario20.setNombre("Victor Manuel");
//		usuario20.setApellido("Monroy Abendaño");
//		usuario20.setTipo("Estudiante");
//		usuario20.setCorreo("vimoa@gutemberg.edu.ec");
//		usuario20.setContrasenia("67890");
//		
//		Usuario usuario21= new Usuario();
//		usuario21.setNombre("Pedro Pablo");
//		usuario21.setApellido("Velasco Ibarra");
//		usuario21.setTipo("Estudiante");
//		usuario21.setCorreo("pepai@gutemberg.edu.ec");
//		usuario21.setContrasenia("67890");
//		
//		Usuario usuario22= new Usuario();
//		usuario22.setNombre("William Rigoberto");
//		usuario22.setApellido("Mayorga Montaño");
//		usuario22.setTipo("Estudiante");
//		usuario22.setCorreo("wimam@gutemberg.edu.ec");
//		usuario22.setContrasenia("67890");
//		
//		Usuario usuario23= new Usuario();
//		usuario23.setNombre("Andy Esteban");
//		usuario23.setApellido("Chiriboga Villacres");
//		usuario23.setTipo("Estudiante");
//		usuario23.setCorreo("achivi@gutemberg.edu.ec");
//		usuario23.setContrasenia("67890");
//		
//		Usuario usuario24= new Usuario();
//		usuario24.setNombre("Richard Ramiro");
//		usuario24.setApellido("Ramirez Rosales");
//		usuario24.setTipo("Estudiante");
//		usuario24.setCorreo("rirales@gutemberg.edu.ec");
//		usuario24.setContrasenia("67890");
//		
//		Usuario usuario25= new Usuario();
//		usuario25.setNombre("Anthony Alexander");
//		usuario25.setApellido("Calvache Molina");
//		usuario25.setTipo("Estudiante");
//		usuario25.setCorreo("ancamo@gutemberg.edu.ec");
//		usuario25.setContrasenia("67890");
//		
//		Usuario usuario26= new Usuario();
//		usuario26.setNombre("Miriam del Rocio");
//		usuario26.setApellido("Velazquez Ibarra");
//		usuario26.setTipo("Estudiante");
//		usuario26.setCorreo("mivi@gutemberg.edu.ec");
//		usuario26.setContrasenia("67890");
//		
//		Usuario usuario27= new Usuario();
//		usuario27.setNombre("Oscar Manuel");
//		usuario27.setApellido("Correa Correa");
//		usuario27.setTipo("Estudiante");
//		usuario27.setCorreo("oscor@gutemberg.edu.ec");
//		usuario27.setContrasenia("67890");
//		
//		Usuario usuario28= new Usuario();
//		usuario28.setNombre("Carlos Alexander");
//		usuario28.setApellido("Diaz Diaz");
//		usuario28.setTipo("Estudiante");
//		usuario28.setCorreo("cadiaz@gutemberg.edu.ec");
//		usuario28.setContrasenia("67890");
//		
//		Usuario usuario29= new Usuario();
//		usuario29.setNombre("Luis Leonel");
//		usuario29.setApellido("Cervantes Ontaneda");
//		usuario29.setTipo("Estudiante");
//		usuario29.setCorreo("luico@gutemberg.edu.ec");
//		usuario29.setContrasenia("67890");
//		
//		Usuario usuario30= new Usuario();
//		usuario30.setNombre("Mayra Elizabeth");
//		usuario30.setApellido("Hernandez Molina");
//		usuario30.setTipo("Estudiante");
//		usuario30.setCorreo("mayher@gutemberg.edu.ec");
//		usuario30.setContrasenia("67890");
//		
//		Usuario usuario31= new Usuario();
//		usuario31.setNombre("Jimy Alexander");
//		usuario31.setApellido("Carcelen Moraloes");
//		usuario31.setTipo("Estudiante");
//		usuario31.setCorreo("jicama@gutemberg.edu.ec");
//		usuario31.setContrasenia("67890");
//		
//		Usuario usuario32= new Usuario();
//		usuario32.setNombre("Jessica Carolina");
//		usuario32.setApellido("Quichimbo Pino");
//		usuario32.setTipo("Estudiante");
//		usuario32.setCorreo("jequin@gutemberg.edu.ec");
//		usuario32.setContrasenia("67890");
//		
//		Usuario usuario33= new Usuario();
//		usuario33.setNombre("Dennis Alexander");
//		usuario33.setApellido("Pilco Rosales");
//		usuario33.setTipo("Estudiante");
//		usuario33.setCorreo("depiro@gutemberg.edu.ec");
//		usuario33.setContrasenia("67890");
//		
//		Usuario usuario34= new Usuario();
//		usuario34.setNombre("Juan Pablo");
//		usuario34.setApellido("Valdivieso Perez");
//		usuario34.setTipo("Estudiante");
//		usuario34.setCorreo("juvupe@gutemberg.edu.ec");
//		usuario34.setContrasenia("67890");
//		
//		Usuario usuario35= new Usuario();
//		usuario35.setNombre("Juan Fernando");
//		usuario35.setApellido("Ramon Carcelen");
//		usuario35.setTipo("Estudiante");
//		usuario35.setCorreo("juralen@gutemberg.edu.ec");
//		usuario35.setContrasenia("67890");
//		
//		Usuario usuario36= new Usuario();
//		usuario36.setNombre("Johan Andres");
//		usuario36.setApellido("Zea Carpio");
//		usuario36.setTipo("Estudiante");
//		usuario36.setCorreo("jozea@gutemberg.edu.ec");
//		usuario36.setContrasenia("67890");
//		
//		Usuario usuario37= new Usuario();
//		usuario37.setNombre("Cristian David");
//		usuario37.setApellido("Carrera Lopez");
//		usuario37.setTipo("Estudiante");
//		usuario37.setCorreo("crisloca@gutemberg.edu.ec");
//		usuario37.setContrasenia("67890");
//		
//		Usuario usuario38= new Usuario();
//		usuario38.setNombre("Luis Maximiliano");
//		usuario38.setApellido("Montalvo Ortiz");
//		usuario38.setTipo("Estudiante");
//		usuario38.setCorreo("lumono@gutemberg.edu.ec");
//		usuario38.setContrasenia("67890");
//		
//		Usuario usuario39= new Usuario();
//		usuario39.setNombre("Jorge Rafael");
//		usuario39.setApellido("Villamar Flores");
//		usuario39.setTipo("Estudiante");
//		usuario39.setCorreo("jorvis@gutemberg.edu.ec");
//		usuario39.setContrasenia("67890");
//		
//		Usuario usuario40= new Usuario();
//		usuario40.setNombre("Luz Maria");
//		usuario40.setApellido("Borja Abad");
//		usuario40.setTipo("Estudiante");
//		usuario40.setCorreo("luboa@gutemberg.edu.ec");
//		usuario40.setContrasenia("67890");
//		
//		Usuario usuario41= new Usuario();
//		usuario41.setNombre("Helen Cristina");
//		usuario41.setApellido("Espinoza Fernandez");
//		usuario41.setTipo("Estudiante");
//		usuario41.setCorreo("hefer@gutemberg.edu.ec");
//		usuario41.setContrasenia("67890");
//		
//		Usuario usuario42= new Usuario();
//		usuario42.setNombre("Mario Fernando");
//		usuario42.setApellido("Carrillo Chavez");
//		usuario42.setTipo("Estudiante");
//		usuario42.setCorreo("macavez@gutemberg.edu.ec");
//		usuario42.setContrasenia("67890");
//		
//		Usuario usuario43= new Usuario();
//		usuario43.setNombre("Veronica Cristina");
//		usuario43.setApellido("Tapia Castillo");
//		usuario43.setTipo("Estudiante");
//		usuario43.setCorreo("vetallo@gutemberg.edu.ec");
//		usuario43.setContrasenia("67890");
//		
//		Usuario usuario44= new Usuario();
//		usuario44.setNombre("Noelia Stefany");
//		usuario44.setApellido("Veintimilla Rios");
//		usuario44.setTipo("Estudiante");
//		usuario44.setCorreo("noe@gutemberg.edu.ec");
//		usuario44.setContrasenia("67890");
//		
//		Usuario usuario45= new Usuario();
//		usuario45.setNombre("Diego Dario");
//		usuario45.setApellido("Tapia Palacios");
//		usuario45.setTipo("Estudiante");
//		usuario45.setCorreo("dietapia@gutemberg.edu.ec");
//		usuario45.setContrasenia("67890");
//		
//		Usuario usuario46= new Usuario();
//		usuario46.setNombre("Stefany Carolina");
//		usuario46.setApellido("Arciniega Aguilar");
//		usuario46.setTipo("Estudiante");
//		usuario46.setCorreo("scalar@gutemberg.edu.ec");
//		usuario46.setContrasenia("67890");
//		
//		Usuario usuario47= new Usuario();
//		usuario47.setNombre("Valeria Fatima");
//		usuario47.setApellido("Valladarez Gonzales");
//		usuario47.setTipo("Estudiante");
//		usuario47.setCorreo("vavago@gutemberg.edu.ec");
//		usuario47.setContrasenia("67890");
//		
//		Usuario usuario48= new Usuario();
//		usuario48.setNombre("Katherine Viviana");
//		usuario48.setApellido("Maza Maza");
//		usuario48.setTipo("Estudiante");
//		usuario48.setCorreo("kamaza@gutemberg.edu.ec");
//		usuario48.setContrasenia("67890");
//		
//		Usuario usuario49= new Usuario();
//		usuario49.setNombre("Dario Esteban");
//		usuario49.setApellido("Arevalo Donoso");
//		usuario49.setTipo("Estudiante");
//		usuario49.setCorreo("dadolo@gutemberg.edu.ec");
//		usuario49.setContrasenia("67890");
//
//		Usuario usuario50= new Usuario();
//		usuario50.setNombre("Carolina del Rocio");
//		usuario50.setApellido("Juca Lopez");
//		usuario50.setTipo("Estudiante");
//		usuario50.setCorreo("caroju@gutemberg.edu.ec");
//		usuario50.setContrasenia("67890");
//		
//		Usuario usuario51= new Usuario();
//		usuario51.setNombre("Walter Fernando");
//		usuario51.setApellido("Cevallos Arias");
//		usuario51.setTipo("Estudiante");
//		usuario51.setCorreo("wacea@gutemberg.edu.ec");
//		usuario51.setContrasenia("67890");
//		
//		Usuario usuario52= new Usuario();
//		usuario52.setNombre("Jose Alexander");
//		usuario52.setApellido("Arias Andrade");
//		usuario52.setTipo("Estudiante");
//		usuario52.setCorreo("joara@gutemberg.edu.ec");
//		usuario52.setContrasenia("67890");
//		
//		Usuario usuario53= new Usuario();
//		usuario53.setNombre("Gustavo Rafael");
//		usuario53.setApellido("Sanchez Iñiguez");
//		usuario53.setTipo("Estudiante");
//		usuario53.setCorreo("gus@gutemberg.edu.ec");
//		usuario53.setContrasenia("67890");
//		
//		Usuario usuario54= new Usuario();
//		usuario54.setNombre("Maria Eugenia");
//		usuario54.setApellido("Suing Bailon");
//		usuario54.setTipo("Estudiante");
//		usuario54.setCorreo("mausi@gutemberg.edu.ec");
//		usuario54.setContrasenia("67890");
//		
//		Usuario usuario55= new Usuario();
//		usuario55.setNombre("Milton Alexander");
//		usuario55.setApellido("Morales Perez");
//		usuario55.setTipo("Estudiante");
//		usuario55.setCorreo("mimopeza@gutemberg.edu.ec");
//		usuario55.setContrasenia("67890");
//		
//		Usuario usuario56= new Usuario();
//		usuario56.setNombre("Giselle Estefania");
//		usuario56.setApellido("Guarnizo Ordoñez");
//		usuario56.setTipo("Estudiante");
//		usuario56.setCorreo("giguas@gutemberg.edu.ec");
//		usuario56.setContrasenia("67890");
//		
//		Usuario usuario57= new Usuario();
//		usuario57.setNombre("Melissa Fernanda");
//		usuario57.setApellido("Cajas Jaramillo");
//		usuario57.setTipo("Estudiante");
//		usuario57.setCorreo("mecaja@gutemberg.edu.ec");
//		usuario57.setContrasenia("67890");
//		
//		this.usuarioService.insertarUsuario(usuario1);
//		this.usuarioService.insertarUsuario(usuario2);
//		this.usuarioService.insertarUsuario(usuario3);
//		this.usuarioService.insertarUsuario(usuario4);
//		this.usuarioService.insertarUsuario(usuario5);
//		this.usuarioService.insertarUsuario(usuario6);
//		this.usuarioService.insertarUsuario(usuario7);
//		this.usuarioService.insertarUsuario(usuario8);
//		this.usuarioService.insertarUsuario(usuario9);
//		this.usuarioService.insertarUsuario(usuario10);
//		this.usuarioService.insertarUsuario(usuario11);
//		this.usuarioService.insertarUsuario(usuario12);
//		this.usuarioService.insertarUsuario(usuario13);
//		this.usuarioService.insertarUsuario(usuario14);
//		this.usuarioService.insertarUsuario(usuario15);
//		this.usuarioService.insertarUsuario(usuario16);
//		this.usuarioService.insertarUsuario(usuario17);
//		this.usuarioService.insertarUsuario(usuario18);
//		this.usuarioService.insertarUsuario(usuario19);
//		this.usuarioService.insertarUsuario(usuario20);
//		this.usuarioService.insertarUsuario(usuario21);
//		this.usuarioService.insertarUsuario(usuario22);
//		this.usuarioService.insertarUsuario(usuario23);
//		this.usuarioService.insertarUsuario(usuario24);
//		this.usuarioService.insertarUsuario(usuario25);
//		this.usuarioService.insertarUsuario(usuario26);
//		this.usuarioService.insertarUsuario(usuario27);
//		this.usuarioService.insertarUsuario(usuario28);
//		this.usuarioService.insertarUsuario(usuario29);
//		this.usuarioService.insertarUsuario(usuario30);
//		this.usuarioService.insertarUsuario(usuario31);
//		this.usuarioService.insertarUsuario(usuario32);
//		this.usuarioService.insertarUsuario(usuario33);
//		this.usuarioService.insertarUsuario(usuario34);
//		this.usuarioService.insertarUsuario(usuario35);
//		this.usuarioService.insertarUsuario(usuario36);
//		this.usuarioService.insertarUsuario(usuario37);
//		this.usuarioService.insertarUsuario(usuario38);
//		this.usuarioService.insertarUsuario(usuario39);
//		this.usuarioService.insertarUsuario(usuario40);
//		this.usuarioService.insertarUsuario(usuario41);
//		this.usuarioService.insertarUsuario(usuario42);
//		this.usuarioService.insertarUsuario(usuario43);
//		this.usuarioService.insertarUsuario(usuario44);
//		this.usuarioService.insertarUsuario(usuario45);
//		this.usuarioService.insertarUsuario(usuario46);
//		this.usuarioService.insertarUsuario(usuario47);
//		this.usuarioService.insertarUsuario(usuario48);
//		this.usuarioService.insertarUsuario(usuario49);
//		this.usuarioService.insertarUsuario(usuario50);
//		this.usuarioService.insertarUsuario(usuario51);
//		this.usuarioService.insertarUsuario(usuario52);
//		this.usuarioService.insertarUsuario(usuario53);
//		this.usuarioService.insertarUsuario(usuario54);
//		this.usuarioService.insertarUsuario(usuario55);
//		this.usuarioService.insertarUsuario(usuario56);
//		this.usuarioService.insertarUsuario(usuario57);
		
		//Filtrar estudiantes por curso
		
	//	List<Estudiante> listasencillo= this.estudianteService.listaEstudiantes("Primero", "A");
		
	//	for (Estudiante s:listasencillo) {
	//		System.out.println(s.toString());
	//		System.out.println(s.getListaMateria().toString());
	//	}
	

	// Filtracion

	// this.gestorEstudiante.consultarCurso("Primero", "A");

//		Estudiante ges36=this.gestorDocente.actualizarRegistrarNota("mecaja@gutemberg.edu.ec", "Ciencias");
	// Estudiante
	// ges37=this.gestorDocente.actualizarRegistrarNota("mecaja@gutemberg.edu.ec",
	// "Lenguaje");
	// Estudiante
	// ges38=this.gestorDocente.actualizarRegistrarNota("mecaja@gutemberg.edu.ec",
	// "Sociales");
	// Estudiante
	// ges39=this.gestorDocente.actualizarRegistrarNota("mecaja@gutemberg.edu.ec",
	// "Ciencias");
	// Estudiante
	// ges40=this.gestorDocente.actualizarRegistrarNota("mecaja@gutemberg.edu.ec",
	// "Aleman");

//		Estudiante t4=this.estudianteService.buscarEstudiantePorCorreo("mecaja@gutemberg.edu.ec");
//		
//		t4.getListaMateria().get(4).setCalificacion(new BigDecimal("6.00"));
//		
//		this.estudianteService.actualizarEstudiante(t4);
//		
//		this.gestorEstudiante.consultarCurso("Septimo", "B");

//	  boolean compro=this.gestorUsuario.comprobarExistenciaUsuario("sefal@gutemberg.edu.ec", "12345");
//	  System.out.println(compro);

//		Docente uno= this.docenteService.buscarDocentePorId(2);
//		
//		System.out.println(uno.getMateria().getNombre());

//		BigDecimal resultado= new BigDecimal("10.00");
//		
//		resultado=resultado.divide(new BigDecimal("2.00"));
//		
//		System.out.println(resultado);
		
		// Encriptacion
		
//		Usuario usuario13= new Usuario();
//		usuario13.setNombre("Luis Roberto");
//		usuario13.setApellido("Machado Obando");
//		usuario13.setTipo("Docente");
//		usuario13.setCorreo(this.usuarioService.encriptarPassword("fido@gutemberg.edu.ec"));
//		usuario13.setContrasenia("12345");
	
		
	}

}
