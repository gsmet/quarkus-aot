package fr.spacefox.perftests.quarkus.rest.endpoint519;

import fr.spacefox.perftests.quarkus.core.service519.model.Model519;
import fr.spacefox.perftests.quarkus.rest.endpoint519.schema.Schema519;

final class Mapper {
    private Mapper() {}

    public static Schema519 of(Model519 model) {
        return new Schema519(model.id(), model.value());
    }
}
