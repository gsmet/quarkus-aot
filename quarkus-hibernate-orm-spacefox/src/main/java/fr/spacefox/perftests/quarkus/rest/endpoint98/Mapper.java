package fr.spacefox.perftests.quarkus.rest.endpoint98;

import fr.spacefox.perftests.quarkus.core.service98.model.Model98;
import fr.spacefox.perftests.quarkus.rest.endpoint98.schema.Schema98;

final class Mapper {
    private Mapper() {}

    public static Schema98 of(Model98 model) {
        return new Schema98(model.id(), model.value());
    }
}
