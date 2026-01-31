package fr.spacefox.perftests.quarkus.rest.endpoint13;

import fr.spacefox.perftests.quarkus.core.service13.model.Model13;
import fr.spacefox.perftests.quarkus.rest.endpoint13.schema.Schema13;

final class Mapper {
    private Mapper() {}

    public static Schema13 of(Model13 model) {
        return new Schema13(model.id(), model.value());
    }
}
