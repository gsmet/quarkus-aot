package fr.spacefox.perftests.quarkus.rest.endpoint513;

import fr.spacefox.perftests.quarkus.core.service513.model.Model513;
import fr.spacefox.perftests.quarkus.rest.endpoint513.schema.Schema513;

final class Mapper {
    private Mapper() {}

    public static Schema513 of(Model513 model) {
        return new Schema513(model.id(), model.value());
    }
}
