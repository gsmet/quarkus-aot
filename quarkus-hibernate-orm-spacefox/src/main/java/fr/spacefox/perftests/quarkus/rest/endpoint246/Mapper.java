package fr.spacefox.perftests.quarkus.rest.endpoint246;

import fr.spacefox.perftests.quarkus.core.service246.model.Model246;
import fr.spacefox.perftests.quarkus.rest.endpoint246.schema.Schema246;

final class Mapper {
    private Mapper() {}

    public static Schema246 of(Model246 model) {
        return new Schema246(model.id(), model.value());
    }
}
