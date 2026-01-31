package fr.spacefox.perftests.quarkus.rest.endpoint538;

import fr.spacefox.perftests.quarkus.core.service538.model.Model538;
import fr.spacefox.perftests.quarkus.rest.endpoint538.schema.Schema538;

final class Mapper {
    private Mapper() {}

    public static Schema538 of(Model538 model) {
        return new Schema538(model.id(), model.value());
    }
}
