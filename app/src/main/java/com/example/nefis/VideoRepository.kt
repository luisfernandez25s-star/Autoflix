package com.example.nefis

object VideoRepository {
    fun getCategories(): List<Category> {
        return listOf(
            Category("Carros", "Velocidad y estilo", getCarros()),
            Category("Motos", "Adrenalina en dos ruedas", getMotos()),
            Category("Camionetas", "Poder todoterreno", getCamionetas()),
            Category("Carreras", "Competencia al límite", getCarreras()),
            Category("Drift", "El arte del derrape", getDrift())
        )
    }

    private fun getCarros(): List<Video> = listOf(
        Video("Deportivo azul en exhibición", "Carros", R.mipmap.ic_launcher, "Video donde se muestra un automóvil deportivo azul con tomas de su diseño exterior.", R.raw.car_1, "2:30", "Carros"),
        Video("Muscle car clásico en carretera", "Carros", R.mipmap.ic_launcher, "Un vehículo clásico de alto rendimiento circulando a gran velocidad.", R.raw.car_2, "3:15", "Carros"),
        Video("Auto deportivo blanco personalizado", "Carros", R.mipmap.ic_launcher, "Se aprecian los detalles traseros y el estilo modificado del vehículo.", R.raw.car_3, "4:00", "Carros"),
        Video("Carrera nocturna entre deportivos", "Carros", R.mipmap.ic_launcher, "Automóviles deportivos recorriendo una carretera durante la noche.", R.raw.car_4, "3:45", "Carros"),
        Video("Superdeportivo morado", "Carros", R.mipmap.ic_launcher, "Exhibición de un automóvil de lujo con pintura morada y diseño moderno.", R.raw.car_5, "2:50", "Carros")
    )

    private fun getMotos(): List<Video> = listOf(
        Video("Motocicleta deportiva morada", "Motos", R.mipmap.ic_launcher, "Motocicleta personalizada con iluminación y acabados deportivos.", R.raw.moto_1, "2:10", "Motos"),
        Video("Moto deportiva negra", "Motos", R.mipmap.ic_launcher, "Exhibición del diseño lateral de una motocicleta de alto rendimiento.", R.raw.moto_2, "3:05", "Motos"),
        Video("Motocicleta azul de competición", "Motos", R.mipmap.ic_launcher, "Vista completa de una motocicleta con estilo racing.", R.raw.moto_3, "2:40", "Motos"),
        Video("Motocicleta deportiva en exhibición", "Motos", R.mipmap.ic_launcher, "Recorrido por los detalles del carenado y la carrocería.", R.raw.moto_4, "3:20", "Motos"),
        Video("Moto personalizada con luces LED", "Motos", R.mipmap.ic_launcher, "Motocicleta modificada con iluminación decorativa y diseño llamativo.", R.raw.moto_5, "4:10", "Motos")
    )

    private fun getCamionetas(): List<Video> = listOf(
        Video("Pickup deportiva negra", "Camionetas", R.mipmap.ic_launcher, "Camioneta con modificaciones estéticas y aspecto robusto.", R.raw.cam_1, "5:00", "Camionetas"),
        Video("Frente de camioneta Chevrolet", "Camionetas", R.mipmap.ic_launcher, "Primer plano del diseño frontal y detalles de iluminación.", R.raw.cam_2, "4:30", "Camionetas"),
        Video("Pickup azul en exterior", "Camionetas", R.mipmap.ic_launcher, "Camioneta estacionada mostrando su carrocería y accesorios.", R.raw.cam_3, "3:55", "Camionetas"),
        Video("Camioneta todoterreno negra", "Camionetas", R.mipmap.ic_launcher, "Vehículo preparado para caminos difíciles con apariencia agresiva.", R.raw.cam_4, "4:20", "Camionetas"),
        Video("Camioneta deportiva blanca", "Camionetas", R.mipmap.ic_launcher, "Recorrido visual por el diseño y acabados exteriores.", R.raw.cam_5, "3:40", "Camionetas")
    )

    private fun getCarreras(): List<Video> = listOf(
        Video("Competencia en pista profesional", "Carreras", R.mipmap.ic_launcher, "Vehículos deportivos recorriendo un circuito de velocidad.", R.raw.race_1, "6:15", "Carreras"),
        Video("Auto de carreras en aceleración", "Carreras", R.mipmap.ic_launcher, "Salida rápida de un automóvil durante una competencia.", R.raw.race_2, "8:00", "Carreras"),
        Video("Carrera de resistencia", "Carreras", R.mipmap.ic_launcher, "Vehículos compitiendo a alta velocidad en una pista.", R.raw.race_3, "5:30", "Carreras"),
        Video("Derrapes en circuito", "Carreras", R.mipmap.ic_launcher, "Automóviles realizando maniobras de alta velocidad.", R.raw.race_4, "4:45", "Carreras"),
        Video("Competencia automovilística", "Carreras", R.mipmap.ic_launcher, "Diferentes tomas de un evento de carreras profesionales.", R.raw.race_5, "7:10", "Carreras")
    )

    private fun getDrift(): List<Video> = listOf(
        Video("Drift con humo intenso", "Drift", R.mipmap.ic_launcher, "Automóvil realizando un derrape controlado con gran generación de humo.", R.raw.drift_1, "9:00", "Drift"),
        Video("Drift en pista cerrada", "Drift", R.mipmap.ic_launcher, "Maniobras de precisión alrededor de conos de seguridad.", R.raw.drift_2, "5:20", "Drift"),
        Video("Derrape en circuito abierto", "Drift", R.mipmap.ic_launcher, "Vehículo ejecutando curvas controladas sobre la pista.", R.raw.drift_3, "3:10", "Drift"),
        Video("Drift extremo a alta velocidad", "Drift", R.mipmap.ic_launcher, "Conducción deportiva con derrapes continuos.", R.raw.drift_4, "4:35", "Drift"),
        Video("Cabina durante un drift", "Drift", R.mipmap.ic_launcher, "Vista desde el interior del automóvil durante la maniobra.", R.raw.drift_5, "3:50", "Drift")
    )
}
