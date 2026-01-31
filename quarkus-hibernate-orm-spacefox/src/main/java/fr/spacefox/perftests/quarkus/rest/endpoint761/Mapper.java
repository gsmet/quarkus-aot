package fr.spacefox.perftests.quarkus.rest.endpoint761;

import fr.spacefox.perftests.quarkus.core.service761.model.Model761;
import fr.spacefox.perftests.quarkus.rest.endpoint761.schema.Schema761;

final class Mapper {
    private Mapper() {}

    public static Schema761 of(Model761 model) {
        return new Schema761(model.id(), model.value());
    }
}
