package com.example.tasklist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tasklist.Model.Tarefa;
import com.example.tasklist.R;

import java.util.List;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.MyViewHolder> {

    private List<Tarefa> tarefaList;

    public TarefaAdapter(List<Tarefa> tarefas) {
        this.tarefaList = tarefas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                                        .inflate(R.layout.lista_tarefa_adapter, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Tarefa tarefa = tarefaList.get(position);
        holder.tarefa.setText(tarefa.getNomeTarefa());
    }

    @Override
    public int getItemCount() {
        return this.tarefaList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tarefa;

        public MyViewHolder(View itemView) {
            super(itemView);

            tarefa = itemView.findViewById(R.id.textoTarefa);
        }
    }
}
