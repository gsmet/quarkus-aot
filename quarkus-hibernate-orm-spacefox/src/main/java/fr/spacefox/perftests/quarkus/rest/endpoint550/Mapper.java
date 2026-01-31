package fr.spacefox.perftests.quarkus.rest.endpoint550;

import fr.spacefox.perftests.quarkus.core.service550.model.Model550;
import fr.spacefox.perftests.quarkus.rest.endpoint550.schema.Schema550;

final class Mapper {
    private Mapper() {}

    public static Schema550 of(Model550 model) {
        return new Schema550(model.id(), model.value());
    }
}
