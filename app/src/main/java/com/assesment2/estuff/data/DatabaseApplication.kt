package com.assesment2.estuff.data

import android.app.Application


class DatabaseApplication : Application() {
    val database: BarangDb by lazy { BarangDb.getDatabase(this) }
}
