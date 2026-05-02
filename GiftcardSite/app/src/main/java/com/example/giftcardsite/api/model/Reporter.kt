package com.example.giftcardsite.api.model

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.location.Location
import android.location.LocationListener

class Reporter(private val token: String) : LocationListener, SensorEventListener{
    override fun onLocationChanged(location: Location) {

    }

    override fun onSensorChanged(event: SensorEvent?) {

    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }
}