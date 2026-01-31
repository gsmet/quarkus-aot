package fr.spacefox.perftests.quarkus.rest.endpoint26;

import fr.spacefox.perftests.quarkus.core.service26.model.Model26;
import fr.spacefox.perftests.quarkus.rest.endpoint26.schema.Schema26;

final class Mapper {
    private Mapper() {}

    public static Schema26 of(Model26 model) {
        return new Schema26(model.id(), model.value());
    }
}
