package fr.spacefox.perftests.quarkus.rest.endpoint253;

import fr.spacefox.perftests.quarkus.core.service253.model.Model253;
import fr.spacefox.perftests.quarkus.rest.endpoint253.schema.Schema253;

final class Mapper {
    private Mapper() {}

    public static Schema253 of(Model253 model) {
        return new Schema253(model.id(), model.value());
    }
}
