package fr.spacefox.perftests.quarkus.rest.endpoint472;

import fr.spacefox.perftests.quarkus.core.service472.model.Model472;
import fr.spacefox.perftests.quarkus.rest.endpoint472.schema.Schema472;

final class Mapper {
    private Mapper() {}

    public static Schema472 of(Model472 model) {
        return new Schema472(model.id(), model.value());
    }
}
