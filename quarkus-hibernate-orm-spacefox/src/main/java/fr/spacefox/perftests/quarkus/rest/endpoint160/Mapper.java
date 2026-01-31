package fr.spacefox.perftests.quarkus.rest.endpoint160;

import fr.spacefox.perftests.quarkus.core.service160.model.Model160;
import fr.spacefox.perftests.quarkus.rest.endpoint160.schema.Schema160;

final class Mapper {
    private Mapper() {}

    public static Schema160 of(Model160 model) {
        return new Schema160(model.id(), model.value());
    }
}
