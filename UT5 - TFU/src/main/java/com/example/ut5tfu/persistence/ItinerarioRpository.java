package com.example.ut5tfu.persistence;

import com.example.ut5tfu.model.Itinerario;


public class ItinerarioRpository extends Repository<Itinerario, String>{

        private static ItinerarioRpository instance;

        private ItinerarioRpository(){
        }

        public static ItinerarioRpository getInstance() {
            if (instance == null) {
                instance = new ItinerarioRpository();
            }
            return instance;
        }

        @Override
        public Itinerario save(Itinerario clase) {
            this.entities.put(clase.getId(), clase);
            return super.save(clase);
        }

        @Override
        public void delete(String id) {
            this.entities.remove(id);
        }


}
