package fr.spacefox.perftests.quarkus.rest.endpoint127;

import fr.spacefox.perftests.quarkus.core.service127.model.Model127;
import fr.spacefox.perftests.quarkus.rest.endpoint127.schema.Schema127;

final class Mapper {
    private Mapper() {}

    public static Schema127 of(Model127 model) {
        return new Schema127(model.id(), model.value());
    }
}
