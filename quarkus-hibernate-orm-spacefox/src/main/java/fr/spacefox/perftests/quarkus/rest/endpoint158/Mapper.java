package fr.spacefox.perftests.quarkus.rest.endpoint158;

import fr.spacefox.perftests.quarkus.core.service158.model.Model158;
import fr.spacefox.perftests.quarkus.rest.endpoint158.schema.Schema158;

final class Mapper {
    private Mapper() {}

    public static Schema158 of(Model158 model) {
        return new Schema158(model.id(), model.value());
    }
}
