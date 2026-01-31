package fr.spacefox.perftests.quarkus.rest.endpoint999;

import fr.spacefox.perftests.quarkus.core.service999.model.Model999;
import fr.spacefox.perftests.quarkus.rest.endpoint999.schema.Schema999;

final class Mapper {
    private Mapper() {}

    public static Schema999 of(Model999 model) {
        return new Schema999(model.id(), model.value());
    }
}
