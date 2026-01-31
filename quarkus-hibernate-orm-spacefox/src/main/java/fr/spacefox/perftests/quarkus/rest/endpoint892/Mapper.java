package fr.spacefox.perftests.quarkus.rest.endpoint892;

import fr.spacefox.perftests.quarkus.core.service892.model.Model892;
import fr.spacefox.perftests.quarkus.rest.endpoint892.schema.Schema892;

final class Mapper {
    private Mapper() {}

    public static Schema892 of(Model892 model) {
        return new Schema892(model.id(), model.value());
    }
}
