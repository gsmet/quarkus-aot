package fr.spacefox.perftests.quarkus.rest.endpoint911;

import fr.spacefox.perftests.quarkus.core.service911.model.Model911;
import fr.spacefox.perftests.quarkus.rest.endpoint911.schema.Schema911;

final class Mapper {
    private Mapper() {}

    public static Schema911 of(Model911 model) {
        return new Schema911(model.id(), model.value());
    }
}
