package fr.spacefox.perftests.quarkus.rest.endpoint740;

import fr.spacefox.perftests.quarkus.core.service740.model.Model740;
import fr.spacefox.perftests.quarkus.rest.endpoint740.schema.Schema740;

final class Mapper {
    private Mapper() {}

    public static Schema740 of(Model740 model) {
        return new Schema740(model.id(), model.value());
    }
}
