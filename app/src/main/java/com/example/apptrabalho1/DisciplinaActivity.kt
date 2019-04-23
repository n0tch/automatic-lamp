package com.example.apptrabalho1

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_disciplina.*

class DisciplinaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_disciplina)
        setupDisciplinaData()
    }

    private fun setupDisciplinaData() {
        val disciplina = Disciplina(
            codigo = 1,
            descricao = "Alguma descricao",
            cargaHoraria = 2)

        disciplinaCodigo.text = disciplina.codigo.toString()
        disciplinaDescricao.text = disciplina.descricao
        disciplinaCarga.text = disciplina.cargaHoraria.toString()
        disciplinaCargaRelogio.text = disciplina.cargaHorariaToWatchFormat().toString()
    }

}