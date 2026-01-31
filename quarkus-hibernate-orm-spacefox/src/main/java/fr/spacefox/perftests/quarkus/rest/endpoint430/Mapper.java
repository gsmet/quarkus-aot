package fr.spacefox.perftests.quarkus.rest.endpoint430;

import fr.spacefox.perftests.quarkus.core.service430.model.Model430;
import fr.spacefox.perftests.quarkus.rest.endpoint430.schema.Schema430;

final class Mapper {
    private Mapper() {}

    public static Schema430 of(Model430 model) {
        return new Schema430(model.id(), model.value());
    }
}
