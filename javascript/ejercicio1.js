//ejercicio clase 11
let days = 5;
switch (days){
    case 1:
        console.log ("hoy es lunes");
        break;
    case 2:
        console.log ("hoy es martes");
        break;
    case 3:
        console.log ("hoy es miercoles");
        break;
    case 4:
        console.log ("hoy es jueves");
        break;
    case 5:
        console.log ("hoy es viernes");
        break;
    case 6:
        console.log ("hoy es sabado");
        break;
    case 7: 
    console.log ("hoy es domingo");
        break;
    default:
        console.log ("error en el ingreso del dia de la semana")
        break;
}

//simplificacion

let days2 = ["lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"];
console.log (getday(3));

//uno similar

let month = 11;
switch (month){
    case 1:
        console.log ("es enero");
        break;
    case 2:
        console.log ("es febrero");
        break;
    case 3:
        console.log ("es marzo");
        break;
    case 4:
        console.log ("es abril");
        break;
    case 5:
        console.log ("es mayo");
        break;
    case 6:
        console.log ("es junio");
        break;
    case 7:
        console.log ("es julio");
        break;
    case 8:
        console.log ("es agosto");
        break;
    case 9:
        console.log ("es septiembre ");
        break;
    case 10:
        console.log ("es octubre");
        break;
    case 11:
        console.log ("es noviembre") ;
        break;
    case 12:
        console.log ("es diciembre");
        break;
    default:
        console.log ("error en el ingreso del mes del año")
        break;

///la opcion mejorada

let month2 = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "junio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" ];
function getMonth (n){
    if (n < 1 || n> 12) {
        throw new error ("out of range"); 
    }
    return month2 [n-1];
}
console.log(getMonth(1));

    }
