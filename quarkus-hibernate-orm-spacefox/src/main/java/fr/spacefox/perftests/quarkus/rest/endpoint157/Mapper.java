package fr.spacefox.perftests.quarkus.rest.endpoint157;

import fr.spacefox.perftests.quarkus.core.service157.model.Model157;
import fr.spacefox.perftests.quarkus.rest.endpoint157.schema.Schema157;

final class Mapper {
    private Mapper() {}

    public static Schema157 of(Model157 model) {
        return new Schema157(model.id(), model.value());
    }
}
