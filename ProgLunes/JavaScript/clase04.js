let x = 10;
console.log(x.length);
console.log('Tipos primitivos');
//objeto
let persona = {
    nombre:'Carlos',
    apellido:  'Gil',
    email: 'cgil@gmail.com',
    edad: 28;
    idioma: 'ES',
    get lang(){
        return this.idioma.toLocaleUpperCase
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    }
    nombreCompleto: function(){// metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido;

    },
    get nombreEdad(){
        return 'El nombre es: '+this.nombre+', edad:  'this.edad;
    }
    }
}
console.log(persona.nombre)
console.log(persona.apellido)
console.log(persona.email)
console.log(persona.edad)
console.log(persona)
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5558585628';
console.log(persona2.telefono); 
console.log('Creamos un nuevo objeto');

console.log(persona['apellido']); //accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');
//for in y accedemos como si fuera un arreglo

for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellidoa = 'Bentacud'; 
delete persona.apellida;
console.log(persona);

//Distinta formas de imprimir un objeto
//Numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log(persona.nombre+', '+persona.apellido);

//numero 2: a traves del diclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//numero 3: la funcion object.values()
let personaArray = object.values(persona);
console.log(personaArray);

//numero 4: utilizamos el motodo json.stringify

console.log('distinta forma de imprimir un objeto')
let personaString =   JSON.stringify(persona);
console.log(personaString);

console.log('comenzamos a utilizar el metodo get');
console.log(persona.nombreEdad);



console.log(('comenzamos con el metodo get y set para idiomas'));
persona.lang = 'en';
console.log(persona.lang);


function Persona3(nombre = 'luis', apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+ ' '+this.apellido;
    }
}
let padre = new Persona3('leo', 'lopez', 'lopez1@gmail.com');
padre.nombre = 'luis';
padre.telefono = '37366272';
console.log(padre);
console.log(padre.nombreCompleto());
let madre = new Persona3('laura', 'contrera', 'contrera1@gmail.com');
console.log(madre.telefono);
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


//uso de prototype

Persona3.prototype.telefono = '3448392333'
console.log(padre);
console.log(madre.telefono);
madre.telefono = '4444449554'
console.log(madre.telefono)

//uso de call
 let persona4 = {
    nombre: 'juan'
    apellido: 'perez'
    nombreCompleto2: function(){
        //return titulo+': '+this.nombre+' '+this.apellido+' '´telefono;
        return this.nombre+' '+this.apellido;

    } 
}

let persona5 = {
    nombre: 'carlos',
    apellido: 'lara'
}

console.log(persona4.nombreCompleto2('lic. ', '737278274772'));
console.log(persona4.nombreCompleto2.call(persona5, 'ing. ', '4884838383'));


//metodo apply
let arreglo = ['ing', '848399393'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));


)
