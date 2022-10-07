package com.example.sarjseviyekontroluygulamasi

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SarjSeviyeAlgilama : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {

        Toast.makeText(p0,"Şarjınız bitmek üzere..", Toast.LENGTH_SHORT).show()

    }
}