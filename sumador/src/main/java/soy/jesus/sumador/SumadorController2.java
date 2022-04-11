package soy.jesus.sumador;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class SumadorApplicationTest {

    private Sumador sumador = new Sumador();



    @Test

    public void testSum() {

         assertEquals(5, sumador.suma(2, 3));

    }    

}



Actulizamos las dependencias en el archivo build.gradle y tasks.named queden así:



dependencies {

	implementation 'org.springframework.boot:spring-boot-starter-web'

	testImplementation 'org.springframework.boot:spring-boot-starter-test'

	testImplementation 'junit:junit:4.13'

}



tasks.named('test') {

	useJUnit() //useJUnitPlatform()

}

