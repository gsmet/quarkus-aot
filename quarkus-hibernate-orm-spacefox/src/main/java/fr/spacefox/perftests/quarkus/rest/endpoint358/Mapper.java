package fr.spacefox.perftests.quarkus.rest.endpoint358;

import fr.spacefox.perftests.quarkus.core.service358.model.Model358;
import fr.spacefox.perftests.quarkus.rest.endpoint358.schema.Schema358;

final class Mapper {
    private Mapper() {}

    public static Schema358 of(Model358 model) {
        return new Schema358(model.id(), model.value());
    }
}
