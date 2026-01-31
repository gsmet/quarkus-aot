package fr.spacefox.perftests.quarkus.rest.endpoint444;

import fr.spacefox.perftests.quarkus.core.service444.model.Model444;
import fr.spacefox.perftests.quarkus.rest.endpoint444.schema.Schema444;

final class Mapper {
    private Mapper() {}

    public static Schema444 of(Model444 model) {
        return new Schema444(model.id(), model.value());
    }
}
