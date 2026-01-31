package fr.spacefox.perftests.quarkus.rest.endpoint608;

import fr.spacefox.perftests.quarkus.core.service608.model.Model608;
import fr.spacefox.perftests.quarkus.rest.endpoint608.schema.Schema608;

final class Mapper {
    private Mapper() {}

    public static Schema608 of(Model608 model) {
        return new Schema608(model.id(), model.value());
    }
}
