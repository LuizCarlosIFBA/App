package br.com.hlnengenharia.app.helper;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import br.com.hlnengenharia.app.InspecaoActivity;
import br.com.hlnengenharia.app.R;
import br.com.hlnengenharia.app.cadastro.CadPerguntaActivity;
import br.com.hlnengenharia.app.model.Carro;

public class CarroHelper {

    private final EditText campoPergunta;
    private final Carro carro;

    public CarroHelper(CadPerguntaActivity activity) {
        campoPergunta = activity.findViewById(R.id.pergunta);
        carro = new Carro();
    }


    public Carro pegaCarro() {
        carro.setPergunta(campoPergunta.getText().toString());
        return carro;
    }
}
