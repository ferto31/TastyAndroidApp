package pe.edu.ulima.tastyfinal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Johanna on 17/07/2016.
 */
public class FragmentoVendedor extends Fragment {
    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    private Adaptador_vendedores adaptadors;

    public FragmentoVendedor() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmento_vendedores, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        adaptadors = new Adaptador_vendedores();
        reciclador.setAdapter(adaptadors);
        return view;

    }


}
