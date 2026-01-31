package fr.spacefox.perftests.quarkus.rest.endpoint947;

import fr.spacefox.perftests.quarkus.core.service947.model.Model947;
import fr.spacefox.perftests.quarkus.rest.endpoint947.schema.Schema947;

final class Mapper {
    private Mapper() {}

    public static Schema947 of(Model947 model) {
        return new Schema947(model.id(), model.value());
    }
}
