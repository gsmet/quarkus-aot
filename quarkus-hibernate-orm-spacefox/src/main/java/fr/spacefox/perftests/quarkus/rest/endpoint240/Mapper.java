package fr.spacefox.perftests.quarkus.rest.endpoint240;

import fr.spacefox.perftests.quarkus.core.service240.model.Model240;
import fr.spacefox.perftests.quarkus.rest.endpoint240.schema.Schema240;

final class Mapper {
    private Mapper() {}

    public static Schema240 of(Model240 model) {
        return new Schema240(model.id(), model.value());
    }
}
