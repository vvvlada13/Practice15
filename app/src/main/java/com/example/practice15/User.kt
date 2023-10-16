package com.example.practice15

import android.os.Parcel
    import android.os.Parcelable

    class User():Parcelable {
        private var name1: String =" "
        private var name2: String =" "

        constructor(parcel: Parcel) : this() {
            name1=parcel.readString().toString()
            name2=parcel.readString().toString()
        }

        companion object CREATOR : Parcelable.Creator<User> {
            override fun createFromParcel(parcel: Parcel): User {
                return User(parcel)
            }

            override fun newArray(size: Int): Array<User?> {
                return arrayOfNulls(size)
            }
        }

        constructor(_name1:String,_name2:String):this(){
            name1=_name1
            name2=_name2
        }

        fun setName1(_name1: String){
            name1=_name1
        }
        fun getName1():String{
            return name1
        }

        fun setName2(_name2: String){
            name2=_name2
        }
        fun getName2(): String{
            return name2
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel?.writeString(name1)
            parcel?.writeString(name2)
        }

        override fun describeContents(): Int {
            return 0
        }

    }
