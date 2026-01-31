package fr.spacefox.perftests.quarkus.rest.endpoint956;

import fr.spacefox.perftests.quarkus.core.service956.model.Model956;
import fr.spacefox.perftests.quarkus.rest.endpoint956.schema.Schema956;

final class Mapper {
    private Mapper() {}

    public static Schema956 of(Model956 model) {
        return new Schema956(model.id(), model.value());
    }
}
