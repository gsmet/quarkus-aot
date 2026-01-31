package fr.spacefox.perftests.quarkus.rest.endpoint30;

import fr.spacefox.perftests.quarkus.core.service30.model.Model30;
import fr.spacefox.perftests.quarkus.rest.endpoint30.schema.Schema30;

final class Mapper {
    private Mapper() {}

    public static Schema30 of(Model30 model) {
        return new Schema30(model.id(), model.value());
    }
}
