package fr.spacefox.perftests.quarkus.rest.endpoint673;

import fr.spacefox.perftests.quarkus.core.service673.model.Model673;
import fr.spacefox.perftests.quarkus.rest.endpoint673.schema.Schema673;

final class Mapper {
    private Mapper() {}

    public static Schema673 of(Model673 model) {
        return new Schema673(model.id(), model.value());
    }
}
