package controller

import model.Persona
import kotlin.math.pow

class PersonaController {
    private var persona = Persona()

    fun getPersona() : Persona { return this.persona }
    fun setPersona(p_persona: Persona) { this.persona = p_persona }

    fun calcularIMC(): Int {
        var imc = persona.getPeso() / (persona.getAltura()).toDouble().pow(2)
        if (imc > 24.9) {
            // Sobrepeso
            return 1
        }
        else if (imc < 18.5) {
            // Debajo del peso ideal
            return -1
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            // Peso ideal
            return 0
        }
        return -3
    }

    fun esMayorDeEdad() : Boolean {
        return persona.getEdad() > 17
    }

    fun comprobarSexo(p_sexo : Char) {
        if (p_sexo == 'M' || p_sexo == 'H') {
            persona.setSexo(p_sexo)
        }
        persona.setSexo('M')
    }

    override fun toString(): String {
        return "Nombre: ${persona.getNombre()}) \n" +
                "Edad: ${persona.getEdad()} \n" +
                "Cedula: ${persona.getCedula()} \n" +
                "Sexo: ${persona.getSexo()} \n" +
                "Peso: ${persona.getPeso()} \n" +
                "Altura: ${persona.getAltura()}"
    }
}