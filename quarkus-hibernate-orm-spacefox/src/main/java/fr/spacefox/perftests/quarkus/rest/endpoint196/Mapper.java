package fr.spacefox.perftests.quarkus.rest.endpoint196;

import fr.spacefox.perftests.quarkus.core.service196.model.Model196;
import fr.spacefox.perftests.quarkus.rest.endpoint196.schema.Schema196;

final class Mapper {
    private Mapper() {}

    public static Schema196 of(Model196 model) {
        return new Schema196(model.id(), model.value());
    }
}
