package fr.spacefox.perftests.quarkus.rest.endpoint861;

import fr.spacefox.perftests.quarkus.core.service861.model.Model861;
import fr.spacefox.perftests.quarkus.rest.endpoint861.schema.Schema861;

final class Mapper {
    private Mapper() {}

    public static Schema861 of(Model861 model) {
        return new Schema861(model.id(), model.value());
    }
}
