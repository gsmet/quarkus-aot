package fr.spacefox.perftests.quarkus.rest.endpoint996;

import fr.spacefox.perftests.quarkus.core.service996.model.Model996;
import fr.spacefox.perftests.quarkus.rest.endpoint996.schema.Schema996;

final class Mapper {
    private Mapper() {}

    public static Schema996 of(Model996 model) {
        return new Schema996(model.id(), model.value());
    }
}
