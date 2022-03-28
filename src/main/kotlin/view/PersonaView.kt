package view

import controller.PersonaController
import model.Persona

class PersonaView {
    private var personaController = PersonaController()

    fun run() {
        println("Digite el nombre: ")
        var nombre = readLine()?.toString()!!
        println("Digite la edad: ")
        var edad = readLine()?.toInt()!!
        println("Digite el sexo (H o M): ")
        var sexo = readLine()?.toString()!![0]
        println("Digite el peso en kg: ")
        var peso = readLine()?.toFloat()!!
        println("Digite la altura en cm: ")
        var altura = readLine()?.toFloat()!!

        var persona1 = Persona(nombre, edad, "", sexo, peso, altura)
        var persona2 = Persona(nombre, edad, sexo)
        var persona3 = Persona()

        persona3.setNombre("Kendall")
        persona3.setEdad(22)
        persona3.setCedula("207900300")
        persona3.setSexo('H')
        persona3.setPeso(55.0f)
        persona3.setAltura(174.0f)

        this.personaController.setPersona(persona1)
        println((determinarPeso(this.personaController.calcularIMC())))
        println(esMayor((this.personaController.esMayorDeEdad())))
        println(personaController.toString())
        println("--------------------------")

        this.personaController.setPersona(persona2)
        println((determinarPeso(this.personaController.calcularIMC())))
        println(esMayor((this.personaController.esMayorDeEdad())))
        println(personaController.toString())
        println("--------------------------")

        this.personaController.setPersona(persona3)
        println((determinarPeso(this.personaController.calcularIMC())))
        println(esMayor((this.personaController.esMayorDeEdad())))
        println(personaController.toString())
        println("--------------------------")
    }

    fun determinarPeso(imc: Int) : String {
        var nombrePersona = this.personaController.getPersona().getNombre()
        if (imc == 1) {
            return "La persona ${nombrePersona} tiene sobrepeso"
        } else if (imc == -1) {
            return "La persona ${nombrePersona} esta por debajo de su peso ideal"
        } else {
            return "La persona ${nombrePersona} esta en su peso ideal"
        }
    }

    fun esMayor(mayor: Boolean) : String {
        var nombrePersona = this.personaController.getPersona().getNombre()
        if (mayor) {
            return "La persona ${nombrePersona} es mayor de edad"
        }
        return "La persona ${nombrePersona} no es mayor de edad"
    }
}