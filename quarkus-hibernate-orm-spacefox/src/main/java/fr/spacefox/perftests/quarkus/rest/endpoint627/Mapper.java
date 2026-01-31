package fr.spacefox.perftests.quarkus.rest.endpoint627;

import fr.spacefox.perftests.quarkus.core.service627.model.Model627;
import fr.spacefox.perftests.quarkus.rest.endpoint627.schema.Schema627;

final class Mapper {
    private Mapper() {}

    public static Schema627 of(Model627 model) {
        return new Schema627(model.id(), model.value());
    }
}
