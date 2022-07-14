# -*- coding: utf-8 -*-
import Tabla as tablaClase
#import Contactos as contactos

tabla = tablaClase.Tabla()
#contacto = contactos.Contactos()




# Ejercicio 1
n = int(input('Introduce un número entero entre 1 y 10: '))
tabla.escribir_archivo(n)

# Ejercicio 2
n = int(input('Introduce un número entero entre 1 y 10: '))
tabla.mostrar_archivo(n)

# Ejercicio 3
n = int(input('Introduce un número entero entre 1 y 10: '))
m = int(input('Introduce otro número entero entre 1 y 10: '))
tabla.mostrar_linea_multiplicacion(n,m) 



