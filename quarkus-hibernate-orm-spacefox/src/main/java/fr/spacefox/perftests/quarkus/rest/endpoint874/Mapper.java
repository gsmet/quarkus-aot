package fr.spacefox.perftests.quarkus.rest.endpoint874;

import fr.spacefox.perftests.quarkus.core.service874.model.Model874;
import fr.spacefox.perftests.quarkus.rest.endpoint874.schema.Schema874;

final class Mapper {
    private Mapper() {}

    public static Schema874 of(Model874 model) {
        return new Schema874(model.id(), model.value());
    }
}
