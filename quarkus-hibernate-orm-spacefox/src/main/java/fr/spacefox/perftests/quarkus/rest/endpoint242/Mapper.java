package fr.spacefox.perftests.quarkus.rest.endpoint242;

import fr.spacefox.perftests.quarkus.core.service242.model.Model242;
import fr.spacefox.perftests.quarkus.rest.endpoint242.schema.Schema242;

final class Mapper {
    private Mapper() {}

    public static Schema242 of(Model242 model) {
        return new Schema242(model.id(), model.value());
    }
}
