# -*- coding: utf-8 -*-
#1.Escribir una función que pida un numero entero entre 1 y 10
# y guarde en un fichero con el nombre tabla-n.txt la tabla de multiplicar de ese nuemro donde n es el número introducido

n = int(input('Introduce un número entero entre 1 y 10: '))
file_name = 'tabla-' + str(n) + '.txt'
f = open(file_name, 'w')
for i in range(1, 11):
    f.write(str(n) + ' x ' + str(i) + ' = ' + str(n * i) + '\n')
f.close()
# Ejercicio 2
n = int(input('Introduce un número entero entre 1 y 10: '))
file_name = 'tabla-' + str(n) + '.txt'
try:
    f = open(file_name, 'r')
except FileNotFoundError:
    print('No existe el fichero con la tabla del', n)
else:
    print(f.read())

#Ejercicio 3
n = int(input('Introduce un número entero entre 1 y 10: '))
m = int(input('Introduce otro número entero entre 1 y 10: '))
file_name = 'tabla-' + str(n) + '.txt'
try:
    f = open(file_name, 'r')
except FileNotFoundError:
    print('No existe el fichero con la tabla del ', n)
else:
    lines = f.readlines()
    print(lines[m - 1])

#Ejercicio 4
