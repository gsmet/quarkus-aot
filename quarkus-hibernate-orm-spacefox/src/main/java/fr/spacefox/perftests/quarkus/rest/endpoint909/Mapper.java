package fr.spacefox.perftests.quarkus.rest.endpoint909;

import fr.spacefox.perftests.quarkus.core.service909.model.Model909;
import fr.spacefox.perftests.quarkus.rest.endpoint909.schema.Schema909;

final class Mapper {
    private Mapper() {}

    public static Schema909 of(Model909 model) {
        return new Schema909(model.id(), model.value());
    }
}
