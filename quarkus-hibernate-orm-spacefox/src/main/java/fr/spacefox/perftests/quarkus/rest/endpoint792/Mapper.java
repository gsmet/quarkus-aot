package fr.spacefox.perftests.quarkus.rest.endpoint792;

import fr.spacefox.perftests.quarkus.core.service792.model.Model792;
import fr.spacefox.perftests.quarkus.rest.endpoint792.schema.Schema792;

final class Mapper {
    private Mapper() {}

    public static Schema792 of(Model792 model) {
        return new Schema792(model.id(), model.value());
    }
}
