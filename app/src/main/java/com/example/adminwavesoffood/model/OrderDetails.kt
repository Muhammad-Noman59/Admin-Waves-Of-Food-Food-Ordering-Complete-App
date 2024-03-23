package com.example.adminwavesoffood.model

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable



//        Made by Muhammad Noman
//
//        If you need my service or you have any question then you can contact with me.
//
//        WhatsApp number :  +923104881573
//
//        LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//        Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL

class OrderDetails(): Serializable {

    var userId : String? = null
    var userName : String? = null
    var foodItemName : ArrayList<String>? = null
    var foodItemImage : ArrayList<String>? = null
    var foodItemPrice : ArrayList<String>? = null
    var foodItemQuantities : ArrayList<Int>? = null
    var address : String? = null
    var totalPrice : String? = null
    var phoneNumber : String? = null
    var orderAccepted : Boolean = false
    var paymentReceived : Boolean = false
    var itemPushKey : String? = null
    var currentTime : Long = 0

    constructor(parcel: Parcel) : this() {
        userId = parcel.readString()
        userName = parcel.readString()
        address = parcel.readString()
        totalPrice = parcel.readString()
        phoneNumber = parcel.readString()
        orderAccepted = parcel.readByte() != 0.toByte()
        paymentReceived = parcel.readByte() != 0.toByte()
        itemPushKey = parcel.readString()
        currentTime = parcel.readLong()
    }

   fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<OrderDetails> {
        override fun createFromParcel(parcel: Parcel): OrderDetails {
            return OrderDetails(parcel)
        }

        override fun newArray(size: Int): Array<OrderDetails?> {
            return arrayOfNulls(size)
        }
    }
}