package fr.spacefox.perftests.quarkus.rest.endpoint375;

import fr.spacefox.perftests.quarkus.core.service375.model.Model375;
import fr.spacefox.perftests.quarkus.rest.endpoint375.schema.Schema375;

final class Mapper {
    private Mapper() {}

    public static Schema375 of(Model375 model) {
        return new Schema375(model.id(), model.value());
    }
}
