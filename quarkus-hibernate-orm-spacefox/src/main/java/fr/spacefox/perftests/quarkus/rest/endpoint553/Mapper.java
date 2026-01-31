package fr.spacefox.perftests.quarkus.rest.endpoint553;

import fr.spacefox.perftests.quarkus.core.service553.model.Model553;
import fr.spacefox.perftests.quarkus.rest.endpoint553.schema.Schema553;

final class Mapper {
    private Mapper() {}

    public static Schema553 of(Model553 model) {
        return new Schema553(model.id(), model.value());
    }
}
