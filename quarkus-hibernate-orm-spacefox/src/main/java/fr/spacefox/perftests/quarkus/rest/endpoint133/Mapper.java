package fr.spacefox.perftests.quarkus.rest.endpoint133;

import fr.spacefox.perftests.quarkus.core.service133.model.Model133;
import fr.spacefox.perftests.quarkus.rest.endpoint133.schema.Schema133;

final class Mapper {
    private Mapper() {}

    public static Schema133 of(Model133 model) {
        return new Schema133(model.id(), model.value());
    }
}
