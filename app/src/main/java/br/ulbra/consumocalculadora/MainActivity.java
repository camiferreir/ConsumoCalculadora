package br.ulbra.consumocalculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtPotencia = findViewById(R.id.edtPotencia);
        EditText edtPreco = findViewById(R.id.edtPrecos);
        EditText edtTempo = findViewById(R.id.edtHoras);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(v -> {
            String potenciae = edtPotencia.getText().toString();
            String precoe = edtPreco.getText().toString();
            String tempoe = edtTempo.getText().toString();

            if (potenciae.isEmpty() || precoe.isEmpty() || tempoe.isEmpty()) {
                txtResultado.setText("Preencha todos os campos!");
                return;
            }

            try {
                double potencia, preco,tempo;
                potencia = Double.parseDouble(potenciae);
                preco = Double.parseDouble(precoe);
                tempo = Double.parseDouble(tempoe);

                double consumo = (potencia * tempo) / 1000;
                double custo = consumo * preco;

                txtResultado.setText(String.format("Consumo: %.3f kWh\nCusto: R$ %.2f", consumo, custo));
            } catch (NumberFormatException e) {
                txtResultado.setText("Digite números válidos!");
            }
        });
    }
}5