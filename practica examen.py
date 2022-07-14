import random 

cartatotaljugador = 0
cartatotalmaquina = 0
#aqui co
def darcarta(mensaje):
    simbolo = random.choice(("corazones","diamantes","treboles","espadas"))
    carta = random.choice((1,2,3,4,5,6,7,8,9,10))
    if mensaje != "":
        print("Su "+ mensaje+ " es: ", str(carta) + " " + simbolo)
    return carta
#end

cartatotaljugador += darcarta("carta 1")
cartatotaljugador += darcarta("carta 2")
cartatotalmaquina += darcarta("")
cartatotalmaquina += darcarta("")

print(cartatotalmaquina)


seguir = "si"
comparar = "no"
while(seguir=="si"):
    if (cartatotaljugador>21 or cartatotalmaquina==21 or (cartatotaljugador<cartatotalmaquina and comparar =="si" and cartatotalmaquina<=21)):
          print("perdiste")
          seguir = "no"
    if(cartatotaljugador == 21 or (cartatotaljugador>cartatotalmaquina and comparar == "si" and cartatotalmaquina<=21)):
        print("Ganaste")
        seguir= "no" 
    if (cartatotaljugador<21):
        siguiente= input("""Desea otra carta? 
        Digite Si para obtener otra carta
        Digite No para ver el resultado
        """)
        if(str(siguiente) == "si"):
            cartatotaljugador += darcarta("nueva carta")
            if(cartatotalmaquina<20):
                cartatotalmaquina += darcarta("")
                print(cartatotalmaquina)
        else:
            if(cartatotalmaquina<20 ):
                cartatotalmaquina += darcarta("")
                print(cartatotalmaquina)
            comparar="si"




#print("termino el juego")

