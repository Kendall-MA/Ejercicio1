package model

class Persona {
    private var nombre : String
    private var edad : Int
    private var cedula : String
    private var sexo : Char
    private var peso : Float
    private var altura : Float

    constructor() {
        this.nombre = ""
        this.edad = 0
        this.cedula = ""
        this.sexo = ' '
        this.peso = 0.0f
        this.altura = 0.0f
    }

    constructor(nombre: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        this.cedula = ""
        this.peso = 0.0f
        this.altura = 0.0f
    }

    constructor(nombre: String, edad: Int, cedula: String, sexo: Char, peso: Float, altura: Float) {
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

    fun getNombre() : String { return this.nombre }
    fun getEdad() : Int { return this.edad }
    fun getCedula() : String { return this.cedula }
    fun getSexo() : Char { return this.sexo }
    fun getPeso() : Float { return this.peso }
    fun getAltura() : Float { return this.altura }

    fun setNombre(p_nombre: String) { this.nombre = p_nombre }
    fun setEdad(p_edad: Int) { this.edad = p_edad }
    fun setCedula(p_cedula: String) { this.cedula = p_cedula }
    fun setSexo(p_sexo: Char) { this.sexo = p_sexo }
    fun setPeso(p_peso: Float) { this.peso = p_peso }
    fun setAltura(p_altura: Float) { this.altura = p_altura }
}