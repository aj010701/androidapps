package com.example.myvechicle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePageActivity : AppCompatActivity() {
    private lateinit var loginregister_your_vehicle: Button
    private lateinit var logincheck_your_vehicle_health: Button
    private lateinit var loginsettings: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        loginregister_your_vehicle = findViewById(R.id.Register)
        logincheck_your_vehicle_health = findViewById(R.id.Health)
        loginsettings = findViewById(R.id.Settings)
        loginregister_your_vehicle.setOnClickListener {
            val intent = Intent(this, VehicleRegisterActivity::class.java)
            startActivity(intent)
        }
        logincheck_your_vehicle_health.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}