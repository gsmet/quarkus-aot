package fr.spacefox.perftests.quarkus.rest.endpoint734;

import fr.spacefox.perftests.quarkus.core.service734.model.Model734;
import fr.spacefox.perftests.quarkus.rest.endpoint734.schema.Schema734;

final class Mapper {
    private Mapper() {}

    public static Schema734 of(Model734 model) {
        return new Schema734(model.id(), model.value());
    }
}
