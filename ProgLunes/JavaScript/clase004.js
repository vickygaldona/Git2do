let x = 10; 
console.log(x.length); // Esto imprimirá undefined porque los números no tienen propiedad "length".
console.log('Tipos primitivos'); 

// Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ES',
    get lang() {
        return this.idioma.toUpperCase(); // Faltaban los paréntesis para invocar el método.
    },
    set lang(lang) {
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function() {
        return this.nombre + ' ' + this.apellido;
    },
    get nombreEdad() {
        return 'El nombre es: ' + this.nombre + ', edad: ' + this.edad; // Faltaba un "+" para concatenar.
    }
};

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5558585628';
console.log(persona2.telefono); 
console.log('Creamos un nuevo objeto');

console.log(persona['apellido']); // Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');

// for in y accedemos como si fuera un arreglo
for (propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log('Cambiamos y eliminamos un error');
persona.apellido = 'Bentacud'; 
delete persona.apellido; // Había un error con el nombre de la propiedad a eliminar.
console.log(persona);

// Distintas formas de imprimir un objeto
// Número 1: La más sencilla: concatenar cada valor de cada propiedad
console.log(persona.nombre + ', ' + persona.apellido);

// Número 2: A través del ciclo for in
for (nombrePropiedad in persona) {
    console.log(persona[nombrePropiedad]);
}

// Número 3: La función Object.values()
let personaArray = Object.values(persona); // Cambié "object" por "Object" (mayúscula).
console.log(personaArray);

// Número 4: Utilizamos el método JSON.stringify
console.log('Distinta forma de imprimir un objeto');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre = 'Luis', apellido, email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function() {
        return this.nombre + ' ' + this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez', 'lopez1@gmail.com');
padre.nombre = 'Luis';
padre.telefono = '37366272';
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona3('Laura', 'Contrera', 'contrera1@gmail.com');
console.log(madre.telefono); // undefined porque no se ha asignado "telefono" a "madre" aún.
console.log(madre);
console.log(madre.nombreCompleto());
//diferentes formas de crear objetos
//caso objeto 1
let miObjeto = new Object();

//caso objeto 2
let miOBjeto2 = {};

//caso string 1
let miCadena1 = new String('hola');

//caso string2 
let miCadena2 = 'hola'

//caso con numeros 1
let miNumero = new Number(1);

//caso con numeros 2
let miNumero2 = 1;

//caso boolean 1
let miBoolean1 = new Boolean(false);

//caso boolean 2
let miBoolean2 = false;

//caso arreglos 1
let miArreglo1 = new Array();

//caso arreglos 2
let miArreglo2 = [];

//caso funcion 1 
let miFuncion1 = new function(){};

//caso funcion 2

let miFuncion2 = function(){};


// Uso de prototype
Persona3.prototype.telefono = '3448392333'; // Agregar un teléfono por defecto a todos los objetos Persona3.
console.log(padre);
console.log(madre.telefono); // Imprime el teléfono del prototype.
madre.telefono = '4444449554';
console.log(madre.telefono); // Ahora sobreescribe el valor del prototype con un valor específico.

// Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono) {
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ', Teléfono: ' + telefono;
    }
};

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
};

console.log(persona4.nombreCompleto2('Lic.', '737278274772')); 
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '4884838383')); 

// Método apply
let arreglo = ['Ing.', '848399393']; 
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
