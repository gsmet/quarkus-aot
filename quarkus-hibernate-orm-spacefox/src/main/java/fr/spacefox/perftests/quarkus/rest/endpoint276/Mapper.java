package fr.spacefox.perftests.quarkus.rest.endpoint276;

import fr.spacefox.perftests.quarkus.core.service276.model.Model276;
import fr.spacefox.perftests.quarkus.rest.endpoint276.schema.Schema276;

final class Mapper {
    private Mapper() {}

    public static Schema276 of(Model276 model) {
        return new Schema276(model.id(), model.value());
    }
}
