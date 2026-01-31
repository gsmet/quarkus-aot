package fr.spacefox.perftests.quarkus.rest.endpoint351;

import fr.spacefox.perftests.quarkus.core.service351.model.Model351;
import fr.spacefox.perftests.quarkus.rest.endpoint351.schema.Schema351;

final class Mapper {
    private Mapper() {}

    public static Schema351 of(Model351 model) {
        return new Schema351(model.id(), model.value());
    }
}
