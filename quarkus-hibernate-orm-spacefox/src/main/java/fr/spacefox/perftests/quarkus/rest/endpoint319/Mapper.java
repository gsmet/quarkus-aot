package fr.spacefox.perftests.quarkus.rest.endpoint319;

import fr.spacefox.perftests.quarkus.core.service319.model.Model319;
import fr.spacefox.perftests.quarkus.rest.endpoint319.schema.Schema319;

final class Mapper {
    private Mapper() {}

    public static Schema319 of(Model319 model) {
        return new Schema319(model.id(), model.value());
    }
}
