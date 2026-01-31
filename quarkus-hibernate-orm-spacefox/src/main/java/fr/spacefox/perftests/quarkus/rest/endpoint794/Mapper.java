package fr.spacefox.perftests.quarkus.rest.endpoint794;

import fr.spacefox.perftests.quarkus.core.service794.model.Model794;
import fr.spacefox.perftests.quarkus.rest.endpoint794.schema.Schema794;

final class Mapper {
    private Mapper() {}

    public static Schema794 of(Model794 model) {
        return new Schema794(model.id(), model.value());
    }
}
