package dam.curso.listado_elementos_vista_detallada_arribasperezmiguelangel;


import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Pagina implements Serializable {
    private int posicion;
    private String volumen;
    private String sinopsis;
    private int portada;

    public Pagina(int posicion) {
        this.posicion = posicion;
        switch (posicion) {
            case 0:
                volumen = "Volumen 1 \nPerro y Motosierra";
                sinopsis = "Un niño súper pobre, Denji, que se ve obligado a trabajar como cobrador de deudas como cazador de demonios con el demonio Pochita. ¡¡Una traición brutal cambiará sus días en el fondo!!";
                portada = R.drawable.csm1;
                break;
            case 1:
                volumen = "Volumen 2 \nMotosierra vs. Murciélago";
                sinopsis = "¡¡Frotando mi pecho!! ¡¡Usando ese abrumador deseo como fuerza impulsora, Denji se involucra en una feroz batalla con el Demonio Murciélago!! ¿¡Qué es El Demonio?! La batalla de Denji, el perro de la seguridad pública, entra en una nueva ¡¡fase!!";
                portada = R.drawable.csm2;
                break;
            case 2:
                volumen = "Volumen 3 \nM**** a Denji";
                sinopsis = "¡Un demonio misterioso que bloquea el espacio y amenaza con matar a Denji! Incluso en una situación tan extrema, Denji nunca renuncia a besar como recompensa. ¿¡Qué clase de estrategia infernal se le ocurrió...!?";
                portada = R.drawable.csm3;
                break;
            case 3:
                volumen = "Volumen 4 \nLa Pistola es más Poderosa";
                sinopsis = "Una pandilla misteriosa atacó el corazón de Denji. Por otro lado, Denji y Power, bajo el mando del cazador de demonios más fuerte, comienzan un entrenamiento especial de muerte que les arranca los tornillos de la cabeza...!?";
                portada = R.drawable.csm4;
                break;
            case 4:
                volumen = "Volumen 5 \nMenor";
                sinopsis = "Aki se enfrenta al demonio al que Himeno solía servir. ¿¡Qué pasa por la mente de un hombre que se quema en llamas de venganza...!?¡¡Por otro lado, Denji choca de nuevo con la espada samurái!!¡¡Motosierra vs Katana, que pasará en la sangrienta batalla a muerte!! ¡¡Acelera hacia el exterior!!";
                portada = R.drawable.csm5;
                break;
            case 5:
                volumen = "Volumen 6 \nBoom Boom Boom";
                sinopsis = "Huyamos lejos... El corazón de Denji se estremece por las palabras inesperadas de Reze, ¿a dónde irá su corazón puro? ¡Inmediatamente después de un momento tan dulce, estalla una tormenta violenta! ¿Qué confirmarán Denji y Reze en una llamativa batalla sangrienta que involucra amor, deseo, humanos y demonios?";
                portada = R.drawable.csm6;
                break;
            case 6:
                volumen = "Volumen 7 \nEn un sueño";
                sinopsis = "La aparición de Denji se informó en la televisión como \"¡¡Miedo!! Demonio Motosierra!!\", ¡y su existencia se hizo conocida en todo el mundo! Asesinos dementes se reunieron en Tokio de todo el mundo. Denji!?";
                portada = R.drawable.csm7;
                break;
            case 7:
                volumen = "Volumen 8 \nSuper Lío";
                sinopsis = "A medida que continúa la batalla entre Quanxi y la División Especial por Denji, ¡el espeluznante Santa Claus comienza a avanzar hacia su verdadero objetivo! Se abre la puerta al mundo de la desesperación. ¡En la noche negra del dos, resuena el grito del Demonio Motosierra!";
                portada = R.drawable.csm8;
                break;
            case 8:
                volumen = "Volumen 9 \nBaño";
                sinopsis = "Muchos de sus camaradas resultaron heridos y perdieron la vida en la batalla anterior: el corazón de Aki tiembla antes de que se acerque la batalla decisiva con el Demonio Pistola. Makima revela la impactante verdad sobre el Demonio Pistola, Aki ve el peor futuro: ¡cuando todas estas cosas se superponen, un destino de pesadilla se apodera de Denji y los demás...!";
                portada = R.drawable.csm9;
                break;
            case 9:
                volumen = "Volumen 10 \nSentimientos de un Perro";
                sinopsis = "Soy Aki... Denji, cuyo cerebro se ha convertido en una mierda de desesperación que nunca se puede borrar, le pide ayuda a Makima. Sin embargo, el descanso temporal fue solo el comienzo de otra pesadilla... Cuando se abre la puerta prohibida en el corazón de Denji, las verdaderas intenciones de Makima y el secreto demoníaco del motosierra se cruzan, ¡convirtiéndose en un infierno sangriento!";
                portada = R.drawable.csm10;
                break;
        }
    }

    public String getVolumen() {
        return volumen;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getPortada() {
        return portada;
    }
}
