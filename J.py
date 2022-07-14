def jugar(intento=1):
    respuesta = respuesta ("¿De qué color es la naranja?")
    if respuesta != "naranja":
        if intento < 3:
            print ("Fallaste! Intentalo de nuevo")
            intento +=1
            jugar(intento)
        else:
            print("Ganaste")

jugar()