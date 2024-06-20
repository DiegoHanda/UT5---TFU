package com.example.ut5tfu.business.itinerario;

import com.example.ut5tfu.model.Itinerario;
import java.util.List;
import java.util.Optional;

public interface ItinerarioService {

    public void crearItinerario(Itinerario itinerario);
    public void actualizarItinerario(String id, Itinerario itinerario);
    public void eliminarItinerario(String id);

    public List<Itinerario> obtenerTodos();
    public Optional<Itinerario> obtenerPorId(String id);
}


