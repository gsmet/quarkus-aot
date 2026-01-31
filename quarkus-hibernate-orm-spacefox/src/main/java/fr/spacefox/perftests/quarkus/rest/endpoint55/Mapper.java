package fr.spacefox.perftests.quarkus.rest.endpoint55;

import fr.spacefox.perftests.quarkus.core.service55.model.Model55;
import fr.spacefox.perftests.quarkus.rest.endpoint55.schema.Schema55;

final class Mapper {
    private Mapper() {}

    public static Schema55 of(Model55 model) {
        return new Schema55(model.id(), model.value());
    }
}
