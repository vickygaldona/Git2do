//let persona3 = new Persona('carla', 'ponce'); no se debe hacer 


class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido) { 
        this._apellido = apellido;
    }
}

class Empleado extends Persona { // Clase hija
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido); // Llama al constructor de la clase padre
        this._departamento = departamento;
    }

    get departamento() { 
        return this._departamento; 
    } 

    set departamento(departamento) { 
        this._departamento = departamento; 
    } 
}


let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre)
persona1.nombre = 'Juan Carlos'
console.log(persona1.nombre)
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2._nombre)
persona2.nombre = 'Maria';
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado('maria', 'gimenez', 'sistemas');
console.log(empleado1);

console.log(empleado1.nombre);