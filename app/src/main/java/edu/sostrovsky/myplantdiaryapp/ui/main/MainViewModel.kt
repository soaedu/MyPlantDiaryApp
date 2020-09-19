package edu.sostrovsky.myplantdiaryapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.sostrovsky.myplantdiaryapp.dto.Plant
import edu.uc.jonesbr.myplantdiary.service.PlantService

class MainViewModel : ViewModel() {
    var plants = MutableLiveData<ArrayList<Plant>>()
    var plantService = PlantService()

    fun fetchPlants(plantName: String) {
        plants = plantService.fetchPlants(plantName)
    }
    // TODO: Implement the ViewModel
}
