package fr.spacefox.perftests.quarkus.rest.endpoint951;

import fr.spacefox.perftests.quarkus.core.service951.model.Model951;
import fr.spacefox.perftests.quarkus.rest.endpoint951.schema.Schema951;

final class Mapper {
    private Mapper() {}

    public static Schema951 of(Model951 model) {
        return new Schema951(model.id(), model.value());
    }
}
