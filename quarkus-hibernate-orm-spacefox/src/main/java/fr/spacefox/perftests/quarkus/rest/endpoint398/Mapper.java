package fr.spacefox.perftests.quarkus.rest.endpoint398;

import fr.spacefox.perftests.quarkus.core.service398.model.Model398;
import fr.spacefox.perftests.quarkus.rest.endpoint398.schema.Schema398;

final class Mapper {
    private Mapper() {}

    public static Schema398 of(Model398 model) {
        return new Schema398(model.id(), model.value());
    }
}
