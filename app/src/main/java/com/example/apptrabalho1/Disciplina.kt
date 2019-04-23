package com.example.apptrabalho1

import android.os.Parcel
import android.os.Parcelable

data class Disciplina(
    var codigo: Int,
    var descricao: String?,
    var cargaHoraria: Int
): Parcelable{

    private constructor(parcel: Parcel) : this(
        codigo = parcel.readInt(),
        descricao = parcel.readString(),
        cargaHoraria = parcel.readInt()
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(this.codigo)
        dest?.writeString(this.descricao)
        dest?.writeInt(this.cargaHoraria)
    }

    override fun describeContents(): Int = 0

    fun cargaHorariaToWatchFormat(): Double{
        return (cargaHoraria*50)/60.0
    }

    companion object {
        @JvmField
        val CREATOR = object: Parcelable.Creator<Disciplina>{
            override fun createFromParcel(source: Parcel): Disciplina = Disciplina(source)
            override fun newArray(size: Int) = arrayOfNulls<Disciplina>(size)
        }
    }
}