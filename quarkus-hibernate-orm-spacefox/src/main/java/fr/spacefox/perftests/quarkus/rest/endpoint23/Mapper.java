package fr.spacefox.perftests.quarkus.rest.endpoint23;

import fr.spacefox.perftests.quarkus.core.service23.model.Model23;
import fr.spacefox.perftests.quarkus.rest.endpoint23.schema.Schema23;

final class Mapper {
    private Mapper() {}

    public static Schema23 of(Model23 model) {
        return new Schema23(model.id(), model.value());
    }
}
