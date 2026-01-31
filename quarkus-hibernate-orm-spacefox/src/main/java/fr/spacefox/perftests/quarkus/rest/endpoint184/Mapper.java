package fr.spacefox.perftests.quarkus.rest.endpoint184;

import fr.spacefox.perftests.quarkus.core.service184.model.Model184;
import fr.spacefox.perftests.quarkus.rest.endpoint184.schema.Schema184;

final class Mapper {
    private Mapper() {}

    public static Schema184 of(Model184 model) {
        return new Schema184(model.id(), model.value());
    }
}
