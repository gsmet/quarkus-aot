package fr.spacefox.perftests.quarkus.rest.endpoint657;

import fr.spacefox.perftests.quarkus.core.service657.model.Model657;
import fr.spacefox.perftests.quarkus.rest.endpoint657.schema.Schema657;

final class Mapper {
    private Mapper() {}

    public static Schema657 of(Model657 model) {
        return new Schema657(model.id(), model.value());
    }
}
