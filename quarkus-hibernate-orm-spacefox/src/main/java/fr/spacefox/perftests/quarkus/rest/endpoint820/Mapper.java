package fr.spacefox.perftests.quarkus.rest.endpoint820;

import fr.spacefox.perftests.quarkus.core.service820.model.Model820;
import fr.spacefox.perftests.quarkus.rest.endpoint820.schema.Schema820;

final class Mapper {
    private Mapper() {}

    public static Schema820 of(Model820 model) {
        return new Schema820(model.id(), model.value());
    }
}
