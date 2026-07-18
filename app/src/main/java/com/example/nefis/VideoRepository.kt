package com.example.nefis

object VideoRepository {
    fun getCategories(): List<Category> {
        return listOf(
            Category("Carros", "", getCarros()),
            Category("Motos", "", getMotos()),
            Category("Camionetas", "", getCamionetas()),
            Category("Carreras", "", getCarreras()),
            Category("Drift", "", getDrift())
        )
    }

    private fun getCarros(): List<Video> = listOf(
        Video("Nissan GT-R R35", "Nissan", R.mipmap.ic_launcher, "Conoce las características y el rendimiento del Nissan GT-R R35 en carretera.", R.raw.car_1, "2:30", "Carros"),
        Video("Toyota Supra MK4", "Toyota", R.mipmap.ic_launcher, "Explora el legado del motor 2JZ y su impacto en la cultura tuning mundial.", R.raw.car_2, "3:15", "Carros"),
        Video("Lamborghini Aventador", "Lamborghini", R.mipmap.ic_launcher, "Siente el rugido del motor V12 y la ingeniería aerodinámica de este superdeportivo italiano.", R.raw.car_3, "4:00", "Carros"),
        Video("Ferrari F8 Tributo", "Ferrari", R.mipmap.ic_launcher, "Un homenaje al motor V8 más potente de la historia de Ferrari, pura pasión en la pista.", R.raw.car_4, "3:45", "Carros"),
        Video("Porsche 911 GT3", "Porsche", R.mipmap.ic_launcher, "La combinación perfecta entre un coche de carreras y uno de calle, precisión alemana absoluta.", R.raw.car_5, "2:50", "Carros")
    )

    private fun getMotos(): List<Video> = listOf(
        Video("Yamaha R1M", "Yamaha", R.mipmap.ic_launcher, "Tecnología de MotoGP llevada a las calles para los entusiastas de la velocidad pura.", R.raw.moto_1, "2:10", "Motos"),
        Video("Kawasaki Ninja H2R", "Kawasaki", R.mipmap.ic_launcher, "La bestia sobrealimentada que desafía los límites de la velocidad en circuito cerrado.", R.raw.moto_2, "3:05", "Motos"),
        Video("Ducati Panigale V4", "Ducati", R.mipmap.ic_launcher, "Elegancia italiana y un rendimiento brutal en cada curva con su motor V4.", R.raw.moto_3, "2:40", "Motos"),
        Video("BMW S1000RR", "BMW", R.mipmap.ic_launcher, "Ingeniería de vanguardia y electrónica avanzada para dominar tanto el circuito como la carretera.", R.raw.moto_4, "3:20", "Motos"),
        Video("Suzuki Hayabusa", "Suzuki", R.mipmap.ic_launcher, "El regreso del halcón japonés, una leyenda de la estabilidad y la velocidad final.", R.raw.moto_5, "4:10", "Motos")
    )

    private fun getCamionetas(): List<Video> = listOf(
        Video("Ford F-150 Raptor", "Ford", R.mipmap.ic_launcher, "Capacidad todoterreno inigualable diseñada para saltar dunas y conquistar cualquier desierto.", R.raw.cam_1, "5:00", "Camionetas"),
        Video("Toyota Hilux GR", "Toyota", R.mipmap.ic_launcher, "La camioneta más resistente del mundo con el toque deportivo de Gazoo Racing.", R.raw.cam_2, "4:30", "Camionetas"),
        Video("RAM 1500 TRX", "RAM", R.mipmap.ic_launcher, "Poder puro con su motor Hellcat V8, la pickup de producción más rápida del planeta.", R.raw.cam_3, "3:55", "Camionetas"),
        Video("Chevrolet Silverado", "Chevrolet", R.mipmap.ic_launcher, "Robustez y tecnología premium combinadas para el trabajo más exigente y el máximo confort.", R.raw.cam_4, "4:20", "Camionetas"),
        Video("Jeep Gladiator", "Jeep", R.mipmap.ic_launcher, "Versatilidad total con techo removible y la legendaria capacidad 4x4 de Jeep.", R.raw.cam_5, "3:40", "Camionetas")
    )

    private fun getCarreras(): List<Video> = listOf(
        Video("F1 Monaco GP", "Formula 1", R.mipmap.ic_launcher, "El desafío más grande para un piloto: velocidad extrema en las estrechas calles del principado.", R.raw.race_1, "6:15", "Carreras"),
        Video("Le Mans 24h", "Endurance", R.mipmap.ic_launcher, "La prueba definitiva de resistencia para hombre y máquina en el mítico circuito de la Sarthe.", R.raw.race_2, "8:00", "Carreras"),
        Video("Nascar Daytona 500", "Nascar", R.mipmap.ic_launcher, "Estrategia y valentía a más de 300 km/h en el óvalo más famoso del mundo.", R.raw.race_3, "5:30", "Carreras"),
        Video("WRC Finland Rally", "Rally", R.mipmap.ic_launcher, "Espectaculares saltos y derrapes a fondo entre los bosques y lagos finlandeses.", R.raw.race_4, "4:45", "Carreras"),
        Video("MotoGP Silverstone", "MotoGP", R.mipmap.ic_launcher, "Duelos al límite sobre dos ruedas en la cuna del automovilismo británico.", R.raw.race_5, "7:10", "Carreras")
    )

    private fun getDrift(): List<Video> = listOf(
        Video("Ken Block Gymkhana", "Drift", R.mipmap.ic_launcher, "El maestro del control total en una exhibición de precisión, humo y adrenalina pura.", R.raw.drift_1, "9:00", "Drift"),
        Video("Formula Drift Japan", "Drift", R.mipmap.ic_launcher, "El arte del derrape llevado al máximo nivel competitivo en las laderas de Ebisu.", R.raw.drift_2, "5:20", "Drift"),
        Video("BMW M3 E46 Drift", "Drift", R.mipmap.ic_launcher, "El equilibrio perfecto del chasis M3 quemando llanta en ángulos imposibles.", R.raw.drift_3, "3:10", "Drift"),
        Video("Nissan Silvia S15", "Drift", R.mipmap.ic_launcher, "La plataforma favorita de los drifters demostrando por qué es el rey del estilo de lado.", R.raw.drift_4, "4:35", "Drift"),
        Video("Mazda RX-7 FD", "Drift", R.mipmap.ic_launcher, "El rugido del motor rotativo acompañando una danza perfecta de humo y velocidad.", R.raw.drift_5, "3:50", "Drift")
    )
}
