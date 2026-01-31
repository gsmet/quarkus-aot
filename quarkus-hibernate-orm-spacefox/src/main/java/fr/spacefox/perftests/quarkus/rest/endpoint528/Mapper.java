package fr.spacefox.perftests.quarkus.rest.endpoint528;

import fr.spacefox.perftests.quarkus.core.service528.model.Model528;
import fr.spacefox.perftests.quarkus.rest.endpoint528.schema.Schema528;

final class Mapper {
    private Mapper() {}

    public static Schema528 of(Model528 model) {
        return new Schema528(model.id(), model.value());
    }
}
