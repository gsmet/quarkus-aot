package fr.spacefox.perftests.quarkus.rest.endpoint599;

import fr.spacefox.perftests.quarkus.core.service599.model.Model599;
import fr.spacefox.perftests.quarkus.rest.endpoint599.schema.Schema599;

final class Mapper {
    private Mapper() {}

    public static Schema599 of(Model599 model) {
        return new Schema599(model.id(), model.value());
    }
}
