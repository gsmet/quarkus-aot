package fr.spacefox.perftests.quarkus.rest.endpoint408;

import fr.spacefox.perftests.quarkus.core.service408.model.Model408;
import fr.spacefox.perftests.quarkus.rest.endpoint408.schema.Schema408;

final class Mapper {
    private Mapper() {}

    public static Schema408 of(Model408 model) {
        return new Schema408(model.id(), model.value());
    }
}
