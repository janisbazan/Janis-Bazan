# -*- coding: utf-8 -*-
class Tabla():

  #Propiedades de la clase
  nombre_archivo = 'name'

  #Init Contructor
  def __init__(self):
    self.nombre_archivo = "nuevo"

  # ----------- funciones de la clase ----
  # ------------ Ejercicio 1 -------------
  """Escribir una función que pida un número entero entre 1 y 10 y guarde en un
  fichero con el nombre tabla-n.txt la tabla de multiplicar de ese número
  donde n es el número introducido."""
  def escribir_archivo(self, n):
      try:
          nombre_archivo = 'tabla-' + str(n) + '.txt'
          f = open('nombre_fichero', 'w')
          for i in range(1, 11):
              f.write(str(n) + ' x ' + str(i) + ' = ' + str(n * i) + '\n')
          f.close()
          return 'Archivo Escrito'
      except ValueError:
          print("Oops! Hubo un problema. Intente nuevamente...")

# ------------ Ejercicio 2 ------------
  """Escribir una función que pida un número entero entre 1 y 10, lea el fichero
  #tabla-n.txt con la tabla de multiplicar de ese número, donde n es el número
  #introducido, y la muestre por pantalla. Si el fichero no existe debe mostrar
  #un mensaje por pantalla informando de ello."""
  def mostrar_archivo(self, n):
    try:
      file_name = 'tabla-' + str(n) + '.txt'
      f = open(file_name, 'r')
    except FileNotFoundError:
        print('No existe el fichero con la tabla del', n)
    else:
      print(f.read())
      return 'mostrar archivo'

# ----------- Ejercicio 3 -------------
  """Escribir una función que pida dos números n y m entre 1 y 10, lea el fichero
  tabla-n.txt con la tabla de multiplicar de ese número, y muestre por pantalla
  la linea m del fichero. Si el fichero no existe debe mostrar un mensaje por
  pantalla informando de ello."""
  def mostrar_linea_multiplicacion(self, n, m):
    try:
      file_name = 'tabla-' + str(n) + '.txt'
      f = open(file_name, 'r')
    except FileNotFoundError:
      print('No existe el fichero con la tabla del ', n)
    else:
      lines = f.readlines()
      print(lines[m - 1])
      return 'mostrar linea multiplicar'

