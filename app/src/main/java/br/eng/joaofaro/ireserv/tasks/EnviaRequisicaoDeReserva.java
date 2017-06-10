package br.eng.joaofaro.ireserv.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by joaofaro on 09/06/17.
 */

public class EnviaRequisicaoDeReserva extends AsyncTask<Object, Object, String> {

    private Context context;
    private ProgressDialog dialog;

    public EnviaRequisicaoDeReserva(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        dialog = ProgressDialog.show(context, "Aguarde", "Enviando requisição", true, true);
    }

    @Override
    protected String doInBackground(Object... params) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
