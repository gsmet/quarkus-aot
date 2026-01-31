package fr.spacefox.perftests.quarkus.rest.endpoint38;

import fr.spacefox.perftests.quarkus.core.service38.model.Model38;
import fr.spacefox.perftests.quarkus.rest.endpoint38.schema.Schema38;

final class Mapper {
    private Mapper() {}

    public static Schema38 of(Model38 model) {
        return new Schema38(model.id(), model.value());
    }
}
