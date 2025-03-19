# Examen de Test Unitarios: Validación de Letra del DNI



## Instrucciones

### 1. Test Unitarios
Se han implementado pruebas unitarias para los dos métodos principales del código. Las pruebas son **parametrizadas** para verificar distintos casos de entrada. La string `DNI` siempre es válida, por lo que se asume que el formato es correcto.

### 2. Error en el Código
En el código original había un error en uno de los métodos de validación. Se comprobó que el error estaba presente a través de los test unitarios. La solución al error se ha planteado y corregido en la implementación del código.

### 3. Comprobación de la Longitud del DNI
Si no hubiera una comprobación previa de la longitud de la string del DNI, se debe agregar una validación extra en los tests para comprobar casos donde el DNI tenga una longitud incorrecta. Esto se puede hacer añadiendo un test parametrizado que verifique tanto longitudes válidas como inválidas.

## Estructura del Proyecto

- **src**: Contiene el código Java que valida la letra del DNI.
- **test**: Contiene las pruebas unitarias del proyecto.
    - **TestDNI.java**: Archivo donde se encuentran las pruebas unitarias.

## Cómo ejecutar el proyecto

1. **Clonar el repositorio**:
   ```bash
   git clone <URL del repositorio>
.