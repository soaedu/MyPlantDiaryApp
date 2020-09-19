package edu.sostrovsky.myplantdiaryapp.dto

import androidx.room.Entity

/**
 * Author: Sergey Ostrovsky
 * Date: 19.09.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
@Entity(tableName="plant")
data class Plant(var genus: String, var species : String, var common :String) {
//                 @PrimaryKey @SerializedName("id") var plantId:Int = 0) {
    override fun toString(): String {
        return common
    }
}