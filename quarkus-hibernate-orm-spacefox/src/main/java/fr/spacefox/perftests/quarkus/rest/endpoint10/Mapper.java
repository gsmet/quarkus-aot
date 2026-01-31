package fr.spacefox.perftests.quarkus.rest.endpoint10;

import fr.spacefox.perftests.quarkus.core.service10.model.Model10;
import fr.spacefox.perftests.quarkus.rest.endpoint10.schema.Schema10;

final class Mapper {
    private Mapper() {}

    public static Schema10 of(Model10 model) {
        return new Schema10(model.id(), model.value());
    }
}
