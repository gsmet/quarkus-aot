package fr.spacefox.perftests.quarkus.rest.endpoint467;

import fr.spacefox.perftests.quarkus.core.service467.model.Model467;
import fr.spacefox.perftests.quarkus.rest.endpoint467.schema.Schema467;

final class Mapper {
    private Mapper() {}

    public static Schema467 of(Model467 model) {
        return new Schema467(model.id(), model.value());
    }
}
