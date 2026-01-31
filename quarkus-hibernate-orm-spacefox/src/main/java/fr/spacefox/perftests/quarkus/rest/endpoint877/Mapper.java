package fr.spacefox.perftests.quarkus.rest.endpoint877;

import fr.spacefox.perftests.quarkus.core.service877.model.Model877;
import fr.spacefox.perftests.quarkus.rest.endpoint877.schema.Schema877;

final class Mapper {
    private Mapper() {}

    public static Schema877 of(Model877 model) {
        return new Schema877(model.id(), model.value());
    }
}
