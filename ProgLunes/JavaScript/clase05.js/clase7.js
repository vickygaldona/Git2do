//let persona3 = new Persona('carla', 'ponce'); no se debe hacer 


class Persona { //Clase padre
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

    nombreCompleto(){
        return this._nombre+' '+this._apellido
    }
//sobreescribiendo el metodo de la clase padre (object)
    toString(){ //regresa un string
        //se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('saludos desde este metodo static');
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

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+', '+this.departamento;
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

console.log(empleado1.nombreCompleto());

//Object.prototype.toString manera de acceder atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

persona1.saludar();
