package fr.spacefox.perftests.quarkus.rest.endpoint483;

import fr.spacefox.perftests.quarkus.core.service483.model.Model483;
import fr.spacefox.perftests.quarkus.rest.endpoint483.schema.Schema483;

final class Mapper {
    private Mapper() {}

    public static Schema483 of(Model483 model) {
        return new Schema483(model.id(), model.value());
    }
}
