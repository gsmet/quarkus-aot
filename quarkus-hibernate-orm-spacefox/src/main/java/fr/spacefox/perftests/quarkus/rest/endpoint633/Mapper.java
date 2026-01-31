package fr.spacefox.perftests.quarkus.rest.endpoint633;

import fr.spacefox.perftests.quarkus.core.service633.model.Model633;
import fr.spacefox.perftests.quarkus.rest.endpoint633.schema.Schema633;

final class Mapper {
    private Mapper() {}

    public static Schema633 of(Model633 model) {
        return new Schema633(model.id(), model.value());
    }
}
