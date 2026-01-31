package fr.spacefox.perftests.quarkus.rest.endpoint522;

import fr.spacefox.perftests.quarkus.core.service522.model.Model522;
import fr.spacefox.perftests.quarkus.rest.endpoint522.schema.Schema522;

final class Mapper {
    private Mapper() {}

    public static Schema522 of(Model522 model) {
        return new Schema522(model.id(), model.value());
    }
}
