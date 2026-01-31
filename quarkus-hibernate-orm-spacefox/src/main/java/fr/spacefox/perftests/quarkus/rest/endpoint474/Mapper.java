package fr.spacefox.perftests.quarkus.rest.endpoint474;

import fr.spacefox.perftests.quarkus.core.service474.model.Model474;
import fr.spacefox.perftests.quarkus.rest.endpoint474.schema.Schema474;

final class Mapper {
    private Mapper() {}

    public static Schema474 of(Model474 model) {
        return new Schema474(model.id(), model.value());
    }
}
