package fr.spacefox.perftests.quarkus.rest.endpoint429;

import fr.spacefox.perftests.quarkus.core.service429.model.Model429;
import fr.spacefox.perftests.quarkus.rest.endpoint429.schema.Schema429;

final class Mapper {
    private Mapper() {}

    public static Schema429 of(Model429 model) {
        return new Schema429(model.id(), model.value());
    }
}
