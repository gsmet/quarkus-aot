package fr.spacefox.perftests.quarkus.rest.endpoint934;

import fr.spacefox.perftests.quarkus.core.service934.model.Model934;
import fr.spacefox.perftests.quarkus.rest.endpoint934.schema.Schema934;

final class Mapper {
    private Mapper() {}

    public static Schema934 of(Model934 model) {
        return new Schema934(model.id(), model.value());
    }
}
