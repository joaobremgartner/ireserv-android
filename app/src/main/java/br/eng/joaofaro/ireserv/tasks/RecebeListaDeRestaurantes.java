package br.eng.joaofaro.ireserv.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * @author Created by joaofaro on 09/06/17.
 */

public class RecebeListaDeRestaurantes extends AsyncTask<Object, Object, String> {

    private Context context;
    private ProgressDialog dialog;

    public RecebeListaDeRestaurantes(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        dialog = ProgressDialog.show(context, "Aguarde", "Atualizando lista", true, false);
    }

    @Override
    protected String doInBackground(Object... params) {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        dialog.dismiss();
        Toast.makeText(context, "Lista está atualizada", Toast.LENGTH_LONG).show();
    }
}
