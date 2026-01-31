package fr.spacefox.perftests.quarkus.rest.endpoint310;

import fr.spacefox.perftests.quarkus.core.service310.model.Model310;
import fr.spacefox.perftests.quarkus.rest.endpoint310.schema.Schema310;

final class Mapper {
    private Mapper() {}

    public static Schema310 of(Model310 model) {
        return new Schema310(model.id(), model.value());
    }
}
