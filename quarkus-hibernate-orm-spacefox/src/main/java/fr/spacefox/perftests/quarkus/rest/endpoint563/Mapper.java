package fr.spacefox.perftests.quarkus.rest.endpoint563;

import fr.spacefox.perftests.quarkus.core.service563.model.Model563;
import fr.spacefox.perftests.quarkus.rest.endpoint563.schema.Schema563;

final class Mapper {
    private Mapper() {}

    public static Schema563 of(Model563 model) {
        return new Schema563(model.id(), model.value());
    }
}
