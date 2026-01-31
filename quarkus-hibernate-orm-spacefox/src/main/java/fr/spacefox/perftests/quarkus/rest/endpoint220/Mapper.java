package fr.spacefox.perftests.quarkus.rest.endpoint220;

import fr.spacefox.perftests.quarkus.core.service220.model.Model220;
import fr.spacefox.perftests.quarkus.rest.endpoint220.schema.Schema220;

final class Mapper {
    private Mapper() {}

    public static Schema220 of(Model220 model) {
        return new Schema220(model.id(), model.value());
    }
}
