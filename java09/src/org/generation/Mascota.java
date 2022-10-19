package org.generation;
//instancias -->le estamos dando vida a algo o ese objeto y que va se unico
public class Mascota { //con class se define la palaba reservada y este es el cuerpo de la clase // solo una clase puede tener el "modificador" public
					   // Herencia de una clase o implementa de una interfaz
	//fields(atributos-->caracteristicas)//son los atributos de la clase mascota//Generalmente los atributos se declaran al inicio//Serian nuestras variables pero aqui se llaman fields
	String name;
	double ageInYears;
	String type; //por default se emprime null si no tiene un valor
	int sizeInCm;//tamaño
	//atributos de clase
	static int numPets; //contador de mascotas

	//El bloque de inicialización de atributos de las instancias. son dos {}
	{ //la ventaja de hacerlo sobre un bloque es que puedes tratar tus erros //se poene este bloque ante de los metodos
		//numPets= 10; //inicializo el atributo de calse con 10 mascotas previas//pero no debe ir aqui
		type ="No definido";
		System.out.println("Se entra al bloque de inicializacion de atributos");
	}
	//atributos de clase, tiene modificador static //que se puede acceder sin instanciar
	//bloque de inicializacion estatico
	static { 
		numPets=10;//inicializo el atributo de calse con 10 mascotas previas
		//se ejecuta con la primera llamada de la clase
	}
	//Metodos constructores // podemos tener mas de un construncor o ninguna(anque java pone un por default vacio
	//El nombre de un contructor debe tener el mismo nombre que la clase
	//Los metodos constructores no tiene retorno(return)
	Mascota(String name, double ageInYears , int sizeInCm){ // tambien se ponen parametos de entrada (..) si lo requiere
		//Este es el metodo default de la clase
		//Con el constructor podemos inicializar los objetos
		//Lo ideal es que los atributos se inicializen en el contrutor
		this.name=name; //this hace referencia al objeto //con esto nos referimos al atributo de arriba //lo que vaya entrar se le acciona al atributo
		this.ageInYears = ageInYears;
		this.sizeInCm = 30;
		//tambien se puede poner valores iniciales
		this.type= "animal";
		//numPets=10;no es correcto esto porque siempre valdria 11, porque se reinica la variable cada vez que entra
		numPets++;//se va incrementar un valor cada vez que se ejecutar el constructor//No lleva por pertener a la clase . no al objeto
		
		System.out.println("Se crea un objeto de tipo Mascota");
	}
	
	//Métodos de la clase
		//Podemos tener metodos sobrecargados
		//Podemos tener metodos sobreescritos
	String information() {
		return 
				
				"nombre " +this.name+
				" edad "+this.ageInYears+
				" tamaño"+this.sizeInCm+
				" tipo "+this.type;
				
	}
	
}

