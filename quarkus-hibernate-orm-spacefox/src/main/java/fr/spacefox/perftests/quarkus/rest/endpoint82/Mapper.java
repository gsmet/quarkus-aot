package fr.spacefox.perftests.quarkus.rest.endpoint82;

import fr.spacefox.perftests.quarkus.core.service82.model.Model82;
import fr.spacefox.perftests.quarkus.rest.endpoint82.schema.Schema82;

final class Mapper {
    private Mapper() {}

    public static Schema82 of(Model82 model) {
        return new Schema82(model.id(), model.value());
    }
}
