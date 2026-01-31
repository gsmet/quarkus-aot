package fr.spacefox.perftests.quarkus.rest.endpoint388;

import fr.spacefox.perftests.quarkus.core.service388.model.Model388;
import fr.spacefox.perftests.quarkus.rest.endpoint388.schema.Schema388;

final class Mapper {
    private Mapper() {}

    public static Schema388 of(Model388 model) {
        return new Schema388(model.id(), model.value());
    }
}
