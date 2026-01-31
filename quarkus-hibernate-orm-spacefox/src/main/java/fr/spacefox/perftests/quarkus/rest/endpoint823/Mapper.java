package fr.spacefox.perftests.quarkus.rest.endpoint823;

import fr.spacefox.perftests.quarkus.core.service823.model.Model823;
import fr.spacefox.perftests.quarkus.rest.endpoint823.schema.Schema823;

final class Mapper {
    private Mapper() {}

    public static Schema823 of(Model823 model) {
        return new Schema823(model.id(), model.value());
    }
}
