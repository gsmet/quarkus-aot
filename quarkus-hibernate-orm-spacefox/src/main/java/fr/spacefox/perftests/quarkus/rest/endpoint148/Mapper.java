package fr.spacefox.perftests.quarkus.rest.endpoint148;

import fr.spacefox.perftests.quarkus.core.service148.model.Model148;
import fr.spacefox.perftests.quarkus.rest.endpoint148.schema.Schema148;

final class Mapper {
    private Mapper() {}

    public static Schema148 of(Model148 model) {
        return new Schema148(model.id(), model.value());
    }
}
