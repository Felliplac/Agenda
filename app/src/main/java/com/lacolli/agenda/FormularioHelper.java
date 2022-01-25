package com.lacolli.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.lacolli.agenda.modelo.Aluno;

public class FormularioHelper {
    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoSite;
    private final EditText campoTelefone;
    private final RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity) {
        campoNome = (EditText) activity.findViewById(R.id.formularioNome);
        campoEndereco = (EditText) activity.findViewById(R.id.formularioEndereco);
        campoSite = (EditText) activity.findViewById(R.id.formularioSite);
        campoTelefone = (EditText) activity.findViewById(R.id.formularioTelefone);
        campoNota = (RatingBar) activity.findViewById(R.id.formularioNota);
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }
}
