package fr.spacefox.perftests.quarkus.rest.endpoint759;

import fr.spacefox.perftests.quarkus.core.service759.model.Model759;
import fr.spacefox.perftests.quarkus.rest.endpoint759.schema.Schema759;

final class Mapper {
    private Mapper() {}

    public static Schema759 of(Model759 model) {
        return new Schema759(model.id(), model.value());
    }
}
