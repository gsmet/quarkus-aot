package fr.spacefox.perftests.quarkus.rest.endpoint788;

import fr.spacefox.perftests.quarkus.core.service788.model.Model788;
import fr.spacefox.perftests.quarkus.rest.endpoint788.schema.Schema788;

final class Mapper {
    private Mapper() {}

    public static Schema788 of(Model788 model) {
        return new Schema788(model.id(), model.value());
    }
}
