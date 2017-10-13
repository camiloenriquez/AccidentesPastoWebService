package com.example.camil.accidentespasto;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.camil.accidentespasto.models.ReporteDeAccidentesEnPasto;

import java.util.ArrayList;

/**
 * Created by camilo  on 11/10/17.
 */

public class ListAccident extends RecyclerView.Adapter<ListAccident.ViewHolder> {
    private ArrayList<ReporteDeAccidentesEnPasto> dataset;

    private Context context;

    public ListAccident(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_accident, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ReporteDeAccidentesEnPasto a = dataset.get(position);
        holder.mes.setText(a.getMes());
        holder.zona.setText(a.getZona().toString());
        holder.accidentesMoto.setText(a.getClaseDeVehiculoMotocicleta().toString());
        holder.accidentesAuto.setText(a.getClaseDeVehiculoAutomovil().toString());
        holder.accidentesCamioneta.setText(a.getCaseDeVehiculoCamioneta().toString());
        holder.accidentesBus.setText(a.getClaseDeVehiculoBus().toString());
        holder.totalAcci.setText(a.getClaseDeVehiculoAutomovil().toString());


    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void agregarAuto(ArrayList<ReporteDeAccidentesEnPasto> listaAuto) {
        dataset.addAll(listaAuto);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        private TextView mes;
        private TextView zona;
        private TextView  accidentesMoto;
        private TextView  accidentesAuto;
        private TextView  accidentesCamioneta;
        private TextView  accidentesBus;
        private TextView totalAcci;

        public ViewHolder(View itemView) {
            super(itemView);


            mes = (TextView) itemView.findViewById(R.id.mes);
            zona=(TextView) itemView.findViewById(R.id.zona);
            accidentesMoto=(TextView) itemView.findViewById(R.id.accidentesMoto);
            accidentesAuto=(TextView) itemView.findViewById(R.id.accidentesAuto);
            accidentesCamioneta=(TextView) itemView.findViewById(R.id.accidentesCamioneta);
            accidentesBus=(TextView) itemView.findViewById(R.id.accidentesBus);
            totalAcci=(TextView) itemView.findViewById(R.id.totalAcci);
        }
    }
}
