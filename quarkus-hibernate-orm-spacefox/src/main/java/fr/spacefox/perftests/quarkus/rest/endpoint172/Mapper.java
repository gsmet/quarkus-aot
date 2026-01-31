package fr.spacefox.perftests.quarkus.rest.endpoint172;

import fr.spacefox.perftests.quarkus.core.service172.model.Model172;
import fr.spacefox.perftests.quarkus.rest.endpoint172.schema.Schema172;

final class Mapper {
    private Mapper() {}

    public static Schema172 of(Model172 model) {
        return new Schema172(model.id(), model.value());
    }
}
