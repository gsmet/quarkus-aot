package fr.spacefox.perftests.quarkus.rest.endpoint857;

import fr.spacefox.perftests.quarkus.core.service857.model.Model857;
import fr.spacefox.perftests.quarkus.rest.endpoint857.schema.Schema857;

final class Mapper {
    private Mapper() {}

    public static Schema857 of(Model857 model) {
        return new Schema857(model.id(), model.value());
    }
}
