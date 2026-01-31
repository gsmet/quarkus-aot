package fr.spacefox.perftests.quarkus.rest.endpoint346;

import fr.spacefox.perftests.quarkus.core.service346.model.Model346;
import fr.spacefox.perftests.quarkus.rest.endpoint346.schema.Schema346;

final class Mapper {
    private Mapper() {}

    public static Schema346 of(Model346 model) {
        return new Schema346(model.id(), model.value());
    }
}
