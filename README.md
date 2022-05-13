# Practica 5 : Pruebas Unitarias


Antes de comenzar a realizar las pruebas unitarias, debemos seguir una serie de pasos :

## Paso 1 : Crear la interfaz iCalculadora

Dentro de la interfaz iCalculadora se declaran los métodos que posteriormente serán utilizados por la clase Calculadora

<img width="402" alt="Captura" src="https://user-images.githubusercontent.com/91699247/168182935-f5fd563c-f2ef-4a7d-bb00-48ff7ee78aab.PNG">


## Paso 2 : Crear la clase Calculadora


Creamos la clase Calculadora, donde se implementan los métodos definidos en la interfaz

<img width="397" alt="Captura1" src="https://user-images.githubusercontent.com/91699247/168183143-e1c78176-2639-4078-9ff4-ea15f2363e2f.PNG">
<img width="400" alt="Captura2" src="https://user-images.githubusercontent.com/91699247/168183163-bf21c9fb-96d3-44e4-843e-7c5a3d1c1fc8.PNG">


En este momento, hacemos el primer commit, que representa la creación de la calculadora y se corresponde a la versión 1.0.0


## Paso 3 : Crear test unitario


Primero de todo creamos una nueva rama ( Tests ) donde tendremos el código refernte a la realización de las pruebas.

Para crear los tests unitario, seguimos la configuración que se muestra en la imagen , con la que dispondremos de la clase Test y su librería :    
<img width="273" alt="Captura3" src="https://user-images.githubusercontent.com/91699247/168183758-051214f9-5ae6-42de-8782-86292105eedb.PNG">

Estos tests nos permitirá probar el funcionamiento de las clase Calculadora y los métodos referentes a las operaciones. 

Hacemos el segundo commit y le ponemos la versión 2.0.0


## Paso 4 : Validar el funcionamiento de los tests

Para comprobar que los tests funcionan correctamente, llevamos a cabo una serie de pruebas unitarias

En la primera, el test de la suma y de resta nos deben salir correctos y el de la multiplicación y división no deben pasar la prueba. Para llevar a cabo esta prueba,
ponemos un resultado esperado diferente al resultado real de la multiplicación de ``7 x 8``  e intentamos dividir ``100/3``, operación la cual debe dar error
ya que el método división está definido e implementado con parámetros y retorno int en lugar de double.

Hacemos nuevo commit como versión 2.1.0

<img width="291" alt="Captura5" src="https://user-images.githubusercontent.com/91699247/168186149-594f0b39-1b84-42c8-b33e-9f2f2ab86388.PNG">
<img width="295" alt="Captura6" src="https://user-images.githubusercontent.com/91699247/168186156-75e0c26a-7849-4b66-a4dc-736016965d49.PNG">
<img width="310" alt="Captura7" src="https://user-images.githubusercontent.com/91699247/168186177-2b869b73-a77d-49d7-b1e5-e4a5b15a6d53.PNG">
<img width="283" alt="Captura9" src="https://user-images.githubusercontent.com/91699247/168186234-f93b8bce-b155-475a-9f89-b7c6330ebf33.PNG">

Como consecuencia de lo mencionado, el resultado es el siguiente, donde vemos que solo el 50% de tests han pasado la prueba :
<img width="472" alt="Captura10" src="https://user-images.githubusercontent.com/91699247/168186440-a23c8158-3746-4eed-8e42-279562f7ef90.PNG">


Para la segunda prueba, solucionamos el problema del método división cambiando los parámetros y el retorno de tipo int a tipo double y para la mutiplicación, 
modificamos el resultado esperado.
```
public abstract double division (double x, double y) ;
```

```
public double division (double x, double y){
  return x/y ;
}
```

<img width="292" alt="Captura12" src="https://user-images.githubusercontent.com/91699247/168187334-f8662eb8-2b54-47c3-9904-75f802935434.PNG">


<img width="293" alt="Captura11" src="https://user-images.githubusercontent.com/91699247/168187297-11625cf7-4e5a-4765-96e0-5c83c6e00468.PNG">



Con estos cambios, el porcentaje de tests pasados debe de ser del 100%, comprobamos y efectivamente :

<img width="472" alt="Captura13" src="https://user-images.githubusercontent.com/91699247/168187378-62ca333c-41fd-459d-a295-6099da57c95d.PNG">

Realizamos el último commit de la rama Tests como la versión v2.2.0


Por último, volvemos a la rama master, la fusionamos con la rama Tests y le ponemos la versión 3.0.0






<img width="452" alt="esquema" src="https://user-images.githubusercontent.com/91699247/168187530-c53de83d-59ca-498a-b04f-4788bf128d56.PNG">

Esquema ramas y commits

