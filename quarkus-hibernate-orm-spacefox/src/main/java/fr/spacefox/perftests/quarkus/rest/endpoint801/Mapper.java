package fr.spacefox.perftests.quarkus.rest.endpoint801;

import fr.spacefox.perftests.quarkus.core.service801.model.Model801;
import fr.spacefox.perftests.quarkus.rest.endpoint801.schema.Schema801;

final class Mapper {
    private Mapper() {}

    public static Schema801 of(Model801 model) {
        return new Schema801(model.id(), model.value());
    }
}
