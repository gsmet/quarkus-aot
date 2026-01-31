package fr.spacefox.perftests.quarkus.rest.endpoint840;

import fr.spacefox.perftests.quarkus.core.service840.model.Model840;
import fr.spacefox.perftests.quarkus.rest.endpoint840.schema.Schema840;

final class Mapper {
    private Mapper() {}

    public static Schema840 of(Model840 model) {
        return new Schema840(model.id(), model.value());
    }
}
