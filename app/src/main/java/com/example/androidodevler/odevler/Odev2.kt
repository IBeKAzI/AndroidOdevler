package com.example.androidodevler.odevler

class Odev2 {
    fun fahreneit(derece:Int) : Double{
        val hesapla = (derece*1.8)+32
        return hesapla

    }
    fun cevre(en:Int, boy:Int){
        val hesapla = 2*(en + boy)
        println("Dikdörtgenin çevresi : $hesapla")
    }
    fun faktor(sayi:Int):Int{
        var hesapla = 1

        if (sayi != 0){
            var sayac = sayi
            while (sayac > 0){
                hesapla = sayac * hesapla
                sayac -=1

            }

        }
        return hesapla

    }
    fun aVarMi(kelime:String){
        var sayac = 0
        for (harf in kelime){
            if (harf == 'a'){
                sayac+=1
            }
        }
        println("Kelimenizde $sayac tane a vardır.")
    }

    fun icAcilarToplaMi(kenar:Int):Int{
        if(kenar<=2){
            return 0
        }
        val hesapla = (kenar - 2)* 180
        return hesapla
    }
    fun maasHesap(gun:Int):Int{
        var hesapla = 0
        var saat = gun * 8
        if(saat >160 ){
            var mesai = 160 - saat
            hesapla = (mesai * 20) + 1600
        }else{
            hesapla = saat * 10

        }
        return hesapla

    }
    fun internetUcreti(kullanim:Int):Int{
        var hesapla = 0
        if (kullanim>50){
            var asim = kullanim - 50
            hesapla = (asim *4) + 100
        }else{
            hesapla = 100
        }
        return hesapla
    }

}