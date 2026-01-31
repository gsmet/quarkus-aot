package fr.spacefox.perftests.quarkus.rest.endpoint77;

import fr.spacefox.perftests.quarkus.core.service77.model.Model77;
import fr.spacefox.perftests.quarkus.rest.endpoint77.schema.Schema77;

final class Mapper {
    private Mapper() {}

    public static Schema77 of(Model77 model) {
        return new Schema77(model.id(), model.value());
    }
}
