package fr.spacefox.perftests.quarkus.rest.endpoint66;

import fr.spacefox.perftests.quarkus.core.service66.model.Model66;
import fr.spacefox.perftests.quarkus.rest.endpoint66.schema.Schema66;

final class Mapper {
    private Mapper() {}

    public static Schema66 of(Model66 model) {
        return new Schema66(model.id(), model.value());
    }
}
