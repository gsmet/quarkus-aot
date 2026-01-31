package fr.spacefox.perftests.quarkus.rest.endpoint732;

import fr.spacefox.perftests.quarkus.core.service732.model.Model732;
import fr.spacefox.perftests.quarkus.rest.endpoint732.schema.Schema732;

final class Mapper {
    private Mapper() {}

    public static Schema732 of(Model732 model) {
        return new Schema732(model.id(), model.value());
    }
}
