package fr.spacefox.perftests.quarkus.rest.endpoint224;

import fr.spacefox.perftests.quarkus.core.service224.model.Model224;
import fr.spacefox.perftests.quarkus.rest.endpoint224.schema.Schema224;

final class Mapper {
    private Mapper() {}

    public static Schema224 of(Model224 model) {
        return new Schema224(model.id(), model.value());
    }
}
