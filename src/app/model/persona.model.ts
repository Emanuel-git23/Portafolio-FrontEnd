export class persona{
    id?: number;
    nombre: string;
    apellido: string;
    descripcion: string;
    img: string;
//GREGO DESCRICION ERRORR
    constructor(nombre: string,apellido: string,descripcion: string, img: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.descripcion= descripcion;
    }
}