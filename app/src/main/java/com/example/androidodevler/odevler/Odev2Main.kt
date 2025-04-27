package com.example.androidodevler.odevler

fun main() {
    val f = Odev2()
    val sonuc = f.fahreneit(12)
    println("12 derece $sonuc fahreneitdır")

    f.cevre(12,8)

    val faktor =f.faktor(0)
    println("3 ün faktöriyeli : $faktor ")
    f.aVarMi("atakan")


}