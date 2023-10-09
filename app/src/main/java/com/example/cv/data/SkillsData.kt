package com.example.cv.data

import com.example.cv.R

data class Skill(val title: String, val icon: Int)

var skills: List<Skill> = listOf(
    Skill("Teamwork", R.drawable.teamwork),
    Skill("Autonomie", R.drawable.autonomous),
    Skill("Écoute", R.drawable.listen),
    Skill("Android", R.drawable.android),
    Skill("Angular", R.drawable.code),
    Skill("VueJS", R.drawable.code),
    Skill("Nuxt", R.drawable.code),
    Skill("Flutter", R.drawable.flutter)
)