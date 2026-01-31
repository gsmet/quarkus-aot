package fr.spacefox.perftests.quarkus.rest.endpoint252;

import fr.spacefox.perftests.quarkus.core.service252.model.Model252;
import fr.spacefox.perftests.quarkus.rest.endpoint252.schema.Schema252;

final class Mapper {
    private Mapper() {}

    public static Schema252 of(Model252 model) {
        return new Schema252(model.id(), model.value());
    }
}
