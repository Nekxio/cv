package com.example.cv.data

data class Experiences(val job: String, val company: String, val date: String, val techno: List<String>?)

var experiences: List<Experiences> = listOf(
    Experiences("Développeur web fullstack", "Infotel", "2022 - Aujourd'hui", listOf("Angular", "Flutter")),
    Experiences("Développeur web", "MyLovelyJobs", "2021 - 2022", listOf("Wordpress")),
    Experiences("Développeur web", "Com & Design", "février - mars 2021", listOf("Wordpress")),
    Experiences("Préparateur de commande", "Boulanger", "Août 2021", null),
    Experiences("Equipier client", "Boulanger", "Août 2021", null),
    Experiences("Vendeur", "Boulanger", "juin-juillet 2021", null),
    Experiences("Equipier client", "Auchan", "juillet - août 2021", null),

)