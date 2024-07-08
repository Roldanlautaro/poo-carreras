# Paradigma orientado a objetos

# Ejercicio Integrador: Carreras y sponsors

Contexto general

Una empresa que organiza carreras de calle, de aventura, y recreativas. Gestiona inscripciones y convoca sponsors nos contrató para ayudarlos a resolver algunos problemas que tiene con sus inscripciones y sus sponsors. La empresa quiere garantizar que todo corredor y corredora que desea participar cumpla los requisitos impuestos para cada carrera y a su vez llevar un registro de las actividades patrocinadas o sponsoreadas.

# Parte 1: Carreras y corredores

Todas las carreras se corren una sola vez, tienen un nombre, una distancia y una lista de corredores inscriptos. Por el momento existen 3 tipos de carreras, de calle, de aventura y recreativas. El nombre y la distancia debe ser establecida en el momento de la creación. Cada carrera debe recordar quienes son sus corredores inscriptos.

Carreras de calle: Son las carreras más comunes que se organizan. En el momento de su creación debe establecerse el nombre, la distancia. Estos datos no cambian. Si la carrera es de 10km o más exige que el corredor cuente con un certificado médico al día. Si la distancia de la carrera es menor a 10km pueden admitir a cualquier corredor, pero siempre registrando su inscripción.

Carreras de aventura: Las carreras de aventura además de distancia tienen desnivel (en metros). Como generalmente se corren en montaña el desnivel nos indica el nivel de pendiente que tiene el recorrido. A mayor desnivel mayor dificultad para los corredores. El desnivel debe establecerse en el momento de la creación, y al igual que la distancia no puede ser modificado. Las carreras de aventura tienen un cupo máximo de personas que puede modificarse en caso de que la organización lo considere necesario. Las carreras de aventura otorgan 1 punto cada 1000m de desnivel y 1 punto cada 20km de distancia. Por ejemplo si la carrera es de 60 km de distancia y  2000m de desnivel aportará a cada corredor 5 puntos en total que el corredor se encargará de acumular. Las carreras de aventura admiten a cualquier corredor siempre y cuando no esté completo el cupo máximo de inscriptos.

Carreras recreativas:  Las carreras recreativas requieren inscripción al igual que las demás, no tienen cupo límite de corredores ni otro requisito para correrlas. Pueden admitir a cualquier corredor. No pueden ser sponsoreadas ni tampoco otorgan puntos a los corredores.

Corredores: Un corredor es una persona que puede inscribirse en una o más carreras si cumple con los requisitos que establece cada una. El corredor debe recordar la cantidad de carreras que participó y la distancia más larga en la que participó. Estos valores se deben ir actualizando cuando se anota en una carrera. La distancia máxima inscrita nunca se decrementa. Por ejemplo: Un corredor tiene como distancia máxima corrida 21k y se anota en una carrera de 10k su distancia máxima sigue siendo 21k y en este caso solo se incrementa la cantidad de carreras en que participó. El corredor además tiene un puntaje que puede ir recibiendo por algunas carreras que otorgan puntos.

Consigna: Modelar las clases necesarias y probar el sistema completo en el main generando ejemplos de distintas carreras y corredores.

# Parte 2: Sponsors

Sobre los sponsors

Un sponsor es una empresa que invierte publicidad con el fin de dar a conocer su marca y por supuesto vender sus productos. Un sponsor puede patrocinar corredores proporcionando la indumentaria para sus carreras y también puede patrocinar carreras exponiendo publicidades a lo largo de su recorrido. 
Cada sponsor lleva un registro de corredores y carreras que patrocina. Puede patrocinar más de una carrera o corredor. Debe llevar un registro único (corredores y carreras) donde debe poder agregar corredores y carreras indistintamente.
Los sponsors son muy estrictos para determinar qué patrocinar. Para ser patrocinados las carreras y corredores deben cumplir ciertos requisitos:

Carreras de calle: Solo pueden ser patrocinadas si cuentan con 100 o más corredores inscriptos.
Carreras de aventura: Una carrera de aventura puede ser patrocinada solamente si cuenta con 1 o más corredores con al menos 5 puntos en su puntaje o si tiene al menos 2000m de desnivel.
Carreras recreativas: No pueden ser patrocinadas. Al menos por el momento, quizás en un futuro sí.
Corredores: Los corredores pueden ser patrocinados solamente si tienen más de 3 carreras corridas.
Si algún corredor o carrera no cumple con los requisitos de poder ser patrocinado no debería traer ningún inconveniente.

Consigna: 

Agregá las clases y modificaciones que consideres necesarias, intentando “no romper lo que funciona”, para que un sponsor pueda tener el registro de las carreras y corredores que patrocina. Cada sponsor debe poder agregar carreras y corredores a su lista de patrocinados utilizando un único método para carreras y corredores.
