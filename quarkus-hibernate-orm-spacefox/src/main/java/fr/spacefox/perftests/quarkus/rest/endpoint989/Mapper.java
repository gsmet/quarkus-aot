package fr.spacefox.perftests.quarkus.rest.endpoint989;

import fr.spacefox.perftests.quarkus.core.service989.model.Model989;
import fr.spacefox.perftests.quarkus.rest.endpoint989.schema.Schema989;

final class Mapper {
    private Mapper() {}

    public static Schema989 of(Model989 model) {
        return new Schema989(model.id(), model.value());
    }
}
